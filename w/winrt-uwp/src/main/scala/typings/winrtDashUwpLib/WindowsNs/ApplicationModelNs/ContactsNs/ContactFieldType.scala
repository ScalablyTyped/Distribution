package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

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
  sealed trait address
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType
  
  /** The contact's connected service account. */
  @js.native
  sealed trait connectedServiceAccount
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType
  
  /** Custom may be altered or unavailable for releases after Windows 8.1. Instead, use one of the specific types. */
  @js.native
  sealed trait custom
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType
  
  /** The contact's email address. Supported on Windows Phone. */
  @js.native
  sealed trait email
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType
  
  /** The contact's important dates. */
  @js.native
  sealed trait importantDate
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType
  
  /** InstantMessage may be altered or unavailable for releases after Windows 8.1. Instead, use ConnectedServiceAccount. */
  @js.native
  sealed trait instantMessage
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType
  
  /** The contact's job info. */
  @js.native
  sealed trait jobInfo
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType
  
  /** Location may be altered or unavailable for releases after Windows 8.1. Instead, use Address. */
  @js.native
  sealed trait location
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType
  
  /** The contact's notes. */
  @js.native
  sealed trait notes
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType
  
  /** The contact's phone number. Supported on Windows Phone. */
  @js.native
  sealed trait phoneNumber
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType
  
  /** The contact's significant other. */
  @js.native
  sealed trait significantOther
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType
  
  /** The contact's Web site. */
  @js.native
  sealed trait website
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType
  
  /* 7 */ val address: address with scala.Double = js.native
  /* 5 */ val connectedServiceAccount: connectedServiceAccount with scala.Double = js.native
  /* 4 */ val custom: custom with scala.Double = js.native
  /* 0 */ val email: email with scala.Double = js.native
  /* 6 */ val importantDate: importantDate with scala.Double = js.native
  /* 3 */ val instantMessage: instantMessage with scala.Double = js.native
  /* 11 */ val jobInfo: jobInfo with scala.Double = js.native
  /* 2 */ val location: location with scala.Double = js.native
  /* 9 */ val notes: notes with scala.Double = js.native
  /* 1 */ val phoneNumber: phoneNumber with scala.Double = js.native
  /* 8 */ val significantOther: significantOther with scala.Double = js.native
  /* 10 */ val website: website with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType with scala.Double
  ] = js.native
}

