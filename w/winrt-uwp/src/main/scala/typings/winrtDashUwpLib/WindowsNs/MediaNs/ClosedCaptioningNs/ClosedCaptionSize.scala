package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClosedCaptionSize extends js.Object

/** Specifies the size of closed caption text. */
@JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionSize")
@js.native
object ClosedCaptionSize extends js.Object {
  /** Default text size. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionSize
  
  /** 50% text size. */
  @js.native
  sealed trait fiftyPercent
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionSize
  
  /** 150% text size. */
  @js.native
  sealed trait oneHundredFiftyPercent
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionSize
  
  /** 100% text size. */
  @js.native
  sealed trait oneHundredPercent
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionSize
  
  /** 200% text size. */
  @js.native
  sealed trait twoHundredPercent
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionSize
  
  /* 0 */ val default: default with scala.Double = js.native
  /* 1 */ val fiftyPercent: fiftyPercent with scala.Double = js.native
  /* 3 */ val oneHundredFiftyPercent: oneHundredFiftyPercent with scala.Double = js.native
  /* 2 */ val oneHundredPercent: oneHundredPercent with scala.Double = js.native
  /* 4 */ val twoHundredPercent: twoHundredPercent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionSize with scala.Double
  ] = js.native
}

