package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferAttributes extends StObject {
  
  /** action - Action URL */
  var action: js.UndefOr[String] = js.undefined
  
  /** method - Action URL method */
  var method: js.UndefOr[String] = js.undefined
}
object ReferAttributes {
  
  inline def apply(): ReferAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferAttributes] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
