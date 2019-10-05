package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

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
  sealed trait emailAddress extends ContactMatchReasonKind
  
  /** The contact job info field matched. */
  @js.native
  sealed trait jobInfo extends ContactMatchReasonKind
  
  /** The contact name field matched. */
  @js.native
  sealed trait name extends ContactMatchReasonKind
  
  /** The contact matched on a field that is not one of the others list in this enum. */
  @js.native
  sealed trait other extends ContactMatchReasonKind
  
  /** The contact phone number field matched. */
  @js.native
  sealed trait phoneNumber extends ContactMatchReasonKind
  
  /** The contact phonetic name field matched. */
  @js.native
  sealed trait yomiName extends ContactMatchReasonKind
  
  /* 1 */ val emailAddress: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactMatchReasonKind.emailAddress with Double = js.native
  /* 3 */ val jobInfo: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactMatchReasonKind.jobInfo with Double = js.native
  /* 0 */ val name: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactMatchReasonKind.name with Double = js.native
  /* 5 */ val other: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactMatchReasonKind.other with Double = js.native
  /* 2 */ val phoneNumber: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactMatchReasonKind.phoneNumber with Double = js.native
  /* 4 */ val yomiName: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactMatchReasonKind.yomiName with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactMatchReasonKind with Double] = js.native
}

