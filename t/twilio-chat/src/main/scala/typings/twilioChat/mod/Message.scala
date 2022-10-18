package typings.twilioChat.mod

import typings.twilioReplayEventEmitter.mod.ReplayEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A message in a channel.
  */
@js.native
trait Message extends ReplayEventEmitter[MessageEvents] {
  
  def _update(data: Any): Unit = js.native
  
  /**
    * Custom attributes of the message.
    */
  def attributes: js.Object = js.native
  
  /**
    * Name of the user that sent the message.
    */
  def author: String = js.native
  
  /**
    * Body of the message. Null if the message is a media message.
    */
  def body: String = js.native
  
  /**
    * Channel that the message is in.
    */
  val channel: Channel = js.native
  
  /* private */ val configuration: Any = js.native
  
  /**
    * Date this message was created on.
    */
  def dateCreated: js.Date = js.native
  
  /**
    * Date this message was last updated on.
    */
  def dateUpdated: js.Date = js.native
  
  /**
    * Get the member who is the author of the message.
    */
  def getMember(): js.Promise[Member] = js.native
  
  /**
    * Index of the message in the channel's messages list.
    * By design of the Programmable Chat system, the message indices may have arbitrary gaps between them,
    * that does not necessarily mean they were deleted or otherwise modified - just that
    * messages may have some non-contiguous indices even if they are being sent immediately one after another.
    *
    * Trying to use indices for some calculations is going to be unreliable.
    *
    * To calculate the number of unread messages it is better to use the read horizon API.
    * See {@link Channel.getUnconsumedMessagesCount} for details.
    */
  def index: Double = js.native
  
  /**
    * Identity of the last user that updated the message.
    */
  def lastUpdatedBy: String = js.native
  
  /* private */ val links: Any = js.native
  
  /**
    * Media information (if present).
    */
  def media: Media = js.native
  
  /**
    * The server-assigned unique identifier of the authoring member.
    */
  def memberSid: String = js.native
  
  /**
    * Remove the message.
    */
  def remove(): js.Promise[Message] = js.native
  
  /* private */ val services: Any = js.native
  
  /**
    * The server-assigned unique identifier for the message.
    */
  def sid: String = js.native
  
  /* private */ var state: Any = js.native
  
  /**
    * Push notification type of the message.
    */
  def `type`: MessageType = js.native
  
  /**
    * Edit the message attributes.
    * @param attributes New attributes.
    */
  def updateAttributes(attributes: Any): js.Promise[Message] = js.native
  
  /**
    * Edit the message body.
    * @param body New body of the message.
    */
  def updateBody(body: String): js.Promise[Message] = js.native
}
