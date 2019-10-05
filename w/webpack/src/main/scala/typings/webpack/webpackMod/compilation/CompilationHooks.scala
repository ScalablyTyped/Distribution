package typings.webpack.webpackMod.compilation

import typings.std.Error
import typings.tapable.tapableMod.AsyncSeriesHook
import typings.tapable.tapableMod.SyncBailHook
import typings.tapable.tapableMod.SyncHook
import typings.tapable.tapableMod.SyncWaterfallHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilationHooks extends js.Object {
  var additionalAssets: AsyncSeriesHook[_, _, _]
  var additionalChunkAssets: SyncHook[js.Array[Chunk], _, _]
  var advancedOptimizeModuleOrder: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _]
  var afterHash: SyncHook[_, _, _]
  var afterOptimizeAssets: SyncHook[js.Array[Asset], _, _]
  var afterOptimizeChunkAssets: SyncHook[js.Array[Chunk], _, _]
  var afterOptimizeChunkIds: SyncHook[js.Array[Chunk], _, _]
  var afterOptimizeChunkModules: SyncHook[js.Array[Chunk], js.Array[typings.webpack.webpackMod.compilation.Module], _]
  var afterOptimizeChunks: SyncHook[js.Array[Chunk], js.Array[ChunkGroup], _]
  var afterOptimizeDependencies: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _]
  var afterOptimizeExtractedChunks: SyncHook[js.Array[Chunk], _, _]
  var afterOptimizeModuleIds: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _]
  var afterOptimizeModules: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _]
  var afterOptimizeTree: SyncHook[js.Array[Chunk], js.Array[typings.webpack.webpackMod.compilation.Module], _]
  var afterSeal: AsyncSeriesHook[_, _, _]
  var assetPath: SyncWaterfallHook[String, _, _]
  var beforeChunkAssets: SyncHook[_, _, _]
  var beforeChunkIds: SyncHook[js.Array[Chunk], _, _]
  var beforeHash: SyncHook[_, _, _]
  var beforeModuleAssets: SyncHook[_, _, _]
  var beforeModuleIds: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _]
  var buildModule: SyncHook[typings.webpack.webpackMod.compilation.Module, _, _]
  var childCompiler: SyncHook[_, _, _]
  var chunkAsset: SyncHook[Chunk, String, _]
  var chunkHash: SyncHook[Chunk, ChunkHash, _]
  var failedModule: SyncHook[typings.webpack.webpackMod.compilation.Module, Error, _]
  var finishModules: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _]
  var finishRebuildingModule: SyncHook[typings.webpack.webpackMod.compilation.Module, _, _]
  var moduleAsset: SyncHook[typings.webpack.webpackMod.compilation.Module, String, _]
  var moduleIds: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _]
  var needAdditionalPass: SyncBailHook[_, _, _, _]
  var needAdditionalSeal: SyncBailHook[_, _, _, _]
  var normalModuleLoader: SyncHook[_, typings.webpack.webpackMod.compilation.Module, _]
  var optimize: SyncHook[_, _, _]
  var optimizeAssets: AsyncSeriesHook[js.Array[Asset], _, _]
  var optimizeChunkAssets: AsyncSeriesHook[js.Array[Chunk], _, _]
  var optimizeChunkIds: SyncHook[js.Array[Chunk], _, _]
  var optimizeChunkModules: SyncBailHook[js.Array[Chunk], js.Array[typings.webpack.webpackMod.compilation.Module], _, _]
  var optimizeChunkModulesAdvanced: SyncBailHook[js.Array[Chunk], js.Array[typings.webpack.webpackMod.compilation.Module], _, _]
  var optimizeChunkModulesBasic: SyncBailHook[js.Array[Chunk], js.Array[typings.webpack.webpackMod.compilation.Module], _, _]
  var optimizeChunkOrder: SyncHook[js.Array[Chunk], _, _]
  var optimizeChunks: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _]
  var optimizeChunksAdvanced: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _]
  var optimizeChunksBasic: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _]
  var optimizeDependencies: SyncBailHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _, _]
  var optimizeDependenciesAdvanced: SyncBailHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _, _]
  var optimizeDependenciesBasic: SyncBailHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _, _]
  var optimizeExtractedChunks: SyncBailHook[js.Array[Chunk], _, _, _]
  var optimizeExtractedChunksAdvanced: SyncBailHook[js.Array[Chunk], _, _, _]
  var optimizeExtractedChunksBasic: SyncBailHook[js.Array[Chunk], _, _, _]
  var optimizeModuleIds: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _]
  var optimizeModuleOrder: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _]
  var optimizeModules: SyncBailHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _, _]
  var optimizeModulesAdvanced: SyncBailHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _, _]
  var optimizeModulesBasic: SyncBailHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _, _]
  var optimizeTree: AsyncSeriesHook[js.Array[Chunk], js.Array[typings.webpack.webpackMod.compilation.Module], _]
  var rebuildModule: SyncHook[typings.webpack.webpackMod.compilation.Module, _, _]
  var record: SyncHook[Compilation, js.Array[Record], _]
  var recordChunks: SyncHook[js.Array[Chunk], js.Array[Record], _]
  var recordHash: SyncHook[js.Array[Record], _, _]
  var recordModules: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], js.Array[Record], _]
  var records: SyncHook[Compilation, js.Array[Record], _]
  var reviveChunks: SyncHook[js.Array[Chunk], js.Array[Record], _]
  var reviveModules: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], js.Array[Record], _]
  var seal: SyncHook[_, _, _]
  var shouldGenerateChunkAssets: SyncBailHook[_, _, _, _]
  var shouldRecord: SyncBailHook[_, _, _, _]
  var succeedModule: SyncHook[typings.webpack.webpackMod.compilation.Module, _, _]
  var unseal: SyncHook[_, _, _]
}

