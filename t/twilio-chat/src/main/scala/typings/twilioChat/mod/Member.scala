package typings.twilioChat.mod

import typings.twilioReplayEventEmitter.mod.ReplayEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A member represents a remote client in a channel.
  */
@JSImport("twilio-chat", "Member")
@js.native
open class Member protected () extends ReplayEventEmitter[MemberEvents] {
  /**
    * @internal
    */
  def this(
    data: MemberDescriptor,
    sid: String,
    channel: Channel,
    links: MemberLinks,
    services: MemberServices
  ) = this()
  
  /**
    * Internal method function used to stop typing indicator timeout (with event emitting).
    * @internal
    */
  def _endTyping(): Unit = js.native
  
  /**
    * Internal method used to start or reset the typing indicator timeout (with event emitting).
    * @internal
    */
  def _startTyping(timeout: Any): this.type = js.native
  
  /**
    * Internal method function used update local object's property roleSid with a new value.
    * @internal
    */
  def _update(data: Any): this.type = js.native
  
  /**
    * Custom attributes of the member.
    */
  def attributes: js.Object = js.native
  
  /**
    * Channel that the remote client is a member of.
    */
  val channel: Channel = js.native
  
  /**
    * Date this member was created on.
    */
  def dateCreated: js.Date = js.native
  
  /**
    * Date this member was last updated on.
    */
  def dateUpdated: js.Date = js.native
  
  /**
    * Get the user for this member and subscribes to it. Supported only for members of type `chat`.
    */
  def getUser(): js.Promise[User] = js.native
  
  /**
    * Get the user descriptor for this member. Supported only for members of type `chat`.
    */
  def getUserDescriptor(): js.Promise[UserDescriptor] = js.native
  
  /**
    * Identity of the member.
    */
  def identity: String = js.native
  
  /**
    * Indicates whether the member is currently typing.
    */
  def isTyping: Boolean = js.native
  
  /**
    * The index of the last consumed message by the member.
    * Note that retrieving messages on a client endpoint does not mean that messages are read,
    * please consider reading about the [Read Horizon feature](https://www.twilio.com/docs/api/chat/guides/consumption-horizon)
    * to find out about the proper way to mark messages as read.
    */
  def lastConsumedMessageIndex: Double | Null = js.native
  
  /**
    * Date of the most recent consumption horizon update.
    */
  def lastConsumptionTimestamp: js.Date = js.native
  
  /* private */ val links: Any = js.native
  
  /**
    * Remove the member from the channel.
    */
  def remove(): js.Promise[Unit] = js.native
  
  def roleSid: String = js.native
  
  /* private */ val services: Any = js.native
  
  /**
    * The server-assigned unique identifier for the member.
    */
  def sid: String = js.native
  
  /* private */ var state: Any = js.native
  
  /**
    * Message type of the member.
    */
  def `type`: MemberType = js.native
  
  /**
    * Update the attributes of the member.
    * @param attributes New attributes.
    */
  def updateAttributes(attributes: Any): js.Promise[Member] = js.native
}
object Member {
  
  /**
    * Fired when the member has stopped typing.
    *
    * Parameters:
    * 1. {@link Member} `member` - the member in question
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Member.typingEnded")
  @js.native
  val typingEnded: /* "typingEnded" */ String = js.native
  
  /**
    * Fired when the member has started typing.
    *
    * Parameters:
    * 1. {@link Member} `member` - the member in question
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Member.typingStarted")
  @js.native
  val typingStarted: /* "typingStarted" */ String = js.native
  
  /**
    * Fired when the fields of the member have been updated.
    *
    * Parameters:
    * 1. object `data` - info object provided with the event. It has the following properties:
    *     * {@link Member} member - the member in question
    *     * {@link MemberUpdateReason}[] updateReasons - array of reasons for the update
    * @event
    */
  /* static member */
  @JSImport("twilio-chat", "Member.updated")
  @js.native
  val updated: /* "updated" */ String = js.native
}
