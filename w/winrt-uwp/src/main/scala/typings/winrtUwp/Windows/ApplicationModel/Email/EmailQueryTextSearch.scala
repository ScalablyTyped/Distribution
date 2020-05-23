package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a text search query in an email mailbox. */
trait EmailQueryTextSearch extends js.Object {
  /** Gets or sets the fields for an email text search query. */
  var fields: EmailQuerySearchFields
  /** Gets or sets the scope for an email text search query. */
  var searchScope: EmailQuerySearchScope
  /** Gets or sets the text string for an email text search query. */
  var text: String
}

object EmailQueryTextSearch {
  @scala.inline
  def apply(fields: EmailQuerySearchFields, searchScope: EmailQuerySearchScope, text: String): EmailQueryTextSearch = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], searchScope = searchScope.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailQueryTextSearch]
  }
}

