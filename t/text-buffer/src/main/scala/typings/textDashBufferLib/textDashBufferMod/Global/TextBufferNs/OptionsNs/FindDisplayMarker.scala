package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindDisplayMarker extends js.Object {
  /** Only include markers contained in this Range in buffer coordinates. */
  var containedInBufferRange: js.UndefOr[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.RangeCompatible] = js.undefined
  /** Only include markers contained in this Range in screen coordinates. */
  var containedInScreenRange: js.UndefOr[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.RangeCompatible] = js.undefined
  /** Only include markers containing this Point in buffer coordinates. */
  var containsBufferPosition: js.UndefOr[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.PointCompatible] = js.undefined
  /** Only include markers containing this Range in buffer coordinates. */
  var containsBufferRange: js.UndefOr[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.RangeCompatible] = js.undefined
  /** Only include markers ending at this Point in buffer coordinates. */
  var endBufferPosition: js.UndefOr[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.PointCompatible] = js.undefined
  /** Only include markers ending at this row in buffer coordinates. */
  var endBufferRow: js.UndefOr[scala.Double] = js.undefined
  /** Only include markers ending at this Point in screen coordinates. */
  var endScreenPosition: js.UndefOr[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.PointCompatible] = js.undefined
  /** Only include markers ending at this row in screen coordinates. */
  var endScreenRow: js.UndefOr[scala.Double] = js.undefined
  /** Only include markers ending inside this Range in buffer coordinates. */
  var endsInBufferRange: js.UndefOr[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.RangeCompatible] = js.undefined
  /** Only include markers ending inside this Range in screen coordinates. */
  var endsInScreenRange: js.UndefOr[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.RangeCompatible] = js.undefined
  /** Only include markers intersecting this Range in buffer coordinates. */
  var intersectsBufferRange: js.UndefOr[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.RangeCompatible] = js.undefined
  /**
    *  Only include markers intersecting this Array of [startRow, endRow] in
    *  buffer coordinates.
    */
  var intersectsBufferRowRange: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  /** Only include markers intersecting this Range in screen coordinates. */
  var intersectsScreenRange: js.UndefOr[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.RangeCompatible] = js.undefined
  /**
    *  Only include markers intersecting this Array of [startRow, endRow] in
    *  screen coordinates.
    */
  var intersectsScreenRowRange: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  /** Only include markers starting at this Point in buffer coordinates. */
  var startBufferPosition: js.UndefOr[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.PointCompatible] = js.undefined
  /** Only include markers starting at this row in buffer coordinates. */
  var startBufferRow: js.UndefOr[scala.Double] = js.undefined
  /** Only include markers starting at this Point in screen coordinates. */
  var startScreenPosition: js.UndefOr[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.PointCompatible] = js.undefined
  /** Only include markers starting at this row in screen coordinates. */
  var startScreenRow: js.UndefOr[scala.Double] = js.undefined
  /** Only include markers starting inside this Range in buffer coordinates. */
  var startsInBufferRange: js.UndefOr[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.RangeCompatible] = js.undefined
  /** Only include markers starting inside this Range in screen coordinates. */
  var startsInScreenRange: js.UndefOr[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.RangeCompatible] = js.undefined
}

