package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.DataTransfer.DataProviderRequest")
@js.native
class DataProviderRequest () extends IDataProviderRequest {
  /* CompleteClass */
  override var deadline: stdLib.Date = js.native
  /* CompleteClass */
  override var formatId: java.lang.String = js.native
  /* CompleteClass */
  override def getDeferral(): DataProviderDeferral = js.native
  /* CompleteClass */
  override def setData(value: js.Any): scala.Unit = js.native
}

