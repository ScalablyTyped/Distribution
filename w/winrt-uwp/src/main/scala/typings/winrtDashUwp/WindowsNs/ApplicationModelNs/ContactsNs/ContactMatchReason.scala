package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs

import typings.winrtDashUwp.WindowsNs.DataNs.TextNs.TextSegment
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details about why search results matched the query parameters. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactMatchReason")
@js.native
abstract class ContactMatchReason () extends js.Object {
  /** Gets the contact field type that matched the search, such as name, phone number, email address and so on. */
  var field: ContactMatchReasonKind = js.native
  /** Gets a list of matching TextSegment objects which tells you what to highlight in your view as the result of a contact search. */
  var segments: IVectorView[TextSegment] = js.native
  /** Gets the matching text result from a contact search. */
  var text: String = js.native
}

