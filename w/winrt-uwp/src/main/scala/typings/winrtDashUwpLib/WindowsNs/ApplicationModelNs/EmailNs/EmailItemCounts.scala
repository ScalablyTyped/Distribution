package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the counts for various email message attributes such as flagged, important, unread, and so on. */
@JSGlobal("Windows.ApplicationModel.Email.EmailItemCounts")
@js.native
abstract class EmailItemCounts () extends js.Object {
  /** Gets the number of flagged email messages. */
  var flagged: scala.Double = js.native
  /** Gets the number of important email messages. */
  var important: scala.Double = js.native
  /** Gets the total number of email messages */
  var total: scala.Double = js.native
  /** Gets the number of unread email messages. */
  var unread: scala.Double = js.native
}

