package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Rich Communication Services (RCS) end user message. */
trait RcsEndUserMessage extends js.Object {
  /** Gets the actions to which the user can respond. */
  var actions: IVectorView[RcsEndUserMessageAction]
  /** Gets a Boolean value that specifies whether a PIN is required to be sent back with the response. */
  var isPinRequired: Boolean
  /** Gets the contents of the message. */
  var text: String
  /** Gets the title of the message. */
  var title: String
  /** Gets the ID of the transport where this message originated. */
  var transportId: String
  /**
    * Asynchronously sends the user's selection back.
    * @param action Specifies the label of the action.
    * @return An async action indicating that the operation has completed.
    */
  def sendResponseAsync(action: RcsEndUserMessageAction): IPromiseWithIAsyncAction
  /**
    * Asynchronously sends the user's selection back with the specified PIN.
    * @param action Specifies the label of the action.
    * @param pin The PIN to send.
    * @return An async action indicating that the operation has completed.
    */
  def sendResponseWithPinAsync(action: RcsEndUserMessageAction, pin: String): IPromiseWithIAsyncAction
}

object RcsEndUserMessage {
  @scala.inline
  def apply(
    actions: IVectorView[RcsEndUserMessageAction],
    isPinRequired: Boolean,
    sendResponseAsync: RcsEndUserMessageAction => IPromiseWithIAsyncAction,
    sendResponseWithPinAsync: (RcsEndUserMessageAction, String) => IPromiseWithIAsyncAction,
    text: String,
    title: String,
    transportId: String
  ): RcsEndUserMessage = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], isPinRequired = isPinRequired.asInstanceOf[js.Any], sendResponseAsync = js.Any.fromFunction1(sendResponseAsync), sendResponseWithPinAsync = js.Any.fromFunction2(sendResponseWithPinAsync), text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transportId = transportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcsEndUserMessage]
  }
}

