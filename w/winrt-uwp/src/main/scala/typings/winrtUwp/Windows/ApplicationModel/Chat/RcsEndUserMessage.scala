package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Rich Communication Services (RCS) end user message. */
trait RcsEndUserMessage extends StObject {
  
  /** Gets the actions to which the user can respond. */
  var actions: IVectorView[RcsEndUserMessageAction]
  
  /** Gets a Boolean value that specifies whether a PIN is required to be sent back with the response. */
  var isPinRequired: Boolean
  
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
  
  /** Gets the contents of the message. */
  var text: String
  
  /** Gets the title of the message. */
  var title: String
  
  /** Gets the ID of the transport where this message originated. */
  var transportId: String
}
object RcsEndUserMessage {
  
  inline def apply(
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
  
  extension [Self <: RcsEndUserMessage](x: Self) {
    
    inline def setActions(value: IVectorView[RcsEndUserMessageAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setIsPinRequired(value: Boolean): Self = StObject.set(x, "isPinRequired", value.asInstanceOf[js.Any])
    
    inline def setSendResponseAsync(value: RcsEndUserMessageAction => IPromiseWithIAsyncAction): Self = StObject.set(x, "sendResponseAsync", js.Any.fromFunction1(value))
    
    inline def setSendResponseWithPinAsync(value: (RcsEndUserMessageAction, String) => IPromiseWithIAsyncAction): Self = StObject.set(x, "sendResponseWithPinAsync", js.Any.fromFunction2(value))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTransportId(value: String): Self = StObject.set(x, "transportId", value.asInstanceOf[js.Any])
  }
}
