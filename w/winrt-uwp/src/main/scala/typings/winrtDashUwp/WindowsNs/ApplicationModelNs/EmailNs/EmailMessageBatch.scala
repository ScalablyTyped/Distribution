package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of email messages. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMessageBatch")
@js.native
abstract class EmailMessageBatch () extends js.Object {
  /** Gets a batch of email messages. */
  var messages: IVectorView[EmailMessage] = js.native
  /** Gets the status of the email batch read. */
  var status: EmailBatchStatus = js.native
}

