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
  
  val leftRight: leftRight with java.lang.String = js.native
  val leftRightTopBottom: leftRightTopBottom with java.lang.String = js.native
  val rightLeft: rightLeft with java.lang.String = js.native
  val rightLeftTopBottom: rightLeftTopBottom with java.lang.String = js.native
  val topBottom: topBottom with java.lang.String = js.native
  val topBottomLeftRight: topBottomLeftRight with java.lang.String = js.native
  val topBottomRightLeft: topBottomRightLeft with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextWritingMode with java.lang.String
  ] = js.native
}

