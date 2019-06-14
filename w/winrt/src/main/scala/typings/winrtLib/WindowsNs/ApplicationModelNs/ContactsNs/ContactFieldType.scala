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
  
  /* 4 */ val custom: custom with scala.Double = js.native
  /* 0 */ val email: email with scala.Double = js.native
  /* 3 */ val instantMessage: instantMessage with scala.Double = js.native
  /* 2 */ val location: location with scala.Double = js.native
  /* 1 */ val phoneNumber: phoneNumber with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType with scala.Double
  ] = js.native
}

