package typings.winrt.global.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager")
@js.native
class DataTransferManager ()
  extends typings.winrt.Windows.ApplicationModel.DataTransfer.DataTransferManager {
  /* CompleteClass */
  override var ondatarequested: js.Any = js.native
  /* CompleteClass */
  override var ontargetapplicationchosen: js.Any = js.native
}

/* static members */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager")
@js.native
object DataTransferManager extends js.Object {
  def getForCurrentView(): typings.winrt.Windows.ApplicationModel.DataTransfer.DataTransferManager = js.native
  def showShareUI(): Unit = js.native
}

