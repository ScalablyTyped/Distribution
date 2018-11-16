package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used by a source app's deferral delegate to notify a DataPackage object that the source app will produce data from another asynchronous function. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataProviderDeferral")
@js.native
abstract class DataProviderDeferral () extends js.Object {
  /** Informs a DataPackage that it is ready for processing. */
  def complete(): scala.Unit = js.native
}

