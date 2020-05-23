package typings.winrtUwp.global.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the counts for various email message attributes such as flagged, important, unread, and so on. */
@JSGlobal("Windows.ApplicationModel.Email.EmailItemCounts")
@js.native
abstract class EmailItemCounts ()
  extends typings.winrtUwp.Windows.ApplicationModel.Email.EmailItemCounts {
  /** Gets the number of flagged email messages. */
  /* CompleteClass */
  override var flagged: Double = js.native
  /** Gets the number of important email messages. */
  /* CompleteClass */
  override var important: Double = js.native
  /** Gets the total number of email messages */
  /* CompleteClass */
  override var total: Double = js.native
  /** Gets the number of unread email messages. */
  /* CompleteClass */
  override var unread: Double = js.native
}

