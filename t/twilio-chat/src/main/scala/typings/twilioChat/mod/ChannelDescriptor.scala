package typings.twilioChat.mod

import typings.twilioNotifications.mod.ChannelType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains channel information.
  * Unlike {@link Channel}, this information won't be updated in realtime.
  * To have fresh data, user should query for channel descriptors again.
  */
@JSImport("twilio-chat", "ChannelDescriptor")
@js.native
open class ChannelDescriptor protected ()
  extends StObject
     with ChannelDescriptor0 {
  /**
    * @internal
    */
  def this(client: Client, descriptor: Any) = this()
  
  /**
    * Custom attributes of the channel.
    */
  /* CompleteClass */
  override val attributes: Any = js.native
  
  /**
    * Custom attributes of the channel.
    */
  /* CompleteClass */
  override val channel: String = js.native
  
  /* CompleteClass */
  var client: Client = js.native
  
  /**
    * Identity of the user that created this channel.
    */
  /* CompleteClass */
  override val createdBy: String = js.native
  @JSName("createdBy")
  var createdBy_ChannelDescriptor: js.UndefOr[String] = js.native
  
  /**
    * Date this channel was created on.
    */
  /* CompleteClass */
  override val dateCreated: js.Date = js.native
  
  /**
    * Date this channel was last updated on.
    */
  /* CompleteClass */
  override val dateUpdated: js.Date = js.native
  
  /* CompleteClass */
  var descriptor: Any = js.native
  
  var entityName: String = js.native
  
  /**
    * Name of the channel.
    */
  /* CompleteClass */
  override val friendlyName: String = js.native
  
  /**
    * Get the channel object from the descriptor.
    */
  /* CompleteClass */
  override def getChannel(): js.Promise[Channel] = js.native
  
  /**
    * Signifies whether the channel is private.
    */
  /* CompleteClass */
  override val isPrivate: Boolean = js.native
  
  /**
    * Index of the last message the user has read in this channel.
    */
  /* CompleteClass */
  override val lastConsumedMessageIndex: Double = js.native
  
  /**
    * Amount of members in the channel.
    */
  /* CompleteClass */
  override val membersCount: Double = js.native
  
  /**
    * Amount of messages in the channel.
    */
  /* CompleteClass */
  override val messagesCount: Double = js.native
  
  /**
    * User notification level for this channel.
    */
  /* CompleteClass */
  override val notificationLevel: NotificationLevel = js.native
  @JSName("notificationLevel")
  var notificationLevel_ChannelDescriptor: js.UndefOr[NotificationLevel] = js.native
  
  /**
    * Unique system identifier of the channel.
    */
  /* CompleteClass */
  override val sid: String = js.native
  
  /**
    * Delivery status of the channel.
    */
  /* CompleteClass */
  override val status: ChannelStatus = js.native
  
  /**
    * MemberType of the channel.
    */
  /* CompleteClass */
  override val `type`: ChannelType0 = js.native
  @JSName("type")
  var type_ChannelDescriptor: ChannelType = js.native
  
  /**
    * Unique name of the channel.
    */
  /* CompleteClass */
  override val uniqueName: String = js.native
}
