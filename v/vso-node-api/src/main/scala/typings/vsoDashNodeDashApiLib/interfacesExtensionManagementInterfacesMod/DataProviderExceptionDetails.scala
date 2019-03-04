package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProviderExceptionDetails extends js.Object {
  /**
    * The type of the exception that was thrown.
    */
  var exceptionType: java.lang.String
  /**
    * Message that is associated with the exception.
    */
  var message: java.lang.String
  /**
    * The StackTrace from the exception turned into a string.
    */
  var stackTrace: java.lang.String
}

object DataProviderExceptionDetails {
  @scala.inline
  def apply(exceptionType: java.lang.String, message: java.lang.String, stackTrace: java.lang.String): DataProviderExceptionDetails = {
    val __obj = js.Dynamic.literal(exceptionType = exceptionType, message = message, stackTrace = stackTrace)
  
    __obj.asInstanceOf[DataProviderExceptionDetails]
  }
}

