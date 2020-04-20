package typings.winrt.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKnownContactFieldStatics extends js.Object {
  var email: String
  var instantMessage: String
  var location: String
  var phoneNumber: String
  def convertNameToType(name: String): ContactFieldType
  def convertTypeToName(`type`: ContactFieldType): String
}

object IKnownContactFieldStatics {
  @scala.inline
  def apply(
    convertNameToType: String => ContactFieldType,
    convertTypeToName: ContactFieldType => String,
    email: String,
    instantMessage: String,
    location: String,
    phoneNumber: String
  ): IKnownContactFieldStatics = {
    val __obj = js.Dynamic.literal(convertNameToType = js.Any.fromFunction1(convertNameToType), convertTypeToName = js.Any.fromFunction1(convertTypeToName), email = email.asInstanceOf[js.Any], instantMessage = instantMessage.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKnownContactFieldStatics]
  }
}

