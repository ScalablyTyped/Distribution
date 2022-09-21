package typings.webpack.anon

import typings.std.Partial
import typings.std.Set
import typings.tapable.mod.AsyncParallelHook
import typings.tapable.mod.AsyncSeriesBailHook
import typings.tapable.mod.AsyncSeriesHook
import typings.tapable.mod.HookMap
import typings.tapable.mod.SyncBailHook
import typings.tapable.mod.SyncHook
import typings.tapable.mod.SyncWaterfallHook
import typings.tapable.mod.UnsetAdditionalOptions
import typings.webpack.mod.AssetInfo
import typings.webpack.mod.ChunkGroup
import typings.webpack.mod.ChunkHashContext
import typings.webpack.mod.Compilation
import typings.webpack.mod.CompilationAssets
import typings.webpack.mod.CreateStatsOptionsContext
import typings.webpack.mod.EntryOptions
import typings.webpack.mod.ExecuteModuleArgument
import typings.webpack.mod.ExecuteModuleContext
import typings.webpack.mod.LogEntry
import typings.webpack.mod.NormalModule
import typings.webpack.mod.NormalizedStatsOptions
import typings.webpack.mod.ProcessAssetsAdditionalOptions
import typings.webpack.mod.ReferencedExport
import typings.webpack.mod.RenderManifestEntry
import typings.webpack.mod.RenderManifestOptions
import typings.webpack.mod.RuntimeModule
import typings.webpack.mod.RuntimeRequirementsContext
import typings.webpack.mod.RuntimeSpec
import typings.webpack.mod.StatsFactory
import typings.webpack.mod.StatsPrinter
import typings.webpack.mod.WebpackError
import typings.webpack.webpackBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  buildModule :tapable.tapable.SyncHook<[webpack.webpack.Module], void, tapable.tapable.UnsetAdditionalOptions>,   rebuildModule :tapable.tapable.SyncHook<[webpack.webpack.Module], void, tapable.tapable.UnsetAdditionalOptions>,   failedModule :tapable.tapable.SyncHook<[webpack.webpack.Module, webpack.webpack.WebpackError], void, tapable.tapable.UnsetAdditionalOptions>,   succeedModule :tapable.tapable.SyncHook<[webpack.webpack.Module], void, tapable.tapable.UnsetAdditionalOptions>,   stillValidModule :tapable.tapable.SyncHook<[webpack.webpack.Module], void, tapable.tapable.UnsetAdditionalOptions>,   addEntry :tapable.tapable.SyncHook<[webpack.webpack.Dependency, webpack.webpack.EntryOptions], void, tapable.tapable.UnsetAdditionalOptions>,   failedEntry :tapable.tapable.SyncHook<[webpack.webpack.Dependency, webpack.webpack.EntryOptions, std.Error], void, tapable.tapable.UnsetAdditionalOptions>,   succeedEntry :tapable.tapable.SyncHook<[webpack.webpack.Dependency, webpack.webpack.EntryOptions, webpack.webpack.Module], void, tapable.tapable.UnsetAdditionalOptions>,   dependencyReferencedExports :tapable.tapable.SyncWaterfallHook<[std.Array<std.Array<string> | webpack.webpack.ReferencedExport>, webpack.webpack.Dependency, webpack.webpack.RuntimeSpec], tapable.tapable.UnsetAdditionalOptions>,   executeModule :tapable.tapable.SyncHook<[webpack.webpack.ExecuteModuleArgument, webpack.webpack.ExecuteModuleContext], void, tapable.tapable.UnsetAdditionalOptions>,   prepareModuleExecution :tapable.tapable.AsyncParallelHook<[webpack.webpack.ExecuteModuleArgument, webpack.webpack.ExecuteModuleContext], tapable.tapable.UnsetAdditionalOptions>,   finishModules :tapable.tapable.AsyncSeriesHook<[std.Iterable<webpack.webpack.Module>], tapable.tapable.UnsetAdditionalOptions>,   finishRebuildingModule :tapable.tapable.AsyncSeriesHook<[webpack.webpack.Module], tapable.tapable.UnsetAdditionalOptions>,   unseal :tapable.tapable.SyncHook<[], void, tapable.tapable.UnsetAdditionalOptions>,   seal :tapable.tapable.SyncHook<[], void, tapable.tapable.UnsetAdditionalOptions>,   beforeChunks :tapable.tapable.SyncHook<[], void, tapable.tapable.UnsetAdditionalOptions>,   afterChunks :tapable.tapable.SyncHook<[std.Iterable<webpack.webpack.Chunk>], void, tapable.tapable.UnsetAdditionalOptions>,   optimizeDependencies :tapable.tapable.SyncBailHook<[std.Iterable<webpack.webpack.Module>], any, tapable.tapable.UnsetAdditionalOptions>,   afterOptimizeDependencies :tapable.tapable.SyncHook<[std.Iterable<webpack.webpack.Module>], void, tapable.tapable.UnsetAdditionalOptions>,   optimize :tapable.tapable.SyncHook<[], void, tapable.tapable.UnsetAdditionalOptions>,   optimizeModules :tapable.tapable.SyncBailHook<[std.Iterable<webpack.webpack.Module>], any, tapable.tapable.UnsetAdditionalOptions>,   afterOptimizeModules :tapable.tapable.SyncHook<[std.Iterable<webpack.webpack.Module>], void, tapable.tapable.UnsetAdditionalOptions>,   optimizeChunks :tapable.tapable.SyncBailHook<[std.Iterable<webpack.webpack.Chunk>, std.Array<webpack.webpack.ChunkGroup>], any, tapable.tapable.UnsetAdditionalOptions>,   afterOptimizeChunks :tapable.tapable.SyncHook<[std.Iterable<webpack.webpack.Chunk>, std.Array<webpack.webpack.ChunkGroup>], void, tapable.tapable.UnsetAdditionalOptions>,   optimizeTree :tapable.tapable.AsyncSeriesHook<[std.Iterable<webpack.webpack.Chunk>, std.Iterable<webpack.webpack.Module>], tapable.tapable.UnsetAdditionalOptions>,   afterOptimizeTree :tapable.tapable.SyncHook<[std.Iterable<webpack.webpack.Chunk>, std.Iterable<webpack.webpack.Module>], void, tapable.tapable.UnsetAdditionalOptions>,   optimizeChunkModules :tapable.tapable.AsyncSeriesBailHook<[std.Iterable<webpack.webpack.Chunk>, std.Iterable<webpack.webpack.Module>], any, tapable.tapable.UnsetAdditionalOptions>,   afterOptimizeChunkModules :tapable.tapable.SyncHook<[std.Iterable<webpack.webpack.Chunk>, std.Iterable<webpack.webpack.Module>], void, tapable.tapable.UnsetAdditionalOptions>,   shouldRecord :tapable.tapable.SyncBailHook<[], boolean, tapable.tapable.UnsetAdditionalOptions>,   additionalChunkRuntimeRequirements :tapable.tapable.SyncHook<[webpack.webpack.Chunk, std.Set<string>, webpack.webpack.RuntimeRequirementsContext], void, tapable.tapable.UnsetAdditionalOptions>,   runtimeRequirementInChunk :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Chunk, std.Set<string>, webpack.webpack.RuntimeRequirementsContext], any, tapable.tapable.UnsetAdditionalOptions>>,   additionalModuleRuntimeRequirements :tapable.tapable.SyncHook<[webpack.webpack.Module, std.Set<string>, webpack.webpack.RuntimeRequirementsContext], void, tapable.tapable.UnsetAdditionalOptions>,   runtimeRequirementInModule :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Module, std.Set<string>, webpack.webpack.RuntimeRequirementsContext], any, tapable.tapable.UnsetAdditionalOptions>>,   additionalTreeRuntimeRequirements :tapable.tapable.SyncHook<[webpack.webpack.Chunk, std.Set<string>, webpack.webpack.RuntimeRequirementsContext], void, tapable.tapable.UnsetAdditionalOptions>,   runtimeRequirementInTree :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Chunk, std.Set<string>, webpack.webpack.RuntimeRequirementsContext], any, tapable.tapable.UnsetAdditionalOptions>>,   runtimeModule :tapable.tapable.SyncHook<[webpack.webpack.RuntimeModule, webpack.webpack.Chunk], void, tapable.tapable.UnsetAdditionalOptions>,   reviveModules :tapable.tapable.SyncHook<[std.Iterable<webpack.webpack.Module>, any], void, tapable.tapable.UnsetAdditionalOptions>,   beforeModuleIds :tapable.tapable.SyncHook<[std.Iterable<webpack.webpack.Module>], void, tapable.tapable.UnsetAdditionalOptions>,   moduleIds :tapable.tapable.SyncHook<[std.Iterable<webpack.webpack.Module>], void, tapable.tapable.UnsetAdditionalOptions>,   optimizeModuleIds :tapable.tapable.SyncHook<[std.Iterable<webpack.webpack.Module>], void, tapable.tapable.UnsetAdditionalOptions>,   afterOptimizeModuleIds :tapable.tapable.SyncHook<[std.Iterable<webpack.webpack.Module>], void, tapable.tapable.UnsetAdditionalOptions>,   reviveChunks :tapable.tapable.SyncHook<[std.Iterable<webpack.webpack.Chunk>, any], void, tapable.tapable.UnsetAdditionalOptions>,   beforeChunkIds :tapable.tapable.SyncHook<[std.Iterable<webpack.webpack.Chunk>], void, tapable.tapable.UnsetAdditionalOptions>,   chunkIds :tapable.tapable.SyncHook<[std.Iterable<webpack.webpack.Chunk>], void, tapable.tapable.UnsetAdditionalOptions>,   optimizeChunkIds :tapable.tapable.SyncHook<[std.Iterable<webpack.webpack.Chunk>], void, tapable.tapable.UnsetAdditionalOptions>,   afterOptimizeChunkIds :tapable.tapable.SyncHook<[std.Iterable<webpack.webpack.Chunk>], void, tapable.tapable.UnsetAdditionalOptions>,   recordModules :tapable.tapable.SyncHook<[std.Iterable<webpack.webpack.Module>, any], void, tapable.tapable.UnsetAdditionalOptions>,   recordChunks :tapable.tapable.SyncHook<[std.Iterable<webpack.webpack.Chunk>, any], void, tapable.tapable.UnsetAdditionalOptions>,   optimizeCodeGeneration :tapable.tapable.SyncHook<[std.Iterable<webpack.webpack.Module>], void, tapable.tapable.UnsetAdditionalOptions>,   beforeModuleHash :tapable.tapable.SyncHook<[], void, tapable.tapable.UnsetAdditionalOptions>,   afterModuleHash :tapable.tapable.SyncHook<[], void, tapable.tapable.UnsetAdditionalOptions>,   beforeCodeGeneration :tapable.tapable.SyncHook<[], void, tapable.tapable.UnsetAdditionalOptions>,   afterCodeGeneration :tapable.tapable.SyncHook<[], void, tapable.tapable.UnsetAdditionalOptions>,   beforeRuntimeRequirements :tapable.tapable.SyncHook<[], void, tapable.tapable.UnsetAdditionalOptions>,   afterRuntimeRequirements :tapable.tapable.SyncHook<[], void, tapable.tapable.UnsetAdditionalOptions>,   beforeHash :tapable.tapable.SyncHook<[], void, tapable.tapable.UnsetAdditionalOptions>,   contentHash :tapable.tapable.SyncHook<[webpack.webpack.Chunk], void, tapable.tapable.UnsetAdditionalOptions>,   afterHash :tapable.tapable.SyncHook<[], void, tapable.tapable.UnsetAdditionalOptions>,   recordHash :tapable.tapable.SyncHook<[any], void, tapable.tapable.UnsetAdditionalOptions>,   record :tapable.tapable.SyncHook<[webpack.webpack.Compilation, any], void, tapable.tapable.UnsetAdditionalOptions>,   beforeModuleAssets :tapable.tapable.SyncHook<[], void, tapable.tapable.UnsetAdditionalOptions>,   shouldGenerateChunkAssets :tapable.tapable.SyncBailHook<[], boolean, tapable.tapable.UnsetAdditionalOptions>,   beforeChunkAssets :tapable.tapable.SyncHook<[], void, tapable.tapable.UnsetAdditionalOptions>,   additionalChunkAssets :webpack.webpack.FakeHook<std.Pick<tapable.tapable.AsyncSeriesHook<[std.Set<webpack.webpack.Chunk>], tapable.tapable.UnsetAdditionalOptions>, 'name' | 'tap' | 'tapAsync' | 'tapPromise'>>,   additionalAssets :webpack.webpack.FakeHook<std.Pick<tapable.tapable.AsyncSeriesHook<[], tapable.tapable.UnsetAdditionalOptions>, 'name' | 'tap' | 'tapAsync' | 'tapPromise'>>,   optimizeChunkAssets :webpack.webpack.FakeHook<std.Pick<tapable.tapable.AsyncSeriesHook<[std.Set<webpack.webpack.Chunk>], tapable.tapable.UnsetAdditionalOptions>, 'name' | 'tap' | 'tapAsync' | 'tapPromise'>>,   afterOptimizeChunkAssets :webpack.webpack.FakeHook<std.Pick<tapable.tapable.AsyncSeriesHook<[std.Set<webpack.webpack.Chunk>], tapable.tapable.UnsetAdditionalOptions>, 'name' | 'tap' | 'tapAsync' | 'tapPromise'>>,   optimizeAssets :tapable.tapable.AsyncSeriesHook<[webpack.webpack.CompilationAssets], webpack.webpack.ProcessAssetsAdditionalOptions>,   afterOptimizeAssets :tapable.tapable.SyncHook<[webpack.webpack.CompilationAssets], void, tapable.tapable.UnsetAdditionalOptions>,   processAssets :tapable.tapable.AsyncSeriesHook<[webpack.webpack.CompilationAssets], webpack.webpack.ProcessAssetsAdditionalOptions>,   afterProcessAssets :tapable.tapable.SyncHook<[webpack.webpack.CompilationAssets], void, tapable.tapable.UnsetAdditionalOptions>,   processAdditionalAssets :tapable.tapable.AsyncSeriesHook<[webpack.webpack.CompilationAssets], tapable.tapable.UnsetAdditionalOptions>,   needAdditionalSeal :tapable.tapable.SyncBailHook<[], boolean, tapable.tapable.UnsetAdditionalOptions>,   afterSeal :tapable.tapable.AsyncSeriesHook<[], tapable.tapable.UnsetAdditionalOptions>,   renderManifest :tapable.tapable.SyncWaterfallHook<[std.Array<webpack.webpack.RenderManifestEntry>, webpack.webpack.RenderManifestOptions], tapable.tapable.UnsetAdditionalOptions>,   fullHash :tapable.tapable.SyncHook<[webpack.webpack.Hash], void, tapable.tapable.UnsetAdditionalOptions>,   chunkHash :tapable.tapable.SyncHook<[webpack.webpack.Chunk, webpack.webpack.Hash, webpack.webpack.ChunkHashContext], void, tapable.tapable.UnsetAdditionalOptions>,   moduleAsset :tapable.tapable.SyncHook<[webpack.webpack.Module, string], void, tapable.tapable.UnsetAdditionalOptions>,   chunkAsset :tapable.tapable.SyncHook<[webpack.webpack.Chunk, string], void, tapable.tapable.UnsetAdditionalOptions>,   assetPath :tapable.tapable.SyncWaterfallHook<[string, object, webpack.webpack.AssetInfo], tapable.tapable.UnsetAdditionalOptions>,   needAdditionalPass :tapable.tapable.SyncBailHook<[], boolean, tapable.tapable.UnsetAdditionalOptions>,   childCompiler :tapable.tapable.SyncHook<[webpack.webpack.Compiler, string, number], void, tapable.tapable.UnsetAdditionalOptions>,   log :tapable.tapable.SyncBailHook<[string, webpack.webpack.LogEntry], true, tapable.tapable.UnsetAdditionalOptions>,   processWarnings :tapable.tapable.SyncWaterfallHook<[std.Array<webpack.webpack.WebpackError>], tapable.tapable.UnsetAdditionalOptions>,   processErrors :tapable.tapable.SyncWaterfallHook<[std.Array<webpack.webpack.WebpackError>], tapable.tapable.UnsetAdditionalOptions>,   statsPreset :tapable.tapable.HookMap<tapable.tapable.SyncHook<[std.Partial<webpack.webpack.NormalizedStatsOptions>, webpack.webpack.CreateStatsOptionsContext], void, tapable.tapable.UnsetAdditionalOptions>>,   statsNormalize :tapable.tapable.SyncHook<[std.Partial<webpack.webpack.NormalizedStatsOptions>, webpack.webpack.CreateStatsOptionsContext], void, tapable.tapable.UnsetAdditionalOptions>,   statsFactory :tapable.tapable.SyncHook<[webpack.webpack.StatsFactory, webpack.webpack.NormalizedStatsOptions], void, tapable.tapable.UnsetAdditionalOptions>,   statsPrinter :tapable.tapable.SyncHook<[webpack.webpack.StatsPrinter, webpack.webpack.NormalizedStatsOptions], void, tapable.tapable.UnsetAdditionalOptions>,  readonly normalModuleLoader :tapable.tapable.SyncHook<[object, webpack.webpack.NormalModule], void, tapable.tapable.UnsetAdditionalOptions>}> */
trait ReadonlybuildModuleSyncHo extends StObject {
  
