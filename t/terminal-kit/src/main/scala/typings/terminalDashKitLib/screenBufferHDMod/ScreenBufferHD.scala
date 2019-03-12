package typings
package terminalDashKitLib.screenBufferHDMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenBufferHD
  extends terminalDashKitLib.screenBufferMod.namespaced {
  @JSName("blending")
  val blending_ScreenBufferHD: terminalDashKitLib.screenBufferHDMod.ScreenBufferHDNs.IsBlending = js.native
  def draw(options: terminalDashKitLib.Anon_Blending): scala.Unit = js.native
  def fill(options: terminalDashKitLib.Anon_AttrCharAttributesNumber): scala.Unit = js.native
}

