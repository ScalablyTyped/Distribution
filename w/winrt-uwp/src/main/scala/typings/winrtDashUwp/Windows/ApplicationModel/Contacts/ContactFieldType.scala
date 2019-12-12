package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactFieldType.address
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactFieldType.connectedServiceAccount
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactFieldType.custom
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactFieldType.email
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactFieldType.importantDate
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactFieldType.instantMessage
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactFieldType.jobInfo
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactFieldType.location
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactFieldType.notes
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactFieldType.phoneNumber
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactFieldType.significantOther
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactFieldType.website
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactFieldType with Double] = js.native
  /* 7 */ @js.native
  object address extends TopLevel[address with Double]
  
  /* 5 */ @js.native
  object connectedServiceAccount extends TopLevel[connectedServiceAccount with Double]
  
  /* 4 */ @js.native
  object custom extends TopLevel[custom with Double]
  
  /* 0 */ @js.native
  object email extends TopLevel[email with Double]
  
  /* 6 */ @js.native
  object importantDate extends TopLevel[importantDate with Double]
  
  /* 3 */ @js.native
  object instantMessage extends TopLevel[instantMessage with Double]
  
  /* 11 */ @js.native
  object jobInfo extends TopLevel[jobInfo with Double]
  
  /* 2 */ @js.native
  object location extends TopLevel[location with Double]
  
  /* 9 */ @js.native
  object notes extends TopLevel[notes with Double]
  
  /* 1 */ @js.native
  object phoneNumber extends TopLevel[phoneNumber with Double]
  
  /* 8 */ @js.native
  object significantOther extends TopLevel[significantOther with Double]
  
  /* 10 */ @js.native
  object website extends TopLevel[website with Double]
  
}

