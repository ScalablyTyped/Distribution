package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClosedCaptionStyle extends js.Object

/** Specifies the style of closed caption text. */
@JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionStyle")
@js.native
object ClosedCaptionStyle extends js.Object {
  /** Casual. */
  @js.native
  sealed trait casual
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionStyle
  
  /** Cursive. */
  @js.native
  sealed trait cursive
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionStyle
  
  /** The default style. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionStyle
  
  /** Monospaced with serifs. */
  @js.native
  sealed trait monospacedWithSerifs
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionStyle
  
  /** Monospaced without serifs */
  @js.native
  sealed trait monospacedWithoutSerifs
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionStyle
  
  /** Proportional with serifs. */
  @js.native
  sealed trait proportionalWithSerifs
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionStyle
  
  /** Proportional without serifs. */
  @js.native
  sealed trait proportionalWithoutSerifs
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionStyle
  
  /** Small capitals. */
  @js.native
  sealed trait smallCapitals
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionStyle
  
  val casual: casual with java.lang.String = js.native
  val cursive: cursive with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val monospacedWithSerifs: monospacedWithSerifs with java.lang.String = js.native
  val monospacedWithoutSerifs: monospacedWithoutSerifs with java.lang.String = js.native
  val proportionalWithSerifs: proportionalWithSerifs with java.lang.String = js.native
  val proportionalWithoutSerifs: proportionalWithoutSerifs with java.lang.String = js.native
  val smallCapitals: smallCapitals with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionStyle with java.lang.String
  ] = js.native
}

