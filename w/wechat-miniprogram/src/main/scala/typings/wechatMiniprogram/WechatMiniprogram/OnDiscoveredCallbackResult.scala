package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnDiscoveredCallbackResult extends js.Object {
  
  /** NdefMessage 数组，消息格式为 {id: ArrayBuffer, type: ArrayBuffer, payload: ArrayBuffer} */
  var messages: js.Array[_] = js.native
  
  /** tech 数组，用于匹配NFC卡片具体可以使用什么标准（NfcA等实例）处理 */
  var techs: js.Array[_] = js.native
}
object OnDiscoveredCallbackResult {
  
  @scala.inline
  def apply(messages: js.Array[_], techs: js.Array[_]): OnDiscoveredCallbackResult = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], techs = techs.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDiscoveredCallbackResult]
  }
  
  @scala.inline
  implicit class OnDiscoveredCallbackResultOps[Self <: OnDiscoveredCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setMessagesVarargs(value: js.Any*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[_]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTechsVarargs(value: js.Any*): Self = this.set("techs", js.Array(value :_*))
    
    @scala.inline
    def setTechs(value: js.Array[_]): Self = this.set("techs", value.asInstanceOf[js.Any])
  }
}
