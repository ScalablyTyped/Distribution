package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedId extends StObject {
  
  var selectedId: Any
  
  var value: Any
}
object SelectedId {
  
  inline def apply(selectedId: Any, value: Any): SelectedId = {
    val __obj = js.Dynamic.literal(selectedId = selectedId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedId]
  }
  
  extension [Self <: SelectedId](x: Self) {
    
    inline def setSelectedId(value: Any): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
