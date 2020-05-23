package typings.winrtUwp.global.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a text search query in an email mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailQueryTextSearch")
@js.native
abstract class EmailQueryTextSearch ()
  extends typings.winrtUwp.Windows.ApplicationModel.Email.EmailQueryTextSearch {
  /** Gets or sets the fields for an email text search query. */
  /* CompleteClass */
  override var fields: typings.winrtUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields = js.native
  /** Gets or sets the scope for an email text search query. */
  /* CompleteClass */
  override var searchScope: typings.winrtUwp.Windows.ApplicationModel.Email.EmailQuerySearchScope = js.native
  /** Gets or sets the text string for an email text search query. */
  /* CompleteClass */
  override var text: String = js.native
}

