package typings.winrtUwp.global.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the field(s) by which to search a collection of email messages. Use the OR operator to combine these values together into a single bit field. */
@JSGlobal("Windows.ApplicationModel.Email.EmailQuerySearchFields")
@js.native
object EmailQuerySearchFields extends js.Object {
  /* 5 */ val all: typings.winrtUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields.all with Double = js.native
  /* 0 */ val none: typings.winrtUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields.none with Double = js.native
  /* 3 */ val preview: typings.winrtUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields.preview with Double = js.native
  /* 4 */ val recipients: typings.winrtUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields.recipients with Double = js.native
  /* 2 */ val sender: typings.winrtUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields.sender with Double = js.native
  /* 1 */ val subject: typings.winrtUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields.subject with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields with Double
  ] = js.native
}

