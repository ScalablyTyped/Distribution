package typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs

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
  
  /* 0 */ val leftToRight: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedTextFlowDirection.leftToRight with Double = js.native
  /* 1 */ val rightToLeft: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedTextFlowDirection.rightToLeft with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimedTextFlowDirection with Double] = js.native
}

