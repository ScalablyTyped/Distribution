package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataTransferManagerStatics extends js.Object {
  def getForCurrentView(): DataTransferManager
  def showShareUI(): scala.Unit
}

object IDataTransferManagerStatics {
  @scala.inline
  def apply(getForCurrentView: js.Function0[DataTransferManager], showShareUI: js.Function0[scala.Unit]): IDataTransferManagerStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = getForCurrentView, showShareUI = showShareUI)
  
    __obj.asInstanceOf[IDataTransferManagerStatics]
  }
}

