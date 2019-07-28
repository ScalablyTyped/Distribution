package typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedException extends js.Object {
  var customProperties: StringDictionary[js.Any]
  var errorCode: Double
  var eventId: Double
  var helpLink: String
  var innerException: WrappedException
  var message: String
  var stackTrace: String
  var typeKey: String
  var typeName: String
}

object WrappedException {
  @scala.inline
  def apply(
    customProperties: StringDictionary[js.Any],
    errorCode: Double,
    eventId: Double,
    helpLink: String,
    innerException: WrappedException,
    message: String,
    stackTrace: String,
    typeKey: String,
    typeName: String
  ): WrappedException = {
    val __obj = js.Dynamic.literal(customProperties = customProperties, errorCode = errorCode, eventId = eventId, helpLink = helpLink, innerException = innerException, message = message, stackTrace = stackTrace, typeKey = typeKey, typeName = typeName)
  
    __obj.asInstanceOf[WrappedException]
  }
}

