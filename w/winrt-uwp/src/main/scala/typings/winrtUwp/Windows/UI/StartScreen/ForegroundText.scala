package typings.winrtUwp.Windows.UI.StartScreen

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
  
}

