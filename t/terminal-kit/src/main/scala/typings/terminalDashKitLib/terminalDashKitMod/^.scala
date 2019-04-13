package typings
package terminalDashKitLib.terminalDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val realTerminal: terminalDashKitLib.terminalMod.Terminal = js.native
  val terminal: terminalDashKitLib.terminalMod.Terminal = js.native
  def autoComplete(array: js.Array[java.lang.String], startString: java.lang.String): java.lang.String = js.native
  def autoComplete(
    array: js.Array[java.lang.String],
    startString: java.lang.String,
    returnAlternatives: scala.Boolean
  ): java.lang.String = js.native
  def autoComplete(
    array: js.Array[java.lang.String],
    startString: java.lang.String,
    returnAlternatives: scala.Boolean,
    prefix: java.lang.String
  ): java.lang.String = js.native
  def autoComplete(
    array: js.Array[java.lang.String],
    startString: java.lang.String,
    returnAlternatives: scala.Boolean,
    prefix: java.lang.String,
    postfix: java.lang.String
  ): java.lang.String = js.native
  def createTerminal(): terminalDashKitLib.terminalMod.Terminal = js.native
  def createTerminal(createOptions: terminalDashKitLib.terminalMod.CreateOptions): terminalDashKitLib.terminalMod.Terminal = js.native
  def getDetectedTerminal(
    calback: js.Function2[/* error */ js.Any, /* term */ terminalDashKitLib.terminalMod.Terminal, scala.Unit]
  ): scala.Unit = js.native
  def getParentTerminalInfo(
    callback: js.Function4[
      /* error */ js.Any, 
      /* codename */ js.UndefOr[java.lang.String], 
      /* name */ js.UndefOr[java.lang.String], 
      /* pid */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def stringWidth(str: java.lang.String): scala.Double = js.native
  def stripEscapeSequences(str: java.lang.String): java.lang.String = js.native
  def truncateString(str: java.lang.String, maxWidth: scala.Double): java.lang.String = js.native
}