  val addEntry: SyncHook[
    js.Tuple2[typings.webpack.mod.Dependency, EntryOptions], 
    Unit, 
    UnsetAdditionalOptions
  ]
  
  val additionalAssets: FakeHookPickAsyncSeriesHo
  
  val additionalChunkAssets: FakeHookPickAsyncSeriesHoName
  
  val additionalChunkRuntimeRequirements: SyncHook[
    js.Tuple3[typings.webpack.mod.Chunk, Set[String], RuntimeRequirementsContext], 
    Unit, 
    UnsetAdditionalOptions
  ]
  
  val additionalModuleRuntimeRequirements: SyncHook[
    js.Tuple3[typings.webpack.mod.Module, Set[String], RuntimeRequirementsContext], 
    Unit, 
    UnsetAdditionalOptions
  ]
  
  val additionalTreeRuntimeRequirements: SyncHook[
    js.Tuple3[typings.webpack.mod.Chunk, Set[String], RuntimeRequirementsContext], 
    Unit, 
    UnsetAdditionalOptions
  ]
  
  val afterChunks: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Chunk]], Unit, UnsetAdditionalOptions]
  
  val afterCodeGeneration: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  val afterHash: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  val afterModuleHash: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  val afterOptimizeAssets: SyncHook[js.Array[CompilationAssets], Unit, UnsetAdditionalOptions]
  
  val afterOptimizeChunkAssets: FakeHookPickAsyncSeriesHoName
  
  val afterOptimizeChunkIds: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Chunk]], Unit, UnsetAdditionalOptions]
  
  val afterOptimizeChunkModules: SyncHook[
    js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], js.Iterable[typings.webpack.mod.Module]], 
    Unit, 
    UnsetAdditionalOptions
  ]
  
  val afterOptimizeChunks: SyncHook[
    js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], js.Array[ChunkGroup]], 
    Unit, 
    UnsetAdditionalOptions
  ]
  
  val afterOptimizeDependencies: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions]
  
  val afterOptimizeModuleIds: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions]
  
  val afterOptimizeModules: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions]
  
  val afterOptimizeTree: SyncHook[
    js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], js.Iterable[typings.webpack.mod.Module]], 
    Unit, 
    UnsetAdditionalOptions
  ]
  
  val afterProcessAssets: SyncHook[js.Array[CompilationAssets], Unit, UnsetAdditionalOptions]
  
  val afterRuntimeRequirements: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  val afterSeal: AsyncSeriesHook[js.Array[Any], UnsetAdditionalOptions]
  
  val assetPath: SyncWaterfallHook[js.Tuple3[String, js.Object, AssetInfo], UnsetAdditionalOptions]
  
  val beforeChunkAssets: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  val beforeChunkIds: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Chunk]], Unit, UnsetAdditionalOptions]
  
  val beforeChunks: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  val beforeCodeGeneration: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  val beforeHash: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  val beforeModuleAssets: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  val beforeModuleHash: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  val beforeModuleIds: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions]
  
  val beforeRuntimeRequirements: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  val buildModule: SyncHook[js.Array[typings.webpack.mod.Module], Unit, UnsetAdditionalOptions]
  
  val childCompiler: SyncHook[
    js.Tuple3[typings.webpack.mod.Compiler, String, Double], 
    Unit, 
    UnsetAdditionalOptions
  ]
  
  val chunkAsset: SyncHook[js.Tuple2[typings.webpack.mod.Chunk, String], Unit, UnsetAdditionalOptions]
  
  val chunkHash: SyncHook[
    js.Tuple3[typings.webpack.mod.Chunk, typings.webpack.mod.Hash, ChunkHashContext], 
    Unit, 
    UnsetAdditionalOptions
  ]
  
  val chunkIds: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Chunk]], Unit, UnsetAdditionalOptions]
  
  val contentHash: SyncHook[js.Array[typings.webpack.mod.Chunk], Unit, UnsetAdditionalOptions]
  
  val dependencyReferencedExports: SyncWaterfallHook[
    js.Tuple3[
      js.Array[js.Array[String] | ReferencedExport], 
      typings.webpack.mod.Dependency, 
      RuntimeSpec
    ], 
    UnsetAdditionalOptions
  ]
  
  val executeModule: SyncHook[js.Tuple2[ExecuteModuleArgument, ExecuteModuleContext], Unit, UnsetAdditionalOptions]
  
  val failedEntry: SyncHook[
    js.Tuple3[typings.webpack.mod.Dependency, EntryOptions, js.Error], 
    Unit, 
    UnsetAdditionalOptions
  ]
  
  val failedModule: SyncHook[js.Tuple2[typings.webpack.mod.Module, WebpackError], Unit, UnsetAdditionalOptions]
  
  val finishModules: AsyncSeriesHook[js.Array[js.Iterable[typings.webpack.mod.Module]], UnsetAdditionalOptions]
  
  val finishRebuildingModule: AsyncSeriesHook[js.Array[typings.webpack.mod.Module], UnsetAdditionalOptions]
  
  val fullHash: SyncHook[js.Array[typings.webpack.mod.Hash], Unit, UnsetAdditionalOptions]
  
  val log: SyncBailHook[js.Tuple2[String, LogEntry], `true`, UnsetAdditionalOptions]
  
  val moduleAsset: SyncHook[js.Tuple2[typings.webpack.mod.Module, String], Unit, UnsetAdditionalOptions]
  
  val moduleIds: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions]
  
  val needAdditionalPass: SyncBailHook[js.Array[Any], Boolean, UnsetAdditionalOptions]
  
  val needAdditionalSeal: SyncBailHook[js.Array[Any], Boolean, UnsetAdditionalOptions]
  
  val normalModuleLoader: SyncHook[js.Tuple2[js.Object, NormalModule], Unit, UnsetAdditionalOptions]
  
  val optimize: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  val optimizeAssets: AsyncSeriesHook[js.Array[CompilationAssets], ProcessAssetsAdditionalOptions]
  
  val optimizeChunkAssets: FakeHookPickAsyncSeriesHoName
  
  val optimizeChunkIds: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Chunk]], Unit, UnsetAdditionalOptions]
  
  val optimizeChunkModules: AsyncSeriesBailHook[
    js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], js.Iterable[typings.webpack.mod.Module]], 
    Any, 
    UnsetAdditionalOptions
  ]
  
  val optimizeChunks: SyncBailHook[
    js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], js.Array[ChunkGroup]], 
    Any, 
    UnsetAdditionalOptions
  ]
  
  val optimizeCodeGeneration: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions]
  
  val optimizeDependencies: SyncBailHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Any, UnsetAdditionalOptions]
  
  val optimizeModuleIds: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions]
  
  val optimizeModules: SyncBailHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Any, UnsetAdditionalOptions]
  
  val optimizeTree: AsyncSeriesHook[
    js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], js.Iterable[typings.webpack.mod.Module]], 
    UnsetAdditionalOptions
  ]
  
  val prepareModuleExecution: AsyncParallelHook[js.Tuple2[ExecuteModuleArgument, ExecuteModuleContext], UnsetAdditionalOptions]
  
  val processAdditionalAssets: AsyncSeriesHook[js.Array[CompilationAssets], UnsetAdditionalOptions]
  
  val processAssets: AsyncSeriesHook[js.Array[CompilationAssets], ProcessAssetsAdditionalOptions]
  
  val processErrors: SyncWaterfallHook[js.Array[js.Array[WebpackError]], UnsetAdditionalOptions]
  
  val processWarnings: SyncWaterfallHook[js.Array[js.Array[WebpackError]], UnsetAdditionalOptions]
  
  val rebuildModule: SyncHook[js.Array[typings.webpack.mod.Module], Unit, UnsetAdditionalOptions]
  
  val record: SyncHook[js.Tuple2[Compilation, Any], Unit, UnsetAdditionalOptions]
  
  val recordChunks: SyncHook[js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], Any], Unit, UnsetAdditionalOptions]
  
  val recordHash: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  val recordModules: SyncHook[
    js.Tuple2[js.Iterable[typings.webpack.mod.Module], Any], 
    Unit, 
    UnsetAdditionalOptions
  ]
  
  val renderManifest: SyncWaterfallHook[
    js.Tuple2[js.Array[RenderManifestEntry], RenderManifestOptions], 
    UnsetAdditionalOptions
  ]
  
  val reviveChunks: SyncHook[js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], Any], Unit, UnsetAdditionalOptions]
  
  val reviveModules: SyncHook[
    js.Tuple2[js.Iterable[typings.webpack.mod.Module], Any], 
    Unit, 
    UnsetAdditionalOptions
  ]
  
  val runtimeModule: SyncHook[js.Tuple2[RuntimeModule, typings.webpack.mod.Chunk], Unit, UnsetAdditionalOptions]
  
  val runtimeRequirementInChunk: HookMap[
    SyncBailHook[
      js.Tuple3[typings.webpack.mod.Chunk, Set[String], RuntimeRequirementsContext], 
      Any, 
      UnsetAdditionalOptions
    ]
  ]
  
  val runtimeRequirementInModule: HookMap[
    SyncBailHook[
      js.Tuple3[typings.webpack.mod.Module, Set[String], RuntimeRequirementsContext], 
      Any, 
      UnsetAdditionalOptions
    ]
  ]
  
  val runtimeRequirementInTree: HookMap[
    SyncBailHook[
      js.Tuple3[typings.webpack.mod.Chunk, Set[String], RuntimeRequirementsContext], 
      Any, 
      UnsetAdditionalOptions
    ]
  ]
  
  val seal: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  val shouldGenerateChunkAssets: SyncBailHook[js.Array[Any], Boolean, UnsetAdditionalOptions]
  
  val shouldRecord: SyncBailHook[js.Array[Any], Boolean, UnsetAdditionalOptions]
  
  val statsFactory: SyncHook[js.Tuple2[StatsFactory, NormalizedStatsOptions], Unit, UnsetAdditionalOptions]
  
  val statsNormalize: SyncHook[
    js.Tuple2[Partial[NormalizedStatsOptions], CreateStatsOptionsContext], 
    Unit, 
    UnsetAdditionalOptions
  ]
  
  val statsPreset: HookMap[
    SyncHook[
      js.Tuple2[Partial[NormalizedStatsOptions], CreateStatsOptionsContext], 
      Unit, 
      UnsetAdditionalOptions
    ]
  ]
  
  val statsPrinter: SyncHook[js.Tuple2[StatsPrinter, NormalizedStatsOptions], Unit, UnsetAdditionalOptions]
  
  val stillValidModule: SyncHook[js.Array[typings.webpack.mod.Module], Unit, UnsetAdditionalOptions]
  
  val succeedEntry: SyncHook[
    js.Tuple3[typings.webpack.mod.Dependency, EntryOptions, typings.webpack.mod.Module], 
    Unit, 
    UnsetAdditionalOptions
  ]
  
  val succeedModule: SyncHook[js.Array[typings.webpack.mod.Module], Unit, UnsetAdditionalOptions]
  
  val unseal: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
}
object ReadonlybuildModuleSyncHo {
  
