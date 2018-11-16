package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to defer the request for a print task source. */
@JSGlobal("Windows.Graphics.Printing.PrintTaskSourceRequestedDeferral")
@js.native
abstract class PrintTaskSourceRequestedDeferral () extends js.Object {
  /** Indicates when the deferral for a print task source request is over. */
  def complete(): scala.Unit = js.native
}

