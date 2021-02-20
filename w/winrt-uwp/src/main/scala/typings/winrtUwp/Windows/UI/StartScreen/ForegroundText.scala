package typings.winrtUwp.Windows.UI.StartScreen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ForegroundText extends StObject
/** Specifies the color of the tile's foreground text. */
@JSGlobal("Windows.UI.StartScreen.ForegroundText")
@js.native
object ForegroundText extends StObject {
  
  /** A Windows-specified default dark text color. */
  @js.native
  sealed trait dark extends ForegroundText
  
  /** A Windows-specified default light text color. */
  @js.native
  sealed trait light extends ForegroundText
}
