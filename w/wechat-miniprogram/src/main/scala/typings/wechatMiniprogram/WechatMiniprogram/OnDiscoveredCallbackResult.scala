package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnDiscoveredCallbackResult extends StObject {
  
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
  implicit class OnDiscoveredCallbackResultMutableBuilder[Self <: OnDiscoveredCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: js.Array[_]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: js.Any*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setTechs(value: js.Array[_]): Self = StObject.set(x, "techs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTechsVarargs(value: js.Any*): Self = StObject.set(x, "techs", js.Array(value :_*))
  }
}
