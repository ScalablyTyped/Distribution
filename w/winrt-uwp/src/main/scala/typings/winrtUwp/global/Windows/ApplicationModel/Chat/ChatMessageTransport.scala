package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the identity of a transport for sending and receiving messages. Physically, a chat message transport is a SIM slot on the phone. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageTransport")
@js.native
abstract class ChatMessageTransport ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageTransport {
  
  /** Gets the configuration of the message transport. */
  /* CompleteClass */
  var configuration: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageTransportConfiguration = js.native
  
  /** Gets a Boolean value that indicates whether the messaging transport is active. */
  /* CompleteClass */
  var isActive: Boolean = js.native
  
  /** Gets a Boolean value that indicates whether the current application is set as the messaging notification provider. */
  /* CompleteClass */
  var isAppSetAsNotificationProvider: Boolean = js.native
  
  /**
    * Sets the current application to handle messaging notifications.
    * @return An asynchronous action.
    */
  /* CompleteClass */
  override def requestSetAsNotificationProviderAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Gets a descriptive name identifying the messaging transport. */
  /* CompleteClass */
  var transportFriendlyName: String = js.native
  
  /** Gets the messaging transport’s identifier. */
  /* CompleteClass */
  var transportId: String = js.native
  
  /** Gets the type of the message transport. */
  /* CompleteClass */
  var transportKind: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageTransportKind = js.native
}
