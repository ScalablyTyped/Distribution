package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactFieldType extends js.Object

/** Defines the type of contact data. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactFieldType")
@js.native
object ContactFieldType extends js.Object {
  /** The contact's address. Supported on Windows Phone. */
  @js.native
  sealed trait address extends ContactFieldType
  
  /** The contact's connected service account. */
  @js.native
  sealed trait connectedServiceAccount extends ContactFieldType
  
  /** Custom may be altered or unavailable for releases after Windows 8.1. Instead, use one of the specific types. */
  @js.native
  sealed trait custom extends ContactFieldType
  
  /** The contact's email address. Supported on Windows Phone. */
  @js.native
  sealed trait email extends ContactFieldType
  
  /** The contact's important dates. */
  @js.native
  sealed trait importantDate extends ContactFieldType
  
  /** InstantMessage may be altered or unavailable for releases after Windows 8.1. Instead, use ConnectedServiceAccount. */
  @js.native
  sealed trait instantMessage extends ContactFieldType
  
  /** The contact's job info. */
  @js.native
  sealed trait jobInfo extends ContactFieldType
  
  /** Location may be altered or unavailable for releases after Windows 8.1. Instead, use Address. */
  @js.native
  sealed trait location extends ContactFieldType
  
  /** The contact's notes. */
  @js.native
  sealed trait notes extends ContactFieldType
  
  /** The contact's phone number. Supported on Windows Phone. */
  @js.native
  sealed trait phoneNumber extends ContactFieldType
  
  /** The contact's significant other. */
  @js.native
  sealed trait significantOther extends ContactFieldType
  
  /** The contact's Web site. */
  @js.native
  sealed trait website extends ContactFieldType
  
  /* 7 */ val address: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType.address with Double = js.native
  /* 5 */ val connectedServiceAccount: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType.connectedServiceAccount with Double = js.native
  /* 4 */ val custom: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType.custom with Double = js.native
  /* 0 */ val email: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType.email with Double = js.native
  /* 6 */ val importantDate: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType.importantDate with Double = js.native
  /* 3 */ val instantMessage: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType.instantMessage with Double = js.native
  /* 11 */ val jobInfo: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType.jobInfo with Double = js.native
  /* 2 */ val location: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType.location with Double = js.native
  /* 9 */ val notes: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType.notes with Double = js.native
  /* 1 */ val phoneNumber: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType.phoneNumber with Double = js.native
  /* 8 */ val significantOther: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType.significantOther with Double = js.native
  /* 10 */ val website: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType.website with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactFieldType with Double] = js.native
}

