package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

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
  sealed trait noWrap
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextWrapping
  
  /** The text is wrapped. */
  @js.native
  sealed trait wrap
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextWrapping
  
  /* 0 */ val noWrap: noWrap with scala.Double = js.native
  /* 1 */ val wrap: wrap with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextWrapping with scala.Double] = js.native
}

