package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofComputed extends StObject {
  
  val Recurring: TypeofRecurring
  
  val Upfront: TypeofUpfront
}
object TypeofComputed {
  
  inline def apply(Recurring: TypeofRecurring, Upfront: TypeofUpfront): TypeofComputed = {
    val __obj = js.Dynamic.literal(Recurring = Recurring.asInstanceOf[js.Any], Upfront = Upfront.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofComputed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofComputed] (val x: Self) extends AnyVal {
    
    inline def setRecurring(value: TypeofRecurring): Self = StObject.set(x, "Recurring", value.asInstanceOf[js.Any])
    
    inline def setUpfront(value: TypeofUpfront): Self = StObject.set(x, "Upfront", value.asInstanceOf[js.Any])
  }
}
