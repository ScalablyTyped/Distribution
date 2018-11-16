package typings
package watchpackLib.watchpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Watchpack
  extends nodeLib.eventsMod.EventEmitter {
  var aggregateTimeout: nodeLib.NodeJSNs.Timer = js.native
  var aggregatedChanges: js.Array[java.lang.String] = js.native
  var dirWatchers: js.Array[watchpackLib.watcherMod.namespaced] = js.native
  var fileWatchers: js.Array[watchpackLib.watcherMod.namespaced] = js.native
  var mtimes: ScalablyTyped.runtime.StringDictionary[scala.Double] = js.native
  var options: watchpackLib.watchpackMod.WatchpackNs.WatchOptions = js.native
  var paused: scala.Boolean = js.native
  var watcherOptions: watchpackLib.watchpackMod.WatchpackNs.WatcherOptions = js.native
  def _dirWatcher(item: java.lang.String, watcher: watchpackLib.watcherMod.namespaced): watchpackLib.watcherMod.namespaced = js.native
  def _fileWatcher(file: java.lang.String, watcher: watchpackLib.watcherMod.namespaced): watchpackLib.watcherMod.namespaced = js.native
  def _onChange(item: java.lang.String, mtime: scala.Double): scala.Unit = js.native
  def _onChange(item: java.lang.String, mtime: scala.Double, file: java.lang.String): scala.Unit = js.native
  def _onTimeout(): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def getTimes(): ScalablyTyped.runtime.StringDictionary[scala.Double] = js.native
  def pause(): scala.Unit = js.native
  def watch(
    files: js.Array[java.lang.String],
    directories: js.Array[java.lang.String],
    startTime: scala.Double
  ): scala.Unit = js.native
}

