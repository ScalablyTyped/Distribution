package typings.winrt.Windows.ApplicationModel.DataTransfer

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.DataTransfer.DataProviderRequest")
@js.native
class DataProviderRequest () extends IDataProviderRequest {
  /* CompleteClass */
  override var deadline: Date = js.native
  /* CompleteClass */
  override var formatId: String = js.native
  /* CompleteClass */
  override def getDeferral(): DataProviderDeferral = js.native
  /* CompleteClass */
  override def setData(value: js.Any): Unit = js.native
}

