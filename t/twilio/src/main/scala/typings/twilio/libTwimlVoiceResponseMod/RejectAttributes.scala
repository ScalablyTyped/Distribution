package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectAttributes extends StObject {
  
  /** reason - Rejection reason */
  var reason: js.UndefOr[RejectReason] = js.undefined
}
object RejectAttributes {
  
  inline def apply(): RejectAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RejectAttributes] (val x: Self) extends AnyVal {
    
    inline def setReason(value: RejectReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
