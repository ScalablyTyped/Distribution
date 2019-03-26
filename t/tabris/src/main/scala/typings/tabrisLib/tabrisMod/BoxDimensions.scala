package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents dimensions on four edges of a box, as used for padding.
  */
trait BoxDimensions extends js.Object {
  /**
    * The bottom part, in dip.
    */
  var bottom: js.UndefOr[scala.Double] = js.undefined
  /**
    * The left part, in dip.
    */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
    * The right part, in dip.
    */
  var right: js.UndefOr[scala.Double] = js.undefined
  /**
    * The top part, in dip.
    */
  var top: js.UndefOr[scala.Double] = js.undefined
}

object BoxDimensions {
  @scala.inline
  def apply(
    bottom: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    right: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null
  ): BoxDimensions = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxDimensions]
  }
}

