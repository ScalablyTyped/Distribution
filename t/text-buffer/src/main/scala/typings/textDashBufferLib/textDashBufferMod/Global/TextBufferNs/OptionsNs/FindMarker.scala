package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindMarker extends js.Object {
  /** Only include markers that contain the given Point, inclusive. */
  var containsPoint: js.UndefOr[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.PointCompatible] = js.undefined
  /** Only include markers that contain the given Range, inclusive. */
  var containsRange: js.UndefOr[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.RangeCompatible] = js.undefined
  /** Only include markers that end at the given Point. */
  var endPosition: js.UndefOr[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.PointCompatible] = js.undefined
  /** Only include markers that end at the given row number. */
  var endRow: js.UndefOr[scala.Double] = js.undefined
  /** Only include markers that end inside the given Range. */
  var endsInRange: js.UndefOr[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.RangeCompatible] = js.undefined
  /** Only include markers that intersect the given row number. */
  var intersectsRow: js.UndefOr[scala.Double] = js.undefined
  /** Only include markers that start at the given Point. */
  var startPosition: js.UndefOr[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.PointCompatible] = js.undefined
  /** Only include markers that start at the given row number. */
  var startRow: js.UndefOr[scala.Double] = js.undefined
  /** Only include markers that start inside the given Range. */
  var startsInRange: js.UndefOr[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.RangeCompatible] = js.undefined
}

object FindMarker {
  @scala.inline
  def apply(
    containsPoint: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.PointCompatible = null,
    containsRange: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.RangeCompatible = null,
    endPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.PointCompatible = null,
    endRow: scala.Int | scala.Double = null,
    endsInRange: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.RangeCompatible = null,
    intersectsRow: scala.Int | scala.Double = null,
    startPosition: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.PointCompatible = null,
    startRow: scala.Int | scala.Double = null,
    startsInRange: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.RangeCompatible = null
  ): FindMarker = {
    val __obj = js.Dynamic.literal()
    if (containsPoint != null) __obj.updateDynamic("containsPoint")(containsPoint.asInstanceOf[js.Any])
    if (containsRange != null) __obj.updateDynamic("containsRange")(containsRange.asInstanceOf[js.Any])
    if (endPosition != null) __obj.updateDynamic("endPosition")(endPosition.asInstanceOf[js.Any])
    if (endRow != null) __obj.updateDynamic("endRow")(endRow.asInstanceOf[js.Any])
    if (endsInRange != null) __obj.updateDynamic("endsInRange")(endsInRange.asInstanceOf[js.Any])
    if (intersectsRow != null) __obj.updateDynamic("intersectsRow")(intersectsRow.asInstanceOf[js.Any])
    if (startPosition != null) __obj.updateDynamic("startPosition")(startPosition.asInstanceOf[js.Any])
    if (startRow != null) __obj.updateDynamic("startRow")(startRow.asInstanceOf[js.Any])
    if (startsInRange != null) __obj.updateDynamic("startsInRange")(startsInRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindMarker]
  }
}

