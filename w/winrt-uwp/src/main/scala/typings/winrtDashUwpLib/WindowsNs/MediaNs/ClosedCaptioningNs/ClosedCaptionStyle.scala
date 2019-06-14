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
  
  /* 5 */ val casual: casual with scala.Double = js.native
  /* 6 */ val cursive: cursive with scala.Double = js.native
  /* 0 */ val default: default with scala.Double = js.native
  /* 1 */ val monospacedWithSerifs: monospacedWithSerifs with scala.Double = js.native
  /* 3 */ val monospacedWithoutSerifs: monospacedWithoutSerifs with scala.Double = js.native
  /* 2 */ val proportionalWithSerifs: proportionalWithSerifs with scala.Double = js.native
  /* 4 */ val proportionalWithoutSerifs: proportionalWithoutSerifs with scala.Double = js.native
  /* 7 */ val smallCapitals: smallCapitals with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionStyle with scala.Double
  ] = js.native
}

