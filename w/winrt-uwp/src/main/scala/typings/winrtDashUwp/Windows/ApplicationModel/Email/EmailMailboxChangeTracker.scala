package typings.winrtDashUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The functionality described in this topic is not available to all Windows and Windows Phone apps. For your code to call these APIs, Microsoft must approve your use of them and provision your developer account. Otherwise the calls will fail at runtime. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxChangeTracker")
@js.native
abstract class EmailMailboxChangeTracker () extends js.Object {
  /** Gets a Boolean value indicating whether change tracking is active. */
  var isTracking: Boolean = js.native
  /** Enables change tracking on a mailbox. */
  def enable(): Unit = js.native
  /**
    * Gets a reader that will read a batch of changes.
    * @return A reader that will read a batch of changes.
    */
  def getChangeReader(): EmailMailboxChangeReader = js.native
  /** Moves the change tracking cursor to now. */
  def reset(): Unit = js.native
}

