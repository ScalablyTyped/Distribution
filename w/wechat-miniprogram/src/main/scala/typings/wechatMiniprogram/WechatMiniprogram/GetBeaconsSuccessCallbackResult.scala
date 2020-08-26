package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBeaconsSuccessCallbackResult extends js.Object {
  /** iBeacon 设备列表 */
  var beacons: js.Array[IBeaconInfo] = js.native
  var errMsg: String = js.native
}

object GetBeaconsSuccessCallbackResult {
  @scala.inline
  def apply(beacons: js.Array[IBeaconInfo], errMsg: String): GetBeaconsSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBeaconsSuccessCallbackResult]
  }
  @scala.inline
  implicit class GetBeaconsSuccessCallbackResultOps[Self <: GetBeaconsSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setBeaconsVarargs(value: IBeaconInfo*): Self = this.set("beacons", js.Array(value :_*))
    @scala.inline
    def setBeacons(value: js.Array[IBeaconInfo]): Self = this.set("beacons", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
  
}

