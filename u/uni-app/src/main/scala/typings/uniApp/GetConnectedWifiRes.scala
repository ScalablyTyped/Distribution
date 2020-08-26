package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectedWifiRes extends js.Object {
  /**
    * 接口调用成功的回调函数
    */
  var wifi: js.UndefOr[WiFi] = js.native
}

object GetConnectedWifiRes {
  @scala.inline
  def apply(): GetConnectedWifiRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectedWifiRes]
  }
  @scala.inline
  implicit class GetConnectedWifiResOps[Self <: GetConnectedWifiRes] (val x: Self) extends AnyVal {
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
    def setWifi(value: WiFi): Self = this.set("wifi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWifi: Self = this.set("wifi", js.undefined)
  }
  
}

