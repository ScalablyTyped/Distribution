package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The parameter for [setContentInsets](Titanium.UI.TableView.setContentInsets) method.
  */
trait ListViewEdgeInsets extends js.Object {
  /**
  	 * Value specifying the bottom insets for the enclosing scroll view of the list view.
  	 */
  var bottom: js.UndefOr[Double] = js.undefined
  /**
  	 * Value specifying the left insets for the enclosing scroll view of the list view.
  	 */
  var left: js.UndefOr[Double] = js.undefined
  /**
  	 * Value specifying the right insets for the enclosing scroll view of the list view.
  	 */
  var right: js.UndefOr[Double] = js.undefined
  /**
  	 * Value specifying the top insets for the enclosing scroll view of the list view.
  	 */
  var top: js.UndefOr[Double] = js.undefined
}

object ListViewEdgeInsets {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): ListViewEdgeInsets = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewEdgeInsets]
  }
}

