package typings.winrtDashUwp.Windows.Media.ClosedCaptioning

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClosedCaptionOpacity with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 1 */ @js.native
  object oneHundredPercent extends TopLevel[oneHundredPercent with Double]
  
  /* 2 */ @js.native
  object seventyFivePercent extends TopLevel[seventyFivePercent with Double]
  
  /* 3 */ @js.native
  object twentyFivePercent extends TopLevel[twentyFivePercent with Double]
  
  /* 4 */ @js.native
  object zeroPercent extends TopLevel[zeroPercent with Double]
  
}

