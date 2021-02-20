package typings.twilioSync

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closeableMod {
  
  @JSImport("twilio-sync/lib/closeable", JSImport.Default)
  @js.native
  abstract class default () extends Closeable
  
  @JSImport("twilio-sync/lib/closeable", "Closeable")
  @js.native
  abstract class Closeable () extends EventEmitter {
    
    /* protected */ def close(): Unit = js.native
    
    var closed: js.Any = js.native
    
    /* protected */ def ensureNotClosed(): Unit = js.native
    
    def listenerUuid: String = js.native
    
    val uuid: js.Any = js.native
  }
}
