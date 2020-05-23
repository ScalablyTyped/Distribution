package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the user changes the image using a gesture.
  */
trait CoverFlowViewChangeEvent extends CoverFlowViewBaseEvent {
  /**
    * Index of the image that is now visible.
    */
  var index: Double
  /**
    * Index of the previously-visible image.
    */
  var previous: Double
}

object CoverFlowViewChangeEvent {
  @scala.inline
  def apply(index: Double, previous: Double, source: CoverFlowView): CoverFlowViewChangeEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverFlowViewChangeEvent]
  }
}

