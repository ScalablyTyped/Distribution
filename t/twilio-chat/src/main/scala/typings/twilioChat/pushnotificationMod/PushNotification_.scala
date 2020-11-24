package typings.twilioChat.pushnotificationMod

import typings.twilioChat.pushnotificationMod.PushNotification.Descriptor
import typings.twilioChat.pushnotificationMod.PushNotification.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
class PushNotification_ protected () extends js.Object {
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
