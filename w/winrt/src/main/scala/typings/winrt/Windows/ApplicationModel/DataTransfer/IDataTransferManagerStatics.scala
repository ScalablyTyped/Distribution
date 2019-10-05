package typings.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataTransferManagerStatics extends js.Object {
  def getForCurrentView(): DataTransferManager
  def showShareUI(): Unit
}

object IDataTransferManagerStatics {
  @scala.inline
  def apply(getForCurrentView: () => DataTransferManager, showShareUI: () => Unit): IDataTransferManagerStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView), showShareUI = js.Any.fromFunction0(showShareUI))
  
    __obj.asInstanceOf[IDataTransferManagerStatics]
  }
}

