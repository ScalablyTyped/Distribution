package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactMatchReasonKind extends js.Object

/** Defines the reasons that a Contact matched a search. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactMatchReasonKind")
@js.native
object ContactMatchReasonKind extends js.Object {
  /** The contact email address field matched. */
  @js.native
  sealed trait emailAddress
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactMatchReasonKind
  
  /** The contact job info field matched. */
  @js.native
  sealed trait jobInfo
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactMatchReasonKind
  
  /** The contact name field matched. */
  @js.native
  sealed trait name
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactMatchReasonKind
  
  /** The contact matched on a field that is not one of the others list in this enum. */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactMatchReasonKind
  
  /** The contact phone number field matched. */
  @js.native
  sealed trait phoneNumber
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactMatchReasonKind
  
  /** The contact phonetic name field matched. */
  @js.native
  sealed trait yomiName
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactMatchReasonKind
  
  val emailAddress: emailAddress with java.lang.String = js.native
  val jobInfo: jobInfo with java.lang.String = js.native
  val name: name with java.lang.String = js.native
  val other: other with java.lang.String = js.native
  val phoneNumber: phoneNumber with java.lang.String = js.native
  val yomiName: yomiName with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactMatchReasonKind with java.lang.String
  ] = js.native
}

