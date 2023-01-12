package typings.wxJsSdkBrowser.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenCardObj extends StObject {
  
  var cardId: String
  
  var code: String
}
object OpenCardObj {
  
  inline def apply(cardId: String, code: String): OpenCardObj = {
    val __obj = js.Dynamic.literal(cardId = cardId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCardObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenCardObj] (val x: Self) extends AnyVal {
    
    inline def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
