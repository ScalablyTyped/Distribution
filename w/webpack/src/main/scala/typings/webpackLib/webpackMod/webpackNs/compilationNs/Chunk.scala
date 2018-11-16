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

