package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDiscoveredCallbackResult extends StObject {
  
  /** NdefMessage 数组，消息格式为 {id: ArrayBuffer, type: ArrayBuffer, payload: ArrayBuffer} */
  var messages: js.Array[js.Any]
  
  /** tech 数组，用于匹配NFC卡片具体可以使用什么标准（NfcA等实例）处理 */
  var techs: js.Array[js.Any]
}
object OnDiscoveredCallbackResult {
  
  inline def apply(messages: js.Array[js.Any], techs: js.Array[js.Any]): OnDiscoveredCallbackResult = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], techs = techs.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDiscoveredCallbackResult]
  }
  
  extension [Self <: OnDiscoveredCallbackResult](x: Self) {
    
    inline def setMessages(value: js.Array[js.Any]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: js.Any*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    inline def setTechs(value: js.Array[js.Any]): Self = StObject.set(x, "techs", value.asInstanceOf[js.Any])
    
    inline def setTechsVarargs(value: js.Any*): Self = StObject.set(x, "techs", js.Array(value :_*))
  }
}
