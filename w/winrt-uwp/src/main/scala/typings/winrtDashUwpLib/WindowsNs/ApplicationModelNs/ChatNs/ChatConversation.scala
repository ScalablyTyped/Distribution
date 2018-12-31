package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a conversation in a chat client. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatConversation")
@js.native
abstract class ChatConversation () extends js.Object {
  /** Gets or sets a boolean that indicates whether participants can be modified or not. */
  var canModifyParticipants: scala.Boolean = js.native
  /** Gets a Boolean value indicating if there are unread messages in the ChatConversation . */
  var hasUnreadMessages: scala.Boolean = js.native
  /** Gets the unique identifier for the ChatConversation . */
  var id: java.lang.String = js.native
  /** Gets or sets a Boolean value indicating if the ChatConversation is muted. */
  var isConversationMuted: scala.Boolean = js.native
  /** Gets the ID of the most recent message in the conversation. */
  var mostRecentMessageId: java.lang.String = js.native
  /** Occurs when the remote user has started or finished typing. */
  @JSName("onremoteparticipantcomposingchanged")
  var onremoteparticipantcomposingchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ChatConversation, RemoteParticipantComposingChangedEventArgs] = js.native
  /** Gets a list of all the participants in the conversation. */
  var participants: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets or sets the subject of a group conversation. */
  var subject: java.lang.String = js.native
  /** Gets the threading info for the ChatConversation . */
  var threadingInfo: ChatConversationThreadingInfo = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_remoteparticipantcomposingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.remoteparticipantcomposingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ChatConversation, RemoteParticipantComposingChangedEventArgs]
  ): scala.Unit = js.native
  /**
    * Asynchronously deletes all of the messages in the ChatConversation and the conversation itself.
    * @return An async action that indicates when the delete has completed.
    */
  def deleteAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Gets the ChatMessageReader for this ChatConversation .
    * @return The ChatMessageReader for this ChatConversation .
    */
  def getMessageReader(): ChatMessageReader = js.native
  /**
    * Asynchronously marks all the messages in the conversation as read.
    * @return An async action indicating that the operation has completed.
    */
  def markMessagesAsReadAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously marks all the messages in the conversation before the specified DateTime as read.
    * @param value Mark all messages before this DateTime as read.
    * @return An async action indicating that the operation has completed.
    */
  def markMessagesAsReadAsync(value: stdLib.Date): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Call this to indicate that the local participant has started or has completed typing.
    * @param transportId Specifies the ChatMessageTransport to use.
    * @param participantAddress The address of the remote participant.
    * @param isComposing TRUE if the local participant is typing, otherwise FALSE.
    */
  def notifyLocalParticipantComposing(transportId: java.lang.String, participantAddress: java.lang.String, isComposing: scala.Boolean): scala.Unit = js.native
  /**
    * Locally triggers the event that indicates that a remote participant is typing.
    * @param transportId Specifies the ChatMessageTransport to use.
    * @param participantAddress The address of the remote participant.
    * @param isComposing TRUE if the remote participant is typing, otherwise FALSE.
    */
  def notifyRemoteParticipantComposing(transportId: java.lang.String, participantAddress: java.lang.String, isComposing: scala.Boolean): scala.Unit = js.native
  /** Occurs when the remote user has started or finished typing. */
  def onremoteparticipantcomposingchanged(
    ev: RemoteParticipantComposingChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[ChatConversation]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_remoteparticipantcomposingchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.remoteparticipantcomposingchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ChatConversation, RemoteParticipantComposingChangedEventArgs]
  ): scala.Unit = js.native
  /**
    * Asynchronously saves the ChatConversation .
    * @return An async action indicating that the operation has completed.
    */
  def saveAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

