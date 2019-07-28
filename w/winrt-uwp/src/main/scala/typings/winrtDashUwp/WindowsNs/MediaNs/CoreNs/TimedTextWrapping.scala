package typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimedTextWrapping extends js.Object

/** Specifies the wrapping behavior of timed text. */
@JSGlobal("Windows.Media.Core.TimedTextWrapping")
@js.native
object TimedTextWrapping extends js.Object {
  /** The text is not wrapped. */
  @js.native
  sealed trait noWrap extends TimedTextWrapping
  
  /** The text is wrapped. */
  @js.native
  sealed trait wrap extends TimedTextWrapping
  
  /* 0 */ val noWrap: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedTextWrapping.noWrap with Double = js.native
  /* 1 */ val wrap: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedTextWrapping.wrap with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimedTextWrapping with Double] = js.native
}

