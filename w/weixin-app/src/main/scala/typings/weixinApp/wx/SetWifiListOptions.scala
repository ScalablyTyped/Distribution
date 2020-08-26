package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetWifiListOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 提供预设的 Wi-Fi 信息列表 */
  var wifiList: js.Array[SetWifiList] = js.native
}

object SetWifiListOptions {
  @scala.inline
  def apply(wifiList: js.Array[SetWifiList]): SetWifiListOptions = {
    val __obj = js.Dynamic.literal(wifiList = wifiList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetWifiListOptions]
  }
  @scala.inline
  implicit class SetWifiListOptionsOps[Self <: SetWifiListOptions] (val x: Self) extends AnyVal {
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
    def setWifiListVarargs(value: SetWifiList*): Self = this.set("wifiList", js.Array(value :_*))
    @scala.inline
    def setWifiList(value: js.Array[SetWifiList]): Self = this.set("wifiList", value.asInstanceOf[js.Any])
  }
  
}

