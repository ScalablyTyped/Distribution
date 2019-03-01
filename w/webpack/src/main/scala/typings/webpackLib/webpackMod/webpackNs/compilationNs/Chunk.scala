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
  def getAllAsyncChunks(): nodeLib.Set[_]
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
    addGroup: js.Function1[js.Any, scala.Boolean],
    addModule: js.Function1[js.Any, scala.Boolean],
    addMultiplierAndOverhead: js.Function2[scala.Double, js.Any, scala.Double],
    canBeInitial: js.Function0[scala.Boolean],
    canBeIntegrated: js.Function1[js.Any, scala.Boolean],
    chunkReason: js.Any,
    compareTo: js.Function1[
      js.Any, 
      webpackLib.webpackLibNumbers.`-1` | webpackLib.webpackLibNumbers.`0` | webpackLib.webpackLibNumbers.`1`
    ],
    containsModule: js.Function1[js.Any, scala.Boolean],
    debugId: scala.Double,
    entryModule: js.Any,
    extraAsync: scala.Boolean,
    files: js.Array[_],
    getAllAsyncChunks: js.Function0[nodeLib.Set[_]],
    getChunkMaps: js.Function1[js.Any, webpackLib.Anon_Hash],
    getChunkModuleMaps: js.Function1[js.Function, webpackLib.Anon_HashId],
    getModules: js.Function0[js.Array[_]],
    getModulesIdent: js.Function0[js.Array[_]],
    getNumberOfGroups: js.Function0[scala.Double],
    getNumberOfModules: js.Function0[scala.Double],
    groupsIterable: js.Array[_],
    hasEntryModule: js.Function0[scala.Boolean],
    hasModuleInGraph: js.Function2[js.Function, js.Function, scala.Boolean],
    hasRuntime: js.Function0[scala.Boolean],
    hash: js.Any,
    id: js.Any,
    ids: js.Any,
    integrate: js.Function2[js.Any, js.Any, scala.Boolean],
    integratedSize: js.Function2[js.Any, js.Any, scala.Double],
    isEmpty: js.Function0[scala.Boolean],
    isInGroup: js.Function1[js.Any, scala.Boolean],
    isOnlyInitial: js.Function0[scala.Boolean],
    modulesIterable: js.Array[_],
    modulesSize: js.Function0[scala.Double],
    moveModule: js.Function2[js.Any, js.Any, scala.Unit],
    name: js.Any,
    remove: js.Function1[js.Any, scala.Unit],
    removeGroup: js.Function1[js.Any, scala.Boolean],
    removeModule: js.Function1[js.Any, scala.Boolean],
    rendered: scala.Boolean,
    renderedHash: js.Any,
    setModules: js.Function1[js.Any, scala.Unit],
    size: js.Function1[js.Any, scala.Double],
    sortModules: js.Function1[js.Function, scala.Unit],
    split: js.Function1[js.Any, scala.Unit],
    toString: js.Function0[java.lang.String],
    updateHash: js.Function1[js.Any, scala.Unit]
  ): Chunk = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addGroup")(addGroup)
    __obj.updateDynamic("addModule")(addModule)
    __obj.updateDynamic("addMultiplierAndOverhead")(addMultiplierAndOverhead)
    __obj.updateDynamic("canBeInitial")(canBeInitial)
    __obj.updateDynamic("canBeIntegrated")(canBeIntegrated)
    __obj.updateDynamic("chunkReason")(chunkReason)
    __obj.updateDynamic("compareTo")(compareTo)
    __obj.updateDynamic("containsModule")(containsModule)
    __obj.updateDynamic("debugId")(debugId)
    __obj.updateDynamic("entryModule")(entryModule)
    __obj.updateDynamic("extraAsync")(extraAsync)
    __obj.updateDynamic("files")(files)
    __obj.updateDynamic("getAllAsyncChunks")(getAllAsyncChunks)
    __obj.updateDynamic("getChunkMaps")(getChunkMaps)
    __obj.updateDynamic("getChunkModuleMaps")(getChunkModuleMaps)
    __obj.updateDynamic("getModules")(getModules)
    __obj.updateDynamic("getModulesIdent")(getModulesIdent)
    __obj.updateDynamic("getNumberOfGroups")(getNumberOfGroups)
    __obj.updateDynamic("getNumberOfModules")(getNumberOfModules)
    __obj.updateDynamic("groupsIterable")(groupsIterable)
    __obj.updateDynamic("hasEntryModule")(hasEntryModule)
    __obj.updateDynamic("hasModuleInGraph")(hasModuleInGraph)
    __obj.updateDynamic("hasRuntime")(hasRuntime)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("ids")(ids)
    __obj.updateDynamic("integrate")(integrate)
    __obj.updateDynamic("integratedSize")(integratedSize)
    __obj.updateDynamic("isEmpty")(isEmpty)
    __obj.updateDynamic("isInGroup")(isInGroup)
    __obj.updateDynamic("isOnlyInitial")(isOnlyInitial)
    __obj.updateDynamic("modulesIterable")(modulesIterable)
    __obj.updateDynamic("modulesSize")(modulesSize)
    __obj.updateDynamic("moveModule")(moveModule)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("removeGroup")(removeGroup)
    __obj.updateDynamic("removeModule")(removeModule)
    __obj.updateDynamic("rendered")(rendered)
    __obj.updateDynamic("renderedHash")(renderedHash)
    __obj.updateDynamic("setModules")(setModules)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("sortModules")(sortModules)
    __obj.updateDynamic("split")(split)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("updateHash")(updateHash)
    __obj.asInstanceOf[Chunk]
  }
}

