package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Web.WebErrorStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTransferErrorStaticMethods extends js.Object {
  def getStatus(hresult: Double): WebErrorStatus
}

object IBackgroundTransferErrorStaticMethods {
  @scala.inline
  def apply(getStatus: Double => WebErrorStatus): IBackgroundTransferErrorStaticMethods = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
  
    __obj.asInstanceOf[IBackgroundTransferErrorStaticMethods]
  }
}

