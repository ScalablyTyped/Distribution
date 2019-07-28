package typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs

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
  sealed trait default extends ClosedCaptionOpacity
  
  /** 100% opaque. */
  @js.native
  sealed trait oneHundredPercent extends ClosedCaptionOpacity
  
  /** 75% opaque. */
  @js.native
  sealed trait seventyFivePercent extends ClosedCaptionOpacity
  
  /** 25% opaque. */
  @js.native
  sealed trait twentyFivePercent extends ClosedCaptionOpacity
  
  /** Completely transparent. */
  @js.native
  sealed trait zeroPercent extends ClosedCaptionOpacity
  
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionOpacity.default with Double = js.native
  /* 1 */ val oneHundredPercent: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionOpacity.oneHundredPercent with Double = js.native
  /* 2 */ val seventyFivePercent: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionOpacity.seventyFivePercent with Double = js.native
  /* 3 */ val twentyFivePercent: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionOpacity.twentyFivePercent with Double = js.native
  /* 4 */ val zeroPercent: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionOpacity.zeroPercent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClosedCaptionOpacity with Double] = js.native
}

