package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

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
  sealed trait leftToRight
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextFlowDirection
  
  /** Text is flowed right to left. */
  @js.native
  sealed trait rightToLeft
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextFlowDirection
  
  val leftToRight: leftToRight with java.lang.String = js.native
  val rightToLeft: rightToLeft with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextFlowDirection with java.lang.String
  ] = js.native
}

