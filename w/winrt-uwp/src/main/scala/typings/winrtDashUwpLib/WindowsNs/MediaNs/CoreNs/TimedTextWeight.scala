package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimedTextWeight extends js.Object

/** Specifies the weight of timed text. */
@JSGlobal("Windows.Media.Core.TimedTextWeight")
@js.native
object TimedTextWeight extends js.Object {
  /** The text is bold. */
  @js.native
  sealed trait bold
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextWeight
  
  /** The text is normal weight. */
  @js.native
  sealed trait normal
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextWeight
  
  /* 1 */ val bold: bold with scala.Double = js.native
  /* 0 */ val normal: normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextWeight with scala.Double] = js.native
}

