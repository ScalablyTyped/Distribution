package typings.winrt.WindowsNs.UINs.StartScreenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ForegroundText extends js.Object

@JSGlobal("Windows.UI.StartScreen.ForegroundText")
@js.native
object ForegroundText extends js.Object {
  @js.native
  sealed trait dark extends ForegroundText
  
  @js.native
  sealed trait light extends ForegroundText
  
  /* 0 */ val dark: typings.winrt.WindowsNs.UINs.StartScreenNs.ForegroundText.dark with Double = js.native
  /* 1 */ val light: typings.winrt.WindowsNs.UINs.StartScreenNs.ForegroundText.light with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ForegroundText with Double] = js.native
}

