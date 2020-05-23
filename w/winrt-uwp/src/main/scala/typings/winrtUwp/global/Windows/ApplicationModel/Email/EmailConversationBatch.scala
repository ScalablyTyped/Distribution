package typings.winrtUwp.global.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of EmailConversation objects for batch processing. */
@JSGlobal("Windows.ApplicationModel.Email.EmailConversationBatch")
@js.native
abstract class EmailConversationBatch ()
  extends typings.winrtUwp.Windows.ApplicationModel.Email.EmailConversationBatch {
  /** Gets a list of EmailConversation objects to use for batch processing. */
  /* CompleteClass */
  override var conversations: IVectorView[typings.winrtUwp.Windows.ApplicationModel.Email.EmailConversation] = js.native
  /** Gets the status of the last batch processing operation. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.ApplicationModel.Email.EmailBatchStatus = js.native
}

