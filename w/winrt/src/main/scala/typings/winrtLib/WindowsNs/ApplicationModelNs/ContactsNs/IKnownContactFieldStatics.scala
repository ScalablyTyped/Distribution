package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKnownContactFieldStatics extends js.Object {
  var email: java.lang.String
  var instantMessage: java.lang.String
  var location: java.lang.String
  var phoneNumber: java.lang.String
  def convertNameToType(name: java.lang.String): ContactFieldType
  def convertTypeToName(`type`: ContactFieldType): java.lang.String
}

object IKnownContactFieldStatics {
  @scala.inline
  def apply(
    convertNameToType: js.Function1[java.lang.String, ContactFieldType],
    convertTypeToName: js.Function1[ContactFieldType, java.lang.String],
    email: java.lang.String,
    instantMessage: java.lang.String,
    location: java.lang.String,
    phoneNumber: java.lang.String
  ): IKnownContactFieldStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("convertNameToType")(convertNameToType)
    __obj.updateDynamic("convertTypeToName")(convertTypeToName)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("instantMessage")(instantMessage)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("phoneNumber")(phoneNumber)
    __obj.asInstanceOf[IKnownContactFieldStatics]
  }
}

