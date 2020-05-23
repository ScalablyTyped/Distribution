package typings.winrt.global.Windows.ApplicationModel.DataTransfer

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.DataTransfer.DataRequest")
@js.native
class DataRequest ()
  extends typings.winrt.Windows.ApplicationModel.DataTransfer.DataRequest {
  /* CompleteClass */
  override var data: typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackage = js.native
  /* CompleteClass */
  override var deadline: Date = js.native
  /* CompleteClass */
  override def failWithDisplayText(value: String): Unit = js.native
  /* CompleteClass */
  override def getDeferral(): typings.winrt.Windows.ApplicationModel.DataTransfer.DataRequestDeferral = js.native
}

