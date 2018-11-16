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

