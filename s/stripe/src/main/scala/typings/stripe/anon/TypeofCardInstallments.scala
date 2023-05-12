package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCardInstallments extends StObject {
  
  val Installments: Any
  
  val MandateOptions: Any
}
object TypeofCardInstallments {
  
  inline def apply(Installments: Any, MandateOptions: Any): TypeofCardInstallments = {
    val __obj = js.Dynamic.literal(Installments = Installments.asInstanceOf[js.Any], MandateOptions = MandateOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCardInstallments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCardInstallments] (val x: Self) extends AnyVal {
    
    inline def setInstallments(value: Any): Self = StObject.set(x, "Installments", value.asInstanceOf[js.Any])
    
    inline def setMandateOptions(value: Any): Self = StObject.set(x, "MandateOptions", value.asInstanceOf[js.Any])
  }
}
