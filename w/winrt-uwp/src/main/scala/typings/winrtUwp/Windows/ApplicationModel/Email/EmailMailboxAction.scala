package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about a change that occurred to a mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxAction")
@js.native
abstract class EmailMailboxAction () extends js.Object {
  /** Gets the number that identifies the change that happened to the mailbox. */
  var changeNumber: Double = js.native
  /** Gets the value that represents the kind of change that happened to the mailbox. */
  var kind: EmailMailboxActionKind = js.native
}

