package typings.winrtDashUwp.Windows.Media.Core

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
  sealed trait after extends TimedTextDisplayAlignment
  
  /** The text region is aligned in the direction of the start of the text. */
  @js.native
  sealed trait before extends TimedTextDisplayAlignment
  
  /** The text region is aligned in the center. */
  @js.native
  sealed trait center extends TimedTextDisplayAlignment
  
  /* 1 */ val after: typings.winrtDashUwp.Windows.Media.Core.TimedTextDisplayAlignment.after with Double = js.native
  /* 0 */ val before: typings.winrtDashUwp.Windows.Media.Core.TimedTextDisplayAlignment.before with Double = js.native
  /* 2 */ val center: typings.winrtDashUwp.Windows.Media.Core.TimedTextDisplayAlignment.center with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimedTextDisplayAlignment with Double] = js.native
}

