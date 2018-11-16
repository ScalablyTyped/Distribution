package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField")
@js.native
class KnownContactField () extends js.Object

@JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField")
@js.native
object KnownContactField extends js.Object {
  var email: java.lang.String = js.native
  var instantMessage: java.lang.String = js.native
  var location: java.lang.String = js.native
  var phoneNumber: java.lang.String = js.native
  def convertNameToType(name: java.lang.String): winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType = js.native
  def convertTypeToName(`type`: winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType): java.lang.String = js.native
}

