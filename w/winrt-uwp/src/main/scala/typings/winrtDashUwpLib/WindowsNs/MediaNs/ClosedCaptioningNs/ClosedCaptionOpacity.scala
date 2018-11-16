package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClosedCaptionOpacity extends js.Object

/** Specifies the opacity of closed caption text. */
@JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionOpacity")
@js.native
object ClosedCaptionOpacity extends js.Object {
  /** Default opacity. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionOpacity
  
  /** 100% opaque. */
  @js.native
  sealed trait oneHundredPercent
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionOpacity
  
  /** 75% opaque. */
  @js.native
  sealed trait seventyFivePercent
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionOpacity
  
  /** 25% opaque. */
  @js.native
  sealed trait twentyFivePercent
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionOpacity
  
  /** Completely transparent. */
  @js.native
  sealed trait zeroPercent
    extends winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionOpacity
  
  val default: default with java.lang.String = js.native
  val oneHundredPercent: oneHundredPercent with java.lang.String = js.native
  val seventyFivePercent: seventyFivePercent with java.lang.String = js.native
  val twentyFivePercent: twentyFivePercent with java.lang.String = js.native
  val zeroPercent: zeroPercent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionOpacity with java.lang.String
  ] = js.native
}

