package typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactFieldType extends js.Object

@JSGlobal("Windows.ApplicationModel.Contacts.ContactFieldType")
@js.native
object ContactFieldType extends js.Object {
  @js.native
  sealed trait custom extends ContactFieldType
  
  @js.native
  sealed trait email extends ContactFieldType
  
  @js.native
  sealed trait instantMessage extends ContactFieldType
  
  @js.native
  sealed trait location extends ContactFieldType
  
  @js.native
  sealed trait phoneNumber extends ContactFieldType
  
  /* 4 */ val custom: typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType.custom with Double = js.native
  /* 0 */ val email: typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType.email with Double = js.native
  /* 3 */ val instantMessage: typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType.instantMessage with Double = js.native
  /* 2 */ val location: typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType.location with Double = js.native
  /* 1 */ val phoneNumber: typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType.phoneNumber with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactFieldType with Double] = js.native
}

