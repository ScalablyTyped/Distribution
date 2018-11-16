package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The functionality described in this topic is not available to all Windows and Windows Phone apps. For your code to call these APIs, Microsoft must approve your use of them and provision your developer account. Otherwise the calls will fail at runtime. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxChange")
@js.native
abstract class EmailMailboxChange () extends js.Object {
  /** Gets the type of change that was made to the mailbox. This includes whether it was a folder or message that was changed and whether the item was created, deleted, or modified, or if change tracking was lost for this change. */
  var changeType: EmailMailboxChangeType = js.native
  /** Gets the folder to which the change applies. */
  var folder: EmailFolder = js.native
  /** Gets the flags that indicate what actions have been affected on the mailbox. */
  var mailboxActions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[EmailMailboxAction] = js.native
  /** Gets the message to which the change applies. */
  var message: EmailMessage = js.native
}

