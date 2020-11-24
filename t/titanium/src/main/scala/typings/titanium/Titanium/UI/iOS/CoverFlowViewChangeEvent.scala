package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the user changes the image using a gesture.
  */
@js.native
trait CoverFlowViewChangeEvent extends CoverFlowViewBaseEvent {
  
  /**
    * Index of the image that is now visible.
    */
  var index: Double = js.native
  
  /**
    * Index of the previously-visible image.
    */
  var previous: Double = js.native
}
object CoverFlowViewChangeEvent {
  
  @scala.inline
  def apply(index: Double, previous: Double, source: CoverFlowView): CoverFlowViewChangeEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverFlowViewChangeEvent]
  }
  
  @scala.inline
  implicit class CoverFlowViewChangeEventOps[Self <: CoverFlowViewChangeEvent] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: Double): Self = this.set("previous", value.asInstanceOf[js.Any])
  }
}
