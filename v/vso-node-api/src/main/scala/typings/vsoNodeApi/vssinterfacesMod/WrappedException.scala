package typings.vsoNodeApi.vssinterfacesMod

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
    val __obj = js.Dynamic.literal(customProperties = customProperties.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], helpLink = helpLink.asInstanceOf[js.Any], innerException = innerException.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any], typeKey = typeKey.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WrappedException]
  }
}

