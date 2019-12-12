package typings.winrt.Windows.UI.StartScreen

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.UI.StartScreen.ForegroundText.dark
import typings.winrt.Windows.UI.StartScreen.ForegroundText.light
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ForegroundText with Double] = js.native
  /* 0 */ @js.native
  object dark extends TopLevel[dark with Double]
  
  /* 1 */ @js.native
  object light extends TopLevel[light with Double]
  
}

