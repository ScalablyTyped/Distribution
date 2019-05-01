package typings
package twilsockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object twilsockLibStrings {
  @js.native
  sealed trait DELETE
    extends twilsockLib.libProtocolProtocolMod.ProtocolNs.Method
  
  @js.native
  sealed trait GET
    extends twilsockLib.libProtocolProtocolMod.ProtocolNs.Method
  
  @js.native
  sealed trait POST
    extends twilsockLib.libProtocolProtocolMod.ProtocolNs.Method
  
  @js.native
  sealed trait PUT
    extends twilsockLib.libProtocolProtocolMod.ProtocolNs.Method
  
  @js.native
  sealed trait close
    extends twilsockLib.libProtocolProtocolMod.ProtocolNs.MessageType
  
  @js.native
  sealed trait connected
    extends twilsockLib.libTwilsockMod.TwilsockChannelNs.State
  
  @js.native
  sealed trait connecting
    extends twilsockLib.libTwilsockMod.TwilsockChannelNs.State
  
  @js.native
  sealed trait delete_notification_ctx
    extends twilsockLib.libProtocolProtocolMod.ProtocolNs.Method
  
  @js.native
  sealed trait disconnected
    extends twilsockLib.libTwilsockMod.TwilsockChannelNs.State
  
  @js.native
  sealed trait disconnecting
    extends twilsockLib.libTwilsockMod.TwilsockChannelNs.State
  
  @js.native
  sealed trait error
    extends twilsockLib.libTwilsockMod.TwilsockChannelNs.State
  
  @js.native
  sealed trait init
    extends twilsockLib.libProtocolProtocolMod.ProtocolNs.MessageType
  
  @js.native
  sealed trait message
    extends twilsockLib.libProtocolProtocolMod.ProtocolNs.MessageType
  
  @js.native
  sealed trait notification
    extends twilsockLib.libProtocolProtocolMod.ProtocolNs.MessageType
  
  @js.native
  sealed trait ping
    extends twilsockLib.libProtocolProtocolMod.ProtocolNs.MessageType
  
  @js.native
  sealed trait put_notification_ctx
    extends twilsockLib.libProtocolProtocolMod.ProtocolNs.Method
  
  @js.native
  sealed trait rejected
    extends twilsockLib.libTwilsockMod.TwilsockChannelNs.State
  
  @js.native
  sealed trait reply
    extends twilsockLib.libProtocolProtocolMod.ProtocolNs.MessageType
  
  @js.native
  sealed trait unknown
    extends twilsockLib.libTwilsockMod.TwilsockChannelNs.State
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  @scala.inline
  def delete_notification_ctx: delete_notification_ctx = "delete_notification_ctx".asInstanceOf[delete_notification_ctx]
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  @scala.inline
  def disconnecting: disconnecting = "disconnecting".asInstanceOf[disconnecting]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def init: init = "init".asInstanceOf[init]
  @scala.inline
  def message: message = "message".asInstanceOf[message]
  @scala.inline
  def notification: notification = "notification".asInstanceOf[notification]
  @scala.inline
  def ping: ping = "ping".asInstanceOf[ping]
  @scala.inline
  def put_notification_ctx: put_notification_ctx = "put_notification_ctx".asInstanceOf[put_notification_ctx]
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  @scala.inline
  def reply: reply = "reply".asInstanceOf[reply]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
}

