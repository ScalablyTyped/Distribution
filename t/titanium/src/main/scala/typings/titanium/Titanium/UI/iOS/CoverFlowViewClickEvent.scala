package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the user clicks on the view.
  */
trait CoverFlowViewClickEvent extends CoverFlowViewBaseEvent {
  /**
    * Index of the image that is now visible.
    */
  var index: Double
  /**
    * Index of the previously-visible image.
    */
  var previous: Double
}

object CoverFlowViewClickEvent {
  @scala.inline
  def apply(index: Double, previous: Double, source: CoverFlowView): CoverFlowViewClickEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverFlowViewClickEvent]
  }
}

