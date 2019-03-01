package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary object of parameters for the <Titanium.UI.TextField.selection> property that describes
  * position and length of the selected text.
  */
trait textFieldSelectedParams extends js.Object {
  /**
  	 * Number of characters selected.
  	 */
  var length: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Starting position of selected text.
  	 */
  var location: js.UndefOr[scala.Double] = js.undefined
}

object textFieldSelectedParams {
  @scala.inline
  def apply(length: scala.Int | scala.Double = null, location: scala.Int | scala.Double = null): textFieldSelectedParams = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[textFieldSelectedParams]
  }
}

