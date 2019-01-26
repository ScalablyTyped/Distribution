package typings
package terminalDashKitLib.screenbufferMod.ScreenBufferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawOptions extends js.Object {
  var blending: js.UndefOr[scala.Boolean] = js.undefined
  var delta: js.UndefOr[scala.Boolean] = js.undefined
  var dst: js.UndefOr[
    terminalDashKitLib.terminalMod.Terminal | terminalDashKitLib.screenbufferMod.ScreenBuffer
  ] = js.undefined
  var dstClipRect: js.UndefOr[terminalDashKitLib.rectMod.namespaced] = js.undefined
  var srcClipRect: js.UndefOr[terminalDashKitLib.rectMod.namespaced] = js.undefined
  var tile: js.UndefOr[scala.Boolean] = js.undefined
  var wrap: js.UndefOr[
    scala.Boolean | terminalDashKitLib.terminalDashKitLibStrings.x | terminalDashKitLib.terminalDashKitLibStrings.y
  ] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

