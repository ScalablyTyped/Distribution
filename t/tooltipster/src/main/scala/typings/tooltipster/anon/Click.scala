package typings.tooltipster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Click extends js.Object {
  
  /**
    * When a mouse click happens anywhere in the page. However, if the interactive option is set to true, 
    * a click happening inside the tooltip will not close it.
    */
  var click: js.UndefOr[Boolean] = js.native
  
  /**
    * When the mouse goes away from the origin. The delay option is taken into account as the delay before 
    * closing.
    */
  var mouseleave: js.UndefOr[Boolean] = js.native
  
  /**
    * When the origin is clicked by a mouse. This mimics a behavior that browsers usually have and is meant 
    * to be used with the mouseenter open trigger.
    */
  var originClick: js.UndefOr[Boolean] = js.native
  
  /**
    * When scrolling happens in the window or in a scrollable area which is a parent of the origin.
    */
  var scroll: js.UndefOr[Boolean] = js.native
  
  /**
    * When the finger taps (ie presses and releases) anywhere in the touch screen.
    */
  var tap: js.UndefOr[Boolean] = js.native
  
  /**
    * When the finger is removed from the touch screen or if the interaction was stopped by the device. The 
    * delayTouch option is taken into account as the delay before closing.
    */
  var touchleave: js.UndefOr[Boolean] = js.native
}
object Click {
  
  @scala.inline
  def apply(): Click = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Click]
  }
  
  @scala.inline
  implicit class ClickOps[Self <: Click] (val x: Self) extends AnyVal {
    
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
    def setClick(value: Boolean): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setMouseleave(value: Boolean): Self = this.set("mouseleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseleave: Self = this.set("mouseleave", js.undefined)
    
    @scala.inline
    def setOriginClick(value: Boolean): Self = this.set("originClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginClick: Self = this.set("originClick", js.undefined)
    
    @scala.inline
    def setScroll(value: Boolean): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setTap(value: Boolean): Self = this.set("tap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTap: Self = this.set("tap", js.undefined)
    
    @scala.inline
    def setTouchleave(value: Boolean): Self = this.set("touchleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchleave: Self = this.set("touchleave", js.undefined)
  }
}
