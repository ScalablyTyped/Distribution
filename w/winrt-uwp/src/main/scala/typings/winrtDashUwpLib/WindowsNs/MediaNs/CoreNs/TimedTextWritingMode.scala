package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

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
  sealed trait leftRight
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextWritingMode
  
  /** Text is written from left to right within a line. Lines are written top to bottom. */
  @js.native
  sealed trait leftRightTopBottom
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextWritingMode
  
  /** Text is written from right to left within a line. Lines are written top to bottom. */
  @js.native
  sealed trait rightLeft
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextWritingMode
  
  /** Text is written from right to left within a line. Lines are written top to bottom. */
  @js.native
  sealed trait rightLeftTopBottom
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextWritingMode
  
  /** Text is written from top to bottom within a line. Lines are written left to right. */
  @js.native
  sealed trait topBottom
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextWritingMode
  
  /** Text is written from top to bottom within a line. Lines are written left to right. */
  @js.native
  sealed trait topBottomLeftRight
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextWritingMode
  
  /** Text is written from top to bottom within a line. Lines are written right to left. */
  @js.native
  sealed trait topBottomRightLeft
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextWritingMode
  
  /* 4 */ val leftRight: leftRight with scala.Double = js.native
  /* 0 */ val leftRightTopBottom: leftRightTopBottom with scala.Double = js.native
  /* 5 */ val rightLeft: rightLeft with scala.Double = js.native
  /* 1 */ val rightLeftTopBottom: rightLeftTopBottom with scala.Double = js.native
  /* 6 */ val topBottom: topBottom with scala.Double = js.native
  /* 3 */ val topBottomLeftRight: topBottomLeftRight with scala.Double = js.native
  /* 2 */ val topBottomRightLeft: topBottomRightLeft with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextWritingMode with scala.Double] = js.native
}

