package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Push notification for a Conversations client.
  */
@JSImport("twilio-chat", "PushNotification")
@js.native
open class PushNotification protected () extends StObject {
  /**
    * @internal
    */
  def this(data: PushNotificationDescriptor) = this()
  
  /**
    * Notification action (`click_action` in FCM/GCM terms and `category` in APN terms).
    */
  val action: String = js.native
  
  /**
    * Number of the badge.
    */
  val badge: Double = js.native
  
  /**
    * Text of the notification.
    */
  val body: String = js.native
  
  /**
    * Additional data of the conversation.
    */
  val data: PushNotificationData = js.native
  
  /**
    * Sound of the notification.
    */
  val sound: String = js.native
  
  /**
    * Title of the notification.
    */
  val title: String = js.native
  
  /**
    * Type of the notification.
    */
  val `type`: PushNotificationType = js.native
}
