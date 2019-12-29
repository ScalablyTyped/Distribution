package typings.winrtDashUwp.Windows.Media.Core

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimedTextLineAlignment with Double] = js.native
  /* 2 */ @js.native
  object center extends TopLevel[center with Double]
  
  /* 1 */ @js.native
  object end extends TopLevel[end with Double]
  
  /* 0 */ @js.native
  object start extends TopLevel[start with Double]
  
}

