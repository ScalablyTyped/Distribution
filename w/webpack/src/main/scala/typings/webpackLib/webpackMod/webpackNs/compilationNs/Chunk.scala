package typings
package webpackLib.webpackMod.webpackNs.compilationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chunk extends js.Object {
  var chunkReason: js.Any
  var debugId: scala.Double
  var entryModule: js.Any
  var extraAsync: scala.Boolean
  var files: js.Array[_]
  var groupsIterable: js.Array[_]
  var hash: js.Any
  var id: js.Any
  var ids: js.Any
  var modulesIterable: js.Array[_]
  var name: js.Any
  var rendered: scala.Boolean
  var renderedHash: js.Any
  def addGroup(chunkGroup: js.Any): scala.Boolean
  def addModule(module: js.Any): scala.Boolean
  def addMultiplierAndOverhead(size: scala.Double, options: js.Any): scala.Double
  def canBeInitial(): scala.Boolean
  def canBeIntegrated(otherChunk: js.Any): scala.Boolean
  def compareTo(otherChunk: js.Any): webpackLib.webpackLibNumbers.`-1` | webpackLib.webpackLibNumbers.`0` | webpackLib.webpackLibNumbers.`1`
  def containsModule(module: js.Any): scala.Boolean
  def getAllAsyncChunks(): stdLib.Set[_]
  def getChunkMaps(realHash: js.Any): webpackLib.Anon_Hash
  // tslint:disable-next-line:ban-types
  def getChunkModuleMaps(filterFn: js.Function): webpackLib.Anon_HashId
  def getModules(): js.Array[_]
  def getModulesIdent(): js.Array[_]
  def getNumberOfGroups(): scala.Double
  def getNumberOfModules(): scala.Double
  def hasEntryModule(): scala.Boolean
  // tslint:disable-next-line:ban-types
  def hasModuleInGraph(filterFn: js.Function, filterChunkFn: js.Function): scala.Boolean
  def hasRuntime(): scala.Boolean
  def integrate(otherChunk: js.Any, reason: js.Any): scala.Boolean
  def integratedSize(otherChunk: js.Any, options: js.Any): scala.Double
  def isEmpty(): scala.Boolean
  def isInGroup(chunkGroup: js.Any): scala.Boolean
  def isOnlyInitial(): scala.Boolean
  def modulesSize(): scala.Double
  def moveModule(module: js.Any, otherChunk: js.Any): scala.Unit
  def remove(reason: js.Any): scala.Unit
  def removeGroup(chunkGroup: js.Any): scala.Boolean
  def removeModule(module: js.Any): scala.Boolean
  def setModules(modules: js.Any): scala.Unit
  def size(options: js.Any): scala.Double
  // tslint:disable-next-line:ban-types
  def sortModules(sortByFn: js.Function): scala.Unit
  def split(newChunk: js.Any): scala.Unit
  def updateHash(hash: js.Any): scala.Unit
}

