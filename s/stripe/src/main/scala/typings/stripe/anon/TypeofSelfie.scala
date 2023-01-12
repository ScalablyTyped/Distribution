package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSelfie extends StObject {
  
  val Error: Any
}
object TypeofSelfie {
  
  inline def apply(Error: Any): TypeofSelfie = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSelfie]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSelfie] (val x: Self) extends AnyVal {
    
    inline def setError(value: Any): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
  }
}
