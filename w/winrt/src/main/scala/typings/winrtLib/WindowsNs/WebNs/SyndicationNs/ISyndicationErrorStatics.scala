package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationErrorStatics extends js.Object {
  def getStatus(hresult: scala.Double): SyndicationErrorStatus
}

object ISyndicationErrorStatics {
  @scala.inline
  def apply(getStatus: js.Function1[scala.Double, SyndicationErrorStatus]): ISyndicationErrorStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStatus")(getStatus)
    __obj.asInstanceOf[ISyndicationErrorStatics]
  }
}

