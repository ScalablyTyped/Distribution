package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the counts for various email message attributes such as flagged, important, unread, and so on. */
@JSGlobal("Windows.ApplicationModel.Email.EmailItemCounts")
@js.native
abstract class EmailItemCounts () extends js.Object {
  /** Gets the number of flagged email messages. */
  var flagged: Double = js.native
  /** Gets the number of important email messages. */
  var important: Double = js.native
  /** Gets the total number of email messages */
  var total: Double = js.native
  /** Gets the number of unread email messages. */
  var unread: Double = js.native
}

