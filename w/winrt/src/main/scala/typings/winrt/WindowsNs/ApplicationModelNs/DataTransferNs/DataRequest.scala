package typings.winrt.WindowsNs.ApplicationModelNs.DataTransferNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.DataTransfer.DataRequest")
@js.native
class DataRequest () extends IDataRequest {
  /* CompleteClass */
  override var data: DataPackage = js.native
  /* CompleteClass */
  override var deadline: Date = js.native
  /* CompleteClass */
  override def failWithDisplayText(value: String): Unit = js.native
  /* CompleteClass */
  override def getDeferral(): DataRequestDeferral = js.native
}

