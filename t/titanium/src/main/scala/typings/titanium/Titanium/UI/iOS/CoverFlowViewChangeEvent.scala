package typings.titanium.Titanium.UI.iOS

import org.scalablytyped.runtime.StObject
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
  implicit class CoverFlowViewChangeEventMutableBuilder[Self <: CoverFlowViewChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: Double): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
  }
}
