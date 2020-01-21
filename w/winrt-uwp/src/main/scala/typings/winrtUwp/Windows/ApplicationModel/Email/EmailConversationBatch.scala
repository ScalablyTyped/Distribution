package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of EmailConversation objects for batch processing. */
@JSGlobal("Windows.ApplicationModel.Email.EmailConversationBatch")
@js.native
abstract class EmailConversationBatch () extends js.Object {
  /** Gets a list of EmailConversation objects to use for batch processing. */
  var conversations: IVectorView[EmailConversation] = js.native
  /** Gets the status of the last batch processing operation. */
  var status: EmailBatchStatus = js.native
}

