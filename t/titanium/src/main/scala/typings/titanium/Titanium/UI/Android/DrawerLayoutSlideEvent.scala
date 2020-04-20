package typings.titanium.Titanium.UI.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Fired when the drawer view changes it's position.
			 */
trait DrawerLayoutSlideEvent extends DrawerLayoutBaseEvent {
  /**
  				 * Contains the drawer frame type. Either `left` or `right`.
  				 */
  var drawer: String
  /**
  				 * The current drawer offset.
  				 */
  var offset: Double
}

object DrawerLayoutSlideEvent {
  @scala.inline
  def apply(drawer: String, offset: Double, source: DrawerLayout): DrawerLayoutSlideEvent = {
    val __obj = js.Dynamic.literal(drawer = drawer.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutSlideEvent]
  }
}

