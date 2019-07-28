package typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs

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
  
  /* 4 */ val leftRight: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedTextWritingMode.leftRight with Double = js.native
  /* 0 */ val leftRightTopBottom: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedTextWritingMode.leftRightTopBottom with Double = js.native
  /* 5 */ val rightLeft: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedTextWritingMode.rightLeft with Double = js.native
  /* 1 */ val rightLeftTopBottom: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedTextWritingMode.rightLeftTopBottom with Double = js.native
  /* 6 */ val topBottom: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedTextWritingMode.topBottom with Double = js.native
  /* 3 */ val topBottomLeftRight: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedTextWritingMode.topBottomLeftRight with Double = js.native
  /* 2 */ val topBottomRightLeft: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedTextWritingMode.topBottomRightLeft with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimedTextWritingMode with Double] = js.native
}

