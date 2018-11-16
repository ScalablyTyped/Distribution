package typings
package watchpackLib.watcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Watcher
  extends nodeLib.eventsMod.EventEmitter {
  var data: scala.Double = js.native
  var directoryWatcher: watchpackLib.directorywatcherMod.namespaced = js.native
  var path: java.lang.String = js.native
  var startTime: scala.Double = js.native
  def checkStartTime(mtime: scala.Double, initial: scala.Boolean): scala.Boolean = js.native
  def close(): scala.Unit = js.native
}

