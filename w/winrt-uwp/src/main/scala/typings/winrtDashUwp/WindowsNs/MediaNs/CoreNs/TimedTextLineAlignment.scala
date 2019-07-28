package typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs

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
  sealed trait center extends TimedTextLineAlignment
  
  /** The text line is aligned in the direction of the end of the text. */
  @js.native
  sealed trait end extends TimedTextLineAlignment
  
  /** The text line is aligned in the direction of the start of the text. */
  @js.native
  sealed trait start extends TimedTextLineAlignment
  
  /* 2 */ val center: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedTextLineAlignment.center with Double = js.native
  /* 1 */ val end: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedTextLineAlignment.end with Double = js.native
  /* 0 */ val start: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedTextLineAlignment.start with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimedTextLineAlignment with Double] = js.native
}

