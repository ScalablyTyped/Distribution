package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the identity of a transport for sending and receiving messages. Physically, a chat message transport is a SIM slot on the phone. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageTransport")
@js.native
abstract class ChatMessageTransport () extends js.Object {
  /** Gets the configuration of the message transport. */
  var configuration: ChatMessageTransportConfiguration = js.native
  /** Gets a Boolean value that indicates whether the messaging transport is active. */
  var isActive: Boolean = js.native
  /** Gets a Boolean value that indicates whether the current application is set as the messaging notification provider. */
  var isAppSetAsNotificationProvider: Boolean = js.native
  /** Gets a descriptive name identifying the messaging transport. */
  var transportFriendlyName: String = js.native
  /** Gets the messaging transport’s identifier. */
  var transportId: String = js.native
  /** Gets the type of the message transport. */
  var transportKind: ChatMessageTransportKind = js.native
  /**
    * Sets the current application to handle messaging notifications.
    * @return An asynchronous action.
    */
  def requestSetAsNotificationProviderAsync(): IPromiseWithIAsyncAction = js.native
}

