package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.`2g`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`3g`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`4g`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`5g`
import typings.wechatMiniprogram.wechatMiniprogramStrings.none
import typings.wechatMiniprogram.wechatMiniprogramStrings.unknown
import typings.wechatMiniprogram.wechatMiniprogramStrings.wifi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNetworkTypeSuccessCallbackResult extends js.Object {
  
  var errMsg: String = js.native
  
  /** 网络类型
    *
    * 可选值：
    * - 'wifi': wifi 网络;
    * - '2g': 2g 网络;
    * - '3g': 3g 网络;
    * - '4g': 4g 网络;
    * - '5g': 5g 网络;
    * - 'unknown': Android 下不常见的网络类型;
    * - 'none': 无网络; */
  var networkType: wifi | `2g` | `3g` | `4g` | `5g` | unknown | none = js.native
}
object GetNetworkTypeSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, networkType: wifi | `2g` | `3g` | `4g` | `5g` | unknown | none): GetNetworkTypeSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkTypeSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetNetworkTypeSuccessCallbackResultOps[Self <: GetNetworkTypeSuccessCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkType(value: wifi | `2g` | `3g` | `4g` | `5g` | unknown | none): Self = this.set("networkType", value.asInstanceOf[js.Any])
  }
}
