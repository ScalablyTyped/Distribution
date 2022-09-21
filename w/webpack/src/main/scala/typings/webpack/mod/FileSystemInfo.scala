package typings.webpack.mod

import typings.std.Map
import typings.std.ReadonlyMap
import typings.std.Set
import typings.webpack.anon.Timestamp
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackStrings.ignore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemInfo extends StObject {
  
  @JSName("addContextTimestamps")
  def addContextTimestamps_ignore(map: ReadonlyMap[String, Null | FileSystemInfoEntry | ignore]): Unit = js.native
  @JSName("addContextTimestamps")
  def addContextTimestamps_ignore(map: ReadonlyMap[String, Null | FileSystemInfoEntry | ignore], immutable: Boolean): Unit = js.native
  
  @JSName("addFileTimestamps")
  def addFileTimestamps_ignore(map: ReadonlyMap[String, Null | FileSystemInfoEntry | ignore]): Unit = js.native
  @JSName("addFileTimestamps")
  def addFileTimestamps_ignore(map: ReadonlyMap[String, Null | FileSystemInfoEntry | ignore], immutable: Boolean): Unit = js.native
  
  @JSName("checkResolveResultsValid")
  def checkResolveResultsValid_false(
    resolveResults: Map[String, String | `false`],
    callback: js.Function2[/* arg0 */ js.UndefOr[Null | js.Error], /* arg1 */ js.UndefOr[Boolean], Unit]
  ): Unit = js.native
  
  def checkSnapshotValid(
    snapshot: Snapshot,
    callback: js.Function2[/* arg0 */ js.UndefOr[Null | WebpackError], /* arg1 */ js.UndefOr[Boolean], Unit]
  ): Unit = js.native
  
  def clear(): Unit = js.native
  
  var contextHashQueue: AsyncQueue[String, String, Null | ContextHash] = js.native
  
  var contextTimestampQueue: AsyncQueue[String, String, Null | ContextFileSystemInfoEntry] = js.native
  
  var contextTshQueue: AsyncQueue[String, String, Null | ContextTimestampAndHash] = js.native
  
  def createSnapshot(
    startTime: Double,
    files: js.Iterable[String],
    directories: js.Iterable[String],
    missing: js.Iterable[String],
    options: Timestamp,
    callback: js.Function2[
      /* arg0 */ js.UndefOr[Null | WebpackError], 
      /* arg1 */ js.UndefOr[Null | Snapshot], 
      Unit
    ]
  ): Unit = js.native
  
  var fileHashQueue: AsyncQueue[String, String, Null | String] = js.native
  
  var fileTimestampQueue: AsyncQueue[String, String, Null | FileSystemInfoEntry] = js.native
  
  var fs: InputFileSystem = js.native
  
  def getContextHash(
    path: String,
    callback: js.Function2[/* arg0 */ js.UndefOr[Null | WebpackError], /* arg1 */ js.UndefOr[String], Unit]
  ): Unit = js.native
  
  @JSName("getContextTimestamp")
  def getContextTimestamp_ignore(
    path: String,
    callback: js.Function2[
      /* arg0 */ js.UndefOr[Null | WebpackError], 
      /* arg1 */ js.UndefOr[Null | ignore | ResolvedContextFileSystemInfoEntry], 
      Unit
    ]
  ): Unit = js.native
  
  def getContextTsh(
    path: String,
    callback: js.Function2[
      /* arg0 */ js.UndefOr[Null | WebpackError], 
      /* arg1 */ js.UndefOr[ResolvedContextTimestampAndHash], 
      Unit
    ]
  ): Unit = js.native
  
  def getDeprecatedContextTimestamps(): Map[Any, Any] = js.native
  
  def getDeprecatedFileTimestamps(): Map[Any, Any] = js.native
  
  def getFileHash(
    path: String,
    callback: js.Function2[/* arg0 */ js.UndefOr[Null | WebpackError], /* arg1 */ js.UndefOr[String], Unit]
  ): Unit = js.native
  
  @JSName("getFileTimestamp")
  def getFileTimestamp_ignore(
    path: String,
    callback: js.Function2[
      /* arg0 */ js.UndefOr[Null | WebpackError], 
      /* arg1 */ js.UndefOr[Null | FileSystemInfoEntry | ignore], 
      Unit
    ]
  ): Unit = js.native
  
  var immutablePaths: js.Array[String | js.RegExp] = js.native
  
  var immutablePathsRegExps: js.Array[js.RegExp] = js.native
  
  var immutablePathsWithSlash: js.Array[String] = js.native
  
  def logStatistics(): Unit = js.native
  
  var logger: js.UndefOr[WebpackLogger] = js.native
  
  var managedItemDirectoryQueue: AsyncQueue[String, String, Set[String]] = js.native
  
  var managedItemQueue: AsyncQueue[String, String, Null | String] = js.native
  
  var managedPaths: js.Array[String | js.RegExp] = js.native
  
  var managedPathsRegExps: js.Array[js.RegExp] = js.native
  
  var managedPathsWithSlash: js.Array[String] = js.native
  
  def mergeSnapshots(snapshot1: Snapshot, snapshot2: Snapshot): Snapshot = js.native
  
  def resolveBuildDependencies(
    context: String,
    deps: js.Iterable[String],
    callback: js.Function2[
      /* arg0 */ js.UndefOr[Null | js.Error], 
      /* arg1 */ js.UndefOr[ResolveBuildDependenciesResult], 
      Unit
    ]
  ): Unit = js.native
}
