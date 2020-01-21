package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProviderExceptionDetails extends js.Object {
  /**
    * The type of the exception that was thrown.
    */
  var exceptionType: String
  /**
    * Message that is associated with the exception.
    */
  var message: String
  /**
    * The StackTrace from the exception turned into a string.
    */
  var stackTrace: String
}

object DataProviderExceptionDetails {
  @scala.inline
  def apply(exceptionType: String, message: String, stackTrace: String): DataProviderExceptionDetails = {
    val __obj = js.Dynamic.literal(exceptionType = exceptionType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataProviderExceptionDetails]
  }
}

