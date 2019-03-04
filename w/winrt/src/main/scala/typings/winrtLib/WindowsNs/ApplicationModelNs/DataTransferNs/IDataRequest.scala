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
    failWithDisplayText: js.Function1[java.lang.String, scala.Unit],
    getDeferral: js.Function0[DataRequestDeferral]
  ): IDataRequest = {
    val __obj = js.Dynamic.literal(data = data, deadline = deadline, failWithDisplayText = failWithDisplayText, getDeferral = getDeferral)
  
    __obj.asInstanceOf[IDataRequest]
  }
}

