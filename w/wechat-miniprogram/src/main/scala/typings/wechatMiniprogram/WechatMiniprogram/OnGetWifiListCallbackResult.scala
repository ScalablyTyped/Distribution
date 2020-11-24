package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnGetWifiListCallbackResult extends js.Object {
  
  /** Wi-Fi 列表数据 */
  var wifiList: js.Array[WifiInfo] = js.native
}
object OnGetWifiListCallbackResult {
  
  @scala.inline
  def apply(wifiList: js.Array[WifiInfo]): OnGetWifiListCallbackResult = {
    val __obj = js.Dynamic.literal(wifiList = wifiList.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnGetWifiListCallbackResult]
  }
  
  @scala.inline
  implicit class OnGetWifiListCallbackResultOps[Self <: OnGetWifiListCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setWifiListVarargs(value: WifiInfo*): Self = this.set("wifiList", js.Array(value :_*))
    
    @scala.inline
    def setWifiList(value: js.Array[WifiInfo]): Self = this.set("wifiList", value.asInstanceOf[js.Any])
  }
}
