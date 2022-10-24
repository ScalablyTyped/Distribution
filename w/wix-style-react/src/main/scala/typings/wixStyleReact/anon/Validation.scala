package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validation extends StObject {
  
  var validation: String
}
object Validation {
  
  inline def apply(validation: String): Validation = {
    val __obj = js.Dynamic.literal(validation = validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validation]
  }
  
  extension [Self <: Validation](x: Self) {
    
    inline def setValidation(value: String): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
  }
}
