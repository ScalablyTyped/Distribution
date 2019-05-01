package typings
package twilioDashNotificationsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object twilioDashNotificationsLibStrings {
  @js.native
  sealed trait apn
    extends twilioDashNotificationsLib.libConnectorMod.ChannelType
  
  @js.native
  sealed trait connected
    extends twilioDashNotificationsLib.libClientMod.ConnectionState
  
  @js.native
  sealed trait connecting
    extends twilioDashNotificationsLib.libClientMod.ConnectionState
  
  @js.native
  sealed trait denied
    extends twilioDashNotificationsLib.libClientMod.ConnectionState
  
  @js.native
  sealed trait disconnected
    extends twilioDashNotificationsLib.libClientMod.ConnectionState
  
  @js.native
  sealed trait disconnecting
    extends twilioDashNotificationsLib.libClientMod.ConnectionState
  
  @js.native
  sealed trait fcm
    extends twilioDashNotificationsLib.libConnectorMod.ChannelType
  
  @js.native
  sealed trait gcm
    extends twilioDashNotificationsLib.libConnectorMod.ChannelType
  
  @js.native
  sealed trait messageType
    extends twilioDashNotificationsLib.libConnectorMod.UpdateReason
  
  @js.native
  sealed trait notificationId
    extends twilioDashNotificationsLib.libConnectorMod.UpdateReason
  
  @js.native
  sealed trait token
    extends twilioDashNotificationsLib.libConnectorMod.UpdateReason
  
  @js.native
  sealed trait twilsock
    extends twilioDashNotificationsLib.libConnectorMod.ChannelType
  
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
}

