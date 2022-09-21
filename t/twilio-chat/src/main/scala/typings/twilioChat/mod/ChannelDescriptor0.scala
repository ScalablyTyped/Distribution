package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains channel information.
  * Unlike {@link Channel}, this information won't be updated in realtime.
  * To have fresh data, user should query for channel descriptors again.
  */
trait ChannelDescriptor0 extends StObject {
  
  /**
    * Custom attributes of the channel.
    */
  val attributes: Any
  
  /**
    * Custom attributes of the channel.
    */
  val channel: String
  
  var client: Client
  
  /**
    * Identity of the user that created this channel.
    */
  val createdBy: String
  
  /**
    * Date this channel was created on.
    */
  val dateCreated: js.Date
  
  /**
    * Date this channel was last updated on.
    */
  val dateUpdated: js.Date
  
  var descriptor: Any
  
  /**
    * Name of the channel.
    */
  val friendlyName: String
  
  /**
    * Get the channel object from the descriptor.
    */
  def getChannel(): js.Promise[Channel]
  
  /**
    * Signifies whether the channel is private.
    */
  val isPrivate: Boolean
  
  /**
    * Index of the last message the user has read in this channel.
    */
  val lastConsumedMessageIndex: Double
  
  /**
    * Amount of members in the channel.
    */
  val membersCount: Double
  
  /**
    * Amount of messages in the channel.
    */
  val messagesCount: Double
  
  /**
    * User notification level for this channel.
    */
  val notificationLevel: NotificationLevel
  
  /**
    * Unique system identifier of the channel.
    */
  val sid: String
  
  /**
    * Delivery status of the channel.
    */
  val status: ChannelStatus
  
  /**
    * MemberType of the channel.
    */
  val `type`: ChannelType0
  
  /**
    * Unique name of the channel.
    */
  val uniqueName: String
}
object ChannelDescriptor0 {
  
  inline def apply(
    attributes: Any,
    channel: String,
    client: Client,
    createdBy: String,
    dateCreated: js.Date,
    dateUpdated: js.Date,
    descriptor: Any,
    friendlyName: String,
    getChannel: () => js.Promise[Channel],
    isPrivate: Boolean,
    lastConsumedMessageIndex: Double,
    membersCount: Double,
    messagesCount: Double,
    notificationLevel: NotificationLevel,
    sid: String,
    status: ChannelStatus,
    `type`: ChannelType0,
    uniqueName: String
  ): ChannelDescriptor0 = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], getChannel = js.Any.fromFunction0(getChannel), isPrivate = isPrivate.asInstanceOf[js.Any], lastConsumedMessageIndex = lastConsumedMessageIndex.asInstanceOf[js.Any], membersCount = membersCount.asInstanceOf[js.Any], messagesCount = messagesCount.asInstanceOf[js.Any], notificationLevel = notificationLevel.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelDescriptor0]
  }
  
  extension [Self <: ChannelDescriptor0](x: Self) {
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setDescriptor(value: Any): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setGetChannel(value: () => js.Promise[Channel]): Self = StObject.set(x, "getChannel", js.Any.fromFunction0(value))
    
    inline def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
    
    inline def setLastConsumedMessageIndex(value: Double): Self = StObject.set(x, "lastConsumedMessageIndex", value.asInstanceOf[js.Any])
    
    inline def setMembersCount(value: Double): Self = StObject.set(x, "membersCount", value.asInstanceOf[js.Any])
    
    inline def setMessagesCount(value: Double): Self = StObject.set(x, "messagesCount", value.asInstanceOf[js.Any])
    
    inline def setNotificationLevel(value: NotificationLevel): Self = StObject.set(x, "notificationLevel", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ChannelStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: ChannelType0): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
  }
}
