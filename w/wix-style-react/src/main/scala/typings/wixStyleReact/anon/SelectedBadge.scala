package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedBadge extends StObject {
  
  var selectedBadge: Any
  
  var visible: Boolean
}
object SelectedBadge {
  
  inline def apply(selectedBadge: Any, visible: Boolean): SelectedBadge = {
    val __obj = js.Dynamic.literal(selectedBadge = selectedBadge.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedBadge]
  }
  
  extension [Self <: SelectedBadge](x: Self) {
    
    inline def setSelectedBadge(value: Any): Self = StObject.set(x, "selectedBadge", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
