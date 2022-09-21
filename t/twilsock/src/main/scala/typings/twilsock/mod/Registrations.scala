package typings.twilsock.mod

import typings.node.eventsMod.EventEmitter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Registrations module handles all operations with registration contexts through twilsock.
  * Main role: it automatically refreshes all registrations after reconnect.
  */
@js.native
trait Registrations extends EventEmitter {
  
  /* private */ var deleteNotificationContext: Any = js.native
  
  /* private */ var putNotificationContext: Any = js.native
  
  /* private */ val registrations: Any = js.native
  
  /* private */ val registrationsInProgress: Any = js.native
  
  def removeNotificationsContext(contextId: String): js.Promise[Unit] = js.native
  
  def setNotificationsContext(contextId: String, context: Context[Record[String, Any]]): js.Promise[Unit] = js.native
  
  /* private */ val transport: Any = js.native
  
  /* private */ var updateRegistration: Any = js.native
  
  def updateRegistrations(): js.Promise[Unit] = js.native
}
