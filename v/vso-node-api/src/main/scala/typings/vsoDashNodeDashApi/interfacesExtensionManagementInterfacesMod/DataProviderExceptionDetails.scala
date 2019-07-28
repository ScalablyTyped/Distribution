package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

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
    val __obj = js.Dynamic.literal(exceptionType = exceptionType, message = message, stackTrace = stackTrace)
  
    __obj.asInstanceOf[DataProviderExceptionDetails]
  }
}

