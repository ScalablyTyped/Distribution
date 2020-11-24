package typings.titanium

import typings.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary of options for <Titanium.UI.iPad.Popover.show>.
  */
@js.native
trait ShowPopoverParams extends js.Object {
  
  /**
    * Indicates whether to animate showing the popover.
    */
  var animated: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the arrow position of the popover relative to the attached view object's dimensions
    * when showing the popover.
    */
  var rect: js.UndefOr[Dimension] = js.native
  
  /**
    * Attaches the popover to the specified view when showing the popover.
    */
  var view: View = js.native
}
object ShowPopoverParams {
  
  @scala.inline
  def apply(view: View): ShowPopoverParams = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowPopoverParams]
  }
  
  @scala.inline
  implicit class ShowPopoverParamsOps[Self <: ShowPopoverParams] (val x: Self) extends AnyVal {
    
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
    def setRect(value: Dimension): Self = this.set("rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRect: Self = this.set("rect", js.undefined)
  }
}
