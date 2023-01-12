package typings.wampy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorArgs extends StObject {
  
  var details: Dict
  
  var error: String
}
object ErrorArgs {
  
  inline def apply(details: Dict, error: String): ErrorArgs = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorArgs] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: Dict): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
