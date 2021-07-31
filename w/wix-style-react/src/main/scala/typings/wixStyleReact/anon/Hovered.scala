package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hovered extends StObject {
  
  var disabled: Boolean
  
  var hovered: Boolean
  
  var selected: Boolean
}
object Hovered {
  
  @scala.inline
  def apply(disabled: Boolean, hovered: Boolean, selected: Boolean): Hovered = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], hovered = hovered.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hovered]
  }
  
  @scala.inline
  implicit class HoveredMutableBuilder[Self <: Hovered] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHovered(value: Boolean): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
