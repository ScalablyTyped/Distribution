package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  def _onClick(e: Any): Unit
  
  var animation: Any
  
  var isItemKeySelected: Any
  
  var isMenuOpen: Any
}
object Animation {
  
  inline def apply(_onClick: Any => Unit, animation: Any, isItemKeySelected: Any, isMenuOpen: Any): Animation = {
    val __obj = js.Dynamic.literal(_onClick = js.Any.fromFunction1(_onClick), animation = animation.asInstanceOf[js.Any], isItemKeySelected = isItemKeySelected.asInstanceOf[js.Any], isMenuOpen = isMenuOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  
  extension [Self <: Animation](x: Self) {
    
    inline def setAnimation(value: Any): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setIsItemKeySelected(value: Any): Self = StObject.set(x, "isItemKeySelected", value.asInstanceOf[js.Any])
    
    inline def setIsMenuOpen(value: Any): Self = StObject.set(x, "isMenuOpen", value.asInstanceOf[js.Any])
    
    inline def set_onClick(value: Any => Unit): Self = StObject.set(x, "_onClick", js.Any.fromFunction1(value))
  }
}
