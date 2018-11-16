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
  
  val noWrap: noWrap with java.lang.String = js.native
  val wrap: wrap with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextWrapping with java.lang.String] = js.native
}

