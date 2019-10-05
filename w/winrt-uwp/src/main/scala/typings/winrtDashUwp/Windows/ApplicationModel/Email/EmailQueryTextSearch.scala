package typings.winrtDashUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a text search query in an email mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailQueryTextSearch")
@js.native
abstract class EmailQueryTextSearch () extends js.Object {
  /** Gets or sets the fields for an email text search query. */
  var fields: EmailQuerySearchFields = js.native
  /** Gets or sets the scope for an email text search query. */
  var searchScope: EmailQuerySearchScope = js.native
  /** Gets or sets the text string for an email text search query. */
  var text: String = js.native
}

