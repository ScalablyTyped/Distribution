package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisabledSize extends StObject {
  
  var disabled: Any
  
  var size: Any
}
object DisabledSize {
  
  inline def apply(disabled: Any, size: Any): DisabledSize = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledSize]
  }
  
  extension [Self <: DisabledSize](x: Self) {
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
