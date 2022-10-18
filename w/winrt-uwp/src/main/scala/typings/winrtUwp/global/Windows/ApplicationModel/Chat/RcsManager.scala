package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to APIs for handling Rich Communication Services (RCS) messages. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Chat.RcsManager")
@js.native
open class RcsManager ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Chat.RcsManager
object RcsManager {
  
  @JSGlobal("Windows.ApplicationModel.Chat.RcsManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the RcsEndUserMessageManager .
    * @return The end user message manager.
    */
  /* static member */
  inline def getEndUserMessageManager(): typings.winrtUwp.Windows.ApplicationModel.Chat.RcsEndUserMessageManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndUserMessageManager")().asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.Chat.RcsEndUserMessageManager]
  
  /**
    * Gets an instance of RcsTransport for the specified transport ID.
    * @param transportId The ID of the transport to retrieve.
    * @return An instance of the transport specified by the transportId parameter.
    */
  /* static member */
  inline def getTransportAsync(transportId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Chat.RcsTransport] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransportAsync")(transportId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Chat.RcsTransport]]
  
  /**
    * Gets all instances of RcsTransport .
    * @return A list of RcsTransport instances.
    */
  /* static member */
  inline def getTransportsAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransportsAsync")().asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
  
  /**
    * Asynchronously allows a user to leave a particular conversation.
    * @param conversation The conversation to leave.
    * @return An async action indicating that the operation has completed.
    */
  /* static member */
  inline def leaveConversationAsync(conversation: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatConversation): IPromiseWithIAsyncAction = ^.asInstanceOf[js.Dynamic].applyDynamic("leaveConversationAsync")(conversation.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncAction]
}
