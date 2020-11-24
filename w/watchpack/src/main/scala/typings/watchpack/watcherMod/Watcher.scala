package typings.watchpack.watcherMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Watcher extends EventEmitter {
  
  def checkStartTime(mtime: Double, initial: Boolean): Boolean = js.native
  
  def close(): Unit = js.native
  
  var data: Double = js.native
  
  var directoryWatcher: typings.watchpack.directoryWatcherMod.^ = js.native
  
  var path: String = js.native
  
  var startTime: Double = js.native
}
