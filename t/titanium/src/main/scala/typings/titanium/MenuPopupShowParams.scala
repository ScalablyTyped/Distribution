package typings.titanium

import typings.titanium.Titanium.UI.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary of options for showing a menu popup with <Titanium.UI.iOS.MenuPopup.show>.
  */
@js.native
trait MenuPopupShowParams extends StObject {
  
  /**
    * Determines whether the menu popup should be opened or closed animated.
    */
  var animated: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates the arrow direction of the menu popup.
    */
  var arrowDirection: js.UndefOr[Double] = js.native
  
  /**
    * The view where the menu pop is shown at.
    */
  var view: View = js.native
}
object MenuPopupShowParams {
  
  @scala.inline
  def apply(view: View): MenuPopupShowParams = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuPopupShowParams]
  }
  
  @scala.inline
  implicit class MenuPopupShowParamsMutableBuilder[Self <: MenuPopupShowParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setArrowDirection(value: Double): Self = StObject.set(x, "arrowDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowDirectionUndefined: Self = StObject.set(x, "arrowDirection", js.undefined)
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
