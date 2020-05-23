package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies parameters to use in a text search of Contact objects. */
trait ContactQueryTextSearch extends js.Object {
  /** Gets or sets which contact fields to search for a text match. */
  var fields: ContactQuerySearchFields
  /** Gets or sets a value that specifies either a local or server search. */
  var searchScope: ContactQuerySearchScope
  /** Gets or sets the text for which to search. */
  var text: String
}

object ContactQueryTextSearch {
  @scala.inline
  def apply(fields: ContactQuerySearchFields, searchScope: ContactQuerySearchScope, text: String): ContactQueryTextSearch = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], searchScope = searchScope.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactQueryTextSearch]
  }
}

