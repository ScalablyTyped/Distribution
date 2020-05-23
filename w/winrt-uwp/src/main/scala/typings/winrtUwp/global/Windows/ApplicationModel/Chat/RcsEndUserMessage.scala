package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Rich Communication Services (RCS) end user message. */
@JSGlobal("Windows.ApplicationModel.Chat.RcsEndUserMessage")
@js.native
abstract class RcsEndUserMessage ()
  extends typings.winrtUwp.Windows.ApplicationModel.Chat.RcsEndUserMessage {
  /** Gets the actions to which the user can respond. */
  /* CompleteClass */
  override var actions: IVectorView[typings.winrtUwp.Windows.ApplicationModel.Chat.RcsEndUserMessageAction] = js.native
  /** Gets a Boolean value that specifies whether a PIN is required to be sent back with the response. */
  /* CompleteClass */
  override var isPinRequired: Boolean = js.native
  /** Gets the contents of the message. */
  /* CompleteClass */
  override var text: String = js.native
  /** Gets the title of the message. */
  /* CompleteClass */
  override var title: String = js.native
  /** Gets the ID of the transport where this message originated. */
  /* CompleteClass */
  override var transportId: String = js.native
  /**
    * Asynchronously sends the user's selection back.
    * @param action Specifies the label of the action.
    * @return An async action indicating that the operation has completed.
    */
  /* CompleteClass */
  override def sendResponseAsync(action: typings.winrtUwp.Windows.ApplicationModel.Chat.RcsEndUserMessageAction): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously sends the user's selection back with the specified PIN.
    * @param action Specifies the label of the action.
    * @param pin The PIN to send.
    * @return An async action indicating that the operation has completed.
    */
  /* CompleteClass */
  override def sendResponseWithPinAsync(action: typings.winrtUwp.Windows.ApplicationModel.Chat.RcsEndUserMessageAction, pin: String): IPromiseWithIAsyncAction = js.native
}

