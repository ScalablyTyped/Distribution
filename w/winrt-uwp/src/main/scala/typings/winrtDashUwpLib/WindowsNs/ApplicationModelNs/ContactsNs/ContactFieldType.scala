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
  
  val address: address with java.lang.String = js.native
  val connectedServiceAccount: connectedServiceAccount with java.lang.String = js.native
  val custom: custom with java.lang.String = js.native
  val email: email with java.lang.String = js.native
  val importantDate: importantDate with java.lang.String = js.native
  val instantMessage: instantMessage with java.lang.String = js.native
  val jobInfo: jobInfo with java.lang.String = js.native
  val location: location with java.lang.String = js.native
  val notes: notes with java.lang.String = js.native
  val phoneNumber: phoneNumber with java.lang.String = js.native
  val significantOther: significantOther with java.lang.String = js.native
  val website: website with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType with java.lang.String
  ] = js.native
}

