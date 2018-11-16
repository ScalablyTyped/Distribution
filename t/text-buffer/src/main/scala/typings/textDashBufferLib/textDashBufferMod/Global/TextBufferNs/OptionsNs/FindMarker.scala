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

