package typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs

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
  sealed trait default extends ClosedCaptionSize
  
  /** 50% text size. */
  @js.native
  sealed trait fiftyPercent extends ClosedCaptionSize
  
  /** 150% text size. */
  @js.native
  sealed trait oneHundredFiftyPercent extends ClosedCaptionSize
  
  /** 100% text size. */
  @js.native
  sealed trait oneHundredPercent extends ClosedCaptionSize
  
  /** 200% text size. */
  @js.native
  sealed trait twoHundredPercent extends ClosedCaptionSize
  
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionSize.default with Double = js.native
  /* 1 */ val fiftyPercent: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionSize.fiftyPercent with Double = js.native
  /* 3 */ val oneHundredFiftyPercent: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionSize.oneHundredFiftyPercent with Double = js.native
  /* 2 */ val oneHundredPercent: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionSize.oneHundredPercent with Double = js.native
  /* 4 */ val twoHundredPercent: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionSize.twoHundredPercent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClosedCaptionSize with Double] = js.native
}

