package typings.winrtDashUwp.Windows.Media.Core

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimedTextDisplayAlignment with Double] = js.native
  /* 1 */ @js.native
  object after extends TopLevel[after with Double]
  
  /* 0 */ @js.native
  object before extends TopLevel[before with Double]
  
  /* 2 */ @js.native
  object center extends TopLevel[center with Double]
  
}

