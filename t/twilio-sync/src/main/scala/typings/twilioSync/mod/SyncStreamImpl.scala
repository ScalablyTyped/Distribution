package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncStreamImpl
  extends StObject
     with SyncEntity {
  
  /* private */ var _handleMessagePublished: Any = js.native
  
  /**
    * Handle event from the server
    * @private
    */
  def _update(update: Any): Unit = js.native
  
  def dateExpires: String = js.native
  
  /* private */ val descriptor: Any = js.native
  
  def links: Any = js.native
  
  def publishMessage(data: js.Object): js.Promise[SyncStreamMessage] = js.native
  
  def removeStream(): js.Promise[Unit] = js.native
  
  def setTtl(ttl: Double): js.Promise[Unit] = js.native
  
  // private props
  def uri: String = js.native
}
