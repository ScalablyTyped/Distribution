package typings.webpack.mod

import org.scalablytyped.runtime.Instantiable0
import typings.std.ReadonlySet
import typings.std.Record
import typings.std.Set
import typings.webpack.webpackNumbers.`-1`
import typings.webpack.webpackNumbers.`0`
import typings.webpack.webpackNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "ChunkGraph")
@js.native
open class ChunkGraph protected () extends StObject {
  def this(moduleGraph: ModuleGraph) = this()
  def this(moduleGraph: ModuleGraph, hashFunction: String) = this()
  def this(moduleGraph: ModuleGraph, hashFunction: Instantiable0[Hash]) = this()
  
  def addChunkRuntimeRequirements(chunk: Chunk, items: Set[String]): Unit = js.native
  
  def addDependentHashModuleToChunk(chunk: Chunk, module: RuntimeModule): Unit = js.native
  
  def addFullHashModuleToChunk(chunk: Chunk, module: RuntimeModule): Unit = js.native
  
  def addModuleRuntimeRequirements(module: Module, runtime: RuntimeSpec, items: Set[String]): Unit = js.native
  def addModuleRuntimeRequirements(module: Module, runtime: RuntimeSpec, items: Set[String], transferOwnership: Boolean): Unit = js.native
  
  def addTreeRuntimeRequirements(chunk: Chunk, items: js.Iterable[String]): Unit = js.native
  
  def attachDependentHashModules(chunk: Chunk, modules: js.Iterable[RuntimeModule]): Unit = js.native
  
  def attachFullHashModules(chunk: Chunk, modules: js.Iterable[RuntimeModule]): Unit = js.native
  
  def attachModules(chunk: Chunk, modules: js.Iterable[Module]): Unit = js.native
  
  def attachRuntimeModules(chunk: Chunk, modules: js.Iterable[RuntimeModule]): Unit = js.native
  
  def canChunksBeIntegrated(chunkA: Chunk, chunkB: Chunk): Boolean = js.native
  
  def compareChunks(chunkA: Chunk, chunkB: Chunk): `0` | `1` | `-1` = js.native
  
  def connectBlockAndChunkGroup(depBlock: AsyncDependenciesBlock, chunkGroup: ChunkGroup): Unit = js.native
  
  def connectChunkAndEntryModule(chunk: Chunk, module: Module): Unit = js.native
  def connectChunkAndEntryModule(chunk: Chunk, module: Module, entrypoint: Entrypoint): Unit = js.native
  
  def connectChunkAndModule(chunk: Chunk, module: Module): Unit = js.native
  
  def connectChunkAndRuntimeModule(chunk: Chunk, module: RuntimeModule): Unit = js.native
  
  def disconnectChunk(chunk: Chunk): Unit = js.native
  
  def disconnectChunkAndEntryModule(chunk: Chunk, module: Module): Unit = js.native
  
  def disconnectChunkAndModule(chunk: Chunk, module: Module): Unit = js.native
  
  def disconnectChunkAndRuntimeModule(chunk: Chunk, module: RuntimeModule): Unit = js.native
  
  def disconnectChunkGroup(chunkGroup: ChunkGroup): Unit = js.native
  
  def disconnectEntries(chunk: Chunk): Unit = js.native
  
  def disconnectEntryModule(module: Module): Unit = js.native
  
  def getBlockChunkGroup(depBlock: AsyncDependenciesBlock): ChunkGroup = js.native
  
  def getChunkConditionMap(chunk: Chunk, filterFn: js.Function2[/* c */ Chunk, /* chunkGraph */ this.type, Boolean]): Record[String | Double, Boolean] = js.native
  
  def getChunkDependentHashModulesIterable(chunk: Chunk): js.UndefOr[js.Iterable[RuntimeModule]] = js.native
  
  def getChunkEntryDependentChunksIterable(chunk: Chunk): js.Iterable[Chunk] = js.native
  
  def getChunkEntryModulesIterable(chunk: Chunk): js.Iterable[Module] = js.native
  
  def getChunkEntryModulesWithChunkGroupIterable(chunk: Chunk): js.Iterable[js.Tuple2[Module, js.UndefOr[Entrypoint]]] = js.native
  
  def getChunkFullHashModulesIterable(chunk: Chunk): js.UndefOr[js.Iterable[RuntimeModule]] = js.native
  
  def getChunkFullHashModulesSet(chunk: Chunk): js.UndefOr[ReadonlySet[RuntimeModule]] = js.native
  
