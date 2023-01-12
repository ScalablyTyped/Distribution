package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors extends StObject {
  
  var errors: Null
  
  var options: Null
}
object Errors {
  
  inline def apply(errors: Null, options: Null): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: Null): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Null): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
