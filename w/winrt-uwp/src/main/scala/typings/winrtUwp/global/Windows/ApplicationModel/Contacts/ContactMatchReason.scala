package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Data.Text.TextSegment
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details about why search results matched the query parameters. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Contacts.ContactMatchReason")
@js.native
open class ContactMatchReason ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactMatchReason {
  
  /** Gets the contact field type that matched the search, such as name, phone number, email address and so on. */
  /* CompleteClass */
  var field: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactMatchReasonKind = js.native
  
  /** Gets a list of matching TextSegment objects which tells you what to highlight in your view as the result of a contact search. */
  /* CompleteClass */
  var segments: IVectorView[TextSegment] = js.native
  
  /** Gets the matching text result from a contact search. */
  /* CompleteClass */
  var text: String = js.native
}
