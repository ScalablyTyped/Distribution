package typings.twilsock

import typings.twilsock.protocolMod.Protocol.MessageType
import typings.twilsock.protocolMod.Protocol.Method
import typings.twilsock.twilsockMod.TwilsockChannel.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object twilsockStrings {
  @js.native
  sealed trait DELETE extends Method
  
  @js.native
  sealed trait GET extends Method
  
  @js.native
  sealed trait POST extends Method
  
  @js.native
  sealed trait PUT extends Method
  
  @js.native
  sealed trait applicationSlashjson extends js.Object
  
  @js.native
  sealed trait close extends MessageType
  
  @js.native
  sealed trait connected extends State
  
  @js.native
  sealed trait connecting extends State
  
  @js.native
  sealed trait delete_notification_ctx extends Method
  
  @js.native
  sealed trait disconnected extends State
  
  @js.native
  sealed trait disconnecting extends State
  
  @js.native
  sealed trait error extends State
  
  @js.native
  sealed trait init extends MessageType
  
  @js.native
  sealed trait message extends MessageType
  
  @js.native
  sealed trait notification extends MessageType
  
  @js.native
  sealed trait ping extends MessageType
  
  @js.native
  sealed trait put_notification_ctx extends Method
  
  @js.native
  sealed trait rejected extends State
  
  @js.native
  sealed trait reply extends MessageType
  
  @js.native
  sealed trait unknown extends State
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  @scala.inline
  def applicationSlashjson: applicationSlashjson = "application/json".asInstanceOf[applicationSlashjson]
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

