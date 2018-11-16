package typings
package winrtDashUwpLib.WindowsNs.UINs.StartScreenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ForegroundText extends js.Object

/** Specifies the color of the tile's foreground text. */
@JSGlobal("Windows.UI.StartScreen.ForegroundText")
@js.native
object ForegroundText extends js.Object {
  /** A Windows-specified default dark text color. */
  @js.native
  sealed trait dark
    extends winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.ForegroundText
  
  /** A Windows-specified default light text color. */
  @js.native
  sealed trait light
    extends winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.ForegroundText
  
  val dark: dark with java.lang.String = js.native
  val light: light with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.ForegroundText with java.lang.String
  ] = js.native
}

