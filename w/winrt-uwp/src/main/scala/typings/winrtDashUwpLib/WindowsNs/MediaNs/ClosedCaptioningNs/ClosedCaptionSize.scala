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
  
  val default: default with java.lang.String = js.native
  val fiftyPercent: fiftyPercent with java.lang.String = js.native
  val oneHundredFiftyPercent: oneHundredFiftyPercent with java.lang.String = js.native
  val oneHundredPercent: oneHundredPercent with java.lang.String = js.native
  val twoHundredPercent: twoHundredPercent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionSize with java.lang.String
  ] = js.native
}

