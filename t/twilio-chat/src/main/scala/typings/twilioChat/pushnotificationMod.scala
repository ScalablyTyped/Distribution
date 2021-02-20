package typings.twilioChat

import typings.twilioChat.pushnotificationMod.PushNotification.Descriptor
import typings.twilioChat.pushnotificationMod.PushNotification.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pushnotificationMod {
  
  /**
    * @classdesc Push notification representation within Chat Client
    * @property {String} [action] - Notification action (`click_action` in FCM/GCM terms and `category` in APN terms)
    * @property {Number} [badge] - Number for the badge
    * @property {String} body - Notification text
    * @property {PushNotification#ChatData} data - Additional Chat data
    * @property {String} [sound] - Notification sound
    * @property {String} [title] - Notification title
    * @property {PushNotification#NotificationType} type - Notification type
    */
  @JSImport("twilio-chat/lib/pushnotification", "PushNotification")
  @js.native
  class PushNotification protected () extends StObject {
    /**
      * Chat push notification type
      * @typedef {('twilio.channel.new_message' | 'twilio.channel.added_to_channel'
      | 'twilio.channel.invited_to_channel'  | 'twilio.channel.removed_from_channel')} PushNotification#NotificationType
      */
    /**
      * Additional Chat data for given Push Notification
      * @typedef {Object} PushNotification#ChatData
      * @property {String} [channelSid] - SID of Channel
      * @property {Number} [messageIndex] - Index of Message in Channel
      * @property {String} [messageSid] - SID of Message
      */
    /**
      * @param {PushNotification.Descriptor} data - initial data for PushNotification
      */
    def this(data: Descriptor) = this()
    
    val action: String = js.native
    
    val badge: Double = js.native
    
    val body: String = js.native
    
    val data: js.Object = js.native
    
    val sound: String = js.native
    
    val title: String = js.native
    
    val `type`: Type = js.native
  }
  object PushNotification {
    
    @js.native
    trait Descriptor extends StObject {
      
      var action: String = js.native
      
      var badge: Double = js.native
      
      var body: String = js.native
      
      var data: js.Object = js.native
      
      var sound: String = js.native
      
      var title: String = js.native
      
      var `type`: Type = js.native
    }
    object Descriptor {
      
      @scala.inline
      def apply(
        action: String,
        badge: Double,
        body: String,
        data: js.Object,
        sound: String,
        title: String,
        `type`: Type
      ): Descriptor = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Descriptor]
      }
      
      @scala.inline
      implicit class DescriptorMutableBuilder[Self <: Descriptor] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBadge(value: Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.twilioChat.twilioChatStrings.twilioDotchannelDotnew_message
      - typings.twilioChat.twilioChatStrings.twilioDotchannelDotadded_to_channel
      - typings.twilioChat.twilioChatStrings.twilioDotchannelDotinvited_to_channel
      - typings.twilioChat.twilioChatStrings.twilioDotchannelDotremoved_from_channel
    */
    trait Type extends StObject
    object Type {
      
      @scala.inline
      def twilioDotchannelDotadded_to_channel: typings.twilioChat.twilioChatStrings.twilioDotchannelDotadded_to_channel = "twilio.channel.added_to_channel".asInstanceOf[typings.twilioChat.twilioChatStrings.twilioDotchannelDotadded_to_channel]
      
      @scala.inline
      def twilioDotchannelDotinvited_to_channel: typings.twilioChat.twilioChatStrings.twilioDotchannelDotinvited_to_channel = "twilio.channel.invited_to_channel".asInstanceOf[typings.twilioChat.twilioChatStrings.twilioDotchannelDotinvited_to_channel]
      
      @scala.inline
      def twilioDotchannelDotnew_message: typings.twilioChat.twilioChatStrings.twilioDotchannelDotnew_message = "twilio.channel.new_message".asInstanceOf[typings.twilioChat.twilioChatStrings.twilioDotchannelDotnew_message]
      
      @scala.inline
      def twilioDotchannelDotremoved_from_channel: typings.twilioChat.twilioChatStrings.twilioDotchannelDotremoved_from_channel = "twilio.channel.removed_from_channel".asInstanceOf[typings.twilioChat.twilioChatStrings.twilioDotchannelDotremoved_from_channel]
    }
  }
}
