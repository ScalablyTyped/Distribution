package typings.textBuffer.mod.global.TextBuffer.Options

import typings.textBuffer.mod.global.TextBuffer.PointCompatible
import typings.textBuffer.mod.global.TextBuffer.RangeCompatible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindMarker extends js.Object {
  /** Only include markers that contain the given Point, inclusive. */
  var containsPoint: js.UndefOr[PointCompatible] = js.undefined
  /** Only include markers that contain the given Range, inclusive. */
  var containsRange: js.UndefOr[RangeCompatible] = js.undefined
  /** Only include markers that end at the given Point. */
  var endPosition: js.UndefOr[PointCompatible] = js.undefined
  /** Only include markers that end at the given row number. */
  var endRow: js.UndefOr[Double] = js.undefined
  /** Only include markers that end inside the given Range. */
  var endsInRange: js.UndefOr[RangeCompatible] = js.undefined
  /** Only include markers that intersect the given row number. */
  var intersectsRow: js.UndefOr[Double] = js.undefined
  /** Only include markers that start at the given Point. */
  var startPosition: js.UndefOr[PointCompatible] = js.undefined
  /** Only include markers that start at the given row number. */
  var startRow: js.UndefOr[Double] = js.undefined
  /** Only include markers that start inside the given Range. */
  var startsInRange: js.UndefOr[RangeCompatible] = js.undefined
}

object FindMarker {
  @scala.inline
  def apply(
    containsPoint: PointCompatible = null,
    containsRange: RangeCompatible = null,
    endPosition: PointCompatible = null,
    endRow: js.UndefOr[Double] = js.undefined,
    endsInRange: RangeCompatible = null,
    intersectsRow: js.UndefOr[Double] = js.undefined,
    startPosition: PointCompatible = null,
    startRow: js.UndefOr[Double] = js.undefined,
    startsInRange: RangeCompatible = null
  ): FindMarker = {
    val __obj = js.Dynamic.literal()
    if (containsPoint != null) __obj.updateDynamic("containsPoint")(containsPoint.asInstanceOf[js.Any])
    if (containsRange != null) __obj.updateDynamic("containsRange")(containsRange.asInstanceOf[js.Any])
    if (endPosition != null) __obj.updateDynamic("endPosition")(endPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(endRow)) __obj.updateDynamic("endRow")(endRow.get.asInstanceOf[js.Any])
    if (endsInRange != null) __obj.updateDynamic("endsInRange")(endsInRange.asInstanceOf[js.Any])
    if (!js.isUndefined(intersectsRow)) __obj.updateDynamic("intersectsRow")(intersectsRow.get.asInstanceOf[js.Any])
    if (startPosition != null) __obj.updateDynamic("startPosition")(startPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(startRow)) __obj.updateDynamic("startRow")(startRow.get.asInstanceOf[js.Any])
    if (startsInRange != null) __obj.updateDynamic("startsInRange")(startsInRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindMarker]
  }
}

