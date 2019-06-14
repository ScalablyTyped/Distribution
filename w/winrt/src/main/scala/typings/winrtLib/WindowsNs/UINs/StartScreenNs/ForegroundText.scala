package typings
package winrtLib.WindowsNs.UINs.StartScreenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ForegroundText extends js.Object

@JSGlobal("Windows.UI.StartScreen.ForegroundText")
@js.native
object ForegroundText extends js.Object {
  @js.native
  sealed trait dark
    extends winrtLib.WindowsNs.UINs.StartScreenNs.ForegroundText
  
  @js.native
  sealed trait light
    extends winrtLib.WindowsNs.UINs.StartScreenNs.ForegroundText
  
  /* 0 */ val dark: dark with scala.Double = js.native
  /* 1 */ val light: light with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.StartScreenNs.ForegroundText with scala.Double] = js.native
}

