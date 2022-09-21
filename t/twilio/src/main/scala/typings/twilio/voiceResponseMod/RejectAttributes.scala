package typings.twilio.voiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectAttributes extends StObject {
  
  var reason: js.UndefOr[RejectReason] = js.undefined
}
object RejectAttributes {
  
  inline def apply(): RejectAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectAttributes]
  }
  
  extension [Self <: RejectAttributes](x: Self) {
    
    inline def setReason(value: RejectReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
