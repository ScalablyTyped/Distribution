package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactFieldType extends js.Object

@JSGlobal("Windows.ApplicationModel.Contacts.ContactFieldType")
@js.native
object ContactFieldType extends js.Object {
  @js.native
  sealed trait custom
    extends winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType
  
  @js.native
  sealed trait email
    extends winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType
  
  @js.native
  sealed trait instantMessage
    extends winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType
  
  @js.native
  sealed trait location
    extends winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType
  
  @js.native
  sealed trait phoneNumber
    extends winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType
  
  val custom: custom with java.lang.String = js.native
  val email: email with java.lang.String = js.native
  val instantMessage: instantMessage with java.lang.String = js.native
  val location: location with java.lang.String = js.native
  val phoneNumber: phoneNumber with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType with java.lang.String
  ] = js.native
}

