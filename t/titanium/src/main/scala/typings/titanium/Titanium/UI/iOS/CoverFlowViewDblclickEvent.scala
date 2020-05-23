package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the device detects a double click against the view.
  */
trait CoverFlowViewDblclickEvent extends CoverFlowViewBaseEvent {
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double
}

object CoverFlowViewDblclickEvent {
  @scala.inline
  def apply(source: CoverFlowView, x: Double, y: Double): CoverFlowViewDblclickEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverFlowViewDblclickEvent]
  }
}

