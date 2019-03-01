package typings
package winrtLib.WindowsNs.WebNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebErrorStatics extends js.Object {
  def getStatus(hresult: scala.Double): WebErrorStatus
}

object IWebErrorStatics {
  @scala.inline
  def apply(getStatus: js.Function1[scala.Double, WebErrorStatus]): IWebErrorStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStatus")(getStatus)
    __obj.asInstanceOf[IWebErrorStatics]
  }
}

