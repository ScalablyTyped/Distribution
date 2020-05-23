package typings.webpack.mod.compilation

import typings.std.Set
import typings.webpack.anon.ChunkOverhead
import typings.webpack.anon.ContentHash
import typings.webpack.anon.Hash
import typings.webpack.mod.SortableSet
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackNumbers.`-1`
import typings.webpack.webpackNumbers.`0`
import typings.webpack.webpackNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "compilation.Chunk")
@js.native
class Chunk () extends js.Object {
  def this(name: String) = this()
  var _groups: SortableSet[ChunkGroup] = js.native
  var _modules: SortableSet[Module] = js.native
  var chunkReason: js.UndefOr[String] = js.native
  var contentHash: js.Object = js.native
  var debugId: Double = js.native
  var entryModule: js.UndefOr[Module] = js.native
  var extraAsync: Boolean = js.native
  var filenameTemplate: js.UndefOr[String] = js.native
  var files: js.Array[String] = js.native
  // Internally returns this._groups
  // So it should have the same type as this._groups
  var groupsIterable: SortableSet[ChunkGroup] = js.native
  var hash: js.UndefOr[String] = js.native
  var id: Double | Null = js.native
  var ids: js.Array[Double] | Null = js.native
  // Internally returns this._modules
  // So it should have the same type as this._modules
  var modulesIterable: SortableSet[Module] = js.native
  var name: String = js.native
  var preventIntegration: Boolean = js.native
  var removedModules: js.Any = js.native
  var rendered: Boolean = js.native
  var renderedHash: js.UndefOr[String] = js.native
  def addGroup(chunkGroup: ChunkGroup): Boolean = js.native
  def addModule(module: Module): Boolean = js.native
  def addMultiplierAndOverhead(size: Double, options: ChunkOverhead): Double = js.native
  def canBeInitial(): Boolean = js.native
  def canBeIntegrated(otherChunk: Chunk): Boolean = js.native
  def compareTo(otherChunk: Chunk): `-1` | `0` | `1` = js.native
  def containsModule(module: Module): Boolean = js.native
  def getAllAsyncChunks(): Set[Chunk] = js.native
  def getChildIdsByOrders(): js.Any = js.native
  def getChildIdsByOrdersMap(): js.Any = js.native
  def getChildIdsByOrdersMap(includeDirectChildren: Boolean): js.Any = js.native
  def getChunkMaps(realHash: Boolean): ContentHash = js.native
  // tslint:disable-next-line:ban-types
  def getChunkModuleMaps(filterFn: js.Function): Hash = js.native
  def getModules(): js.Array[Module] = js.native
  def getModulesIdent(): js.Array[_] = js.native
  def getNumberOfGroups(): Double = js.native
  def getNumberOfModules(): Double = js.native
  def hasEntryModule(): Boolean = js.native
  def hasModuleInGraph(
    filterFn: js.Function1[/* module */ Module, Boolean],
    filterChunkFn: js.Function1[/* chunk */ this.type, Boolean]
  ): Boolean = js.native
  def hasRuntime(): Boolean = js.native
  def integrate(otherChunk: Chunk, reason: String): Boolean = js.native
  def integratedSize(otherChunk: Chunk, options: js.Any): Double | `false` = js.native
  def isEmpty(): Boolean = js.native
  def isInGroup(chunkGroup: ChunkGroup): Boolean = js.native
  def isOnlyInitial(): Boolean = js.native
  def modulesSize(): Double = js.native
  def moveModule(module: Module, otherChunk: Chunk): Unit = js.native
  def remove(): Unit = js.native
  def remove(reason: String): Unit = js.native
  def removeGroup(chunkGroup: ChunkGroup): Boolean = js.native
  def removeModule(module: Module): Boolean = js.native
  def setModules(modules: js.Array[Module]): Unit = js.native
  def size(): Double = js.native
  def size(options: ChunkOverhead): Double = js.native
  def sortItems(): Unit = js.native
  def sortModules(sortByFn: js.Function2[/* module1 */ Module, /* module2 */ Module, `-1` | `0` | `1`]): Unit = js.native
  def split(newChunk: Chunk): Unit = js.native
  def updateHash(hash: js.Any): Unit = js.native
}

