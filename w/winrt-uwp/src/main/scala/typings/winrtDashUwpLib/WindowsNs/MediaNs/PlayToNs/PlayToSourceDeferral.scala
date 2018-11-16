package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a deferred operation when you're supplying a source media element for Play To. */
@JSGlobal("Windows.Media.PlayTo.PlayToSourceDeferral")
@js.native
abstract class PlayToSourceDeferral () extends js.Object {
  /** Ends the deferral. */
  def complete(): scala.Unit = js.native
}

