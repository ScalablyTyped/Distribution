package typings
package terminalDashKitLib.screenbufferhdMod.ScreenBufferHDNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blending extends IsBlending {
  var blendSrcFgWithDstBg: scala.Boolean = js.native
  @JSName("fn")
  var fn_Original: BlendFunction = js.native
  var opacity: scala.Double = js.native
  def fn(src: scala.Double, dst: scala.Double): scala.Double = js.native
}

