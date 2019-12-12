package typings.winrtDashUwp.Windows.Media.ClosedCaptioning

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize.default
import typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize.fiftyPercent
import typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize.oneHundredFiftyPercent
import typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize.oneHundredPercent
import typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionSize.twoHundredPercent
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClosedCaptionSize with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 1 */ @js.native
  object fiftyPercent extends TopLevel[fiftyPercent with Double]
  
  /* 3 */ @js.native
  object oneHundredFiftyPercent extends TopLevel[oneHundredFiftyPercent with Double]
  
  /* 2 */ @js.native
  object oneHundredPercent extends TopLevel[oneHundredPercent with Double]
  
  /* 4 */ @js.native
  object twoHundredPercent extends TopLevel[twoHundredPercent with Double]
  
}

