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
  
  val after: after with java.lang.String = js.native
  val before: before with java.lang.String = js.native
  val center: center with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextDisplayAlignment with java.lang.String
  ] = js.native
}

