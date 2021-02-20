package typings.twilioNotifications

import typings.twilioNotifications.clientMod.ConnectionState
import typings.twilioNotifications.connectorMod.ChannelType
import typings.twilioNotifications.connectorMod.UpdateReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twilioNotificationsStrings {
  
  @js.native
  sealed trait apn extends ChannelType
  @scala.inline
  def apn: apn = "apn".asInstanceOf[apn]
  
  @js.native
  sealed trait connected extends ConnectionState
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait connecting extends ConnectionState
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait denied extends ConnectionState
  @scala.inline
  def denied: denied = "denied".asInstanceOf[denied]
  
  @js.native
  sealed trait disconnected extends ConnectionState
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait disconnecting extends ConnectionState
  @scala.inline
  def disconnecting: disconnecting = "disconnecting".asInstanceOf[disconnecting]
  
  @js.native
  sealed trait fcm extends ChannelType
  @scala.inline
  def fcm: fcm = "fcm".asInstanceOf[fcm]
  
  @js.native
  sealed trait gcm extends ChannelType
  @scala.inline
  def gcm: gcm = "gcm".asInstanceOf[gcm]
  
  @js.native
  sealed trait messageType extends UpdateReason
  @scala.inline
  def messageType: messageType = "messageType".asInstanceOf[messageType]
  
  @js.native
  sealed trait notificationId extends UpdateReason
  @scala.inline
  def notificationId: notificationId = "notificationId".asInstanceOf[notificationId]
  
  @js.native
  sealed trait token extends UpdateReason
  @scala.inline
  def token: token = "token".asInstanceOf[token]
  
  @js.native
  sealed trait twilsock extends ChannelType
  @scala.inline
  def twilsock: twilsock = "twilsock".asInstanceOf[twilsock]
}
