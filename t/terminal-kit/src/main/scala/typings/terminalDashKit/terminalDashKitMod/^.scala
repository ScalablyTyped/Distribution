package typings.terminalDashKit.terminalDashKitMod

import typings.terminalDashKit.terminalMod.CreateOptions
import typings.terminalDashKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val realTerminal: Terminal = js.native
  val terminal: Terminal = js.native
  def autoComplete(array: js.Array[String], startString: String): String = js.native
  def autoComplete(array: js.Array[String], startString: String, returnAlternatives: Boolean): String = js.native
  def autoComplete(array: js.Array[String], startString: String, returnAlternatives: Boolean, prefix: String): String = js.native
  def autoComplete(
    array: js.Array[String],
    startString: String,
    returnAlternatives: Boolean,
    prefix: String,
    postfix: String
  ): String = js.native
  def createTerminal(): Terminal = js.native
  def createTerminal(createOptions: CreateOptions): Terminal = js.native
  def getDetectedTerminal(calback: js.Function2[/* error */ js.Any, /* term */ Terminal, Unit]): Unit = js.native
  def getParentTerminalInfo(
    callback: js.Function4[
      /* error */ js.Any, 
      /* codename */ js.UndefOr[String], 
      /* name */ js.UndefOr[String], 
      /* pid */ js.UndefOr[Double], 
      Unit
    ]
  ): Unit = js.native
  def stringWidth(str: String): Double = js.native
  def stripEscapeSequences(str: String): String = js.native
  def truncateString(str: String, maxWidth: Double): String = js.native
}

