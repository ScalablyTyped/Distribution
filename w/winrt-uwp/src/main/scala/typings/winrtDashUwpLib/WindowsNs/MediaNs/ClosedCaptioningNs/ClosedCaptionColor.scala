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
  
  val black: black with java.lang.String = js.native
  val blue: blue with java.lang.String = js.native
  val cyan: cyan with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val green: green with java.lang.String = js.native
  val magenta: magenta with java.lang.String = js.native
  val red: red with java.lang.String = js.native
  val white: white with java.lang.String = js.native
  val yellow: yellow with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionColor with java.lang.String
  ] = js.native
}

