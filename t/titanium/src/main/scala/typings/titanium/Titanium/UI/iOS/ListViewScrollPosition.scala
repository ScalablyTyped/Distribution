package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the position value that can be used for the `position` property of
			 * <ListViewAnimationProperties> when invoking the ListView's `scrollToItem`, `appendSection`,
			 * `deleteSectionAt`, `insertSectionAt` and `replaceSectionAt` methods.
			 */
@JSGlobal("Titanium.UI.iOS.ListViewScrollPosition")
@js.native
object ListViewScrollPosition extends js.Object {
  /**
  				 * The list view scrolls the row of interest to the bottom of the visible list view.
  				 */
  val BOTTOM: Double = js.native
  /**
  				 * The list view scrolls the row of interest to the middle of the list table view.
  				 */
  val MIDDLE: Double = js.native
  /**
  				 * The table view scrolls the row of interest to be fully visible with a minimal movement.
  				 * If the row is already fully visible, no scrolling occurs. For example, if the row is above the
  				 * visible area, the behavior is identical to that specified by `TOP`. This is the default.
  				 */
  val NONE: Double = js.native
  /**
  				 * The list view scrolls the row of interest to the top of the visible list view.
  				 */
  val TOP: Double = js.native
}

