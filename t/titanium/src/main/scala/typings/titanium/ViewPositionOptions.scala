package typings.titanium

import typings.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pass an object with the following key-value pairs:
  *   * `view` (Titanium.UI.View): View to insert
  *   * `position` (Number): Position in the [children](Titanium.UI.View.children) array of
  *     the view elment to replace.
  */
trait ViewPositionOptions extends js.Object {
  /**
  	 * Position in the [children](Titanium.UI.View.children) array of the view element to replace.
  	 */
  var position: js.UndefOr[Double] = js.undefined
  /**
  	 * View to insert. Required.
  	 */
  var view: View
}

object ViewPositionOptions {
  @scala.inline
  def apply(view: View, position: Int | Double = null): ViewPositionOptions = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewPositionOptions]
  }
}

