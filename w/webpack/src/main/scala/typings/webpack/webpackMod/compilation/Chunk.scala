package typings.webpack.webpackMod.compilation

import typings.std.Set
import typings.webpack.Anon_Hash
import typings.webpack.Anon_HashId
import typings.webpack.webpackNumbers.`-1`
import typings.webpack.webpackNumbers.`0`
import typings.webpack.webpackNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "compilation.Chunk")
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

