package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region iBeacon
@js.native
trait StartBeaconDiscoveryOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_StartBeaconDiscoveryOptions: js.UndefOr[js.Function1[/* res */ ErrMsgResponse, Unit]] = js.native
  /**
    * iBeacon设备广播的 uuids
    */
  var uuids: String | js.Array[String] = js.native
}

object StartBeaconDiscoveryOptions {
  @scala.inline
  def apply(uuids: String | js.Array[String]): StartBeaconDiscoveryOptions = {
    val __obj = js.Dynamic.literal(uuids = uuids.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBeaconDiscoveryOptions]
  }
  @scala.inline
  implicit class StartBeaconDiscoveryOptionsOps[Self <: StartBeaconDiscoveryOptions] (val x: Self) extends AnyVal {
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
    def setUuidsVarargs(value: String*): Self = this.set("uuids", js.Array(value :_*))
    @scala.inline
    def setUuids(value: String | js.Array[String]): Self = this.set("uuids", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: /* res */ ErrMsgResponse => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

