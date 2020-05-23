package typings.terminalKit.mod

import typings.terminalKit.anon.DstRect
import typings.terminalKit.rectMod.AbsoluteOptions
import typings.terminalKit.rectMod.Region
import typings.terminalKit.rectMod.^
import typings.terminalKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit", "Rect")
@js.native
class Rect protected () extends ^ {
  def this(options: AbsoluteOptions) = this()
  def this(options: typings.terminalKit.rectMod.Rect) = this()
  def this(options: Region) = this()
  def this(options: typings.terminalKit.screenBufferMod.^) = this()
  def this(options: Terminal) = this()
  def this(options: typings.terminalKit.textBufferMod.^) = this()
  def this(xmin: Double, xmax: Double, ymin: Double, ymax: Double) = this()
}

/* static members */
@JSImport("terminal-kit", "Rect")
@js.native
object Rect extends js.Object {
  def wrappingRect(params: DstRect): Unit = js.native
}

