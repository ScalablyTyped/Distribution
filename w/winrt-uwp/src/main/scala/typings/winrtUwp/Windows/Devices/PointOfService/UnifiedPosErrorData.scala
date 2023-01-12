package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides error information. */
trait UnifiedPosErrorData extends StObject {
  
  /** Gets the vendor specific error information. */
  var extendedReason: Double
  
  /** Gets the error message. */
  var message: String
  
  /** Gets the cause of the error. */
  var reason: UnifiedPosErrorReason
  
  /** Gets the error severity. */
  var severity: UnifiedPosErrorSeverity
}
object UnifiedPosErrorData {
  
  inline def apply(
    extendedReason: Double,
    message: String,
    reason: UnifiedPosErrorReason,
    severity: UnifiedPosErrorSeverity
  ): UnifiedPosErrorData = {
    val __obj = js.Dynamic.literal(extendedReason = extendedReason.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnifiedPosErrorData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnifiedPosErrorData] (val x: Self) extends AnyVal {
    
    inline def setExtendedReason(value: Double): Self = StObject.set(x, "extendedReason", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setReason(value: UnifiedPosErrorReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: UnifiedPosErrorSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
  }
}
