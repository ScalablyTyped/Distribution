package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait all
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQuerySearchFields
  
  /** No search field defined. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQuerySearchFields
  
  /** Search by preview text field. */
  @js.native
  sealed trait preview
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQuerySearchFields
  
  /** Search by members of the recipient list. */
  @js.native
  sealed trait recipients
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQuerySearchFields
  
  /** Search by sender field. */
  @js.native
  sealed trait sender
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQuerySearchFields
  
  /** Search by subject field. */
  @js.native
  sealed trait subject
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQuerySearchFields
  
  val all: all with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val preview: preview with java.lang.String = js.native
  val recipients: recipients with java.lang.String = js.native
  val sender: sender with java.lang.String = js.native
  val subject: subject with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailQuerySearchFields with java.lang.String
  ] = js.native
}

