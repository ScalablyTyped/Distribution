package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactMatchReasonKind extends StObject
/** Defines the reasons that a Contact matched a search. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactMatchReasonKind")
@js.native
object ContactMatchReasonKind extends StObject {
  
  /** The contact email address field matched. */
  @js.native
  sealed trait emailAddress
    extends StObject
       with ContactMatchReasonKind
  
  /** The contact job info field matched. */
  @js.native
  sealed trait jobInfo
    extends StObject
       with ContactMatchReasonKind
  
  /** The contact name field matched. */
  @js.native
  sealed trait name
    extends StObject
       with ContactMatchReasonKind
  
  /** The contact matched on a field that is not one of the others list in this enum. */
  @js.native
  sealed trait other
    extends StObject
       with ContactMatchReasonKind
  
  /** The contact phone number field matched. */
  @js.native
  sealed trait phoneNumber
    extends StObject
       with ContactMatchReasonKind
  
  /** The contact phonetic name field matched. */
  @js.native
  sealed trait yomiName
    extends StObject
       with ContactMatchReasonKind
}
