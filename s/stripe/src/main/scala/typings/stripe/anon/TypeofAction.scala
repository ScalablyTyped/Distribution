package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAction extends StObject {
  
  val ProcessPaymentIntent: TypeofProcessPaymentInten
  
  val SetReaderDisplay: TypeofSetReaderDisplay
}
object TypeofAction {
  
  inline def apply(ProcessPaymentIntent: TypeofProcessPaymentInten, SetReaderDisplay: TypeofSetReaderDisplay): TypeofAction = {
    val __obj = js.Dynamic.literal(ProcessPaymentIntent = ProcessPaymentIntent.asInstanceOf[js.Any], SetReaderDisplay = SetReaderDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofAction] (val x: Self) extends AnyVal {
    
    inline def setProcessPaymentIntent(value: TypeofProcessPaymentInten): Self = StObject.set(x, "ProcessPaymentIntent", value.asInstanceOf[js.Any])
    
    inline def setSetReaderDisplay(value: TypeofSetReaderDisplay): Self = StObject.set(x, "SetReaderDisplay", value.asInstanceOf[js.Any])
  }
}
