package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewOption extends StObject {
  
  var newOption: Any
}
object NewOption {
  
  inline def apply(newOption: Any): NewOption = {
    val __obj = js.Dynamic.literal(newOption = newOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewOption]
  }
  
  extension [Self <: NewOption](x: Self) {
    
    inline def setNewOption(value: Any): Self = StObject.set(x, "newOption", value.asInstanceOf[js.Any])
  }
}
