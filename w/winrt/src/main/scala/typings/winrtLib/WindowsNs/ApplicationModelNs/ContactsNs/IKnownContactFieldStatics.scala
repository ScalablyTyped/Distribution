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
    val __obj = js.Dynamic.literal(convertNameToType = convertNameToType, convertTypeToName = convertTypeToName, email = email, instantMessage = instantMessage, location = location, phoneNumber = phoneNumber)
  
    __obj.asInstanceOf[IKnownContactFieldStatics]
  }
}

