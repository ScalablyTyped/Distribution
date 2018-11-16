package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to defer the request for a print task. */
@JSGlobal("Windows.Graphics.Printing.PrintTaskRequestedDeferral")
@js.native
abstract class PrintTaskRequestedDeferral () extends js.Object {
  /** Indicates when the deferral for the print task request is over. */
  def complete(): scala.Unit = js.native
}

