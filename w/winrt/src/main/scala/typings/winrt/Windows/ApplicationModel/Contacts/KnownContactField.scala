package typings.winrt.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField")
@js.native
class KnownContactField () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField")
@js.native
object KnownContactField extends js.Object {
  var email: String = js.native
  var instantMessage: String = js.native
  var location: String = js.native
  var phoneNumber: String = js.native
  def convertNameToType(name: String): ContactFieldType = js.native
  def convertTypeToName(`type`: ContactFieldType): String = js.native
}

