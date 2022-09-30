package typings.webpack.mod

import typings.std.Record
import typings.std.Set
import typings.webpack.anon.Chunks
import typings.webpack.webpackInts.`-1`
import typings.webpack.webpackInts.`0`
import typings.webpack.webpackInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "Chunk")
@js.native
open class Chunk () extends StObject {
  def this(name: String) = this()
  def this(name: String, backCompat: Boolean) = this()
  def this(name: Unit, backCompat: Boolean) = this()
  
  def addGroup(chunkGroup: ChunkGroup): Unit = js.native
  
  def addModule(module: Module): Boolean = js.native
  
  var auxiliaryFiles: Set[String] = js.native
  
  def canBeInitial(): Boolean = js.native
  
  def canBeIntegrated(otherChunk: Chunk): Boolean = js.native
  
  var chunkReason: js.UndefOr[String] = js.native
  
  def compareTo(otherChunk: Chunk): `0` | `1` | `-1` = js.native
  
  def containsModule(module: Module): Boolean = js.native
  
  var contentHash: Record[String, String] = js.native
  
  var cssFilenameTemplate: Null | String | (js.Function2[/* arg0 */ PathData, /* arg1 */ js.UndefOr[AssetInfo], String]) = js.native
  
  var debugId: Double = js.native
  
  def disconnectFromGroups(): Unit = js.native
  
  val entryModule: js.UndefOr[Module] = js.native
  
  var extraAsync: Boolean = js.native
  
  var filenameTemplate: Null | String | (js.Function2[/* arg0 */ PathData, /* arg1 */ js.UndefOr[AssetInfo], String]) = js.native
  
  var files: Set[String] = js.native
  
  def getAllAsyncChunks(): Set[Chunk] = js.native
  
  def getAllInitialChunks(): Set[Chunk] = js.native
  
  def getAllReferencedAsyncEntrypoints(): Set[Entrypoint] = js.native
  
  def getAllReferencedChunks(): Set[Chunk] = js.native
  
  def getChildIdsByOrders(chunkGraph: ChunkGraph): Record[String, js.Array[String | Double]] = js.native
  def getChildIdsByOrders(
    chunkGraph: ChunkGraph,
    filterFn: js.Function2[/* c */ this.type, /* chunkGraph */ ChunkGraph, Boolean]
  ): Record[String, js.Array[String | Double]] = js.native
  
  def getChildIdsByOrdersMap(chunkGraph: ChunkGraph): Record[String | Double, Record[String, js.Array[String | Double]]] = js.native
  def getChildIdsByOrdersMap(chunkGraph: ChunkGraph, includeDirectChildren: Boolean): Record[String | Double, Record[String, js.Array[String | Double]]] = js.native
  def getChildIdsByOrdersMap(
    chunkGraph: ChunkGraph,
    includeDirectChildren: Boolean,
    filterFn: js.Function2[/* c */ this.type, /* chunkGraph */ ChunkGraph, Boolean]
  ): Record[String | Double, Record[String, js.Array[String | Double]]] = js.native
  def getChildIdsByOrdersMap(
    chunkGraph: ChunkGraph,
    includeDirectChildren: Unit,
    filterFn: js.Function2[/* c */ this.type, /* chunkGraph */ ChunkGraph, Boolean]
  ): Record[String | Double, Record[String, js.Array[String | Double]]] = js.native
  
  def getChildrenOfTypeInOrder(chunkGraph: ChunkGraph, `type`: String): js.Array[Chunks] = js.native
  
  def getChunkMaps(realHash: Boolean): ChunkMaps = js.native
  
  def getChunkModuleMaps(filterFn: js.Function1[/* m */ Module, Boolean]): ChunkModuleMaps = js.native
  
  def getEntryOptions(): js.UndefOr[EntryOptions] = js.native
  
  def getModules(): js.Array[Module] = js.native
  
  def getNumberOfGroups(): Double = js.native
  
  def getNumberOfModules(): Double = js.native
  
  val groupsIterable: js.Iterable[ChunkGroup] = js.native
  
  def hasAsyncChunks(): Boolean = js.native
  
  def hasEntryModule(): Boolean = js.native
  
  def hasModuleInGraph(filterFn: js.Function1[/* m */ Module, Boolean]): Boolean = js.native
  def hasModuleInGraph(
    filterFn: js.Function1[/* m */ Module, Boolean],
    filterChunkFn: js.Function2[/* c */ this.type, /* chunkGraph */ ChunkGraph, Boolean]
  ): Boolean = js.native
  
  def hasRuntime(): Boolean = js.native
  
  var hash: js.UndefOr[String] = js.native
  
  var id: Null | String | Double = js.native
  
  var idNameHints: SortableSet[String] = js.native
  
  var ids: Null | (js.Array[String | Double]) = js.native
  
  def integrate(otherChunk: Chunk): Boolean = js.native
  
  def integratedSize(otherChunk: Chunk, options: ChunkSizeOptions): Double = js.native
  
  def isEmpty(): Boolean = js.native
  
  def isInGroup(chunkGroup: ChunkGroup): Boolean = js.native
  
  def isOnlyInitial(): Boolean = js.native
  
  val modulesIterable: js.Iterable[Module] = js.native
  
  def modulesSize(): Double = js.native
  
  def moveModule(module: Module, otherChunk: Chunk): Unit = js.native
  
  var name: String = js.native
  
  var preventIntegration: Boolean = js.native
  
  def remove(): Unit = js.native
  
  def removeGroup(chunkGroup: ChunkGroup): Unit = js.native
  
  def removeModule(module: Module): Unit = js.native
  
  var rendered: Boolean = js.native
  
  var renderedHash: js.UndefOr[String] = js.native
  
  var runtime: RuntimeSpec = js.native
  
  def size(): Double = js.native
  def size(options: ChunkSizeOptions): Double = js.native
  
  def split(newChunk: Chunk): Unit = js.native
  
  def updateHash(hash: Hash, chunkGraph: ChunkGraph): Unit = js.native
}
