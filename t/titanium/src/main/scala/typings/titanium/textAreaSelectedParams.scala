package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary object of parameters for the <Titanium.UI.TextArea.selected> event and <Titanium.UI.TextArea.selection> property that describes
  * position and length of the selected text.
  */
trait textAreaSelectedParams extends js.Object {
  /**
  	 * Number of characters selected.
  	 */
  var length: js.UndefOr[Double] = js.undefined
  /**
  	 * Starting position of selected text.
  	 */
  var location: js.UndefOr[Double] = js.undefined
}

object textAreaSelectedParams {
  @scala.inline
  def apply(length: Int | Double = null, location: Int | Double = null): textAreaSelectedParams = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[textAreaSelectedParams]
  }
}

