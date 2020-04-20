package typings.tabris.mod

import typings.tabris.tabrisBooleans.`true`
import typings.tabris.tabrisStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutDataLikeObject extends LayoutDataValue {
  var baseline: js.UndefOr[auto | SiblingReferenceValue | `true`] = js.undefined
  var bottom: js.UndefOr[auto | ConstraintValue] = js.undefined
  var centerX: js.UndefOr[auto | Offset | `true`] = js.undefined
  var centerY: js.UndefOr[auto | Offset | `true`] = js.undefined
  var height: js.UndefOr[auto | Dimension] = js.undefined
  var left: js.UndefOr[auto | ConstraintValue] = js.undefined
  var right: js.UndefOr[auto | ConstraintValue] = js.undefined
  var top: js.UndefOr[auto | ConstraintValue] = js.undefined
  var width: js.UndefOr[auto | Dimension] = js.undefined
}

object LayoutDataLikeObject {
  @scala.inline
  def apply(
    baseline: auto | SiblingReferenceValue | `true` = null,
    bottom: auto | ConstraintValue = null,
    centerX: auto | Offset | `true` = null,
    centerY: auto | Offset | `true` = null,
    height: auto | Dimension = null,
    left: auto | ConstraintValue = null,
    right: auto | ConstraintValue = null,
    top: auto | ConstraintValue = null,
    width: auto | Dimension = null
  ): LayoutDataLikeObject = {
    val __obj = js.Dynamic.literal()
    if (baseline != null) __obj.updateDynamic("baseline")(baseline.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (centerX != null) __obj.updateDynamic("centerX")(centerX.asInstanceOf[js.Any])
    if (centerY != null) __obj.updateDynamic("centerY")(centerY.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutDataLikeObject]
  }
}

