package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedAny extends StObject {
  
  var selected: Any
}
object SelectedAny {
  
  inline def apply(selected: Any): SelectedAny = {
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedAny]
  }
  
  extension [Self <: SelectedAny](x: Self) {
    
    inline def setSelected(value: Any): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
