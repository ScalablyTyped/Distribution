package typings.textDashBuffer.textDashBufferMod.Global.TextBufferNs.OptionsNs

import typings.textDashBuffer.textDashBufferStrings.inside
import typings.textDashBuffer.textDashBufferStrings.never
import typings.textDashBuffer.textDashBufferStrings.overlap
import typings.textDashBuffer.textDashBufferStrings.surround
import typings.textDashBuffer.textDashBufferStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyMarker extends js.Object {
  /**
    *  Indicates whether insertions at the start or end of the marked range should
    *  be interpreted as happening outside the marker.
    */
  var exclusive: js.UndefOr[Boolean] = js.undefined
  /** Determines the rules by which changes to the buffer invalidate the marker. */
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
  /**
    *  Custom properties to be associated with the marker.
    *  @deprecated
    */
  var properties: js.UndefOr[js.Object] = js.undefined
  /** Creates the marker in a reversed orientation. */
  var reversed: js.UndefOr[Boolean] = js.undefined
  /** Whether or not the marker should be tailed. */
  var tailed: js.UndefOr[Boolean] = js.undefined
}

object CopyMarker {
  @scala.inline
  def apply(
    exclusive: js.UndefOr[Boolean] = js.undefined,
    invalidate: never | surround | overlap | inside | touch = null,
    properties: js.Object = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    tailed: js.UndefOr[Boolean] = js.undefined
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

