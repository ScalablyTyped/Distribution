package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimedTextWritingMode extends js.Object

/** Specifies the direction timed text is written. */
@JSGlobal("Windows.Media.Core.TimedTextWritingMode")
@js.native
object TimedTextWritingMode extends js.Object {
  /** Text is written from left to right within a line. Lines are written top to bottom. */
  @js.native
  sealed trait leftRight extends TimedTextWritingMode
  
  /** Text is written from left to right within a line. Lines are written top to bottom. */
  @js.native
  sealed trait leftRightTopBottom extends TimedTextWritingMode
  
  /** Text is written from right to left within a line. Lines are written top to bottom. */
  @js.native
  sealed trait rightLeft extends TimedTextWritingMode
  
  /** Text is written from right to left within a line. Lines are written top to bottom. */
  @js.native
  sealed trait rightLeftTopBottom extends TimedTextWritingMode
  
  /** Text is written from top to bottom within a line. Lines are written left to right. */
  @js.native
  sealed trait topBottom extends TimedTextWritingMode
  
  /** Text is written from top to bottom within a line. Lines are written left to right. */
  @js.native
  sealed trait topBottomLeftRight extends TimedTextWritingMode
  
  /** Text is written from top to bottom within a line. Lines are written right to left. */
  @js.native
  sealed trait topBottomRightLeft extends TimedTextWritingMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimedTextWritingMode with Double] = js.native
  /* 4 */ @js.native
  object leftRight extends TopLevel[leftRight with Double]
  
  /* 0 */ @js.native
  object leftRightTopBottom extends TopLevel[leftRightTopBottom with Double]
  
  /* 5 */ @js.native
  object rightLeft extends TopLevel[rightLeft with Double]
  
  /* 1 */ @js.native
  object rightLeftTopBottom extends TopLevel[rightLeftTopBottom with Double]
  
  /* 6 */ @js.native
  object topBottom extends TopLevel[topBottom with Double]
  
  /* 3 */ @js.native
  object topBottomLeftRight extends TopLevel[topBottomLeftRight with Double]
  
  /* 2 */ @js.native
  object topBottomRightLeft extends TopLevel[topBottomRightLeft with Double]
  
}

