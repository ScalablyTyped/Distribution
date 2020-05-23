package typings.textBuffer.mod.global.TextBuffer.Options

import typings.textBuffer.mod.global.TextBuffer.PointCompatible
import typings.textBuffer.mod.global.TextBuffer.RangeCompatible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindDisplayMarker extends js.Object {
  /** Only include markers contained in this Range in buffer coordinates. */
  var containedInBufferRange: js.UndefOr[RangeCompatible] = js.undefined
  /** Only include markers contained in this Range in screen coordinates. */
  var containedInScreenRange: js.UndefOr[RangeCompatible] = js.undefined
  /** Only include markers containing this Point in buffer coordinates. */
  var containsBufferPosition: js.UndefOr[PointCompatible] = js.undefined
  /** Only include markers containing this Range in buffer coordinates. */
  var containsBufferRange: js.UndefOr[RangeCompatible] = js.undefined
  /** Only include markers ending at this Point in buffer coordinates. */
  var endBufferPosition: js.UndefOr[PointCompatible] = js.undefined
  /** Only include markers ending at this row in buffer coordinates. */
  var endBufferRow: js.UndefOr[Double] = js.undefined
  /** Only include markers ending at this Point in screen coordinates. */
  var endScreenPosition: js.UndefOr[PointCompatible] = js.undefined
  /** Only include markers ending at this row in screen coordinates. */
  var endScreenRow: js.UndefOr[Double] = js.undefined
  /** Only include markers ending inside this Range in buffer coordinates. */
  var endsInBufferRange: js.UndefOr[RangeCompatible] = js.undefined
  /** Only include markers ending inside this Range in screen coordinates. */
  var endsInScreenRange: js.UndefOr[RangeCompatible] = js.undefined
  /** Only include markers intersecting this Range in buffer coordinates. */
  var intersectsBufferRange: js.UndefOr[RangeCompatible] = js.undefined
  /**
    *  Only include markers intersecting this Array of [startRow, endRow] in
    *  buffer coordinates.
    */
  var intersectsBufferRowRange: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  /** Only include markers intersecting this Range in screen coordinates. */
  var intersectsScreenRange: js.UndefOr[RangeCompatible] = js.undefined
  /**
    *  Only include markers intersecting this Array of [startRow, endRow] in
    *  screen coordinates.
    */
  var intersectsScreenRowRange: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  /** Only include markers starting at this Point in buffer coordinates. */
  var startBufferPosition: js.UndefOr[PointCompatible] = js.undefined
  /** Only include markers starting at this row in buffer coordinates. */
  var startBufferRow: js.UndefOr[Double] = js.undefined
  /** Only include markers starting at this Point in screen coordinates. */
  var startScreenPosition: js.UndefOr[PointCompatible] = js.undefined
  /** Only include markers starting at this row in screen coordinates. */
  var startScreenRow: js.UndefOr[Double] = js.undefined
  /** Only include markers starting inside this Range in buffer coordinates. */
  var startsInBufferRange: js.UndefOr[RangeCompatible] = js.undefined
  /** Only include markers starting inside this Range in screen coordinates. */
  var startsInScreenRange: js.UndefOr[RangeCompatible] = js.undefined
}

object FindDisplayMarker {
  @scala.inline
  def apply(
    containedInBufferRange: RangeCompatible = null,
    containedInScreenRange: RangeCompatible = null,
    containsBufferPosition: PointCompatible = null,
    containsBufferRange: RangeCompatible = null,
    endBufferPosition: PointCompatible = null,
    endBufferRow: js.UndefOr[Double] = js.undefined,
    endScreenPosition: PointCompatible = null,
    endScreenRow: js.UndefOr[Double] = js.undefined,
    endsInBufferRange: RangeCompatible = null,
    endsInScreenRange: RangeCompatible = null,
    intersectsBufferRange: RangeCompatible = null,
    intersectsBufferRowRange: js.Tuple2[Double, Double] = null,
    intersectsScreenRange: RangeCompatible = null,
    intersectsScreenRowRange: js.Tuple2[Double, Double] = null,
    startBufferPosition: PointCompatible = null,
    startBufferRow: js.UndefOr[Double] = js.undefined,
    startScreenPosition: PointCompatible = null,
    startScreenRow: js.UndefOr[Double] = js.undefined,
    startsInBufferRange: RangeCompatible = null,
    startsInScreenRange: RangeCompatible = null
  ): FindDisplayMarker = {
    val __obj = js.Dynamic.literal()
    if (containedInBufferRange != null) __obj.updateDynamic("containedInBufferRange")(containedInBufferRange.asInstanceOf[js.Any])
    if (containedInScreenRange != null) __obj.updateDynamic("containedInScreenRange")(containedInScreenRange.asInstanceOf[js.Any])
    if (containsBufferPosition != null) __obj.updateDynamic("containsBufferPosition")(containsBufferPosition.asInstanceOf[js.Any])
    if (containsBufferRange != null) __obj.updateDynamic("containsBufferRange")(containsBufferRange.asInstanceOf[js.Any])
    if (endBufferPosition != null) __obj.updateDynamic("endBufferPosition")(endBufferPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(endBufferRow)) __obj.updateDynamic("endBufferRow")(endBufferRow.get.asInstanceOf[js.Any])
    if (endScreenPosition != null) __obj.updateDynamic("endScreenPosition")(endScreenPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(endScreenRow)) __obj.updateDynamic("endScreenRow")(endScreenRow.get.asInstanceOf[js.Any])
    if (endsInBufferRange != null) __obj.updateDynamic("endsInBufferRange")(endsInBufferRange.asInstanceOf[js.Any])
    if (endsInScreenRange != null) __obj.updateDynamic("endsInScreenRange")(endsInScreenRange.asInstanceOf[js.Any])
    if (intersectsBufferRange != null) __obj.updateDynamic("intersectsBufferRange")(intersectsBufferRange.asInstanceOf[js.Any])
    if (intersectsBufferRowRange != null) __obj.updateDynamic("intersectsBufferRowRange")(intersectsBufferRowRange.asInstanceOf[js.Any])
    if (intersectsScreenRange != null) __obj.updateDynamic("intersectsScreenRange")(intersectsScreenRange.asInstanceOf[js.Any])
    if (intersectsScreenRowRange != null) __obj.updateDynamic("intersectsScreenRowRange")(intersectsScreenRowRange.asInstanceOf[js.Any])
    if (startBufferPosition != null) __obj.updateDynamic("startBufferPosition")(startBufferPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(startBufferRow)) __obj.updateDynamic("startBufferRow")(startBufferRow.get.asInstanceOf[js.Any])
    if (startScreenPosition != null) __obj.updateDynamic("startScreenPosition")(startScreenPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(startScreenRow)) __obj.updateDynamic("startScreenRow")(startScreenRow.get.asInstanceOf[js.Any])
    if (startsInBufferRange != null) __obj.updateDynamic("startsInBufferRange")(startsInBufferRange.asInstanceOf[js.Any])
    if (startsInScreenRange != null) __obj.updateDynamic("startsInScreenRange")(startsInScreenRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindDisplayMarker]
  }
}

