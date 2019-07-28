package typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs

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
  
  /* 2 */ val black: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionColor.black with Double = js.native
  /* 5 */ val blue: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionColor.blue with Double = js.native
  /* 8 */ val cyan: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionColor.cyan with Double = js.native
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionColor.default with Double = js.native
  /* 4 */ val green: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionColor.green with Double = js.native
  /* 7 */ val magenta: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionColor.magenta with Double = js.native
  /* 3 */ val red: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionColor.red with Double = js.native
  /* 1 */ val white: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionColor.white with Double = js.native
  /* 6 */ val yellow: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionColor.yellow with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClosedCaptionColor with Double] = js.native
}

