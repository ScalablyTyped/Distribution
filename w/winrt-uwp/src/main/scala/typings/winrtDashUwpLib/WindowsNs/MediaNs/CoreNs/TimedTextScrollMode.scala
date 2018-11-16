package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimedTextScrollMode extends js.Object

/** Specifies the method in which lines of text scroll through the region. */
@JSGlobal("Windows.Media.Core.TimedTextScrollMode")
@js.native
object TimedTextScrollMode extends js.Object {
  /** Text lines pop on to the region discretely. */
  @js.native
  sealed trait popon
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextScrollMode
  
  /** Text lines roll up onto the region. */
  @js.native
  sealed trait rollup
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextScrollMode
  
  val popon: popon with java.lang.String = js.native
  val rollup: rollup with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextScrollMode with java.lang.String
  ] = js.native
}

