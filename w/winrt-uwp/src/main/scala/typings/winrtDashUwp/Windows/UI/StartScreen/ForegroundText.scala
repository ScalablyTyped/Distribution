package typings.winrtDashUwp.Windows.UI.StartScreen

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.UI.StartScreen.ForegroundText.dark
import typings.winrtDashUwp.Windows.UI.StartScreen.ForegroundText.light
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
  sealed trait dark extends ForegroundText
  
  /** A Windows-specified default light text color. */
  @js.native
  sealed trait light extends ForegroundText
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ForegroundText with Double] = js.native
  /* 0 */ @js.native
  object dark extends TopLevel[dark with Double]
  
  /* 1 */ @js.native
  object light extends TopLevel[light with Double]
  
}

