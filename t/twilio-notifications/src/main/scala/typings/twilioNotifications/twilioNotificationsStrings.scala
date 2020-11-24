package typings.twilioNotifications

import typings.twilioNotifications.clientMod.ConnectionState
import typings.twilioNotifications.connectorMod.ChannelType
import typings.twilioNotifications.connectorMod.UpdateReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twilioNotificationsStrings {
  
  @scala.inline
  def apn: apn = "apn".asInstanceOf[apn]
  
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @scala.inline
  def denied: denied = "denied".asInstanceOf[denied]
  
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @scala.inline
  def disconnecting: disconnecting = "disconnecting".asInstanceOf[disconnecting]
  
  @scala.inline
  def fcm: fcm = "fcm".asInstanceOf[fcm]
  
  @scala.inline
  def gcm: gcm = "gcm".asInstanceOf[gcm]
  
  @scala.inline
  def messageType: messageType = "messageType".asInstanceOf[messageType]
  
  @scala.inline
  def notificationId: notificationId = "notificationId".asInstanceOf[notificationId]
  
  @scala.inline
  def token: token = "token".asInstanceOf[token]
  
  @scala.inline
  def twilsock: twilsock = "twilsock".asInstanceOf[twilsock]
  
  @js.native
  sealed trait apn extends ChannelType
  
  @js.native
  sealed trait connected extends ConnectionState
  
  @js.native
  sealed trait connecting extends ConnectionState
  
  @js.native
  sealed trait denied extends ConnectionState
  
  @js.native
  sealed trait disconnected extends ConnectionState
  
  @js.native
  sealed trait disconnecting extends ConnectionState
  
  @js.native
  sealed trait fcm extends ChannelType
  
  @js.native
  sealed trait gcm extends ChannelType
  
  @js.native
  sealed trait messageType extends UpdateReason
  
  @js.native
  sealed trait notificationId extends UpdateReason
  
  @js.native
  sealed trait token extends UpdateReason
  
  @js.native
  sealed trait twilsock extends ChannelType
}
