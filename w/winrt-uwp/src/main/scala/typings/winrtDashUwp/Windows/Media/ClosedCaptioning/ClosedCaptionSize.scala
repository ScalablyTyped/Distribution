package typings.winrtDashUwp.Windows.Media.ClosedCaptioning

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
  
  /* 0 */ val default: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize.default with Double = js.native
  /* 1 */ val fiftyPercent: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize.fiftyPercent with Double = js.native
  /* 3 */ val oneHundredFiftyPercent: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize.oneHundredFiftyPercent with Double = js.native
  /* 2 */ val oneHundredPercent: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize.oneHundredPercent with Double = js.native
  /* 4 */ val twoHundredPercent: typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize.twoHundredPercent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClosedCaptionSize with Double] = js.native
}

