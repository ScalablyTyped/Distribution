package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about a change that occurred to a mailbox. */
trait EmailMailboxAction extends js.Object {
  /** Gets the number that identifies the change that happened to the mailbox. */
  var changeNumber: Double
  /** Gets the value that represents the kind of change that happened to the mailbox. */
  var kind: EmailMailboxActionKind
}

object EmailMailboxAction {
  @scala.inline
  def apply(changeNumber: Double, kind: EmailMailboxActionKind): EmailMailboxAction = {
    val __obj = js.Dynamic.literal(changeNumber = changeNumber.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMailboxAction]
  }
}

