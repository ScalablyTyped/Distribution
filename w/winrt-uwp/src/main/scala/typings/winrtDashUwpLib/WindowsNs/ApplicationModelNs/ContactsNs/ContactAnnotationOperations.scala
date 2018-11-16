package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

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
  sealed trait audioCall
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactAnnotationOperations
  
  /** Get the contact profile. */
  @js.native
  sealed trait contactProfile
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactAnnotationOperations
  
  /** Send an SMS/MMS message. */
  @js.native
  sealed trait message
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactAnnotationOperations
  
  /** None */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactAnnotationOperations
  
  /** Access social media feeds. */
  @js.native
  sealed trait socialFeeds
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactAnnotationOperations
  
  /** Make a video call. */
  @js.native
  sealed trait videoCall
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactAnnotationOperations
  
  val audioCall: audioCall with java.lang.String = js.native
  val contactProfile: contactProfile with java.lang.String = js.native
  val message: message with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val socialFeeds: socialFeeds with java.lang.String = js.native
  val videoCall: videoCall with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactAnnotationOperations with java.lang.String
  ] = js.native
}