object Chunk {
  @scala.inline
  def apply(
    addGroup: js.Any => scala.Boolean,
    addModule: js.Any => scala.Boolean,
    addMultiplierAndOverhead: (scala.Double, js.Any) => scala.Double,
    canBeInitial: () => scala.Boolean,
    canBeIntegrated: js.Any => scala.Boolean,
    chunkReason: js.Any,
    compareTo: js.Any => webpackLib.webpackLibNumbers.`-1` | webpackLib.webpackLibNumbers.`0` | webpackLib.webpackLibNumbers.`1`,
    containsModule: js.Any => scala.Boolean,
    debugId: scala.Double,
    entryModule: js.Any,
    extraAsync: scala.Boolean,
    files: js.Array[_],
    getAllAsyncChunks: () => stdLib.Set[_],
    getChunkMaps: js.Any => webpackLib.Anon_Hash,
    getChunkModuleMaps: js.Function => webpackLib.Anon_HashId,
    getModules: () => js.Array[_],
    getModulesIdent: () => js.Array[_],
    getNumberOfGroups: () => scala.Double,
    getNumberOfModules: () => scala.Double,
    groupsIterable: js.Array[_],
    hasEntryModule: () => scala.Boolean,
    hasModuleInGraph: (js.Function, js.Function) => scala.Boolean,
    hasRuntime: () => scala.Boolean,
    hash: js.Any,
    id: js.Any,
    ids: js.Any,
    integrate: (js.Any, js.Any) => scala.Boolean,
    integratedSize: (js.Any, js.Any) => scala.Double,
    isEmpty: () => scala.Boolean,
    isInGroup: js.Any => scala.Boolean,
    isOnlyInitial: () => scala.Boolean,
    modulesIterable: js.Array[_],
    modulesSize: () => scala.Double,
    moveModule: (js.Any, js.Any) => scala.Unit,
    name: js.Any,
    remove: js.Any => scala.Unit,
    removeGroup: js.Any => scala.Boolean,
    removeModule: js.Any => scala.Boolean,
    rendered: scala.Boolean,
    renderedHash: js.Any,
    setModules: js.Any => scala.Unit,
    size: js.Any => scala.Double,
    sortModules: js.Function => scala.Unit,
    split: js.Any => scala.Unit,
    toString: () => java.lang.String,
    updateHash: js.Any => scala.Unit
  ): Chunk = {
    val __obj = js.Dynamic.literal(addGroup = js.Any.fromFunction1(addGroup), addModule = js.Any.fromFunction1(addModule), addMultiplierAndOverhead = js.Any.fromFunction2(addMultiplierAndOverhead), canBeInitial = js.Any.fromFunction0(canBeInitial), canBeIntegrated = js.Any.fromFunction1(canBeIntegrated), chunkReason = chunkReason, compareTo = js.Any.fromFunction1(compareTo), containsModule = js.Any.fromFunction1(containsModule), debugId = debugId, entryModule = entryModule, extraAsync = extraAsync, files = files, getAllAsyncChunks = js.Any.fromFunction0(getAllAsyncChunks), getChunkMaps = js.Any.fromFunction1(getChunkMaps), getChunkModuleMaps = js.Any.fromFunction1(getChunkModuleMaps), getModules = js.Any.fromFunction0(getModules), getModulesIdent = js.Any.fromFunction0(getModulesIdent), getNumberOfGroups = js.Any.fromFunction0(getNumberOfGroups), getNumberOfModules = js.Any.fromFunction0(getNumberOfModules), groupsIterable = groupsIterable, hasEntryModule = js.Any.fromFunction0(hasEntryModule), hasModuleInGraph = js.Any.fromFunction2(hasModuleInGraph), hasRuntime = js.Any.fromFunction0(hasRuntime), hash = hash, id = id, ids = ids, integrate = js.Any.fromFunction2(integrate), integratedSize = js.Any.fromFunction2(integratedSize), isEmpty = js.Any.fromFunction0(isEmpty), isInGroup = js.Any.fromFunction1(isInGroup), isOnlyInitial = js.Any.fromFunction0(isOnlyInitial), modulesIterable = modulesIterable, modulesSize = js.Any.fromFunction0(modulesSize), moveModule = js.Any.fromFunction2(moveModule), name = name, remove = js.Any.fromFunction1(remove), removeGroup = js.Any.fromFunction1(removeGroup), removeModule = js.Any.fromFunction1(removeModule), rendered = rendered, renderedHash = renderedHash, setModules = js.Any.fromFunction1(setModules), size = js.Any.fromFunction1(size), sortModules = js.Any.fromFunction1(sortModules), split = js.Any.fromFunction1(split), toString = js.Any.fromFunction0(toString), updateHash = js.Any.fromFunction1(updateHash))
  
    __obj.asInstanceOf[Chunk]
  }
}

