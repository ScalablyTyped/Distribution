package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to message transports and the message store. Also provides a method to display the UI to compose messages. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageManager")
@js.native
abstract class ChatMessageManager () extends js.Object

/** Provides access to message transports and the message store. Also provides a method to display the UI to compose messages. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageManager")
@js.native
object ChatMessageManager extends js.Object {
  /**
    * Asynchronously gets the ChatMessageTransport .
    * @param transportId The locally unique identifier for the message transport.
    * @return The message transport.
    */
  def getTransportAsync(transportId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageTransport] = js.native
  /**
    * Asynchronously gets the chat message transports available on the device.
    * @return An asynchronous operation that returns a list of transports on successful completion.
    */
  def getTransportsAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Asynchronously registers the app as a ChatMessageTransport in order to post messages to the ChatMessageStore .
    * @return The transport ID for the newly registered ChatMessageTransport .
    */
  def registerTransportAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
    * Returns the SMS messaging store for the phone.
    * @return An asynchronous operation that returns a ChatMessageStore on successful completion.
    */
  def requestStoreAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStore] = js.native
  /**
    * Shows the compose SMS dialog, pre-populated with data from the supplied ChatMessage object, allowing the user to send an SMS message.
    * @param message The chat message.
    * @return An asynchronous action.
    */
  def showComposeSmsMessageAsync(message: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessage): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Launches the device's SMS settings app. */
  def showSmsSettings(): scala.Unit = js.native
}

