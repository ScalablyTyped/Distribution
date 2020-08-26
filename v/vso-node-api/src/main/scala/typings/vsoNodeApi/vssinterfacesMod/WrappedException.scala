package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedException extends js.Object {
  var customProperties: StringDictionary[js.Any] = js.native
  var errorCode: Double = js.native
  var eventId: Double = js.native
  var helpLink: String = js.native
  var innerException: WrappedException = js.native
  var message: String = js.native
  var stackTrace: String = js.native
  var typeKey: String = js.native
  var typeName: String = js.native
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
  @scala.inline
  implicit class WrappedExceptionOps[Self <: WrappedException] (val x: Self) extends AnyVal {
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
    def setCustomProperties(value: StringDictionary[js.Any]): Self = this.set("customProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventId(value: Double): Self = this.set("eventId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelpLink(value: String): Self = this.set("helpLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerException(value: WrappedException): Self = this.set("innerException", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackTrace(value: String): Self = this.set("stackTrace", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeKey(value: String): Self = this.set("typeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeName(value: String): Self = this.set("typeName", value.asInstanceOf[js.Any])
  }
  
}

