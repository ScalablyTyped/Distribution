package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the scrollable region stops being dragged.
  */
@js.native
trait ScrollView_DragEndEvent extends ScrollViewBaseEvent {
  
  /**
    * Indicates whether scrolling will continue but decelerate, now that the drag gesture has
    * been released by the touch. If `false`, scrolling will stop immediately.
    */
  var decelerate: Boolean = js.native
}
object ScrollView_DragEndEvent {
  
  @scala.inline
  def apply(decelerate: Boolean, source: ScrollView): ScrollView_DragEndEvent = {
    val __obj = js.Dynamic.literal(decelerate = decelerate.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollView_DragEndEvent]
  }
  
  @scala.inline
  implicit class ScrollView_DragEndEventOps[Self <: ScrollView_DragEndEvent] (val x: Self) extends AnyVal {
    
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
    def setDecelerate(value: Boolean): Self = this.set("decelerate", value.asInstanceOf[js.Any])
  }
}
