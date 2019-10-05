package typings.winrt.Windows.ApplicationModel.Contacts

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
  
  /* 4 */ val custom: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.custom with Double = js.native
  /* 0 */ val email: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.email with Double = js.native
  /* 3 */ val instantMessage: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.instantMessage with Double = js.native
  /* 2 */ val location: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.location with Double = js.native
  /* 1 */ val phoneNumber: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.phoneNumber with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactFieldType with Double] = js.native
}

