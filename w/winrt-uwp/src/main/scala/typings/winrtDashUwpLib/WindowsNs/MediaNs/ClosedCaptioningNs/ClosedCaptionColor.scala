package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs

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
  sealed trait black
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionColor
  
  /** Blue */
  @js.native
  sealed trait blue
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionColor
  
  /** Cyan */
  @js.native
  sealed trait cyan
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionColor
  
  /** The default color. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionColor
  
  /** Green */
  @js.native
  sealed trait green
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionColor
  
  /** Magenta */
  @js.native
  sealed trait magenta
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionColor
  
  /** Red */
  @js.native
  sealed trait red
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionColor
  
  /** White */
  @js.native
  sealed trait white
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionColor
  
  /** Yellow */
  @js.native
  sealed trait yellow
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionColor
  
  /* 2 */ val black: black with scala.Double = js.native
  /* 5 */ val blue: blue with scala.Double = js.native
  /* 8 */ val cyan: cyan with scala.Double = js.native
  /* 0 */ val default: default with scala.Double = js.native
  /* 4 */ val green: green with scala.Double = js.native
  /* 7 */ val magenta: magenta with scala.Double = js.native
  /* 3 */ val red: red with scala.Double = js.native
  /* 1 */ val white: white with scala.Double = js.native
  /* 6 */ val yellow: yellow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionColor with scala.Double
  ] = js.native
}

