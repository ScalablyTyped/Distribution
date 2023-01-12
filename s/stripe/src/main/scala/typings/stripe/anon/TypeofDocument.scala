package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDocument extends StObject {
  
  val Error: Any
}
object TypeofDocument {
  
  inline def apply(Error: Any): TypeofDocument = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDocument] (val x: Self) extends AnyVal {
    
    inline def setError(value: Any): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
  }
}
