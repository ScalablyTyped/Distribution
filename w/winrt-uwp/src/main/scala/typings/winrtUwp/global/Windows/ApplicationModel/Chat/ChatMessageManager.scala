package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to message transports and the message store. Also provides a method to display the UI to compose messages. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Chat.ChatMessageManager")
@js.native
open class ChatMessageManager ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageManager
object ChatMessageManager {
  
  @JSGlobal("Windows.ApplicationModel.Chat.ChatMessageManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Asynchronously gets the ChatMessageTransport .
    * @param transportId The locally unique identifier for the message transport.
    * @return The message transport.
    */
  /* static member */
  inline def getTransportAsync(transportId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageTransport] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransportAsync")(transportId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageTransport]]
  
  /**
    * Asynchronously gets the chat message transports available on the device.
    * @return An asynchronous operation that returns a list of transports on successful completion.
    */
  /* static member */
  inline def getTransportsAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransportsAsync")().asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
  
  /**
    * Asynchronously registers the app as a ChatMessageTransport in order to post messages to the ChatMessageStore .
    * @return The transport ID for the newly registered ChatMessageTransport .
    */
  /* static member */
  inline def registerTransportAsync(): IPromiseWithIAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTransportAsync")().asInstanceOf[IPromiseWithIAsyncOperation[String]]
  
  /**
    * Returns the SMS messaging store for the phone.
    * @return An asynchronous operation that returns a ChatMessageStore on successful completion.
    */
  /* static member */
  inline def requestStoreAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageStore] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestStoreAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageStore]]
  
  /**
    * Shows the compose SMS dialog, pre-populated with data from the supplied ChatMessage object, allowing the user to send an SMS message.
    * @param message The chat message.
    * @return An asynchronous action.
    */
  /* static member */
  inline def showComposeSmsMessageAsync(message: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessage): IPromiseWithIAsyncAction = ^.asInstanceOf[js.Dynamic].applyDynamic("showComposeSmsMessageAsync")(message.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncAction]
  
  /** Launches the device's SMS settings app. */
  /* static member */
  inline def showSmsSettings(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showSmsSettings")().asInstanceOf[Unit]
}
