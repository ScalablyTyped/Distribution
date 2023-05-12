package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTaxLocation extends StObject {
  
  val Location: Any
}
object TypeofTaxLocation {
  
  inline def apply(Location: Any): TypeofTaxLocation = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTaxLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTaxLocation] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: Any): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
  }
}
