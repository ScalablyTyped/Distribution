package typings.webpack.mod

import typings.std.Record
import typings.webpack.webpackInts.`-1`
import typings.webpack.webpackInts.`0`
import typings.webpack.webpackInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChunkGroup extends StObject {
  
  def addAsyncEntrypoint(entrypoint: Entrypoint): Boolean = js.native
  
  def addBlock(block: AsyncDependenciesBlock): Boolean = js.native
  
  def addChild(group: ChunkGroup): Boolean = js.native
  
  /**
  	 * when a new chunk is added to a chunkGroup, addingOptions will occur.
  	 */
  def addOptions(options: ChunkGroupOptions): Unit = js.native
  
  def addOrigin(module: Module, loc: DependencyLocation, request: String): Unit = js.native
  
  def addParent(parentChunk: ChunkGroup): Boolean = js.native
  
  def asyncEntrypointsIterable: SortableSet[ChunkGroup] = js.native
  
  def blocksIterable: js.Iterable[AsyncDependenciesBlock] = js.native
  
  def checkConstraints(): Unit = js.native
  
  def childrenIterable: SortableSet[ChunkGroup] = js.native
  
  var chunks: js.Array[Chunk] = js.native
  
  /**
  	 * Sorting predicate which allows current ChunkGroup to be compared against another.
  	 * Sorting values are based off of number of chunks in ChunkGroup.
  	 */
  def compareTo(chunkGraph: ChunkGraph, otherGroup: ChunkGroup): `0` | `1` | `-1` = js.native
  
  /**
  	 * get a uniqueId for ChunkGroup, made up of its member Chunk debugId's
  	 */
  def debugId: String = js.native
  
  def getBlocks(): js.Array[Any] = js.native
  
  def getChildren(): js.Array[ChunkGroup] = js.native
  
  def getChildrenByOrders(moduleGraph: ModuleGraph, chunkGraph: ChunkGraph): Record[String, js.Array[ChunkGroup]] = js.native
  
  def getFiles(): js.Array[String] = js.native
  
  def getModuleIndex(module: Module): Double = js.native
  
  def getModuleIndex2(module: Module): Double = js.native
  
  /**
  	 * Gets the bottom-up index of a module in this ChunkGroup
  	 */
  def getModulePostOrderIndex(module: Module): Double = js.native
  
  /**
  	 * Gets the top-down index of a module in this ChunkGroup
  	 */
  def getModulePreOrderIndex(module: Module): Double = js.native
  
  def getNumberOfBlocks(): Double = js.native
  
  def getNumberOfChildren(): Double = js.native
  
  def getNumberOfParents(): Double = js.native
  
  def getParents(): js.Array[ChunkGroup] = js.native
  
  var groupDebugId: Double = js.native
  
  def hasBlock(): Boolean = js.native
  def hasBlock(block: Any): Boolean = js.native
  
  def hasParent(parent: ChunkGroup): Boolean = js.native
  
  /**
  	 * get a unique id for ChunkGroup, made up of its member Chunk id's
  	 */
  def id: String = js.native
  
  var index: Double = js.native
  
  /**
  	 * inserts a chunk before another existing chunk in group
  	 */
  def insertChunk(chunk: Chunk, before: Chunk): Boolean = js.native
  
  def isInitial(): Boolean = js.native
  
  /**
  	 * returns the name of current ChunkGroup
  	 * sets a new name for current ChunkGroup
  	 */
  var name: js.UndefOr[String] = js.native
  
  var options: ChunkGroupOptions = js.native
  
  var origins: js.Array[OriginRecord] = js.native
  
  def parentsIterable: SortableSet[ChunkGroup] = js.native
  
  /**
  	 * add a chunk into ChunkGroup. Is pushed on or prepended
  	 */
  def pushChunk(chunk: Chunk): Boolean = js.native
  
  def remove(): Unit = js.native
  
  def removeChild(group: ChunkGroup): Boolean = js.native
  
  def removeChunk(chunk: Chunk): Boolean = js.native
  
  def removeParent(chunkGroup: ChunkGroup): Boolean = js.native
  
  def replaceChunk(oldChunk: Chunk, newChunk: Chunk): Boolean = js.native
  
  /**
  	 * Sets the bottom-up index of a module in this ChunkGroup
  	 */
  def setModulePostOrderIndex(module: Module, index: Double): Unit = js.native
  
  /**
  	 * Sets the top-down index of a module in this ChunkGroup
  	 */
  def setModulePreOrderIndex(module: Module, index: Double): Unit = js.native
  
  def sortItems(): Unit = js.native
  
  /**
  	 * Performs an unshift of a specific chunk
  	 */
  def unshiftChunk(chunk: Chunk): Boolean = js.native
}
