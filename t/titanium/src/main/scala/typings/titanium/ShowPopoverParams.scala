package typings.titanium

import typings.titanium.Titanium.UI.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary of options for <Titanium.UI.iPad.Popover.show>.
  */
@js.native
trait ShowPopoverParams extends StObject {
  
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
  implicit class ShowPopoverParamsMutableBuilder[Self <: ShowPopoverParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setRect(value: Dimension): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
