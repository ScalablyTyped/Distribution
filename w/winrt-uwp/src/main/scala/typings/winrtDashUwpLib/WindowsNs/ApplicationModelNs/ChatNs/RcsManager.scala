package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to APIs for handling Rich Communication Services (RCS) messages. */
@JSGlobal("Windows.ApplicationModel.Chat.RcsManager")
@js.native
abstract class RcsManager () extends js.Object

/** Provides access to APIs for handling Rich Communication Services (RCS) messages. */
@JSGlobal("Windows.ApplicationModel.Chat.RcsManager")
@js.native
object RcsManager extends js.Object {
  /**
    * Gets the RcsEndUserMessageManager .
    * @return The end user message manager.
    */
  def getEndUserMessageManager(): winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.RcsEndUserMessageManager = js.native
  /**
    * Gets an instance of RcsTransport for the specified transport ID.
    * @param transportId The ID of the transport to retrieve.
    * @return An instance of the transport specified by the transportId parameter.
    */
  def getTransportAsync(transportId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.RcsTransport] = js.native
  /**
    * Gets all instances of RcsTransport .
    * @return A list of RcsTransport instances.
    */
  def getTransportsAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Asynchronously allows a user to leave a particular conversation.
    * @param conversation The conversation to leave.
    * @return An async action indicating that the operation has completed.
    */
  def leaveConversationAsync(conversation: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatConversation): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

