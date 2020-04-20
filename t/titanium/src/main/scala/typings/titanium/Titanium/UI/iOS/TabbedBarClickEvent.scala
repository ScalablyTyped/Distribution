package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Fired when a button is clicked.
			 */
trait TabbedBarClickEvent extends TabbedBarBaseEvent {
  /**
  				 * Index of the clicked button.
  				 */
  var index: Double
}

object TabbedBarClickEvent {
  @scala.inline
  def apply(index: Double, source: TabbedBar): TabbedBarClickEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbedBarClickEvent]
  }
}

