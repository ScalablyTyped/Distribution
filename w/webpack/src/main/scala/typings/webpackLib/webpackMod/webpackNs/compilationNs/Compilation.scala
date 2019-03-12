package typings
package webpackLib.webpackMod.webpackNs.compilationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compilation
  extends tapableLib.tapableMod.Tapable {
  var _modules: stdLib.Map[_, _] = js.native
  var _preparedEntrypoints: js.Array[_] = js.native
  var additionalChunkAssets: js.Array[_] = js.native
  var assets: js.Any = js.native
  var bail: js.Any = js.native
  var cache: js.Any = js.native
  var children: js.Array[_] = js.native
  var childrenCounters: js.Any = js.native
  var chunkGroups: js.Array[_] = js.native
  var chunkTemplate: ChunkTemplate = js.native
  var chunks: js.Array[_] = js.native
  var compiler: webpackLib.webpackMod.webpackNs.Compiler = js.native
  var contextDependencies: webpackLib.webpackMod.webpackNs.SortableSet[java.lang.String] = js.native
  var contextTimestamps: stdLib.Map[java.lang.String, scala.Double] = js.native
  var dependencyFactories: stdLib.Map[webpackLib.Anon_A, tapableLib.tapableMod.Tapable] = js.native
  var dependencyTemplates: stdLib.Map[webpackLib.Anon_A, tapableLib.tapableMod.Tapable] = js.native
  var entries: js.Array[_] = js.native
  var entrypoints: stdLib.Map[_, _] = js.native
  var errors: js.Array[_] = js.native
  var fileDependencies: webpackLib.webpackMod.webpackNs.SortableSet[java.lang.String] = js.native
  var fileTimestamps: stdLib.Map[java.lang.String, scala.Double] = js.native
  var hash: js.UndefOr[java.lang.String] = js.native
  var hooks: CompilationHooks = js.native
  var hotUpdateChunkTemplate: HotUpdateChunkTemplate = js.native
  var inputFileSystem: js.Any = js.native
  var mainTemplate: MainTemplate = js.native
  var missingDependencies: webpackLib.webpackMod.webpackNs.SortableSet[java.lang.String] = js.native
  var moduleTemplates: webpackLib.Anon_Javascript = js.native
  var modules: js.Array[_] = js.native
  var namedChunkGroups: stdLib.Map[_, _] = js.native
  var namedChunks: stdLib.Map[_, _] = js.native
  var nextFreeModuleIndex: js.Any = js.native
  var nextFreeModuleIndex2: js.Any = js.native
  var outputOptions: js.Any = js.native
  var performance: js.Any = js.native
  var profile: js.Any = js.native
  var records: js.Any = js.native
  var requestShortener: js.Any = js.native
  var resolverFactory: js.Any = js.native
  var runtimeTemplate: RuntimeTemplate = js.native
  var usedChunkIds: js.Any = js.native
  var usedModuleIds: js.Any = js.native
  var warnings: js.Array[_] = js.native
  // tslint:disable-next-line:ban-types
  def addEntry(context: js.Any, entry: js.Any, name: js.Any, callback: js.Function): scala.Unit = js.native
  def addModule(module: CompilationModule, cacheGroup: js.Any): js.Any = js.native
  def getPath(filename: java.lang.String, data: webpackLib.Anon_Basename): java.lang.String = js.native
  def getStats(): webpackLib.webpackMod.webpackNs.Stats = js.native
}

