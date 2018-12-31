package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to provide errors encountered during a transfer operation. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferError")
@js.native
abstract class BackgroundTransferError () extends js.Object

/** Used to provide errors encountered during a transfer operation. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferError")
@js.native
object BackgroundTransferError extends js.Object {
  /**
    * Gets the specific error using the returned HRESULT value. Possible values are defined by WebErrorStatus .
    * @param hresult An HRESULT returned during the operation.
    * @return The error encountered.
    */
  def getStatus(hresult: scala.Double): winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus = js.native
}

