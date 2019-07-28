package typings.terminalDashKit.terminalDashKitMod

import typings.terminalDashKit.Anon_DstRect
import typings.terminalDashKit.rectMod.AbsoluteOptions
import typings.terminalDashKit.rectMod.Region
import typings.terminalDashKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit", "Rect")
@js.native
class Rect protected ()
  extends typings.terminalDashKit.rectMod.^ {
  def this(options: AbsoluteOptions) = this()
  def this(options: typings.terminalDashKit.rectMod.Rect) = this()
  def this(options: Region) = this()
  def this(options: typings.terminalDashKit.screenBufferMod.^) = this()
  def this(options: Terminal) = this()
  def this(options: typings.terminalDashKit.textBufferMod.^) = this()
  def this(xmin: Double, xmax: Double, ymin: Double, ymax: Double) = this()
}

/* static members */
@JSImport("terminal-kit", "Rect")
@js.native
object Rect extends js.Object {
  def wrappingRect(params: Anon_DstRect): Unit = js.native
}

