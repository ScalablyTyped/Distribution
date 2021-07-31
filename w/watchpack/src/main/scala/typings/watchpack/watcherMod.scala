package typings.watchpack

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object watcherMod {
  
  @JSImport("watchpack/Watcher", JSImport.Namespace)
  @js.native
  class ^ protected () extends Watcher {
    def this(directoryWatcher: typings.watchpack.directoryWatcherMod.^, filePath: String, startTime: Double) = this()
  }
  
  @js.native
  trait Watcher extends EventEmitter {
    
    def checkStartTime(mtime: Double, initial: Boolean): Boolean = js.native
    
    def close(): Unit = js.native
    
    var data: Double = js.native
    
    var directoryWatcher: typings.watchpack.directoryWatcherMod.^ = js.native
    
    var path: String = js.native
    
    var startTime: Double = js.native
  }
}
