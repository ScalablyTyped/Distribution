package typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs

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
  sealed trait bold extends TimedTextWeight
  
  /** The text is normal weight. */
  @js.native
  sealed trait normal extends TimedTextWeight
  
  /* 1 */ val bold: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedTextWeight.bold with Double = js.native
  /* 0 */ val normal: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedTextWeight.normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimedTextWeight with Double] = js.native
}

