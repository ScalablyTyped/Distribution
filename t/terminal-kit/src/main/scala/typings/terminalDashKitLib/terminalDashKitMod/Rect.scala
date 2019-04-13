package typings
package terminalDashKitLib.terminalDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit", "Rect")
@js.native
class Rect protected ()
  extends terminalDashKitLib.rectMod.^ {
  def this(options: terminalDashKitLib.rectMod.AbsoluteOptions) = this()
  def this(options: terminalDashKitLib.rectMod.Rect) = this()
  def this(options: terminalDashKitLib.rectMod.Region) = this()
  def this(options: terminalDashKitLib.screenBufferMod.^) = this()
  def this(options: terminalDashKitLib.terminalMod.Terminal) = this()
  def this(options: terminalDashKitLib.textBufferMod.^) = this()
  def this(xmin: scala.Double, xmax: scala.Double, ymin: scala.Double, ymax: scala.Double) = this()
}

/* static members */
@JSImport("terminal-kit", "Rect")
@js.native
object Rect extends js.Object {
  def wrappingRect(params: terminalDashKitLib.Anon_DstRect): scala.Unit = js.native
}

