package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataRequest extends js.Object {
  var data: DataPackage
  var deadline: stdLib.Date
  def failWithDisplayText(value: java.lang.String): scala.Unit
  def getDeferral(): DataRequestDeferral
}

object IDataRequest {
  @scala.inline
  def apply(
    data: DataPackage,
    deadline: stdLib.Date,
    failWithDisplayText: java.lang.String => scala.Unit,
    getDeferral: () => DataRequestDeferral
  ): IDataRequest = {
    val __obj = js.Dynamic.literal(data = data, deadline = deadline, failWithDisplayText = js.Any.fromFunction1(failWithDisplayText), getDeferral = js.Any.fromFunction0(getDeferral))
  
    __obj.asInstanceOf[IDataRequest]
  }
}