object CompilationHooks {
  @scala.inline
  def apply(
    additionalAssets: AsyncSeriesHook[_, _, _],
    additionalChunkAssets: SyncHook[js.Array[Chunk], _, _],
    advancedOptimizeModuleOrder: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _],
    afterHash: SyncHook[_, _, _],
    afterOptimizeAssets: SyncHook[js.Array[Asset], _, _],
    afterOptimizeChunkAssets: SyncHook[js.Array[Chunk], _, _],
    afterOptimizeChunkIds: SyncHook[js.Array[Chunk], _, _],
    afterOptimizeChunkModules: SyncHook[js.Array[Chunk], js.Array[typings.webpack.webpackMod.compilation.Module], _],
    afterOptimizeChunks: SyncHook[js.Array[Chunk], js.Array[ChunkGroup], _],
    afterOptimizeDependencies: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _],
    afterOptimizeExtractedChunks: SyncHook[js.Array[Chunk], _, _],
    afterOptimizeModuleIds: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _],
    afterOptimizeModules: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _],
    afterOptimizeTree: SyncHook[js.Array[Chunk], js.Array[typings.webpack.webpackMod.compilation.Module], _],
    afterSeal: AsyncSeriesHook[_, _, _],
    assetPath: SyncWaterfallHook[String, _, _],
    beforeChunkAssets: SyncHook[_, _, _],
    beforeChunkIds: SyncHook[js.Array[Chunk], _, _],
    beforeHash: SyncHook[_, _, _],
    beforeModuleAssets: SyncHook[_, _, _],
    beforeModuleIds: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _],
    buildModule: SyncHook[typings.webpack.webpackMod.compilation.Module, _, _],
    childCompiler: SyncHook[_, _, _],
    chunkAsset: SyncHook[Chunk, String, _],
    chunkHash: SyncHook[Chunk, ChunkHash, _],
    failedModule: SyncHook[typings.webpack.webpackMod.compilation.Module, Error, _],
    finishModules: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _],
    finishRebuildingModule: SyncHook[typings.webpack.webpackMod.compilation.Module, _, _],
    moduleAsset: SyncHook[typings.webpack.webpackMod.compilation.Module, String, _],
    moduleIds: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _],
    needAdditionalPass: SyncBailHook[_, _, _, _],
    needAdditionalSeal: SyncBailHook[_, _, _, _],
    normalModuleLoader: SyncHook[_, typings.webpack.webpackMod.compilation.Module, _],
    optimize: SyncHook[_, _, _],
    optimizeAssets: AsyncSeriesHook[js.Array[Asset], _, _],
    optimizeChunkAssets: AsyncSeriesHook[js.Array[Chunk], _, _],
    optimizeChunkIds: SyncHook[js.Array[Chunk], _, _],
    optimizeChunkModules: SyncBailHook[js.Array[Chunk], js.Array[typings.webpack.webpackMod.compilation.Module], _, _],
    optimizeChunkModulesAdvanced: SyncBailHook[js.Array[Chunk], js.Array[typings.webpack.webpackMod.compilation.Module], _, _],
    optimizeChunkModulesBasic: SyncBailHook[js.Array[Chunk], js.Array[typings.webpack.webpackMod.compilation.Module], _, _],
    optimizeChunkOrder: SyncHook[js.Array[Chunk], _, _],
    optimizeChunks: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _],
    optimizeChunksAdvanced: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _],
    optimizeChunksBasic: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _],
    optimizeDependencies: SyncBailHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _, _],
    optimizeDependenciesAdvanced: SyncBailHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _, _],
    optimizeDependenciesBasic: SyncBailHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _, _],
    optimizeExtractedChunks: SyncBailHook[js.Array[Chunk], _, _, _],
    optimizeExtractedChunksAdvanced: SyncBailHook[js.Array[Chunk], _, _, _],
    optimizeExtractedChunksBasic: SyncBailHook[js.Array[Chunk], _, _, _],
    optimizeModuleIds: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _],
    optimizeModuleOrder: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _],
    optimizeModules: SyncBailHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _, _],
    optimizeModulesAdvanced: SyncBailHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _, _],
    optimizeModulesBasic: SyncBailHook[js.Array[typings.webpack.webpackMod.compilation.Module], _, _, _],
    optimizeTree: AsyncSeriesHook[js.Array[Chunk], js.Array[typings.webpack.webpackMod.compilation.Module], _],
    rebuildModule: SyncHook[typings.webpack.webpackMod.compilation.Module, _, _],
    record: SyncHook[Compilation, js.Array[Record], _],
    recordChunks: SyncHook[js.Array[Chunk], js.Array[Record], _],
    recordHash: SyncHook[js.Array[Record], _, _],
    recordModules: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], js.Array[Record], _],
    records: SyncHook[Compilation, js.Array[Record], _],
    reviveChunks: SyncHook[js.Array[Chunk], js.Array[Record], _],
    reviveModules: SyncHook[js.Array[typings.webpack.webpackMod.compilation.Module], js.Array[Record], _],
    seal: SyncHook[_, _, _],
    shouldGenerateChunkAssets: SyncBailHook[_, _, _, _],
    shouldRecord: SyncBailHook[_, _, _, _],
    succeedModule: SyncHook[typings.webpack.webpackMod.compilation.Module, _, _],
    unseal: SyncHook[_, _, _]
  ): CompilationHooks = {
    val __obj = js.Dynamic.literal(additionalAssets = additionalAssets, additionalChunkAssets = additionalChunkAssets, advancedOptimizeModuleOrder = advancedOptimizeModuleOrder, afterHash = afterHash, afterOptimizeAssets = afterOptimizeAssets, afterOptimizeChunkAssets = afterOptimizeChunkAssets, afterOptimizeChunkIds = afterOptimizeChunkIds, afterOptimizeChunkModules = afterOptimizeChunkModules, afterOptimizeChunks = afterOptimizeChunks, afterOptimizeDependencies = afterOptimizeDependencies, afterOptimizeExtractedChunks = afterOptimizeExtractedChunks, afterOptimizeModuleIds = afterOptimizeModuleIds, afterOptimizeModules = afterOptimizeModules, afterOptimizeTree = afterOptimizeTree, afterSeal = afterSeal, assetPath = assetPath, beforeChunkAssets = beforeChunkAssets, beforeChunkIds = beforeChunkIds, beforeHash = beforeHash, beforeModuleAssets = beforeModuleAssets, beforeModuleIds = beforeModuleIds, buildModule = buildModule, childCompiler = childCompiler, chunkAsset = chunkAsset, chunkHash = chunkHash, failedModule = failedModule, finishModules = finishModules, finishRebuildingModule = finishRebuildingModule, moduleAsset = moduleAsset, moduleIds = moduleIds, needAdditionalPass = needAdditionalPass, needAdditionalSeal = needAdditionalSeal, normalModuleLoader = normalModuleLoader, optimize = optimize, optimizeAssets = optimizeAssets, optimizeChunkAssets = optimizeChunkAssets, optimizeChunkIds = optimizeChunkIds, optimizeChunkModules = optimizeChunkModules, optimizeChunkModulesAdvanced = optimizeChunkModulesAdvanced, optimizeChunkModulesBasic = optimizeChunkModulesBasic, optimizeChunkOrder = optimizeChunkOrder, optimizeChunks = optimizeChunks, optimizeChunksAdvanced = optimizeChunksAdvanced, optimizeChunksBasic = optimizeChunksBasic, optimizeDependencies = optimizeDependencies, optimizeDependenciesAdvanced = optimizeDependenciesAdvanced, optimizeDependenciesBasic = optimizeDependenciesBasic, optimizeExtractedChunks = optimizeExtractedChunks, optimizeExtractedChunksAdvanced = optimizeExtractedChunksAdvanced, optimizeExtractedChunksBasic = optimizeExtractedChunksBasic, optimizeModuleIds = optimizeModuleIds, optimizeModuleOrder = optimizeModuleOrder, optimizeModules = optimizeModules, optimizeModulesAdvanced = optimizeModulesAdvanced, optimizeModulesBasic = optimizeModulesBasic, optimizeTree = optimizeTree, rebuildModule = rebuildModule, record = record, recordChunks = recordChunks, recordHash = recordHash, recordModules = recordModules, records = records, reviveChunks = reviveChunks, reviveModules = reviveModules, seal = seal, shouldGenerateChunkAssets = shouldGenerateChunkAssets, shouldRecord = shouldRecord, succeedModule = succeedModule, unseal = unseal)
  
    __obj.asInstanceOf[CompilationHooks]
  }
}

