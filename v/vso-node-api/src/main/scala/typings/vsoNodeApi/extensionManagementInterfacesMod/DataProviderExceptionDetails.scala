package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProviderExceptionDetails extends js.Object {
  /**
    * The type of the exception that was thrown.
    */
  var exceptionType: String = js.native
  /**
    * Message that is associated with the exception.
    */
  var message: String = js.native
  /**
    * The StackTrace from the exception turned into a string.
    */
  var stackTrace: String = js.native
}

object DataProviderExceptionDetails {
  @scala.inline
  def apply(exceptionType: String, message: String, stackTrace: String): DataProviderExceptionDetails = {
    val __obj = js.Dynamic.literal(exceptionType = exceptionType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProviderExceptionDetails]
  }
  @scala.inline
  implicit class DataProviderExceptionDetailsOps[Self <: DataProviderExceptionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExceptionType(value: String): Self = this.set("exceptionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackTrace(value: String): Self = this.set("stackTrace", value.asInstanceOf[js.Any])
  }
  
}

