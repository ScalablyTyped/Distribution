package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to APIs for handling Rich Communication Services (RCS) messages. */
@JSGlobal("Windows.ApplicationModel.Chat.RcsManager")
@js.native
abstract class RcsManager ()
  extends typings.winrtUwp.Windows.ApplicationModel.Chat.RcsManager

/* static members */
@JSGlobal("Windows.ApplicationModel.Chat.RcsManager")
@js.native
object RcsManager extends js.Object {
  /**
    * Gets the RcsEndUserMessageManager .
    * @return The end user message manager.
    */
  def getEndUserMessageManager(): typings.winrtUwp.Windows.ApplicationModel.Chat.RcsEndUserMessageManager = js.native
  /**
    * Gets an instance of RcsTransport for the specified transport ID.
    * @param transportId The ID of the transport to retrieve.
    * @return An instance of the transport specified by the transportId parameter.
    */
  def getTransportAsync(transportId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Chat.RcsTransport] = js.native
  /**
    * Gets all instances of RcsTransport .
    * @return A list of RcsTransport instances.
    */
  def getTransportsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Asynchronously allows a user to leave a particular conversation.
    * @param conversation The conversation to leave.
    * @return An async action indicating that the operation has completed.
    */
  def leaveConversationAsync(conversation: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatConversation): IPromiseWithIAsyncAction = js.native
}

