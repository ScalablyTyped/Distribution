package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to message transports and the message store. Also provides a method to display the UI to compose messages. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageManager")
@js.native
abstract class ChatMessageManager ()
  extends typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageManager
object ChatMessageManager {
  
  /**
    * Asynchronously gets the ChatMessageTransport .
    * @param transportId The locally unique identifier for the message transport.
    * @return The message transport.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Chat.ChatMessageManager.getTransportAsync")
  @js.native
  def getTransportAsync(transportId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageTransport] = js.native
  
  /**
    * Asynchronously gets the chat message transports available on the device.
    * @return An asynchronous operation that returns a list of transports on successful completion.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Chat.ChatMessageManager.getTransportsAsync")
  @js.native
  def getTransportsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Asynchronously registers the app as a ChatMessageTransport in order to post messages to the ChatMessageStore .
    * @return The transport ID for the newly registered ChatMessageTransport .
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Chat.ChatMessageManager.registerTransportAsync")
  @js.native
  def registerTransportAsync(): IPromiseWithIAsyncOperation[String] = js.native
  
  /**
    * Returns the SMS messaging store for the phone.
    * @return An asynchronous operation that returns a ChatMessageStore on successful completion.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Chat.ChatMessageManager.requestStoreAsync")
  @js.native
  def requestStoreAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageStore] = js.native
  
  /**
    * Shows the compose SMS dialog, pre-populated with data from the supplied ChatMessage object, allowing the user to send an SMS message.
    * @param message The chat message.
    * @return An asynchronous action.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Chat.ChatMessageManager.showComposeSmsMessageAsync")
  @js.native
  def showComposeSmsMessageAsync(message: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessage): IPromiseWithIAsyncAction = js.native
  
  /** Launches the device's SMS settings app. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Chat.ChatMessageManager.showSmsSettings")
  @js.native
  def showSmsSettings(): Unit = js.native
}
