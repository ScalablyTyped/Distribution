package typings.winrt.WindowsNs.ApplicationModelNs.DataTransferNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataRequest extends js.Object {
  var data: DataPackage
  var deadline: Date
  def failWithDisplayText(value: String): Unit
  def getDeferral(): DataRequestDeferral
}

object IDataRequest {
  @scala.inline
  def apply(
    data: DataPackage,
    deadline: Date,
    failWithDisplayText: String => Unit,
    getDeferral: () => DataRequestDeferral
  ): IDataRequest = {
    val __obj = js.Dynamic.literal(data = data, deadline = deadline, failWithDisplayText = js.Any.fromFunction1(failWithDisplayText), getDeferral = js.Any.fromFunction0(getDeferral))
  
    __obj.asInstanceOf[IDataRequest]
  }
}

