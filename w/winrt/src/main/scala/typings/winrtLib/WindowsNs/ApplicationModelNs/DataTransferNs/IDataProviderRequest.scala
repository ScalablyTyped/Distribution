package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataProviderRequest extends js.Object {
  var deadline: stdLib.Date
  var formatId: java.lang.String
  def getDeferral(): DataProviderDeferral
  def setData(value: js.Any): scala.Unit
}

object IDataProviderRequest {
  @scala.inline
  def apply(
    deadline: stdLib.Date,
    formatId: java.lang.String,
    getDeferral: js.Function0[DataProviderDeferral],
    setData: js.Function1[js.Any, scala.Unit]
  ): IDataProviderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deadline")(deadline)
    __obj.updateDynamic("formatId")(formatId)
    __obj.updateDynamic("getDeferral")(getDeferral)
    __obj.updateDynamic("setData")(setData)
    __obj.asInstanceOf[IDataProviderRequest]
  }
}

