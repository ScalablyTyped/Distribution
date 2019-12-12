package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields.all
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields.none
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields.preview
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields.recipients
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields.sender
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields.subject
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailQuerySearchFields with Double] = js.native
  /* 5 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object preview extends TopLevel[preview with Double]
  
  /* 4 */ @js.native
  object recipients extends TopLevel[recipients with Double]
  
  /* 2 */ @js.native
  object sender extends TopLevel[sender with Double]
  
  /* 1 */ @js.native
  object subject extends TopLevel[subject with Double]
  
}

