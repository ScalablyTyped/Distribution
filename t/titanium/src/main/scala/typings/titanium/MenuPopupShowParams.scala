package typings.titanium

import typings.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary of options for showing a menu popup with <Titanium.UI.iOS.MenuPopup.show>.
  */
@js.native
trait MenuPopupShowParams extends js.Object {
  
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
  implicit class MenuPopupShowParamsOps[Self <: MenuPopupShowParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setArrowDirection(value: Double): Self = this.set("arrowDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowDirection: Self = this.set("arrowDirection", js.undefined)
  }
}
