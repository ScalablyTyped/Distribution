package typings.twilioDashChat.twilioDashChatMod

import typings.twilioDashChat.libPushnotificationMod.PushNotificationNs.Descriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("twilio-chat", "PushNotification")
@js.native
class PushNotification protected ()
  extends typings.twilioDashChat.libPushnotificationMod.PushNotification {
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
}

