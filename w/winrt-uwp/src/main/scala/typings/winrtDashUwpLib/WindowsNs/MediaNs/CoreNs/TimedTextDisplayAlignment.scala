package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimedTextDisplayAlignment extends js.Object

/** Specifies the alignment of a TimedTextRegion relative to the video frame. */
@JSGlobal("Windows.Media.Core.TimedTextDisplayAlignment")
@js.native
object TimedTextDisplayAlignment extends js.Object {
  /** The text region is aligned in the direction of the end of the text. */
  @js.native
  sealed trait after
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextDisplayAlignment
  
  /** The text region is aligned in the direction of the start of the text. */
  @js.native
  sealed trait before
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextDisplayAlignment
  
  /** The text region is aligned in the center. */
  @js.native
  sealed trait center
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextDisplayAlignment
  
  /* 1 */ val after: after with scala.Double = js.native
  /* 0 */ val before: before with scala.Double = js.native
  /* 2 */ val center: center with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextDisplayAlignment with scala.Double
  ] = js.native
}

