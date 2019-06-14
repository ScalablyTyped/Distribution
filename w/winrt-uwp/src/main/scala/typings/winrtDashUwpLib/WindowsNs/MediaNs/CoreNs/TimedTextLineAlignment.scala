package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimedTextLineAlignment extends js.Object

/** Specifies the alignment of a TimedTextLine relative to the TimedTextRegion in which it is displayed. */
@JSGlobal("Windows.Media.Core.TimedTextLineAlignment")
@js.native
object TimedTextLineAlignment extends js.Object {
  /** The text line is aligned in the center of the region. */
  @js.native
  sealed trait center
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextLineAlignment
  
  /** The text line is aligned in the direction of the end of the text. */
  @js.native
  sealed trait end
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextLineAlignment
  
  /** The text line is aligned in the direction of the start of the text. */
  @js.native
  sealed trait start
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextLineAlignment
  
  /* 2 */ val center: center with scala.Double = js.native
  /* 1 */ val end: end with scala.Double = js.native
  /* 0 */ val start: start with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextLineAlignment with scala.Double
  ] = js.native
}

