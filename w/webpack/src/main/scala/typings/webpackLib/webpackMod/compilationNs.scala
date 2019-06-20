package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "compilation")
@js.native
object compilationNs extends js.Object {
  @js.native
  class Asset () extends js.Object
  
  @js.native
  class Chunk protected () extends js.Object {
    def this(name: java.lang.String) = this()
    var chunkReason: js.Any = js.native
    var debugId: scala.Double = js.native
    var entryModule: js.Any = js.native
    var extraAsync: scala.Boolean = js.native
    var files: js.Array[_] = js.native
    var groupsIterable: js.Array[_] = js.native
    var hash: js.Any = js.native
    var id: js.Any = js.native
    var ids: js.Any = js.native
    var modulesIterable: js.Array[_] = js.native
    var name: js.Any = js.native
    var rendered: scala.Boolean = js.native
    var renderedHash: js.Any = js.native
    def addGroup(chunkGroup: js.Any): scala.Boolean = js.native
    def addModule(module: js.Any): scala.Boolean = js.native
    def addMultiplierAndOverhead(size: scala.Double, options: js.Any): scala.Double = js.native
    def canBeInitial(): scala.Boolean = js.native
    def canBeIntegrated(otherChunk: js.Any): scala.Boolean = js.native
    def compareTo(otherChunk: js.Any): webpackLib.webpackLibNumbers.`-1` | webpackLib.webpackLibNumbers.`0` | webpackLib.webpackLibNumbers.`1` = js.native
    def containsModule(module: js.Any): scala.Boolean = js.native
    def getAllAsyncChunks(): stdLib.Set[_] = js.native
    def getChunkMaps(realHash: js.Any): webpackLib.Anon_Hash = js.native
    // tslint:disable-next-line:ban-types
    def getChunkModuleMaps(filterFn: js.Function): webpackLib.Anon_HashId = js.native
    def getModules(): js.Array[_] = js.native
    def getModulesIdent(): js.Array[_] = js.native
    def getNumberOfGroups(): scala.Double = js.native
    def getNumberOfModules(): scala.Double = js.native
    def hasEntryModule(): scala.Boolean = js.native
    // tslint:disable-next-line:ban-types
    def hasModuleInGraph(filterFn: js.Function, filterChunkFn: js.Function): scala.Boolean = js.native
    def hasRuntime(): scala.Boolean = js.native
    def integrate(otherChunk: js.Any, reason: js.Any): scala.Boolean = js.native
    def integratedSize(otherChunk: js.Any, options: js.Any): scala.Double = js.native
    def isEmpty(): scala.Boolean = js.native
    def isInGroup(chunkGroup: js.Any): scala.Boolean = js.native
    def isOnlyInitial(): scala.Boolean = js.native
    def modulesSize(): scala.Double = js.native
    def moveModule(module: js.Any, otherChunk: js.Any): scala.Unit = js.native
    def remove(reason: js.Any): scala.Unit = js.native
    def removeGroup(chunkGroup: js.Any): scala.Boolean = js.native
    def removeModule(module: js.Any): scala.Boolean = js.native
    def setModules(modules: js.Any): scala.Unit = js.native
    def size(options: js.Any): scala.Double = js.native
    // tslint:disable-next-line:ban-types
    def sortModules(sortByFn: js.Function): scala.Unit = js.native
    def split(newChunk: js.Any): scala.Unit = js.native
    def updateHash(hash: js.Any): scala.Unit = js.native
  }
  
  @js.native
  class ChunkGroup () extends js.Object
  
  @js.native
  class ChunkHash () extends js.Object
  
  @js.native
  class ChunkTemplate ()
    extends tapableLib.tapableMod.Tapable
  
