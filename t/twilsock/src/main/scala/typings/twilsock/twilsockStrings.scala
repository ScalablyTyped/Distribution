package typings.twilsock

import typings.twilsock.mod.ConnectionState
import typings.twilsock.mod.MessageType
import typings.twilsock.mod.Messages.Method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twilsockStrings {
  
  @js.native
  sealed trait DELETE
    extends StObject
       with Method
       with typings.twilsock.mod.Method
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET
    extends StObject
       with Method
       with typings.twilsock.mod.Method
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait POST
    extends StObject
       with Method
       with typings.twilsock.mod.Method
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT
    extends StObject
       with Method
       with typings.twilsock.mod.Method
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait client_update
    extends StObject
       with MessageType
       with typings.twilsock.mod.Messages.MessageType
  inline def client_update: client_update = "client_update".asInstanceOf[client_update]
  
  @js.native
  sealed trait close
    extends StObject
       with MessageType
       with typings.twilsock.mod.Messages.MessageType
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait connected
    extends StObject
       with ConnectionState
  inline def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait connecting
    extends StObject
       with ConnectionState
  inline def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait delete_notification_ctx
    extends StObject
       with Method
       with typings.twilsock.mod.Method
  inline def delete_notification_ctx: delete_notification_ctx = "delete_notification_ctx".asInstanceOf[delete_notification_ctx]
  
  @js.native
  sealed trait denied
    extends StObject
       with ConnectionState
  inline def denied: denied = "denied".asInstanceOf[denied]
  
  @js.native
  sealed trait disconnected
    extends StObject
       with ConnectionState
  inline def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait disconnecting
    extends StObject
       with ConnectionState
  inline def disconnecting: disconnecting = "disconnecting".asInstanceOf[disconnecting]
  
  @js.native
  sealed trait error
    extends StObject
       with ConnectionState
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait init
    extends StObject
       with MessageType
       with typings.twilsock.mod.Messages.MessageType
  inline def init: init = "init".asInstanceOf[init]
  
  @js.native
  sealed trait message
    extends StObject
       with MessageType
       with typings.twilsock.mod.Messages.MessageType
  inline def message: message = "message".asInstanceOf[message]
  
  @js.native
  sealed trait notification
    extends StObject
       with MessageType
       with typings.twilsock.mod.Messages.MessageType
  inline def notification: notification = "notification".asInstanceOf[notification]
  
  @js.native
  sealed trait ping
    extends StObject
       with MessageType
       with typings.twilsock.mod.Messages.MessageType
  inline def ping: ping = "ping".asInstanceOf[ping]
  
  @js.native
  sealed trait put_notification_ctx
    extends StObject
       with Method
       with typings.twilsock.mod.Method
  inline def put_notification_ctx: put_notification_ctx = "put_notification_ctx".asInstanceOf[put_notification_ctx]
  
  @js.native
  sealed trait reply
    extends StObject
       with MessageType
       with typings.twilsock.mod.Messages.MessageType
  inline def reply: reply = "reply".asInstanceOf[reply]
  
  @js.native
  sealed trait telemetryDotv1
    extends StObject
       with MessageType
       with typings.twilsock.mod.Messages.MessageType
  inline def telemetryDotv1: telemetryDotv1 = "telemetry.v1".asInstanceOf[telemetryDotv1]
  
  @js.native
  sealed trait unknown
    extends StObject
       with ConnectionState
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
}
