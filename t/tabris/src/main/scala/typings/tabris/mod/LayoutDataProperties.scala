package typings.tabris.mod

import typings.tabris.tabrisStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutDataProperties extends js.Object {
  var baseline: js.UndefOr[auto | SiblingReference] = js.undefined
  var bottom: js.UndefOr[auto | Constraint] = js.undefined
  var centerX: js.UndefOr[auto | Offset] = js.undefined
  var centerY: js.UndefOr[auto | Offset] = js.undefined
  var height: js.UndefOr[auto | Dimension] = js.undefined
  var left: js.UndefOr[auto | Constraint] = js.undefined
  var right: js.UndefOr[auto | Constraint] = js.undefined
  var top: js.UndefOr[auto | Constraint] = js.undefined
  var width: js.UndefOr[auto | Dimension] = js.undefined
}

object LayoutDataProperties {
  @scala.inline
  def apply(
    baseline: auto | SiblingReference = null,
    bottom: auto | Constraint = null,
    centerX: auto | Offset = null,
    centerY: auto | Offset = null,
    height: auto | Dimension = null,
    left: auto | Constraint = null,
    right: auto | Constraint = null,
    top: auto | Constraint = null,
    width: auto | Dimension = null
  ): LayoutDataProperties = {
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
    __obj.asInstanceOf[LayoutDataProperties]
  }
}

