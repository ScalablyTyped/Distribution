package typings.winrtDashUwp.Windows.Media.ClosedCaptioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClosedCaptionColor extends js.Object

/** Specifies the color of closed caption UI elements. */
@JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionColor")
@js.native
object ClosedCaptionColor extends js.Object {
  /** Black */
  @js.native
  sealed trait black extends ClosedCaptionColor
  
  /** Blue */
  @js.native
  sealed trait blue extends ClosedCaptionColor
  
  /** Cyan */
  @js.native
  sealed trait cyan extends ClosedCaptionColor
  
  /** The default color. */
  @js.native
  sealed trait default extends ClosedCaptionColor
  
  /** Green */
  @js.native
  sealed trait green extends ClosedCaptionColor
  
  /** Magenta */
  @js.native
  sealed trait magenta extends ClosedCaptionColor
  
  /** Red */
  @js.native
  sealed trait red extends ClosedCaptionColor
  
  /** White */
  @js.native
  sealed trait white extends ClosedCaptionColor
  
  /** Yellow */
  @js.native
  sealed trait yellow extends ClosedCaptionColor
  
  /* 2 */ val black: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.black with Double = js.native
  /* 5 */ val blue: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.blue with Double = js.native
  /* 8 */ val cyan: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.cyan with Double = js.native
  /* 0 */ val default: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.default with Double = js.native
  /* 4 */ val green: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.green with Double = js.native
  /* 7 */ val magenta: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.magenta with Double = js.native
  /* 3 */ val red: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.red with Double = js.native
  /* 1 */ val white: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.white with Double = js.native
  /* 6 */ val yellow: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.yellow with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClosedCaptionColor with Double] = js.native
}

