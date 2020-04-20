package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary object of parameters for horizontal-only insets applied to [Table](Titanium.UI.TableView) and [List](Titanium.UI.ListView) views. Only `left` and `right` properties are used (see <Padding>).
  */
trait HorizontalInsets extends js.Object {
  /**
  	 * Left padding/inset
  	 */
  var left: js.UndefOr[Double] = js.undefined
  /**
  	 * Right padding/inset
  	 */
  var right: js.UndefOr[Double] = js.undefined
}

object HorizontalInsets {
  @scala.inline
  def apply(left: Int | Double = null, right: Int | Double = null): HorizontalInsets = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalInsets]
  }
}

