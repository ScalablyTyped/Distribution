package typings.titanium.Titanium.UI.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Fired when the motion state of the drawer view changes.
			 */
trait DrawerLayoutChangeEvent extends DrawerLayoutBaseEvent {
  /**
  				 * Whether or not the drawer is currently dragging.
  				 */
  var dragging: Boolean
  /**
  				 * Contains the drawer frame type. Either `left` or `right`.
  				 */
  var drawer: String
  /**
  				 * Whether or not the drawer is currently idle.
  				 */
  var idle: Boolean
  /**
  				 * Whether or not the drawer is currently settling.
  				 */
  var settling: Boolean
  /**
  				 * The current drawer state.
  				 */
  var state: Double
}

object DrawerLayoutChangeEvent {
  @scala.inline
  def apply(
    dragging: Boolean,
    drawer: String,
    idle: Boolean,
    settling: Boolean,
    source: DrawerLayout,
    state: Double
  ): DrawerLayoutChangeEvent = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], drawer = drawer.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], settling = settling.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutChangeEvent]
  }
}

