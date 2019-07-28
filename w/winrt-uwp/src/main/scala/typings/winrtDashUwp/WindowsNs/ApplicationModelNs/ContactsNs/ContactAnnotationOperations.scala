package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactAnnotationOperations extends js.Object

/** Specifies the types of operations you can perform with a Contact . */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactAnnotationOperations")
@js.native
object ContactAnnotationOperations extends js.Object {
  /** Make and audio call. */
  @js.native
  sealed trait audioCall extends ContactAnnotationOperations
  
  /** Get the contact profile. */
  @js.native
  sealed trait contactProfile extends ContactAnnotationOperations
  
  /** Send an SMS/MMS message. */
  @js.native
  sealed trait message extends ContactAnnotationOperations
  
  /** None */
  @js.native
  sealed trait none extends ContactAnnotationOperations
  
  /** Access social media feeds. */
  @js.native
  sealed trait socialFeeds extends ContactAnnotationOperations
  
  /** Make a video call. */
  @js.native
  sealed trait videoCall extends ContactAnnotationOperations
  
  /* 3 */ val audioCall: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactAnnotationOperations.audioCall with Double = js.native
  /* 1 */ val contactProfile: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactAnnotationOperations.contactProfile with Double = js.native
  /* 2 */ val message: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactAnnotationOperations.message with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactAnnotationOperations.none with Double = js.native
  /* 5 */ val socialFeeds: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactAnnotationOperations.socialFeeds with Double = js.native
  /* 4 */ val videoCall: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactAnnotationOperations.videoCall with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactAnnotationOperations with Double] = js.native
}

