package typings.weappApi.mod.wx

import typings.weappApi.weappApiStrings.gcj02
import typings.weappApi.weappApiStrings.wgs84
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLocationOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.native
  /** 默认为 wgs84 返回 gps 坐标，gcj02 返回可用于wx.openLocation的坐标 */
  var `type`: js.UndefOr[wgs84 | gcj02] = js.native
  /** 接口调用成功的回调函数，返回内容详见返回参数说明。 */
  def success(res: LocationData): Unit = js.native
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
    def setComplete(value: /* res */ js.Any => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setType(value: wgs84 | gcj02): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