  def getChunkModuleIdMap(chunk: Chunk, filterFn: js.Function1[/* m */ Module, Boolean]): Record[String | Double, js.Array[String | Double]] = js.native
  def getChunkModuleIdMap(chunk: Chunk, filterFn: js.Function1[/* m */ Module, Boolean], includeAllChunks: Boolean): Record[String | Double, js.Array[String | Double]] = js.native
  
  def getChunkModuleRenderedHashMap(chunk: Chunk, filterFn: js.Function1[/* m */ Module, Boolean]): Record[String | Double, Record[String | Double, String]] = js.native
  def getChunkModuleRenderedHashMap(chunk: Chunk, filterFn: js.Function1[/* m */ Module, Boolean], hashLength: Double): Record[String | Double, Record[String | Double, String]] = js.native
  def getChunkModuleRenderedHashMap(
    chunk: Chunk,
    filterFn: js.Function1[/* m */ Module, Boolean],
    hashLength: Double,
    includeAllChunks: Boolean
  ): Record[String | Double, Record[String | Double, String]] = js.native
  def getChunkModuleRenderedHashMap(
    chunk: Chunk,
    filterFn: js.Function1[/* m */ Module, Boolean],
    hashLength: Unit,
    includeAllChunks: Boolean
  ): Record[String | Double, Record[String | Double, String]] = js.native
  
  def getChunkModuleSourceTypes(chunk: Chunk, module: Module): Set[String] = js.native
  
  def getChunkModules(chunk: Chunk): js.Array[Module] = js.native
  
  def getChunkModulesIterable(chunk: Chunk): js.Iterable[Module] = js.native
  
  def getChunkModulesIterableBySourceType(chunk: Chunk, sourceType: String): js.UndefOr[js.Iterable[Module]] = js.native
  
  def getChunkModulesSize(chunk: Chunk): Double = js.native
  
  def getChunkModulesSizes(chunk: Chunk): Record[String, Double] = js.native
  
  def getChunkRootModules(chunk: Chunk): js.Array[Module] = js.native
  
  def getChunkRuntimeModulesInOrder(chunk: Chunk): js.Array[RuntimeModule] = js.native
  
  def getChunkRuntimeModulesIterable(chunk: Chunk): js.Iterable[RuntimeModule] = js.native
  
  def getChunkRuntimeRequirements(chunk: Chunk): ReadonlySet[String] = js.native
  
  def getChunkSize(chunk: Chunk): Double = js.native
  def getChunkSize(chunk: Chunk, options: ChunkSizeOptions): Double = js.native
  
  def getIntegratedChunksSize(chunkA: Chunk, chunkB: Chunk): Double = js.native
  def getIntegratedChunksSize(chunkA: Chunk, chunkB: Chunk, options: ChunkSizeOptions): Double = js.native
  
  def getModuleChunks(module: Module): js.Array[Chunk] = js.native
  
  def getModuleChunksIterable(module: Module): js.Iterable[Chunk] = js.native
  
  def getModuleGraphHash(module: Module, runtime: RuntimeSpec): String = js.native
  def getModuleGraphHash(module: Module, runtime: RuntimeSpec, withConnections: Boolean): String = js.native
  
  def getModuleGraphHashBigInt(module: Module, runtime: RuntimeSpec): js.BigInt = js.native
  def getModuleGraphHashBigInt(module: Module, runtime: RuntimeSpec, withConnections: Boolean): js.BigInt = js.native
  
  def getModuleHash(module: Module, runtime: RuntimeSpec): String = js.native
  
  def getModuleId(module: Module): String | Double = js.native
  
  def getModuleRuntimeRequirements(module: Module, runtime: RuntimeSpec): ReadonlySet[String] = js.native
  
  def getModuleRuntimes(module: Module): RuntimeSpecSet = js.native
  
  def getModuleSourceTypes(module: Module): Set[String] = js.native
  
  def getNumberOfChunkFullHashModules(chunk: Chunk): Double = js.native
  
  def getNumberOfChunkModules(chunk: Chunk): Double = js.native
  
  def getNumberOfEntryModules(chunk: Chunk): Double = js.native
  
  def getNumberOfModuleChunks(module: Module): Double = js.native
  
  def getNumberOfRuntimeModules(chunk: Chunk): Double = js.native
  
  def getOrderedChunkModules(chunk: Chunk, comparator: js.Function2[/* arg0 */ Module, /* arg1 */ Module, `0` | `1` | `-1`]): js.Array[Module] = js.native
  
