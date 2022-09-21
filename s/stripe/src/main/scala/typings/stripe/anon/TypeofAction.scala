package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAction extends StObject {
  
  val ProcessPaymentIntent: Any
  
  val SetReaderDisplay: TypeofSetReaderDisplay
}
object TypeofAction {
  
  inline def apply(ProcessPaymentIntent: Any, SetReaderDisplay: TypeofSetReaderDisplay): TypeofAction = {
    val __obj = js.Dynamic.literal(ProcessPaymentIntent = ProcessPaymentIntent.asInstanceOf[js.Any], SetReaderDisplay = SetReaderDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAction]
  }
  
  extension [Self <: TypeofAction](x: Self) {
    
    inline def setProcessPaymentIntent(value: Any): Self = StObject.set(x, "ProcessPaymentIntent", value.asInstanceOf[js.Any])
    
    inline def setSetReaderDisplay(value: TypeofSetReaderDisplay): Self = StObject.set(x, "SetReaderDisplay", value.asInstanceOf[js.Any])
  }
}
