package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.DataTransfer.DataRequest")
@js.native
class DataRequest () extends IDataRequest {
  /* CompleteClass */
  override var data: DataPackage = js.native
  /* CompleteClass */
  override var deadline: stdLib.Date = js.native
  /* CompleteClass */
  override def failWithDisplayText(value: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def getDeferral(): DataRequestDeferral = js.native
}