  def getOrderedChunkModulesIterable(chunk: Chunk, comparator: js.Function2[/* arg0 */ Module, /* arg1 */ Module, `0` | `1` | `-1`]): js.Iterable[Module] = js.native
  
  def getOrderedChunkModulesIterableBySourceType(
    chunk: Chunk,
    sourceType: String,
    comparator: js.Function2[/* arg0 */ Module, /* arg1 */ Module, `0` | `1` | `-1`]
  ): js.UndefOr[js.Iterable[Module]] = js.native
  
  def getOrderedModuleChunksIterable(module: Module, sortFn: js.Function2[/* arg0 */ Chunk, /* arg1 */ Chunk, `0` | `1` | `-1`]): js.Iterable[Chunk] = js.native
  
  def getRenderedModuleHash(module: Module, runtime: RuntimeSpec): String = js.native
  
  def getRuntimeId(runtime: String): String | Double = js.native
  
  def getTreeRuntimeRequirements(chunk: Chunk): ReadonlySet[String] = js.native
  
  def hasChunkEntryDependentChunks(chunk: Chunk): Boolean = js.native
  
  def hasModuleHashes(module: Module, runtime: RuntimeSpec): Boolean = js.native
  
  def hasModuleInGraph(chunk: Chunk, filterFn: js.Function1[/* m */ Module, Boolean]): Boolean = js.native
  def hasModuleInGraph(
    chunk: Chunk,
    filterFn: js.Function1[/* m */ Module, Boolean],
    filterChunkFn: js.Function2[/* c */ Chunk, /* chunkGraph */ this.type, Boolean]
  ): Boolean = js.native
  
  def integrateChunks(chunkA: Chunk, chunkB: Chunk): Unit = js.native
  
  def isEntryModule(module: Module): Boolean = js.native
  
  def isEntryModuleInChunk(module: Module, chunk: Chunk): Boolean = js.native
  
  def isModuleInChunk(module: Module, chunk: Chunk): Boolean = js.native
  
  def isModuleInChunkGroup(module: Module, chunkGroup: ChunkGroup): Boolean = js.native
  
  var moduleGraph: ModuleGraph = js.native
  
  def replaceModule(oldModule: Module, newModule: Module): Unit = js.native
  
  def setChunkModuleSourceTypes(chunk: Chunk, module: Module, sourceTypes: Set[String]): Unit = js.native
  
  def setModuleHashes(module: Module, runtime: RuntimeSpec, hash: String, renderedHash: String): Unit = js.native
  
  def setModuleId(module: Module, id: String): Unit = js.native
  def setModuleId(module: Module, id: Double): Unit = js.native
  
  def setRuntimeId(runtime: String, id: String): Unit = js.native
  def setRuntimeId(runtime: String, id: Double): Unit = js.native
  
  def upgradeDependentToFullHashModules(chunk: Chunk): Unit = js.native
}
object ChunkGraph {
  
  @JSImport("webpack", "ChunkGraph")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def clearChunkGraphForChunk(chunk: Chunk): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearChunkGraphForChunk")(chunk.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def clearChunkGraphForModule(module: Module): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearChunkGraphForModule")(module.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def getChunkGraphForChunk(chunk: Chunk, deprecateMessage: String, deprecationCode: String): ChunkGraph = (^.asInstanceOf[js.Dynamic].applyDynamic("getChunkGraphForChunk")(chunk.asInstanceOf[js.Any], deprecateMessage.asInstanceOf[js.Any], deprecationCode.asInstanceOf[js.Any])).asInstanceOf[ChunkGraph]
  
  /* static member */
  inline def getChunkGraphForModule(module: Module, deprecateMessage: String, deprecationCode: String): ChunkGraph = (^.asInstanceOf[js.Dynamic].applyDynamic("getChunkGraphForModule")(module.asInstanceOf[js.Any], deprecateMessage.asInstanceOf[js.Any], deprecationCode.asInstanceOf[js.Any])).asInstanceOf[ChunkGraph]
  
  /* static member */
  inline def setChunkGraphForChunk(chunk: Chunk, chunkGraph: ChunkGraph): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setChunkGraphForChunk")(chunk.asInstanceOf[js.Any], chunkGraph.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def setChunkGraphForModule(module: Module, chunkGraph: ChunkGraph): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setChunkGraphForModule")(module.asInstanceOf[js.Any], chunkGraph.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
