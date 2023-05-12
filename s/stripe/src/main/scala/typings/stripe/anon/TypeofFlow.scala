package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFlow extends StObject {
  
  val AfterCompletion: Any
}
object TypeofFlow {
  
  inline def apply(AfterCompletion: Any): TypeofFlow = {
    val __obj = js.Dynamic.literal(AfterCompletion = AfterCompletion.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFlow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofFlow] (val x: Self) extends AnyVal {
    
    inline def setAfterCompletion(value: Any): Self = StObject.set(x, "AfterCompletion", value.asInstanceOf[js.Any])
  }
}
