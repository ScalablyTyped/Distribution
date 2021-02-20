package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to APIs for handling Rich Communication Services (RCS) messages. */
@JSGlobal("Windows.ApplicationModel.Chat.RcsManager")
@js.native
abstract class RcsManager ()
  extends typings.winrtUwp.Windows.ApplicationModel.Chat.RcsManager
object RcsManager {
  
  /**
    * Gets the RcsEndUserMessageManager .
    * @return The end user message manager.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Chat.RcsManager.getEndUserMessageManager")
  @js.native
  def getEndUserMessageManager(): typings.winrtUwp.Windows.ApplicationModel.Chat.RcsEndUserMessageManager = js.native
  
  /**
    * Gets an instance of RcsTransport for the specified transport ID.
    * @param transportId The ID of the transport to retrieve.
    * @return An instance of the transport specified by the transportId parameter.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Chat.RcsManager.getTransportAsync")
  @js.native
  def getTransportAsync(transportId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Chat.RcsTransport] = js.native
  
  /**
    * Gets all instances of RcsTransport .
    * @return A list of RcsTransport instances.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Chat.RcsManager.getTransportsAsync")
  @js.native
  def getTransportsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Asynchronously allows a user to leave a particular conversation.
    * @param conversation The conversation to leave.
    * @return An async action indicating that the operation has completed.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Chat.RcsManager.leaveConversationAsync")
  @js.native
  def leaveConversationAsync(conversation: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatConversation): IPromiseWithIAsyncAction = js.native
}
