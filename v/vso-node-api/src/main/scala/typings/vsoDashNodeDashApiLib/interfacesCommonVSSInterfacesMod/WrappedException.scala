package typings
package vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedException extends js.Object {
  var customProperties: org.scalablytyped.runtime.StringDictionary[js.Any]
  var errorCode: scala.Double
  var eventId: scala.Double
  var helpLink: java.lang.String
  var innerException: WrappedException
  var message: java.lang.String
  var stackTrace: java.lang.String
  var typeKey: java.lang.String
  var typeName: java.lang.String
}

object WrappedException {
  @scala.inline
  def apply(
    customProperties: org.scalablytyped.runtime.StringDictionary[js.Any],
    errorCode: scala.Double,
    eventId: scala.Double,
    helpLink: java.lang.String,
    innerException: WrappedException,
    message: java.lang.String,
    stackTrace: java.lang.String,
    typeKey: java.lang.String,
    typeName: java.lang.String
  ): WrappedException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("customProperties")(customProperties)
    __obj.updateDynamic("errorCode")(errorCode)
    __obj.updateDynamic("eventId")(eventId)
    __obj.updateDynamic("helpLink")(helpLink)
    __obj.updateDynamic("innerException")(innerException)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("stackTrace")(stackTrace)
    __obj.updateDynamic("typeKey")(typeKey)
    __obj.updateDynamic("typeName")(typeName)
    __obj.asInstanceOf[WrappedException]
  }
}

