package typings.weixinApp.wx

import typings.weixinApp.weixinAppStrings.gcj02
import typings.weixinApp.weixinAppStrings.wgs84
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 传入 true 会返回高度信息，由于获取高度需要较高精确度，会减慢接口返回速度 */
  var altitude: js.UndefOr[Boolean] = js.native
  /** 高精度定位超时时间(ms)，指定时间内返回最高精度，该值3000ms以上高精度定位才有效果 */
  var highAccuracyExpireTime: js.UndefOr[Double] = js.native
  /** 开启高精度定位 */
  var isHighAccuracy: js.UndefOr[Boolean] = js.native
  /** 默认为 wgs84 返回 gps 坐标，gcj02 返回可用于wx.openLocation的坐标 */
  var `type`: js.UndefOr[wgs84 | gcj02] = js.native
  /** 接口调用成功的回调函数，返回内容详见返回参数说明。 */
  @JSName("success")
  def success_MGetLocationOptions(res: LocationData): Unit = js.native
}

object GetLocationOptions {
  @scala.inline
  def apply(success: LocationData => Unit): GetLocationOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetLocationOptions]
  }
  @scala.inline
  implicit class GetLocationOptionsOps[Self <: GetLocationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSuccess(value: LocationData => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def setAltitude(value: Boolean): Self = this.set("altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    @scala.inline
    def setHighAccuracyExpireTime(value: Double): Self = this.set("highAccuracyExpireTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighAccuracyExpireTime: Self = this.set("highAccuracyExpireTime", js.undefined)
    @scala.inline
    def setIsHighAccuracy(value: Boolean): Self = this.set("isHighAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHighAccuracy: Self = this.set("isHighAccuracy", js.undefined)
    @scala.inline
    def setType(value: wgs84 | gcj02): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

