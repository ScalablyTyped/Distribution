package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyMarker extends js.Object {
  /**
    *  Indicates whether insertions at the start or end of the marked range should
    *  be interpreted as happening outside the marker.
    */
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  /** Determines the rules by which changes to the buffer invalidate the marker. */
  var invalidate: js.UndefOr[
    textDashBufferLib.textDashBufferLibStrings.never | textDashBufferLib.textDashBufferLibStrings.surround | textDashBufferLib.textDashBufferLibStrings.overlap | textDashBufferLib.textDashBufferLibStrings.inside | textDashBufferLib.textDashBufferLibStrings.touch
  ] = js.undefined
  /**
    *  Custom properties to be associated with the marker.
    *  @deprecated
    */
  var properties: js.UndefOr[js.Object] = js.undefined
  /** Creates the marker in a reversed orientation. */
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not the marker should be tailed. */
  var tailed: js.UndefOr[scala.Boolean] = js.undefined
}

object CopyMarker {
  @scala.inline
  def apply(
    exclusive: js.UndefOr[scala.Boolean] = js.undefined,
    invalidate: textDashBufferLib.textDashBufferLibStrings.never | textDashBufferLib.textDashBufferLibStrings.surround | textDashBufferLib.textDashBufferLibStrings.overlap | textDashBufferLib.textDashBufferLibStrings.inside | textDashBufferLib.textDashBufferLibStrings.touch = null,
    properties: js.Object = null,
    reversed: js.UndefOr[scala.Boolean] = js.undefined,
    tailed: js.UndefOr[scala.Boolean] = js.undefined
  ): CopyMarker = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    if (!js.isUndefined(tailed)) __obj.updateDynamic("tailed")(tailed)
    __obj.asInstanceOf[CopyMarker]
  }
}