  @js.native
  class Compilation ()
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
    var compiler: webpackLib.webpackMod.Compiler = js.native
    var context: java.lang.String = js.native
    var contextDependencies: webpackLib.webpackMod.SortableSet[java.lang.String] = js.native
    var contextTimestamps: stdLib.Map[java.lang.String, scala.Double] = js.native
    var dependencyFactories: stdLib.Map[webpackLib.TypeofClassDependency, tapableLib.tapableMod.Tapable] = js.native
    var dependencyTemplates: stdLib.Map[webpackLib.TypeofClassDependency, tapableLib.tapableMod.Tapable] = js.native
    var entries: js.Array[_] = js.native
    var entrypoints: stdLib.Map[_, _] = js.native
    var errors: js.Array[_] = js.native
    var fileDependencies: webpackLib.webpackMod.SortableSet[java.lang.String] = js.native
    var fileTimestamps: stdLib.Map[java.lang.String, scala.Double] = js.native
    var hash: js.UndefOr[java.lang.String] = js.native
    var hooks: CompilationHooks = js.native
    var hotUpdateChunkTemplate: HotUpdateChunkTemplate = js.native
    var inputFileSystem: js.Any = js.native
    var mainTemplate: MainTemplate = js.native
    var missingDependencies: webpackLib.webpackMod.SortableSet[java.lang.String] = js.native
    var moduleTemplates: webpackLib.Anon_Javascript = js.native
    var modules: js.Array[_] = js.native
    var namedChunkGroups: stdLib.Map[_, _] = js.native
    var namedChunks: stdLib.Map[_, _] = js.native
    var nextFreeModuleIndex: js.Any = js.native
    var nextFreeModuleIndex2: js.Any = js.native
    var outputOptions: js.Any = js.native
    var outputPath: java.lang.String = js.native
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
    def getStats(): webpackLib.webpackMod.Stats = js.native
    def isChild(): scala.Boolean = js.native
  }
  
  trait CompilationHooks extends js.Object {
    var additionalAssets: tapableLib.tapableMod.AsyncSeriesHook[_, _, _]
    var additionalChunkAssets: tapableLib.tapableMod.SyncHook[js.Array[Chunk], _, _]
    var advancedOptimizeModuleOrder: tapableLib.tapableMod.SyncHook[js.Array[Module], _, _]
    var afterHash: tapableLib.tapableMod.SyncHook[_, _, _]
    var afterOptimizeAssets: tapableLib.tapableMod.SyncHook[js.Array[Asset], _, _]
    var afterOptimizeChunkAssets: tapableLib.tapableMod.SyncHook[js.Array[Chunk], _, _]
    var afterOptimizeChunkIds: tapableLib.tapableMod.SyncHook[js.Array[Chunk], _, _]
    var afterOptimizeChunkModules: tapableLib.tapableMod.SyncHook[js.Array[Chunk], js.Array[Module], _]
    var afterOptimizeChunks: tapableLib.tapableMod.SyncHook[js.Array[Chunk], js.Array[ChunkGroup], _]
    var afterOptimizeDependencies: tapableLib.tapableMod.SyncHook[js.Array[Module], _, _]
    var afterOptimizeExtractedChunks: tapableLib.tapableMod.SyncHook[js.Array[Chunk], _, _]
    var afterOptimizeModuleIds: tapableLib.tapableMod.SyncHook[js.Array[Module], _, _]
    var afterOptimizeModules: tapableLib.tapableMod.SyncHook[js.Array[Module], _, _]
    var afterOptimizeTree: tapableLib.tapableMod.SyncHook[js.Array[Chunk], js.Array[Module], _]
    var afterSeal: tapableLib.tapableMod.AsyncSeriesHook[_, _, _]
    var assetPath: tapableLib.tapableMod.SyncWaterfallHook[java.lang.String, _, _]
    var beforeChunkAssets: tapableLib.tapableMod.SyncHook[_, _, _]
    var beforeChunkIds: tapableLib.tapableMod.SyncHook[js.Array[Chunk], _, _]
    var beforeHash: tapableLib.tapableMod.SyncHook[_, _, _]
    var beforeModuleAssets: tapableLib.tapableMod.SyncHook[_, _, _]
    var beforeModuleIds: tapableLib.tapableMod.SyncHook[js.Array[Module], _, _]
    var buildModule: tapableLib.tapableMod.SyncHook[Module, _, _]
    var childCompiler: tapableLib.tapableMod.SyncHook[_, _, _]
    var chunkAsset: tapableLib.tapableMod.SyncHook[Chunk, java.lang.String, _]
    var chunkHash: tapableLib.tapableMod.SyncHook[Chunk, ChunkHash, _]
    var failedModule: tapableLib.tapableMod.SyncHook[Module, stdLib.Error, _]
    var finishModules: tapableLib.tapableMod.SyncHook[js.Array[Module], _, _]
    var finishRebuildingModule: tapableLib.tapableMod.SyncHook[Module, _, _]
    var moduleAsset: tapableLib.tapableMod.SyncHook[Module, java.lang.String, _]
    var moduleIds: tapableLib.tapableMod.SyncHook[js.Array[Module], _, _]
    var needAdditionalPass: tapableLib.tapableMod.SyncBailHook[_, _, _, _]
    var needAdditionalSeal: tapableLib.tapableMod.SyncBailHook[_, _, _, _]
    var normalModuleLoader: tapableLib.tapableMod.SyncHook[_, Module, _]
    var optimize: tapableLib.tapableMod.SyncHook[_, _, _]
    var optimizeAssets: tapableLib.tapableMod.AsyncSeriesHook[js.Array[Asset], _, _]
    var optimizeChunkAssets: tapableLib.tapableMod.AsyncSeriesHook[js.Array[Chunk], _, _]
    var optimizeChunkIds: tapableLib.tapableMod.SyncHook[js.Array[Chunk], _, _]
    var optimizeChunkModules: tapableLib.tapableMod.SyncBailHook[js.Array[Chunk], js.Array[Module], _, _]
    var optimizeChunkModulesAdvanced: tapableLib.tapableMod.SyncBailHook[js.Array[Chunk], js.Array[Module], _, _]
    var optimizeChunkModulesBasic: tapableLib.tapableMod.SyncBailHook[js.Array[Chunk], js.Array[Module], _, _]
    var optimizeChunkOrder: tapableLib.tapableMod.SyncHook[js.Array[Chunk], _, _]
    var optimizeChunks: tapableLib.tapableMod.SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _]
    var optimizeChunksAdvanced: tapableLib.tapableMod.SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _]
    var optimizeChunksBasic: tapableLib.tapableMod.SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _]
    var optimizeDependencies: tapableLib.tapableMod.SyncBailHook[js.Array[Module], _, _, _]
    var optimizeDependenciesAdvanced: tapableLib.tapableMod.SyncBailHook[js.Array[Module], _, _, _]
    var optimizeDependenciesBasic: tapableLib.tapableMod.SyncBailHook[js.Array[Module], _, _, _]
    var optimizeExtractedChunks: tapableLib.tapableMod.SyncBailHook[js.Array[Chunk], _, _, _]
    var optimizeExtractedChunksAdvanced: tapableLib.tapableMod.SyncBailHook[js.Array[Chunk], _, _, _]
    var optimizeExtractedChunksBasic: tapableLib.tapableMod.SyncBailHook[js.Array[Chunk], _, _, _]
    var optimizeModuleIds: tapableLib.tapableMod.SyncHook[js.Array[Module], _, _]
    var optimizeModuleOrder: tapableLib.tapableMod.SyncHook[js.Array[Module], _, _]
    var optimizeModules: tapableLib.tapableMod.SyncBailHook[js.Array[Module], _, _, _]
    var optimizeModulesAdvanced: tapableLib.tapableMod.SyncBailHook[js.Array[Module], _, _, _]
    var optimizeModulesBasic: tapableLib.tapableMod.SyncBailHook[js.Array[Module], _, _, _]
    var optimizeTree: tapableLib.tapableMod.AsyncSeriesHook[js.Array[Chunk], js.Array[Module], _]
    var rebuildModule: tapableLib.tapableMod.SyncHook[Module, _, _]
    var record: tapableLib.tapableMod.SyncHook[Compilation, js.Array[Record], _]
    var recordChunks: tapableLib.tapableMod.SyncHook[js.Array[Chunk], js.Array[Record], _]
    var recordHash: tapableLib.tapableMod.SyncHook[js.Array[Record], _, _]
    var recordModules: tapableLib.tapableMod.SyncHook[js.Array[Module], js.Array[Record], _]
    var records: tapableLib.tapableMod.SyncHook[Compilation, js.Array[Record], _]
    var reviveChunks: tapableLib.tapableMod.SyncHook[js.Array[Chunk], js.Array[Record], _]
    var reviveModules: tapableLib.tapableMod.SyncHook[js.Array[Module], js.Array[Record], _]
    var seal: tapableLib.tapableMod.SyncHook[_, _, _]
    var shouldGenerateChunkAssets: tapableLib.tapableMod.SyncBailHook[_, _, _, _]
    var shouldRecord: tapableLib.tapableMod.SyncBailHook[_, _, _, _]
    var succeedModule: tapableLib.tapableMod.SyncHook[Module, _, _]
    var unseal: tapableLib.tapableMod.SyncHook[_, _, _]
  }
  
  trait CompilationModule extends js.Object {
    var build: scala.Boolean
    var dependencies: scala.Boolean
    var issuer: scala.Boolean
    var module: js.Any
  }
  
  trait CompilerHooks extends js.Object {
    var additionalPass: tapableLib.tapableMod.AsyncSeriesHook[_, _, _]
    var afterCompile: tapableLib.tapableMod.AsyncSeriesHook[Compilation, _, _]
    var afterEmit: tapableLib.tapableMod.AsyncSeriesHook[Compilation, _, _]
    var afterEnvironment: tapableLib.tapableMod.SyncHook[_, _, _]
    var afterPlugins: tapableLib.tapableMod.SyncHook[webpackLib.webpackMod.Compiler, _, _]
    var afterResolvers: tapableLib.tapableMod.SyncHook[webpackLib.webpackMod.Compiler, _, _]
    var beforeCompile: tapableLib.tapableMod.AsyncSeriesHook[js.Object, _, _]
    var beforeRun: tapableLib.tapableMod.AsyncSeriesHook[webpackLib.webpackMod.Compiler, _, _]
    var compilation: tapableLib.tapableMod.SyncHook[Compilation, webpackLib.Anon_NormalModuleFactory, _]
    var compile: tapableLib.tapableMod.SyncHook[js.Object, _, _]
    var contextModuleFactory: tapableLib.tapableMod.SyncHook[ContextModuleFactory, _, _]
    var done: tapableLib.tapableMod.AsyncSeriesHook[webpackLib.webpackMod.Stats, _, _]
    var emit: tapableLib.tapableMod.AsyncSeriesHook[Compilation, _, _]
    var entryOption: tapableLib.tapableMod.SyncBailHook[_, _, _, _]
    var environment: tapableLib.tapableMod.SyncHook[_, _, _]
    var failed: tapableLib.tapableMod.SyncHook[stdLib.Error, _, _]
    var invalid: tapableLib.tapableMod.SyncHook[java.lang.String, stdLib.Date, _]
    var make: tapableLib.tapableMod.AsyncParallelHook[Compilation, _, _]
    var normalModuleFactory: tapableLib.tapableMod.SyncHook[NormalModuleFactory, _, _]
    var run: tapableLib.tapableMod.AsyncSeriesHook[webpackLib.webpackMod.Compiler, _, _]
    var shouldEmit: tapableLib.tapableMod.SyncBailHook[Compilation, _, _, _]
    var thisCompilation: tapableLib.tapableMod.SyncHook[Compilation, webpackLib.Anon_NormalModuleFactory, _]
    var watchClose: tapableLib.tapableMod.SyncHook[_, _, _]
    var watchRun: tapableLib.tapableMod.AsyncSeriesHook[webpackLib.webpackMod.Compiler, _, _]
  }
  
  @js.native
  class ContextModuleFactory ()
    extends tapableLib.tapableMod.Tapable {
    var hooks: ContextModuleFactoryHooks = js.native
  }
  
  trait ContextModuleFactoryHooks extends js.Object {
    var afterResolve: tapableLib.tapableMod.AsyncSeriesWaterfallHook[_, _, _]
    var alternatives: tapableLib.tapableMod.AsyncSeriesWaterfallHook[_, _, _]
    var beforeResolve: tapableLib.tapableMod.AsyncSeriesWaterfallHook[_, _, _]
    var contextModuleFiles: tapableLib.tapableMod.SyncWaterfallHook[_, _, _]
  }
  
  @js.native
  class Dependency () extends js.Object {
    def disconnect(): scala.Unit = js.native
    def getErrors(): js.Any = js.native
    def getExports(): js.Any = js.native
    def getReference(): js.Any = js.native
    def getResourceIdentifier(): js.Any = js.native
    def getWarnings(): js.Any = js.native
    def updateHash(hash: js.Any): scala.Unit = js.native
  }
  
  @js.native
  class DllModuleFactory ()
    extends tapableLib.tapableMod.Tapable
  
  @js.native
  class HotUpdateChunkTemplate ()
    extends tapableLib.tapableMod.Tapable
  
  @js.native
  class MainTemplate ()
    extends tapableLib.tapableMod.Tapable
  
  @js.native
  class Module () extends js.Object
  
  @js.native
  class ModuleTemplate ()
    extends tapableLib.tapableMod.Tapable {
    var hooks: ModuleTemplateHooks = js.native
  }
  
  trait ModuleTemplateHooks extends js.Object {
    var content: tapableLib.tapableMod.SyncWaterfallHook[_, _, _]
    var hash: tapableLib.tapableMod.SyncHook[_, _, _]
    var module: tapableLib.tapableMod.SyncWaterfallHook[_, _, _]
    var `package`: tapableLib.tapableMod.SyncWaterfallHook[_, _, _]
    var render: tapableLib.tapableMod.SyncWaterfallHook[_, _, _]
  }
  
  trait MultiCompilerHooks extends js.Object {
    var done: tapableLib.tapableMod.SyncHook[MultiStats, _, _]
    var invalid: tapableLib.tapableMod.SyncHook[java.lang.String, stdLib.Date, _]
    var run: tapableLib.tapableMod.AsyncSeriesHook[webpackLib.webpackMod.Compiler, _, _]
    var watchClose: tapableLib.tapableMod.SyncHook[_, _, _]
    var watchRun: tapableLib.tapableMod.AsyncSeriesHook[webpackLib.webpackMod.Compiler, _, _]
  }
  
  trait MultiStats extends js.Object {
    var hash: java.lang.String
    var stats: js.Array[webpackLib.webpackMod.Stats]
  }
  
  @js.native
  class NormalModuleFactory ()
    extends tapableLib.tapableMod.Tapable {
    var hooks: NormalModuleFactoryHooks = js.native
  }
  
  trait NormalModuleFactoryHooks extends js.Object {
    var afterResolve: tapableLib.tapableMod.AsyncSeriesWaterfallHook[_, _, _]
    var beforeResolve: tapableLib.tapableMod.AsyncSeriesWaterfallHook[_, _, _]
    var createGenerator: tapableLib.tapableMod.HookMap[_, _, _]
    var createModule: tapableLib.tapableMod.SyncBailHook[_, _, _, _]
    var createParser: tapableLib.tapableMod.HookMap[_, _, _]
    var factory: tapableLib.tapableMod.SyncWaterfallHook[_, _, _]
    var generator: tapableLib.tapableMod.HookMap[_, _, _]
    var module: tapableLib.tapableMod.SyncWaterfallHook[_, _, _]
    var parser: tapableLib.tapableMod.HookMap[_, _, _]
    var resolver: tapableLib.tapableMod.SyncWaterfallHook[_, _, _]
  }
  
  @js.native
  class Record () extends js.Object
  
  @js.native
  class RuntimeTemplate () extends js.Object
  
  /* static members */
  @js.native
  object Dependency extends js.Object {
    def compare(a: js.Any, b: js.Any): js.Any = js.native
  }
  
}

