package typings
package webpackLib.webpackMod.webpackNs.compilationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var failedModule: tapableLib.tapableMod.SyncHook[Module, nodeLib.Error, _]
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

object CompilationHooks {
  @scala.inline
  def apply(
    additionalAssets: tapableLib.tapableMod.AsyncSeriesHook[_, _, _],
    additionalChunkAssets: tapableLib.tapableMod.SyncHook[js.Array[Chunk], _, _],
    advancedOptimizeModuleOrder: tapableLib.tapableMod.SyncHook[js.Array[Module], _, _],
    afterHash: tapableLib.tapableMod.SyncHook[_, _, _],
    afterOptimizeAssets: tapableLib.tapableMod.SyncHook[js.Array[Asset], _, _],
    afterOptimizeChunkAssets: tapableLib.tapableMod.SyncHook[js.Array[Chunk], _, _],
    afterOptimizeChunkIds: tapableLib.tapableMod.SyncHook[js.Array[Chunk], _, _],
    afterOptimizeChunkModules: tapableLib.tapableMod.SyncHook[js.Array[Chunk], js.Array[Module], _],
    afterOptimizeChunks: tapableLib.tapableMod.SyncHook[js.Array[Chunk], js.Array[ChunkGroup], _],
    afterOptimizeDependencies: tapableLib.tapableMod.SyncHook[js.Array[Module], _, _],
    afterOptimizeExtractedChunks: tapableLib.tapableMod.SyncHook[js.Array[Chunk], _, _],
    afterOptimizeModuleIds: tapableLib.tapableMod.SyncHook[js.Array[Module], _, _],
    afterOptimizeModules: tapableLib.tapableMod.SyncHook[js.Array[Module], _, _],
    afterOptimizeTree: tapableLib.tapableMod.SyncHook[js.Array[Chunk], js.Array[Module], _],
    afterSeal: tapableLib.tapableMod.AsyncSeriesHook[_, _, _],
    assetPath: tapableLib.tapableMod.SyncWaterfallHook[java.lang.String, _, _],
    beforeChunkAssets: tapableLib.tapableMod.SyncHook[_, _, _],
    beforeChunkIds: tapableLib.tapableMod.SyncHook[js.Array[Chunk], _, _],
    beforeHash: tapableLib.tapableMod.SyncHook[_, _, _],
    beforeModuleAssets: tapableLib.tapableMod.SyncHook[_, _, _],
    beforeModuleIds: tapableLib.tapableMod.SyncHook[js.Array[Module], _, _],
    buildModule: tapableLib.tapableMod.SyncHook[Module, _, _],
    childCompiler: tapableLib.tapableMod.SyncHook[_, _, _],
    chunkAsset: tapableLib.tapableMod.SyncHook[Chunk, java.lang.String, _],
    chunkHash: tapableLib.tapableMod.SyncHook[Chunk, ChunkHash, _],
    failedModule: tapableLib.tapableMod.SyncHook[Module, nodeLib.Error, _],
    finishModules: tapableLib.tapableMod.SyncHook[js.Array[Module], _, _],
    finishRebuildingModule: tapableLib.tapableMod.SyncHook[Module, _, _],
    moduleAsset: tapableLib.tapableMod.SyncHook[Module, java.lang.String, _],
    moduleIds: tapableLib.tapableMod.SyncHook[js.Array[Module], _, _],
    needAdditionalPass: tapableLib.tapableMod.SyncBailHook[_, _, _, _],
    needAdditionalSeal: tapableLib.tapableMod.SyncBailHook[_, _, _, _],
    normalModuleLoader: tapableLib.tapableMod.SyncHook[_, Module, _],
    optimize: tapableLib.tapableMod.SyncHook[_, _, _],
    optimizeAssets: tapableLib.tapableMod.AsyncSeriesHook[js.Array[Asset], _, _],
    optimizeChunkAssets: tapableLib.tapableMod.AsyncSeriesHook[js.Array[Chunk], _, _],
    optimizeChunkIds: tapableLib.tapableMod.SyncHook[js.Array[Chunk], _, _],
    optimizeChunkModules: tapableLib.tapableMod.SyncBailHook[js.Array[Chunk], js.Array[Module], _, _],
    optimizeChunkModulesAdvanced: tapableLib.tapableMod.SyncBailHook[js.Array[Chunk], js.Array[Module], _, _],
    optimizeChunkModulesBasic: tapableLib.tapableMod.SyncBailHook[js.Array[Chunk], js.Array[Module], _, _],
    optimizeChunkOrder: tapableLib.tapableMod.SyncHook[js.Array[Chunk], _, _],
    optimizeChunks: tapableLib.tapableMod.SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _],
    optimizeChunksAdvanced: tapableLib.tapableMod.SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _],
    optimizeChunksBasic: tapableLib.tapableMod.SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _],
    optimizeDependencies: tapableLib.tapableMod.SyncBailHook[js.Array[Module], _, _, _],
    optimizeDependenciesAdvanced: tapableLib.tapableMod.SyncBailHook[js.Array[Module], _, _, _],
    optimizeDependenciesBasic: tapableLib.tapableMod.SyncBailHook[js.Array[Module], _, _, _],
    optimizeExtractedChunks: tapableLib.tapableMod.SyncBailHook[js.Array[Chunk], _, _, _],
    optimizeExtractedChunksAdvanced: tapableLib.tapableMod.SyncBailHook[js.Array[Chunk], _, _, _],
    optimizeExtractedChunksBasic: tapableLib.tapableMod.SyncBailHook[js.Array[Chunk], _, _, _],
    optimizeModuleIds: tapableLib.tapableMod.SyncHook[js.Array[Module], _, _],
    optimizeModuleOrder: tapableLib.tapableMod.SyncHook[js.Array[Module], _, _],
    optimizeModules: tapableLib.tapableMod.SyncBailHook[js.Array[Module], _, _, _],
    optimizeModulesAdvanced: tapableLib.tapableMod.SyncBailHook[js.Array[Module], _, _, _],
    optimizeModulesBasic: tapableLib.tapableMod.SyncBailHook[js.Array[Module], _, _, _],
    optimizeTree: tapableLib.tapableMod.AsyncSeriesHook[js.Array[Chunk], js.Array[Module], _],
    rebuildModule: tapableLib.tapableMod.SyncHook[Module, _, _],
    record: tapableLib.tapableMod.SyncHook[Compilation, js.Array[Record], _],
    recordChunks: tapableLib.tapableMod.SyncHook[js.Array[Chunk], js.Array[Record], _],
    recordHash: tapableLib.tapableMod.SyncHook[js.Array[Record], _, _],
    recordModules: tapableLib.tapableMod.SyncHook[js.Array[Module], js.Array[Record], _],
    records: tapableLib.tapableMod.SyncHook[Compilation, js.Array[Record], _],
    reviveChunks: tapableLib.tapableMod.SyncHook[js.Array[Chunk], js.Array[Record], _],
    reviveModules: tapableLib.tapableMod.SyncHook[js.Array[Module], js.Array[Record], _],
    seal: tapableLib.tapableMod.SyncHook[_, _, _],
    shouldGenerateChunkAssets: tapableLib.tapableMod.SyncBailHook[_, _, _, _],
    shouldRecord: tapableLib.tapableMod.SyncBailHook[_, _, _, _],
    succeedModule: tapableLib.tapableMod.SyncHook[Module, _, _],
    unseal: tapableLib.tapableMod.SyncHook[_, _, _]
  ): CompilationHooks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("additionalAssets")(additionalAssets)
    __obj.updateDynamic("additionalChunkAssets")(additionalChunkAssets)
    __obj.updateDynamic("advancedOptimizeModuleOrder")(advancedOptimizeModuleOrder)
    __obj.updateDynamic("afterHash")(afterHash)
    __obj.updateDynamic("afterOptimizeAssets")(afterOptimizeAssets)
    __obj.updateDynamic("afterOptimizeChunkAssets")(afterOptimizeChunkAssets)
    __obj.updateDynamic("afterOptimizeChunkIds")(afterOptimizeChunkIds)
    __obj.updateDynamic("afterOptimizeChunkModules")(afterOptimizeChunkModules)
    __obj.updateDynamic("afterOptimizeChunks")(afterOptimizeChunks)
    __obj.updateDynamic("afterOptimizeDependencies")(afterOptimizeDependencies)
    __obj.updateDynamic("afterOptimizeExtractedChunks")(afterOptimizeExtractedChunks)
    __obj.updateDynamic("afterOptimizeModuleIds")(afterOptimizeModuleIds)
    __obj.updateDynamic("afterOptimizeModules")(afterOptimizeModules)
    __obj.updateDynamic("afterOptimizeTree")(afterOptimizeTree)
    __obj.updateDynamic("afterSeal")(afterSeal)
    __obj.updateDynamic("assetPath")(assetPath)
    __obj.updateDynamic("beforeChunkAssets")(beforeChunkAssets)
    __obj.updateDynamic("beforeChunkIds")(beforeChunkIds)
    __obj.updateDynamic("beforeHash")(beforeHash)
    __obj.updateDynamic("beforeModuleAssets")(beforeModuleAssets)
    __obj.updateDynamic("beforeModuleIds")(beforeModuleIds)
    __obj.updateDynamic("buildModule")(buildModule)
    __obj.updateDynamic("childCompiler")(childCompiler)
    __obj.updateDynamic("chunkAsset")(chunkAsset)
    __obj.updateDynamic("chunkHash")(chunkHash)
    __obj.updateDynamic("failedModule")(failedModule)
    __obj.updateDynamic("finishModules")(finishModules)
    __obj.updateDynamic("finishRebuildingModule")(finishRebuildingModule)
    __obj.updateDynamic("moduleAsset")(moduleAsset)
    __obj.updateDynamic("moduleIds")(moduleIds)
    __obj.updateDynamic("needAdditionalPass")(needAdditionalPass)
    __obj.updateDynamic("needAdditionalSeal")(needAdditionalSeal)
    __obj.updateDynamic("normalModuleLoader")(normalModuleLoader)
    __obj.updateDynamic("optimize")(optimize)
    __obj.updateDynamic("optimizeAssets")(optimizeAssets)
    __obj.updateDynamic("optimizeChunkAssets")(optimizeChunkAssets)
    __obj.updateDynamic("optimizeChunkIds")(optimizeChunkIds)
    __obj.updateDynamic("optimizeChunkModules")(optimizeChunkModules)
    __obj.updateDynamic("optimizeChunkModulesAdvanced")(optimizeChunkModulesAdvanced)
    __obj.updateDynamic("optimizeChunkModulesBasic")(optimizeChunkModulesBasic)
    __obj.updateDynamic("optimizeChunkOrder")(optimizeChunkOrder)
    __obj.updateDynamic("optimizeChunks")(optimizeChunks)
    __obj.updateDynamic("optimizeChunksAdvanced")(optimizeChunksAdvanced)
    __obj.updateDynamic("optimizeChunksBasic")(optimizeChunksBasic)
    __obj.updateDynamic("optimizeDependencies")(optimizeDependencies)
    __obj.updateDynamic("optimizeDependenciesAdvanced")(optimizeDependenciesAdvanced)
    __obj.updateDynamic("optimizeDependenciesBasic")(optimizeDependenciesBasic)
    __obj.updateDynamic("optimizeExtractedChunks")(optimizeExtractedChunks)
    __obj.updateDynamic("optimizeExtractedChunksAdvanced")(optimizeExtractedChunksAdvanced)
    __obj.updateDynamic("optimizeExtractedChunksBasic")(optimizeExtractedChunksBasic)
    __obj.updateDynamic("optimizeModuleIds")(optimizeModuleIds)
    __obj.updateDynamic("optimizeModuleOrder")(optimizeModuleOrder)
    __obj.updateDynamic("optimizeModules")(optimizeModules)
    __obj.updateDynamic("optimizeModulesAdvanced")(optimizeModulesAdvanced)
    __obj.updateDynamic("optimizeModulesBasic")(optimizeModulesBasic)
    __obj.updateDynamic("optimizeTree")(optimizeTree)
    __obj.updateDynamic("rebuildModule")(rebuildModule)
    __obj.updateDynamic("record")(record)
    __obj.updateDynamic("recordChunks")(recordChunks)
    __obj.updateDynamic("recordHash")(recordHash)
    __obj.updateDynamic("recordModules")(recordModules)
    __obj.updateDynamic("records")(records)
    __obj.updateDynamic("reviveChunks")(reviveChunks)
    __obj.updateDynamic("reviveModules")(reviveModules)
    __obj.updateDynamic("seal")(seal)
    __obj.updateDynamic("shouldGenerateChunkAssets")(shouldGenerateChunkAssets)
    __obj.updateDynamic("shouldRecord")(shouldRecord)
    __obj.updateDynamic("succeedModule")(succeedModule)
    __obj.updateDynamic("unseal")(unseal)
    __obj.asInstanceOf[CompilationHooks]
  }
}

