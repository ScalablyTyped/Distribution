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
  
  val dark: dark with java.lang.String = js.native
  val light: light with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.StartScreenNs.ForegroundText with java.lang.String] = js.native
}

