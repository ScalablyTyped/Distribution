package typings.webpack.webpackMod

import typings.std.Date
import typings.std.Error
import typings.std.Map
import typings.std.Set
import typings.tapable.tapableMod.AsyncParallelHook
import typings.tapable.tapableMod.AsyncSeriesHook
import typings.tapable.tapableMod.AsyncSeriesWaterfallHook
import typings.tapable.tapableMod.HookMap
import typings.tapable.tapableMod.SyncBailHook
import typings.tapable.tapableMod.SyncHook
import typings.tapable.tapableMod.SyncWaterfallHook
import typings.tapable.tapableMod.Tapable
import typings.webpack.Anon_Basename
import typings.webpack.Anon_Hash
import typings.webpack.Anon_HashId
import typings.webpack.Anon_Javascript
import typings.webpack.Anon_JsonpScript
import typings.webpack.Anon_NormalModuleFactory
import typings.webpack.TypeofClassDependency
import typings.webpack.webpackMod.compilationNs.Asset
import typings.webpack.webpackMod.compilationNs.Chunk
import typings.webpack.webpackMod.compilationNs.ChunkGroup
import typings.webpack.webpackMod.compilationNs.ChunkHash
import typings.webpack.webpackMod.compilationNs.ChunkTemplate
import typings.webpack.webpackMod.compilationNs.Compilation
import typings.webpack.webpackMod.compilationNs.CompilationHooks
import typings.webpack.webpackMod.compilationNs.CompilationModule
import typings.webpack.webpackMod.compilationNs.ContextModuleFactory
import typings.webpack.webpackMod.compilationNs.ContextModuleFactoryHooks
import typings.webpack.webpackMod.compilationNs.HotUpdateChunkTemplate
import typings.webpack.webpackMod.compilationNs.MainTemplate
import typings.webpack.webpackMod.compilationNs.ModuleTemplateHooks
import typings.webpack.webpackMod.compilationNs.MultiStats
import typings.webpack.webpackMod.compilationNs.NormalModuleFactory
import typings.webpack.webpackMod.compilationNs.NormalModuleFactoryHooks
import typings.webpack.webpackMod.compilationNs.Record
import typings.webpack.webpackMod.compilationNs.RuntimeTemplate
import typings.webpack.webpackNumbers.`-1`
import typings.webpack.webpackNumbers.`0`
import typings.webpack.webpackNumbers.`1`
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
    def this(name: String) = this()
    var chunkReason: js.Any = js.native
    var debugId: Double = js.native
    var entryModule: js.Any = js.native
    var extraAsync: Boolean = js.native
    var files: js.Array[_] = js.native
    var groupsIterable: js.Array[_] = js.native
    var hash: js.Any = js.native
    var id: js.Any = js.native
    var ids: js.Any = js.native
    var modulesIterable: js.Array[_] = js.native
    var name: js.Any = js.native
    var rendered: Boolean = js.native
    var renderedHash: js.Any = js.native
    def addGroup(chunkGroup: js.Any): Boolean = js.native
    def addModule(module: js.Any): Boolean = js.native
    def addMultiplierAndOverhead(size: Double, options: js.Any): Double = js.native
    def canBeInitial(): Boolean = js.native
    def canBeIntegrated(otherChunk: js.Any): Boolean = js.native
    def compareTo(otherChunk: js.Any): `-1` | `0` | `1` = js.native
    def containsModule(module: js.Any): Boolean = js.native
    def getAllAsyncChunks(): Set[_] = js.native
    def getChunkMaps(realHash: js.Any): Anon_Hash = js.native
    // tslint:disable-next-line:ban-types
    def getChunkModuleMaps(filterFn: js.Function): Anon_HashId = js.native
    def getModules(): js.Array[_] = js.native
    def getModulesIdent(): js.Array[_] = js.native
    def getNumberOfGroups(): Double = js.native
    def getNumberOfModules(): Double = js.native
    def hasEntryModule(): Boolean = js.native
    // tslint:disable-next-line:ban-types
    def hasModuleInGraph(filterFn: js.Function, filterChunkFn: js.Function): Boolean = js.native
    def hasRuntime(): Boolean = js.native
    def integrate(otherChunk: js.Any, reason: js.Any): Boolean = js.native
    def integratedSize(otherChunk: js.Any, options: js.Any): Double = js.native
    def isEmpty(): Boolean = js.native
    def isInGroup(chunkGroup: js.Any): Boolean = js.native
    def isOnlyInitial(): Boolean = js.native
    def modulesSize(): Double = js.native
    def moveModule(module: js.Any, otherChunk: js.Any): Unit = js.native
    def remove(reason: js.Any): Unit = js.native
    def removeGroup(chunkGroup: js.Any): Boolean = js.native
    def removeModule(module: js.Any): Boolean = js.native
    def setModules(modules: js.Any): Unit = js.native
    def size(options: js.Any): Double = js.native
    // tslint:disable-next-line:ban-types
    def sortModules(sortByFn: js.Function): Unit = js.native
    def split(newChunk: js.Any): Unit = js.native
    def updateHash(hash: js.Any): Unit = js.native
  }
  
  @js.native
  class ChunkGroup () extends js.Object
  
  @js.native
  class ChunkHash () extends js.Object
  
  @js.native
  class ChunkTemplate () extends Tapable
  
  @js.native
  class Compilation () extends Tapable {
    var _modules: Map[_, _] = js.native
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
    var compiler: Compiler = js.native
    var context: String = js.native
    var contextDependencies: SortableSet[String] = js.native
    var contextTimestamps: Map[String, Double] = js.native
    var dependencyFactories: Map[TypeofClassDependency, Tapable] = js.native
    var dependencyTemplates: Map[TypeofClassDependency, Tapable] = js.native
    var entries: js.Array[_] = js.native
    var entrypoints: Map[_, _] = js.native
    var errors: js.Array[_] = js.native
    var fileDependencies: SortableSet[String] = js.native
    var fileTimestamps: Map[String, Double] = js.native
    var hash: js.UndefOr[String] = js.native
    var hooks: CompilationHooks = js.native
    var hotUpdateChunkTemplate: HotUpdateChunkTemplate = js.native
    var inputFileSystem: js.Any = js.native
    var mainTemplate: MainTemplate = js.native
    var missingDependencies: SortableSet[String] = js.native
    var moduleTemplates: Anon_Javascript = js.native
    var modules: js.Array[_] = js.native
    var namedChunkGroups: Map[_, _] = js.native
    var namedChunks: Map[_, _] = js.native
    var nextFreeModuleIndex: js.Any = js.native
    var nextFreeModuleIndex2: js.Any = js.native
    var outputOptions: js.Any = js.native
    var outputPath: String = js.native
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
    def addEntry(context: js.Any, entry: js.Any, name: js.Any, callback: js.Function): Unit = js.native
    def addModule(module: CompilationModule, cacheGroup: js.Any): js.Any = js.native
    def getPath(filename: String, data: Anon_Basename): String = js.native
    def getStats(): Stats = js.native
    def isChild(): Boolean = js.native
  }
  
  trait CompilationHooks extends js.Object {
    var additionalAssets: AsyncSeriesHook[_, _, _]
    var additionalChunkAssets: SyncHook[js.Array[Chunk], _, _]
    var advancedOptimizeModuleOrder: SyncHook[js.Array[typings.webpack.webpackMod.compilationNs.Module], _, _]
    var afterHash: SyncHook[_, _, _]
    var afterOptimizeAssets: SyncHook[js.Array[Asset], _, _]
    var afterOptimizeChunkAssets: SyncHook[js.Array[Chunk], _, _]
    var afterOptimizeChunkIds: SyncHook[js.Array[Chunk], _, _]
    var afterOptimizeChunkModules: SyncHook[js.Array[Chunk], js.Array[typings.webpack.webpackMod.compilationNs.Module], _]
    var afterOptimizeChunks: SyncHook[js.Array[Chunk], js.Array[ChunkGroup], _]
    var afterOptimizeDependencies: SyncHook[js.Array[typings.webpack.webpackMod.compilationNs.Module], _, _]
    var afterOptimizeExtractedChunks: SyncHook[js.Array[Chunk], _, _]
    var afterOptimizeModuleIds: SyncHook[js.Array[typings.webpack.webpackMod.compilationNs.Module], _, _]
    var afterOptimizeModules: SyncHook[js.Array[typings.webpack.webpackMod.compilationNs.Module], _, _]
    var afterOptimizeTree: SyncHook[js.Array[Chunk], js.Array[typings.webpack.webpackMod.compilationNs.Module], _]
    var afterSeal: AsyncSeriesHook[_, _, _]
    var assetPath: SyncWaterfallHook[String, _, _]
    var beforeChunkAssets: SyncHook[_, _, _]
    var beforeChunkIds: SyncHook[js.Array[Chunk], _, _]
    var beforeHash: SyncHook[_, _, _]
    var beforeModuleAssets: SyncHook[_, _, _]
    var beforeModuleIds: SyncHook[js.Array[typings.webpack.webpackMod.compilationNs.Module], _, _]
    var buildModule: SyncHook[typings.webpack.webpackMod.compilationNs.Module, _, _]
    var childCompiler: SyncHook[_, _, _]
    var chunkAsset: SyncHook[Chunk, String, _]
    var chunkHash: SyncHook[Chunk, ChunkHash, _]
    var failedModule: SyncHook[typings.webpack.webpackMod.compilationNs.Module, Error, _]
    var finishModules: SyncHook[js.Array[typings.webpack.webpackMod.compilationNs.Module], _, _]
    var finishRebuildingModule: SyncHook[typings.webpack.webpackMod.compilationNs.Module, _, _]
    var moduleAsset: SyncHook[typings.webpack.webpackMod.compilationNs.Module, String, _]
    var moduleIds: SyncHook[js.Array[typings.webpack.webpackMod.compilationNs.Module], _, _]
    var needAdditionalPass: SyncBailHook[_, _, _, _]
    var needAdditionalSeal: SyncBailHook[_, _, _, _]
    var normalModuleLoader: SyncHook[_, typings.webpack.webpackMod.compilationNs.Module, _]
    var optimize: SyncHook[_, _, _]
    var optimizeAssets: AsyncSeriesHook[js.Array[Asset], _, _]
    var optimizeChunkAssets: AsyncSeriesHook[js.Array[Chunk], _, _]
    var optimizeChunkIds: SyncHook[js.Array[Chunk], _, _]
    var optimizeChunkModules: SyncBailHook[js.Array[Chunk], js.Array[typings.webpack.webpackMod.compilationNs.Module], _, _]
    var optimizeChunkModulesAdvanced: SyncBailHook[js.Array[Chunk], js.Array[typings.webpack.webpackMod.compilationNs.Module], _, _]
    var optimizeChunkModulesBasic: SyncBailHook[js.Array[Chunk], js.Array[typings.webpack.webpackMod.compilationNs.Module], _, _]
    var optimizeChunkOrder: SyncHook[js.Array[Chunk], _, _]
    var optimizeChunks: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _]
    var optimizeChunksAdvanced: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _]
    var optimizeChunksBasic: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _]
    var optimizeDependencies: SyncBailHook[js.Array[typings.webpack.webpackMod.compilationNs.Module], _, _, _]
    var optimizeDependenciesAdvanced: SyncBailHook[js.Array[typings.webpack.webpackMod.compilationNs.Module], _, _, _]
    var optimizeDependenciesBasic: SyncBailHook[js.Array[typings.webpack.webpackMod.compilationNs.Module], _, _, _]
    var optimizeExtractedChunks: SyncBailHook[js.Array[Chunk], _, _, _]
    var optimizeExtractedChunksAdvanced: SyncBailHook[js.Array[Chunk], _, _, _]
    var optimizeExtractedChunksBasic: SyncBailHook[js.Array[Chunk], _, _, _]
    var optimizeModuleIds: SyncHook[js.Array[typings.webpack.webpackMod.compilationNs.Module], _, _]
    var optimizeModuleOrder: SyncHook[js.Array[typings.webpack.webpackMod.compilationNs.Module], _, _]
    var optimizeModules: SyncBailHook[js.Array[typings.webpack.webpackMod.compilationNs.Module], _, _, _]
    var optimizeModulesAdvanced: SyncBailHook[js.Array[typings.webpack.webpackMod.compilationNs.Module], _, _, _]
    var optimizeModulesBasic: SyncBailHook[js.Array[typings.webpack.webpackMod.compilationNs.Module], _, _, _]
    var optimizeTree: AsyncSeriesHook[js.Array[Chunk], js.Array[typings.webpack.webpackMod.compilationNs.Module], _]
    var rebuildModule: SyncHook[typings.webpack.webpackMod.compilationNs.Module, _, _]
    var record: SyncHook[Compilation, js.Array[Record], _]
    var recordChunks: SyncHook[js.Array[Chunk], js.Array[Record], _]
    var recordHash: SyncHook[js.Array[Record], _, _]
    var recordModules: SyncHook[js.Array[typings.webpack.webpackMod.compilationNs.Module], js.Array[Record], _]
    var records: SyncHook[Compilation, js.Array[Record], _]
    var reviveChunks: SyncHook[js.Array[Chunk], js.Array[Record], _]
    var reviveModules: SyncHook[js.Array[typings.webpack.webpackMod.compilationNs.Module], js.Array[Record], _]
    var seal: SyncHook[_, _, _]
    var shouldGenerateChunkAssets: SyncBailHook[_, _, _, _]
    var shouldRecord: SyncBailHook[_, _, _, _]
    var succeedModule: SyncHook[typings.webpack.webpackMod.compilationNs.Module, _, _]
    var unseal: SyncHook[_, _, _]
  }
  
  trait CompilationModule extends js.Object {
    var build: Boolean
    var dependencies: Boolean
    var issuer: Boolean
    var module: js.Any
  }
  
  trait CompilerHooks extends js.Object {
    var additionalPass: AsyncSeriesHook[_, _, _]
    var afterCompile: AsyncSeriesHook[Compilation, _, _]
    var afterEmit: AsyncSeriesHook[Compilation, _, _]
    var afterEnvironment: SyncHook[_, _, _]
    var afterPlugins: SyncHook[Compiler, _, _]
    var afterResolvers: SyncHook[Compiler, _, _]
    var beforeCompile: AsyncSeriesHook[js.Object, _, _]
    var beforeRun: AsyncSeriesHook[Compiler, _, _]
    var compilation: SyncHook[Compilation, Anon_NormalModuleFactory, _]
    var compile: SyncHook[js.Object, _, _]
    var contextModuleFactory: SyncHook[ContextModuleFactory, _, _]
    var done: AsyncSeriesHook[Stats, _, _]
    var emit: AsyncSeriesHook[Compilation, _, _]
    var entryOption: SyncBailHook[_, _, _, _]
    var environment: SyncHook[_, _, _]
    var failed: SyncHook[Error, _, _]
    var invalid: SyncHook[String, Date, _]
    var make: AsyncParallelHook[Compilation, _, _]
    var normalModuleFactory: SyncHook[NormalModuleFactory, _, _]
    var run: AsyncSeriesHook[Compiler, _, _]
    var shouldEmit: SyncBailHook[Compilation, _, _, _]
    var thisCompilation: SyncHook[Compilation, Anon_NormalModuleFactory, _]
    var watchClose: SyncHook[_, _, _]
    var watchRun: AsyncSeriesHook[Compiler, _, _]
  }
  
  @js.native
  class ContextModuleFactory () extends Tapable {
    var hooks: ContextModuleFactoryHooks = js.native
  }
  
  trait ContextModuleFactoryHooks extends js.Object {
    var afterResolve: AsyncSeriesWaterfallHook[_, _, _]
    var alternatives: AsyncSeriesWaterfallHook[_, _, _]
    var beforeResolve: AsyncSeriesWaterfallHook[_, _, _]
    var contextModuleFiles: SyncWaterfallHook[_, _, _]
  }
  
  @js.native
  class Dependency () extends js.Object {
    def disconnect(): Unit = js.native
    def getErrors(): js.Any = js.native
    def getExports(): js.Any = js.native
    def getReference(): js.Any = js.native
    def getResourceIdentifier(): js.Any = js.native
    def getWarnings(): js.Any = js.native
    def updateHash(hash: js.Any): Unit = js.native
  }
  
  @js.native
  class DllModuleFactory () extends Tapable
  
  @js.native
  class HotUpdateChunkTemplate () extends Tapable
  
  @js.native
  class MainTemplate () extends Tapable {
    var hooks: Anon_JsonpScript = js.native
    var outputOptions: Output = js.native
    var requireFn: String = js.native
  }
  
  @js.native
  class Module () extends js.Object
  
  @js.native
  class ModuleTemplate () extends Tapable {
    var hooks: ModuleTemplateHooks = js.native
  }
  
  trait ModuleTemplateHooks extends js.Object {
    var content: SyncWaterfallHook[_, _, _]
    var hash: SyncHook[_, _, _]
    var module: SyncWaterfallHook[_, _, _]
    var `package`: SyncWaterfallHook[_, _, _]
    var render: SyncWaterfallHook[_, _, _]
  }
  
  trait MultiCompilerHooks extends js.Object {
    var done: SyncHook[MultiStats, _, _]
    var invalid: SyncHook[String, Date, _]
    var run: AsyncSeriesHook[Compiler, _, _]
    var watchClose: SyncHook[_, _, _]
    var watchRun: AsyncSeriesHook[Compiler, _, _]
  }
  
  trait MultiStats extends js.Object {
    var hash: String
    var stats: js.Array[Stats]
  }
  
  @js.native
  class NormalModuleFactory () extends Tapable {
    var hooks: NormalModuleFactoryHooks = js.native
  }
  
  trait NormalModuleFactoryHooks extends js.Object {
    var afterResolve: AsyncSeriesWaterfallHook[_, _, _]
    var beforeResolve: AsyncSeriesWaterfallHook[_, _, _]
    var createGenerator: HookMap[_, _, _]
    var createModule: SyncBailHook[_, _, _, _]
    var createParser: HookMap[_, _, _]
    var factory: SyncWaterfallHook[_, _, _]
    var generator: HookMap[_, _, _]
    var module: SyncWaterfallHook[_, _, _]
    var parser: HookMap[_, _, _]
    var resolver: SyncWaterfallHook[_, _, _]
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

