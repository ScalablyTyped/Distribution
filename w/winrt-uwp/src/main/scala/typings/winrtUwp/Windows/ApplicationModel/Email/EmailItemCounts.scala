package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the counts for various email message attributes such as flagged, important, unread, and so on. */
trait EmailItemCounts extends js.Object {
  /** Gets the number of flagged email messages. */
  var flagged: Double
  /** Gets the number of important email messages. */
  var important: Double
  /** Gets the total number of email messages */
  var total: Double
  /** Gets the number of unread email messages. */
  var unread: Double
}

object EmailItemCounts {
  @scala.inline
  def apply(flagged: Double, important: Double, total: Double, unread: Double): EmailItemCounts = {
    val __obj = js.Dynamic.literal(flagged = flagged.asInstanceOf[js.Any], important = important.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], unread = unread.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailItemCounts]
  }
}

