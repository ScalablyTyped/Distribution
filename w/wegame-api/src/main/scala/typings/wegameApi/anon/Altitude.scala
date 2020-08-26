package typings.wegameApi.anon

import typings.wegameApi.wegameApiStrings.gcj02
import typings.wegameApi.wegameApiStrings.wgs84
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Altitude extends js.Object {
  /**
    * 传入 true 会返回高度信息，由于获取高度需要较高精确度，会减慢接口返回速度    >= 1.6.0
    */
  var altitude: js.UndefOr[Boolean] = js.native
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  var success: js.UndefOr[js.Function1[/* res */ Accuracy, Unit]] = js.native
  /**
    * wgs84 返回 gps 坐标，gcj02 返回可用于 wx.openLocation 的坐标
    */
  var `type`: js.UndefOr[wgs84 | gcj02] = js.native
}

object Altitude {
  @scala.inline
  def apply(): Altitude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Altitude]
  }
  @scala.inline
  implicit class AltitudeOps[Self <: Altitude] (val x: Self) extends AnyVal {
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
    def setAltitude(value: Boolean): Self = this.set("altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ Accuracy => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setType(value: wgs84 | gcj02): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

