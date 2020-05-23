package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailQuerySearchFields extends js.Object

/** Defines the field(s) by which to search a collection of email messages. Use the OR operator to combine these values together into a single bit field. */
@JSGlobal("Windows.ApplicationModel.Email.EmailQuerySearchFields")
@js.native
object EmailQuerySearchFields extends js.Object {
  /** Search by all searchable fields. */
  @js.native
  sealed trait all extends EmailQuerySearchFields
  
  /** No search field defined. */
  @js.native
  sealed trait none extends EmailQuerySearchFields
  
  /** Search by preview text field. */
  @js.native
  sealed trait preview extends EmailQuerySearchFields
  
  /** Search by members of the recipient list. */
  @js.native
  sealed trait recipients extends EmailQuerySearchFields
  
  /** Search by sender field. */
  @js.native
  sealed trait sender extends EmailQuerySearchFields
  
  /** Search by subject field. */
  @js.native
  sealed trait subject extends EmailQuerySearchFields
  
}

