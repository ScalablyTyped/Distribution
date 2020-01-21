package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactMatchReasonKind with Double] = js.native
  /* 1 */ @js.native
  object emailAddress extends TopLevel[emailAddress with Double]
  
  /* 3 */ @js.native
  object jobInfo extends TopLevel[jobInfo with Double]
  
  /* 0 */ @js.native
  object name extends TopLevel[name with Double]
  
  /* 5 */ @js.native
  object other extends TopLevel[other with Double]
  
  /* 2 */ @js.native
  object phoneNumber extends TopLevel[phoneNumber with Double]
  
  /* 4 */ @js.native
  object yomiName extends TopLevel[yomiName with Double]
  
}

