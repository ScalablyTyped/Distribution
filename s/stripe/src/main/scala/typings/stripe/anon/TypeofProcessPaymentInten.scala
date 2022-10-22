package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofProcessPaymentInten extends StObject {
  
  val ProcessConfig: Any
}
object TypeofProcessPaymentInten {
  
  inline def apply(ProcessConfig: Any): TypeofProcessPaymentInten = {
    val __obj = js.Dynamic.literal(ProcessConfig = ProcessConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofProcessPaymentInten]
  }
  
  extension [Self <: TypeofProcessPaymentInten](x: Self) {
    
    inline def setProcessConfig(value: Any): Self = StObject.set(x, "ProcessConfig", value.asInstanceOf[js.Any])
  }
}
