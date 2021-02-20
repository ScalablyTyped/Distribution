package typings.titanium.Titanium.UI.iOS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the user clicks on the view.
  */
@js.native
trait CoverFlowViewClickEvent extends CoverFlowViewBaseEvent {
  
  /**
    * Index of the image that is now visible.
    */
  var index: Double = js.native
  
  /**
    * Index of the previously-visible image.
    */
  var previous: Double = js.native
}
object CoverFlowViewClickEvent {
  
  @scala.inline
  def apply(index: Double, previous: Double, source: CoverFlowView): CoverFlowViewClickEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverFlowViewClickEvent]
  }
  
  @scala.inline
  implicit class CoverFlowViewClickEventMutableBuilder[Self <: CoverFlowViewClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: Double): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
  }
}
