package typings.twilioSync.mod

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Closeable extends EventEmitter {
  
  /* protected */ def close(): Unit = js.native
  
  /* private */ var closed: Any = js.native
  
  /* protected */ def ensureNotClosed(): Unit = js.native
  
  def listenerUuid: String = js.native
  
  /* private */ val uuid: Any = js.native
}
