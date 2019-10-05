package typings.winrtDashUwp.Windows.ApplicationModel.Email

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
  
  /* 5 */ val all: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields.all with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields.none with Double = js.native
  /* 3 */ val preview: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields.preview with Double = js.native
  /* 4 */ val recipients: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields.recipients with Double = js.native
  /* 2 */ val sender: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields.sender with Double = js.native
  /* 1 */ val subject: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields.subject with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailQuerySearchFields with Double] = js.native
}

