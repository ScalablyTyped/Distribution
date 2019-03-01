package typings
package winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTransferErrorStaticMethods extends js.Object {
  def getStatus(hresult: scala.Double): winrtLib.WindowsNs.WebNs.WebErrorStatus
}

object IBackgroundTransferErrorStaticMethods {
  @scala.inline
  def apply(getStatus: js.Function1[scala.Double, winrtLib.WindowsNs.WebNs.WebErrorStatus]): IBackgroundTransferErrorStaticMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStatus")(getStatus)
    __obj.asInstanceOf[IBackgroundTransferErrorStaticMethods]
  }
}

