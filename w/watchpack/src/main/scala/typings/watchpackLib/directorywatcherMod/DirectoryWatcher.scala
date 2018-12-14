package typings
package watchpackLib.directorywatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryWatcher
  extends nodeLib.eventsMod.EventEmitter {
  var directories: org.scalablytyped.runtime.StringDictionary[watchpackLib.watcherMod.namespaced | watchpackLib.watchpackLibNumbers.`true`] = js.native
  var files: org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, scala.Double]] = js.native
  var initialScan: scala.Boolean = js.native
  var initialScanRemoved: js.Array[java.lang.String] = js.native
  var nestedWatching: scala.Boolean = js.native
  var options: watchpackLib.watchpackMod.WatchpackNs.WatcherOptions = js.native
  var path: java.lang.String = js.native
  var refs: scala.Double = js.native
  var watcher: nodeLib.fsMod.FSWatcher = js.native
  var watchers: org.scalablytyped.runtime.StringDictionary[js.Array[watchpackLib.watcherMod.namespaced]] = js.native
  def close(): scala.Unit = js.native
  def createNestedWatcher(directoryPath: java.lang.String): scala.Unit = js.native
  def doInitialScan(): scala.Unit = js.native
  def getTimes(): org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  def onChange(filePath: java.lang.String, stat: gracefulDashFsLib.gracefulDashFsMod.Stats): scala.Unit = js.native
  def onDirectoryAdded(directoryPath: java.lang.String): scala.Unit = js.native
  def onDirectoryUnlinked(directoryPath: java.lang.String): scala.Unit = js.native
  def onFileAdded(filePath: java.lang.String, stat: gracefulDashFsLib.gracefulDashFsMod.Stats): scala.Unit = js.native
  def onFileUnlinked(filePath: java.lang.String): scala.Unit = js.native
  def onWatcherError(): scala.Unit = js.native
  def setDirectory(directoryPath: java.lang.String, exist: scala.Boolean, initial: scala.Boolean): scala.Unit = js.native
  def setFileTime(filePath: java.lang.String, mtime: scala.Double, initial: scala.Boolean): scala.Unit = js.native
  def setFileTime(filePath: java.lang.String, mtime: scala.Double, initial: scala.Boolean, `type`: java.lang.String): scala.Unit = js.native
  def setFileTime(filePath: java.lang.String, mtime: scala.Double, initial: scala.Boolean, `type`: scala.Boolean): scala.Unit = js.native
  def setNestedWatching(flag: scala.Boolean): scala.Unit = js.native
  def watch(filePath: java.lang.String, startTime: scala.Double): watchpackLib.watcherMod.namespaced = js.native
}