  inline def apply(
    addEntry: SyncHook[
      js.Tuple2[typings.webpack.mod.Dependency, EntryOptions], 
      Unit, 
      UnsetAdditionalOptions
    ],
    additionalAssets: FakeHookPickAsyncSeriesHo,
    additionalChunkAssets: FakeHookPickAsyncSeriesHoName,
    additionalChunkRuntimeRequirements: SyncHook[
      js.Tuple3[typings.webpack.mod.Chunk, Set[String], RuntimeRequirementsContext], 
      Unit, 
      UnsetAdditionalOptions
    ],
    additionalModuleRuntimeRequirements: SyncHook[
      js.Tuple3[typings.webpack.mod.Module, Set[String], RuntimeRequirementsContext], 
      Unit, 
      UnsetAdditionalOptions
    ],
    additionalTreeRuntimeRequirements: SyncHook[
      js.Tuple3[typings.webpack.mod.Chunk, Set[String], RuntimeRequirementsContext], 
      Unit, 
      UnsetAdditionalOptions
    ],
    afterChunks: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Chunk]], Unit, UnsetAdditionalOptions],
    afterCodeGeneration: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    afterHash: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    afterModuleHash: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    afterOptimizeAssets: SyncHook[js.Array[CompilationAssets], Unit, UnsetAdditionalOptions],
    afterOptimizeChunkAssets: FakeHookPickAsyncSeriesHoName,
    afterOptimizeChunkIds: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Chunk]], Unit, UnsetAdditionalOptions],
    afterOptimizeChunkModules: SyncHook[
      js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], js.Iterable[typings.webpack.mod.Module]], 
      Unit, 
      UnsetAdditionalOptions
    ],
    afterOptimizeChunks: SyncHook[
      js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], js.Array[ChunkGroup]], 
      Unit, 
      UnsetAdditionalOptions
    ],
    afterOptimizeDependencies: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions],
    afterOptimizeModuleIds: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions],
    afterOptimizeModules: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions],
    afterOptimizeTree: SyncHook[
      js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], js.Iterable[typings.webpack.mod.Module]], 
      Unit, 
      UnsetAdditionalOptions
    ],
    afterProcessAssets: SyncHook[js.Array[CompilationAssets], Unit, UnsetAdditionalOptions],
    afterRuntimeRequirements: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    afterSeal: AsyncSeriesHook[js.Array[Any], UnsetAdditionalOptions],
    assetPath: SyncWaterfallHook[js.Tuple3[String, js.Object, AssetInfo], UnsetAdditionalOptions],
    beforeChunkAssets: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    beforeChunkIds: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Chunk]], Unit, UnsetAdditionalOptions],
    beforeChunks: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    beforeCodeGeneration: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    beforeHash: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    beforeModuleAssets: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    beforeModuleHash: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    beforeModuleIds: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions],
    beforeRuntimeRequirements: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    buildModule: SyncHook[js.Array[typings.webpack.mod.Module], Unit, UnsetAdditionalOptions],
    childCompiler: SyncHook[
      js.Tuple3[typings.webpack.mod.Compiler, String, Double], 
      Unit, 
      UnsetAdditionalOptions
    ],
    chunkAsset: SyncHook[js.Tuple2[typings.webpack.mod.Chunk, String], Unit, UnsetAdditionalOptions],
    chunkHash: SyncHook[
      js.Tuple3[typings.webpack.mod.Chunk, typings.webpack.mod.Hash, ChunkHashContext], 
      Unit, 
      UnsetAdditionalOptions
    ],
    chunkIds: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Chunk]], Unit, UnsetAdditionalOptions],
    contentHash: SyncHook[js.Array[typings.webpack.mod.Chunk], Unit, UnsetAdditionalOptions],
    dependencyReferencedExports: SyncWaterfallHook[
      js.Tuple3[
        js.Array[js.Array[String] | ReferencedExport], 
        typings.webpack.mod.Dependency, 
        RuntimeSpec
      ], 
      UnsetAdditionalOptions
    ],
    executeModule: SyncHook[js.Tuple2[ExecuteModuleArgument, ExecuteModuleContext], Unit, UnsetAdditionalOptions],
    failedEntry: SyncHook[
      js.Tuple3[typings.webpack.mod.Dependency, EntryOptions, js.Error], 
      Unit, 
      UnsetAdditionalOptions
    ],
    failedModule: SyncHook[js.Tuple2[typings.webpack.mod.Module, WebpackError], Unit, UnsetAdditionalOptions],
    finishModules: AsyncSeriesHook[js.Array[js.Iterable[typings.webpack.mod.Module]], UnsetAdditionalOptions],
    finishRebuildingModule: AsyncSeriesHook[js.Array[typings.webpack.mod.Module], UnsetAdditionalOptions],
    fullHash: SyncHook[js.Array[typings.webpack.mod.Hash], Unit, UnsetAdditionalOptions],
    log: SyncBailHook[js.Tuple2[String, LogEntry], `true`, UnsetAdditionalOptions],
    moduleAsset: SyncHook[js.Tuple2[typings.webpack.mod.Module, String], Unit, UnsetAdditionalOptions],
    moduleIds: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions],
    needAdditionalPass: SyncBailHook[js.Array[Any], Boolean, UnsetAdditionalOptions],
    needAdditionalSeal: SyncBailHook[js.Array[Any], Boolean, UnsetAdditionalOptions],
    normalModuleLoader: SyncHook[js.Tuple2[js.Object, NormalModule], Unit, UnsetAdditionalOptions],
    optimize: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    optimizeAssets: AsyncSeriesHook[js.Array[CompilationAssets], ProcessAssetsAdditionalOptions],
    optimizeChunkAssets: FakeHookPickAsyncSeriesHoName,
    optimizeChunkIds: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Chunk]], Unit, UnsetAdditionalOptions],
    optimizeChunkModules: AsyncSeriesBailHook[
      js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], js.Iterable[typings.webpack.mod.Module]], 
      Any, 
      UnsetAdditionalOptions
    ],
    optimizeChunks: SyncBailHook[
      js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], js.Array[ChunkGroup]], 
      Any, 
      UnsetAdditionalOptions
    ],
    optimizeCodeGeneration: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions],
    optimizeDependencies: SyncBailHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Any, UnsetAdditionalOptions],
    optimizeModuleIds: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions],
    optimizeModules: SyncBailHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Any, UnsetAdditionalOptions],
    optimizeTree: AsyncSeriesHook[
      js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], js.Iterable[typings.webpack.mod.Module]], 
      UnsetAdditionalOptions
    ],
    prepareModuleExecution: AsyncParallelHook[js.Tuple2[ExecuteModuleArgument, ExecuteModuleContext], UnsetAdditionalOptions],
    processAdditionalAssets: AsyncSeriesHook[js.Array[CompilationAssets], UnsetAdditionalOptions],
    processAssets: AsyncSeriesHook[js.Array[CompilationAssets], ProcessAssetsAdditionalOptions],
    processErrors: SyncWaterfallHook[js.Array[js.Array[WebpackError]], UnsetAdditionalOptions],
    processWarnings: SyncWaterfallHook[js.Array[js.Array[WebpackError]], UnsetAdditionalOptions],
    rebuildModule: SyncHook[js.Array[typings.webpack.mod.Module], Unit, UnsetAdditionalOptions],
    record: SyncHook[js.Tuple2[Compilation, Any], Unit, UnsetAdditionalOptions],
    recordChunks: SyncHook[js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], Any], Unit, UnsetAdditionalOptions],
    recordHash: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    recordModules: SyncHook[
      js.Tuple2[js.Iterable[typings.webpack.mod.Module], Any], 
      Unit, 
      UnsetAdditionalOptions
    ],
    renderManifest: SyncWaterfallHook[
      js.Tuple2[js.Array[RenderManifestEntry], RenderManifestOptions], 
      UnsetAdditionalOptions
    ],
    reviveChunks: SyncHook[js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], Any], Unit, UnsetAdditionalOptions],
    reviveModules: SyncHook[
      js.Tuple2[js.Iterable[typings.webpack.mod.Module], Any], 
      Unit, 
      UnsetAdditionalOptions
    ],
    runtimeModule: SyncHook[js.Tuple2[RuntimeModule, typings.webpack.mod.Chunk], Unit, UnsetAdditionalOptions],
    runtimeRequirementInChunk: HookMap[
      SyncBailHook[
        js.Tuple3[typings.webpack.mod.Chunk, Set[String], RuntimeRequirementsContext], 
        Any, 
        UnsetAdditionalOptions
      ]
    ],
    runtimeRequirementInModule: HookMap[
      SyncBailHook[
        js.Tuple3[typings.webpack.mod.Module, Set[String], RuntimeRequirementsContext], 
        Any, 
        UnsetAdditionalOptions
      ]
    ],
    runtimeRequirementInTree: HookMap[
      SyncBailHook[
        js.Tuple3[typings.webpack.mod.Chunk, Set[String], RuntimeRequirementsContext], 
        Any, 
        UnsetAdditionalOptions
      ]
    ],
    seal: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    shouldGenerateChunkAssets: SyncBailHook[js.Array[Any], Boolean, UnsetAdditionalOptions],
    shouldRecord: SyncBailHook[js.Array[Any], Boolean, UnsetAdditionalOptions],
    statsFactory: SyncHook[js.Tuple2[StatsFactory, NormalizedStatsOptions], Unit, UnsetAdditionalOptions],
    statsNormalize: SyncHook[
      js.Tuple2[Partial[NormalizedStatsOptions], CreateStatsOptionsContext], 
      Unit, 
      UnsetAdditionalOptions
    ],
    statsPreset: HookMap[
      SyncHook[
        js.Tuple2[Partial[NormalizedStatsOptions], CreateStatsOptionsContext], 
        Unit, 
        UnsetAdditionalOptions
      ]
    ],
    statsPrinter: SyncHook[js.Tuple2[StatsPrinter, NormalizedStatsOptions], Unit, UnsetAdditionalOptions],
    stillValidModule: SyncHook[js.Array[typings.webpack.mod.Module], Unit, UnsetAdditionalOptions],
    succeedEntry: SyncHook[
      js.Tuple3[typings.webpack.mod.Dependency, EntryOptions, typings.webpack.mod.Module], 
      Unit, 
      UnsetAdditionalOptions
    ],
    succeedModule: SyncHook[js.Array[typings.webpack.mod.Module], Unit, UnsetAdditionalOptions],
    unseal: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  ): ReadonlybuildModuleSyncHo = {
    val __obj = js.Dynamic.literal(addEntry = addEntry.asInstanceOf[js.Any], additionalAssets = additionalAssets.asInstanceOf[js.Any], additionalChunkAssets = additionalChunkAssets.asInstanceOf[js.Any], additionalChunkRuntimeRequirements = additionalChunkRuntimeRequirements.asInstanceOf[js.Any], additionalModuleRuntimeRequirements = additionalModuleRuntimeRequirements.asInstanceOf[js.Any], additionalTreeRuntimeRequirements = additionalTreeRuntimeRequirements.asInstanceOf[js.Any], afterChunks = afterChunks.asInstanceOf[js.Any], afterCodeGeneration = afterCodeGeneration.asInstanceOf[js.Any], afterHash = afterHash.asInstanceOf[js.Any], afterModuleHash = afterModuleHash.asInstanceOf[js.Any], afterOptimizeAssets = afterOptimizeAssets.asInstanceOf[js.Any], afterOptimizeChunkAssets = afterOptimizeChunkAssets.asInstanceOf[js.Any], afterOptimizeChunkIds = afterOptimizeChunkIds.asInstanceOf[js.Any], afterOptimizeChunkModules = afterOptimizeChunkModules.asInstanceOf[js.Any], afterOptimizeChunks = afterOptimizeChunks.asInstanceOf[js.Any], afterOptimizeDependencies = afterOptimizeDependencies.asInstanceOf[js.Any], afterOptimizeModuleIds = afterOptimizeModuleIds.asInstanceOf[js.Any], afterOptimizeModules = afterOptimizeModules.asInstanceOf[js.Any], afterOptimizeTree = afterOptimizeTree.asInstanceOf[js.Any], afterProcessAssets = afterProcessAssets.asInstanceOf[js.Any], afterRuntimeRequirements = afterRuntimeRequirements.asInstanceOf[js.Any], afterSeal = afterSeal.asInstanceOf[js.Any], assetPath = assetPath.asInstanceOf[js.Any], beforeChunkAssets = beforeChunkAssets.asInstanceOf[js.Any], beforeChunkIds = beforeChunkIds.asInstanceOf[js.Any], beforeChunks = beforeChunks.asInstanceOf[js.Any], beforeCodeGeneration = beforeCodeGeneration.asInstanceOf[js.Any], beforeHash = beforeHash.asInstanceOf[js.Any], beforeModuleAssets = beforeModuleAssets.asInstanceOf[js.Any], beforeModuleHash = beforeModuleHash.asInstanceOf[js.Any], beforeModuleIds = beforeModuleIds.asInstanceOf[js.Any], beforeRuntimeRequirements = beforeRuntimeRequirements.asInstanceOf[js.Any], buildModule = buildModule.asInstanceOf[js.Any], childCompiler = childCompiler.asInstanceOf[js.Any], chunkAsset = chunkAsset.asInstanceOf[js.Any], chunkHash = chunkHash.asInstanceOf[js.Any], chunkIds = chunkIds.asInstanceOf[js.Any], contentHash = contentHash.asInstanceOf[js.Any], dependencyReferencedExports = dependencyReferencedExports.asInstanceOf[js.Any], executeModule = executeModule.asInstanceOf[js.Any], failedEntry = failedEntry.asInstanceOf[js.Any], failedModule = failedModule.asInstanceOf[js.Any], finishModules = finishModules.asInstanceOf[js.Any], finishRebuildingModule = finishRebuildingModule.asInstanceOf[js.Any], fullHash = fullHash.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], moduleAsset = moduleAsset.asInstanceOf[js.Any], moduleIds = moduleIds.asInstanceOf[js.Any], needAdditionalPass = needAdditionalPass.asInstanceOf[js.Any], needAdditionalSeal = needAdditionalSeal.asInstanceOf[js.Any], normalModuleLoader = normalModuleLoader.asInstanceOf[js.Any], optimize = optimize.asInstanceOf[js.Any], optimizeAssets = optimizeAssets.asInstanceOf[js.Any], optimizeChunkAssets = optimizeChunkAssets.asInstanceOf[js.Any], optimizeChunkIds = optimizeChunkIds.asInstanceOf[js.Any], optimizeChunkModules = optimizeChunkModules.asInstanceOf[js.Any], optimizeChunks = optimizeChunks.asInstanceOf[js.Any], optimizeCodeGeneration = optimizeCodeGeneration.asInstanceOf[js.Any], optimizeDependencies = optimizeDependencies.asInstanceOf[js.Any], optimizeModuleIds = optimizeModuleIds.asInstanceOf[js.Any], optimizeModules = optimizeModules.asInstanceOf[js.Any], optimizeTree = optimizeTree.asInstanceOf[js.Any], prepareModuleExecution = prepareModuleExecution.asInstanceOf[js.Any], processAdditionalAssets = processAdditionalAssets.asInstanceOf[js.Any], processAssets = processAssets.asInstanceOf[js.Any], processErrors = processErrors.asInstanceOf[js.Any], processWarnings = processWarnings.asInstanceOf[js.Any], rebuildModule = rebuildModule.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any], recordChunks = recordChunks.asInstanceOf[js.Any], recordHash = recordHash.asInstanceOf[js.Any], recordModules = recordModules.asInstanceOf[js.Any], renderManifest = renderManifest.asInstanceOf[js.Any], reviveChunks = reviveChunks.asInstanceOf[js.Any], reviveModules = reviveModules.asInstanceOf[js.Any], runtimeModule = runtimeModule.asInstanceOf[js.Any], runtimeRequirementInChunk = runtimeRequirementInChunk.asInstanceOf[js.Any], runtimeRequirementInModule = runtimeRequirementInModule.asInstanceOf[js.Any], runtimeRequirementInTree = runtimeRequirementInTree.asInstanceOf[js.Any], seal = seal.asInstanceOf[js.Any], shouldGenerateChunkAssets = shouldGenerateChunkAssets.asInstanceOf[js.Any], shouldRecord = shouldRecord.asInstanceOf[js.Any], statsFactory = statsFactory.asInstanceOf[js.Any], statsNormalize = statsNormalize.asInstanceOf[js.Any], statsPreset = statsPreset.asInstanceOf[js.Any], statsPrinter = statsPrinter.asInstanceOf[js.Any], stillValidModule = stillValidModule.asInstanceOf[js.Any], succeedEntry = succeedEntry.asInstanceOf[js.Any], succeedModule = succeedModule.asInstanceOf[js.Any], unseal = unseal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlybuildModuleSyncHo]
  }
  
  extension [Self <: ReadonlybuildModuleSyncHo](x: Self) {
    
    inline def setAddEntry(
      value: SyncHook[
          js.Tuple2[typings.webpack.mod.Dependency, EntryOptions], 
          Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "addEntry", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAssets(value: FakeHookPickAsyncSeriesHo): Self = StObject.set(x, "additionalAssets", value.asInstanceOf[js.Any])
    
    inline def setAdditionalChunkAssets(value: FakeHookPickAsyncSeriesHoName): Self = StObject.set(x, "additionalChunkAssets", value.asInstanceOf[js.Any])
    
    inline def setAdditionalChunkRuntimeRequirements(
      value: SyncHook[
          js.Tuple3[typings.webpack.mod.Chunk, Set[String], RuntimeRequirementsContext], 
          Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "additionalChunkRuntimeRequirements", value.asInstanceOf[js.Any])
    
    inline def setAdditionalModuleRuntimeRequirements(
      value: SyncHook[
          js.Tuple3[typings.webpack.mod.Module, Set[String], RuntimeRequirementsContext], 
          Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "additionalModuleRuntimeRequirements", value.asInstanceOf[js.Any])
    
    inline def setAdditionalTreeRuntimeRequirements(
      value: SyncHook[
          js.Tuple3[typings.webpack.mod.Chunk, Set[String], RuntimeRequirementsContext], 
          Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "additionalTreeRuntimeRequirements", value.asInstanceOf[js.Any])
    
    inline def setAfterChunks(value: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Chunk]], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "afterChunks", value.asInstanceOf[js.Any])
    
    inline def setAfterCodeGeneration(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "afterCodeGeneration", value.asInstanceOf[js.Any])
    
    inline def setAfterHash(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "afterHash", value.asInstanceOf[js.Any])
    
    inline def setAfterModuleHash(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "afterModuleHash", value.asInstanceOf[js.Any])
    
    inline def setAfterOptimizeAssets(value: SyncHook[js.Array[CompilationAssets], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "afterOptimizeAssets", value.asInstanceOf[js.Any])
    
    inline def setAfterOptimizeChunkAssets(value: FakeHookPickAsyncSeriesHoName): Self = StObject.set(x, "afterOptimizeChunkAssets", value.asInstanceOf[js.Any])
    
    inline def setAfterOptimizeChunkIds(value: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Chunk]], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "afterOptimizeChunkIds", value.asInstanceOf[js.Any])
    
    inline def setAfterOptimizeChunkModules(
      value: SyncHook[
          js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], js.Iterable[typings.webpack.mod.Module]], 
          Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "afterOptimizeChunkModules", value.asInstanceOf[js.Any])
    
    inline def setAfterOptimizeChunks(
      value: SyncHook[
          js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], js.Array[ChunkGroup]], 
          Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "afterOptimizeChunks", value.asInstanceOf[js.Any])
    
    inline def setAfterOptimizeDependencies(value: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "afterOptimizeDependencies", value.asInstanceOf[js.Any])
    
    inline def setAfterOptimizeModuleIds(value: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "afterOptimizeModuleIds", value.asInstanceOf[js.Any])
    
    inline def setAfterOptimizeModules(value: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "afterOptimizeModules", value.asInstanceOf[js.Any])
    
    inline def setAfterOptimizeTree(
      value: SyncHook[
          js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], js.Iterable[typings.webpack.mod.Module]], 
          Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "afterOptimizeTree", value.asInstanceOf[js.Any])
    
    inline def setAfterProcessAssets(value: SyncHook[js.Array[CompilationAssets], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "afterProcessAssets", value.asInstanceOf[js.Any])
    
    inline def setAfterRuntimeRequirements(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "afterRuntimeRequirements", value.asInstanceOf[js.Any])
    
    inline def setAfterSeal(value: AsyncSeriesHook[js.Array[Any], UnsetAdditionalOptions]): Self = StObject.set(x, "afterSeal", value.asInstanceOf[js.Any])
    
    inline def setAssetPath(value: SyncWaterfallHook[js.Tuple3[String, js.Object, AssetInfo], UnsetAdditionalOptions]): Self = StObject.set(x, "assetPath", value.asInstanceOf[js.Any])
    
    inline def setBeforeChunkAssets(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "beforeChunkAssets", value.asInstanceOf[js.Any])
    
    inline def setBeforeChunkIds(value: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Chunk]], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "beforeChunkIds", value.asInstanceOf[js.Any])
    
    inline def setBeforeChunks(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "beforeChunks", value.asInstanceOf[js.Any])
    
    inline def setBeforeCodeGeneration(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "beforeCodeGeneration", value.asInstanceOf[js.Any])
    
    inline def setBeforeHash(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "beforeHash", value.asInstanceOf[js.Any])
    
    inline def setBeforeModuleAssets(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "beforeModuleAssets", value.asInstanceOf[js.Any])
    
    inline def setBeforeModuleHash(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "beforeModuleHash", value.asInstanceOf[js.Any])
    
    inline def setBeforeModuleIds(value: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "beforeModuleIds", value.asInstanceOf[js.Any])
    
    inline def setBeforeRuntimeRequirements(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "beforeRuntimeRequirements", value.asInstanceOf[js.Any])
    
    inline def setBuildModule(value: SyncHook[js.Array[typings.webpack.mod.Module], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "buildModule", value.asInstanceOf[js.Any])
    
    inline def setChildCompiler(
      value: SyncHook[
          js.Tuple3[typings.webpack.mod.Compiler, String, Double], 
          Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "childCompiler", value.asInstanceOf[js.Any])
    
    inline def setChunkAsset(value: SyncHook[js.Tuple2[typings.webpack.mod.Chunk, String], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "chunkAsset", value.asInstanceOf[js.Any])
    
    inline def setChunkHash(
      value: SyncHook[
          js.Tuple3[typings.webpack.mod.Chunk, typings.webpack.mod.Hash, ChunkHashContext], 
          Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "chunkHash", value.asInstanceOf[js.Any])
    
    inline def setChunkIds(value: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Chunk]], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "chunkIds", value.asInstanceOf[js.Any])
    
    inline def setContentHash(value: SyncHook[js.Array[typings.webpack.mod.Chunk], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "contentHash", value.asInstanceOf[js.Any])
    
    inline def setDependencyReferencedExports(
      value: SyncWaterfallHook[
          js.Tuple3[
            js.Array[js.Array[String] | ReferencedExport], 
            typings.webpack.mod.Dependency, 
            RuntimeSpec
          ], 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "dependencyReferencedExports", value.asInstanceOf[js.Any])
    
    inline def setExecuteModule(
      value: SyncHook[js.Tuple2[ExecuteModuleArgument, ExecuteModuleContext], Unit, UnsetAdditionalOptions]
    ): Self = StObject.set(x, "executeModule", value.asInstanceOf[js.Any])
    
    inline def setFailedEntry(
      value: SyncHook[
          js.Tuple3[typings.webpack.mod.Dependency, EntryOptions, js.Error], 
          Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "failedEntry", value.asInstanceOf[js.Any])
    
    inline def setFailedModule(value: SyncHook[js.Tuple2[typings.webpack.mod.Module, WebpackError], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "failedModule", value.asInstanceOf[js.Any])
    
    inline def setFinishModules(value: AsyncSeriesHook[js.Array[js.Iterable[typings.webpack.mod.Module]], UnsetAdditionalOptions]): Self = StObject.set(x, "finishModules", value.asInstanceOf[js.Any])
    
    inline def setFinishRebuildingModule(value: AsyncSeriesHook[js.Array[typings.webpack.mod.Module], UnsetAdditionalOptions]): Self = StObject.set(x, "finishRebuildingModule", value.asInstanceOf[js.Any])
    
    inline def setFullHash(value: SyncHook[js.Array[typings.webpack.mod.Hash], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "fullHash", value.asInstanceOf[js.Any])
    
    inline def setLog(value: SyncBailHook[js.Tuple2[String, LogEntry], `true`, UnsetAdditionalOptions]): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setModuleAsset(value: SyncHook[js.Tuple2[typings.webpack.mod.Module, String], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "moduleAsset", value.asInstanceOf[js.Any])
    
    inline def setModuleIds(value: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "moduleIds", value.asInstanceOf[js.Any])
    
    inline def setNeedAdditionalPass(value: SyncBailHook[js.Array[Any], Boolean, UnsetAdditionalOptions]): Self = StObject.set(x, "needAdditionalPass", value.asInstanceOf[js.Any])
    
    inline def setNeedAdditionalSeal(value: SyncBailHook[js.Array[Any], Boolean, UnsetAdditionalOptions]): Self = StObject.set(x, "needAdditionalSeal", value.asInstanceOf[js.Any])
    
    inline def setNormalModuleLoader(value: SyncHook[js.Tuple2[js.Object, NormalModule], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "normalModuleLoader", value.asInstanceOf[js.Any])
    
    inline def setOptimize(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
    
    inline def setOptimizeAssets(value: AsyncSeriesHook[js.Array[CompilationAssets], ProcessAssetsAdditionalOptions]): Self = StObject.set(x, "optimizeAssets", value.asInstanceOf[js.Any])
    
    inline def setOptimizeChunkAssets(value: FakeHookPickAsyncSeriesHoName): Self = StObject.set(x, "optimizeChunkAssets", value.asInstanceOf[js.Any])
    
    inline def setOptimizeChunkIds(value: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Chunk]], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "optimizeChunkIds", value.asInstanceOf[js.Any])
    
    inline def setOptimizeChunkModules(
      value: AsyncSeriesBailHook[
          js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], js.Iterable[typings.webpack.mod.Module]], 
          Any, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "optimizeChunkModules", value.asInstanceOf[js.Any])
    
    inline def setOptimizeChunks(
      value: SyncBailHook[
          js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], js.Array[ChunkGroup]], 
          Any, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "optimizeChunks", value.asInstanceOf[js.Any])
    
    inline def setOptimizeCodeGeneration(value: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "optimizeCodeGeneration", value.asInstanceOf[js.Any])
    
    inline def setOptimizeDependencies(
      value: SyncBailHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Any, UnsetAdditionalOptions]
    ): Self = StObject.set(x, "optimizeDependencies", value.asInstanceOf[js.Any])
    
    inline def setOptimizeModuleIds(value: SyncHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "optimizeModuleIds", value.asInstanceOf[js.Any])
    
    inline def setOptimizeModules(
      value: SyncBailHook[js.Array[js.Iterable[typings.webpack.mod.Module]], Any, UnsetAdditionalOptions]
    ): Self = StObject.set(x, "optimizeModules", value.asInstanceOf[js.Any])
    
    inline def setOptimizeTree(
      value: AsyncSeriesHook[
          js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], js.Iterable[typings.webpack.mod.Module]], 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "optimizeTree", value.asInstanceOf[js.Any])
    
    inline def setPrepareModuleExecution(
      value: AsyncParallelHook[js.Tuple2[ExecuteModuleArgument, ExecuteModuleContext], UnsetAdditionalOptions]
    ): Self = StObject.set(x, "prepareModuleExecution", value.asInstanceOf[js.Any])
    
    inline def setProcessAdditionalAssets(value: AsyncSeriesHook[js.Array[CompilationAssets], UnsetAdditionalOptions]): Self = StObject.set(x, "processAdditionalAssets", value.asInstanceOf[js.Any])
    
    inline def setProcessAssets(value: AsyncSeriesHook[js.Array[CompilationAssets], ProcessAssetsAdditionalOptions]): Self = StObject.set(x, "processAssets", value.asInstanceOf[js.Any])
    
    inline def setProcessErrors(value: SyncWaterfallHook[js.Array[js.Array[WebpackError]], UnsetAdditionalOptions]): Self = StObject.set(x, "processErrors", value.asInstanceOf[js.Any])
    
    inline def setProcessWarnings(value: SyncWaterfallHook[js.Array[js.Array[WebpackError]], UnsetAdditionalOptions]): Self = StObject.set(x, "processWarnings", value.asInstanceOf[js.Any])
    
    inline def setRebuildModule(value: SyncHook[js.Array[typings.webpack.mod.Module], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "rebuildModule", value.asInstanceOf[js.Any])
    
    inline def setRecord(value: SyncHook[js.Tuple2[Compilation, Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    inline def setRecordChunks(
      value: SyncHook[js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], Any], Unit, UnsetAdditionalOptions]
    ): Self = StObject.set(x, "recordChunks", value.asInstanceOf[js.Any])
    
    inline def setRecordHash(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "recordHash", value.asInstanceOf[js.Any])
    
    inline def setRecordModules(
      value: SyncHook[
          js.Tuple2[js.Iterable[typings.webpack.mod.Module], Any], 
          Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "recordModules", value.asInstanceOf[js.Any])
    
    inline def setRenderManifest(
      value: SyncWaterfallHook[
          js.Tuple2[js.Array[RenderManifestEntry], RenderManifestOptions], 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "renderManifest", value.asInstanceOf[js.Any])
    
    inline def setReviveChunks(
      value: SyncHook[js.Tuple2[js.Iterable[typings.webpack.mod.Chunk], Any], Unit, UnsetAdditionalOptions]
    ): Self = StObject.set(x, "reviveChunks", value.asInstanceOf[js.Any])
    
    inline def setReviveModules(
      value: SyncHook[
          js.Tuple2[js.Iterable[typings.webpack.mod.Module], Any], 
          Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "reviveModules", value.asInstanceOf[js.Any])
    
    inline def setRuntimeModule(value: SyncHook[js.Tuple2[RuntimeModule, typings.webpack.mod.Chunk], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "runtimeModule", value.asInstanceOf[js.Any])
    
    inline def setRuntimeRequirementInChunk(
      value: HookMap[
          SyncBailHook[
            js.Tuple3[typings.webpack.mod.Chunk, Set[String], RuntimeRequirementsContext], 
            Any, 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "runtimeRequirementInChunk", value.asInstanceOf[js.Any])
    
    inline def setRuntimeRequirementInModule(
      value: HookMap[
          SyncBailHook[
            js.Tuple3[typings.webpack.mod.Module, Set[String], RuntimeRequirementsContext], 
            Any, 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "runtimeRequirementInModule", value.asInstanceOf[js.Any])
    
    inline def setRuntimeRequirementInTree(
      value: HookMap[
          SyncBailHook[
            js.Tuple3[typings.webpack.mod.Chunk, Set[String], RuntimeRequirementsContext], 
            Any, 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "runtimeRequirementInTree", value.asInstanceOf[js.Any])
    
    inline def setSeal(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "seal", value.asInstanceOf[js.Any])
    
    inline def setShouldGenerateChunkAssets(value: SyncBailHook[js.Array[Any], Boolean, UnsetAdditionalOptions]): Self = StObject.set(x, "shouldGenerateChunkAssets", value.asInstanceOf[js.Any])
    
    inline def setShouldRecord(value: SyncBailHook[js.Array[Any], Boolean, UnsetAdditionalOptions]): Self = StObject.set(x, "shouldRecord", value.asInstanceOf[js.Any])
    
    inline def setStatsFactory(value: SyncHook[js.Tuple2[StatsFactory, NormalizedStatsOptions], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "statsFactory", value.asInstanceOf[js.Any])
    
    inline def setStatsNormalize(
      value: SyncHook[
          js.Tuple2[Partial[NormalizedStatsOptions], CreateStatsOptionsContext], 
          Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "statsNormalize", value.asInstanceOf[js.Any])
    
    inline def setStatsPreset(
      value: HookMap[
          SyncHook[
            js.Tuple2[Partial[NormalizedStatsOptions], CreateStatsOptionsContext], 
            Unit, 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "statsPreset", value.asInstanceOf[js.Any])
    
    inline def setStatsPrinter(value: SyncHook[js.Tuple2[StatsPrinter, NormalizedStatsOptions], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "statsPrinter", value.asInstanceOf[js.Any])
    
    inline def setStillValidModule(value: SyncHook[js.Array[typings.webpack.mod.Module], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "stillValidModule", value.asInstanceOf[js.Any])
    
    inline def setSucceedEntry(
      value: SyncHook[
          js.Tuple3[typings.webpack.mod.Dependency, EntryOptions, typings.webpack.mod.Module], 
          Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "succeedEntry", value.asInstanceOf[js.Any])
    
    inline def setSucceedModule(value: SyncHook[js.Array[typings.webpack.mod.Module], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "succeedModule", value.asInstanceOf[js.Any])
    
    inline def setUnseal(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "unseal", value.asInstanceOf[js.Any])
  }
}
