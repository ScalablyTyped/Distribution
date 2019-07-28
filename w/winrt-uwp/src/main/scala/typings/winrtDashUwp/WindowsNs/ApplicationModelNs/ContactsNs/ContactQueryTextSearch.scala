package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies parameters to use in a text search of Contact objects. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactQueryTextSearch")
@js.native
abstract class ContactQueryTextSearch () extends js.Object {
  /** Gets or sets which contact fields to search for a text match. */
  var fields: ContactQuerySearchFields = js.native
  /** Gets or sets a value that specifies either a local or server search. */
  var searchScope: ContactQuerySearchScope = js.native
  /** Gets or sets the text for which to search. */
  var text: String = js.native
}

