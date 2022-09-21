package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRequirements extends StObject {
  
  val Error: Any
}
object TypeofRequirements {
  
  inline def apply(Error: Any): TypeofRequirements = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRequirements]
  }
  
  extension [Self <: TypeofRequirements](x: Self) {
    
    inline def setError(value: Any): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
  }
}
