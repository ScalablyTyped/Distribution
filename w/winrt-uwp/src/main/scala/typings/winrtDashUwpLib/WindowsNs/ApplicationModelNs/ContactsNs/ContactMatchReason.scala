package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

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
  var segments: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.DataNs.TextNs.TextSegment] = js.native
  /** Gets the matching text result from a contact search. */
  var text: java.lang.String = js.native
}

