package typings.winrtDashUwp.Windows.Media.Core

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimedTextFlowDirection extends js.Object

/** Specifies the direction timed text is flowed. */
@JSGlobal("Windows.Media.Core.TimedTextFlowDirection")
@js.native
object TimedTextFlowDirection extends js.Object {
  /** Text is flowed left to right. */
  @js.native
  sealed trait leftToRight extends TimedTextFlowDirection
  
  /** Text is flowed right to left. */
  @js.native
  sealed trait rightToLeft extends TimedTextFlowDirection
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimedTextFlowDirection with Double] = js.native
  /* 0 */ @js.native
  object leftToRight extends TopLevel[leftToRight with Double]
  
  /* 1 */ @js.native
  object rightToLeft extends TopLevel[rightToLeft with Double]
  
}

