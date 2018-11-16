package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "compilation")
@js.native
object compilationNs extends js.Object {
  @js.native
  class Asset ()
    extends webpackLib.webpackMod.webpackNs.compilationNs.Asset
  
  @js.native
  class Chunk protected ()
    extends webpackLib.webpackMod.webpackNs.compilationNs.Chunk {
    def this(name: java.lang.String) = this()
    /* CompleteClass */
    override var chunkReason: js.Any = js.native
    /* CompleteClass */
    override var debugId: scala.Double = js.native
    /* CompleteClass */
    override var entryModule: js.Any = js.native
    /* CompleteClass */
    override var extraAsync: scala.Boolean = js.native
    /* CompleteClass */
    override var files: js.Array[_] = js.native
    /* CompleteClass */
    override var groupsIterable: js.Array[_] = js.native
    /* CompleteClass */
    override var hash: js.Any = js.native
    /* CompleteClass */
    override var id: js.Any = js.native
    /* CompleteClass */
    override var ids: js.Any = js.native
    /* CompleteClass */
    override var modulesIterable: js.Array[_] = js.native
    /* CompleteClass */
    override var name: js.Any = js.native
    /* CompleteClass */
    override var rendered: scala.Boolean = js.native
    /* CompleteClass */
    override var renderedHash: js.Any = js.native
    /* CompleteClass */
    override def addGroup(chunkGroup: js.Any): scala.Boolean = js.native
    /* CompleteClass */
    override def addModule(module: js.Any): scala.Boolean = js.native
    /* CompleteClass */
    override def addMultiplierAndOverhead(size: scala.Double, options: js.Any): scala.Double = js.native
    /* CompleteClass */
    override def canBeInitial(): scala.Boolean = js.native
    /* CompleteClass */
    override def canBeIntegrated(otherChunk: js.Any): scala.Boolean = js.native
    /* CompleteClass */
    override def compareTo(otherChunk: js.Any): webpackLib.webpackLibNumbers.`-1` | webpackLib.webpackLibNumbers.`0` | webpackLib.webpackLibNumbers.`1` = js.native
    /* CompleteClass */
    override def containsModule(module: js.Any): scala.Boolean = js.native
    /* CompleteClass */
    override def getAllAsyncChunks(): nodeLib.Set[_] = js.native
    /* CompleteClass */
    override def getChunkMaps(realHash: js.Any): webpackLib.Anon_Hash = js.native
    // tslint:disable-next-line:ban-types
    /* CompleteClass */
    override def getChunkModuleMaps(filterFn: js.Function): webpackLib.Anon_HashId = js.native
    /* CompleteClass */
    override def getModules(): js.Array[_] = js.native
    /* CompleteClass */
    override def getModulesIdent(): js.Array[_] = js.native
    /* CompleteClass */
    override def getNumberOfGroups(): scala.Double = js.native
    /* CompleteClass */
    override def getNumberOfModules(): scala.Double = js.native
    /* CompleteClass */
    override def hasEntryModule(): scala.Boolean = js.native
    // tslint:disable-next-line:ban-types
    /* CompleteClass */
    override def hasModuleInGraph(filterFn: js.Function, filterChunkFn: js.Function): scala.Boolean = js.native
    /* CompleteClass */
    override def hasRuntime(): scala.Boolean = js.native
    /* CompleteClass */
    override def integrate(otherChunk: js.Any, reason: js.Any): scala.Boolean = js.native
    /* CompleteClass */
    override def integratedSize(otherChunk: js.Any, options: js.Any): scala.Double = js.native
    /* CompleteClass */
    override def isEmpty(): scala.Boolean = js.native
    /* CompleteClass */
    override def isInGroup(chunkGroup: js.Any): scala.Boolean = js.native
    /* CompleteClass */
    override def isOnlyInitial(): scala.Boolean = js.native
    /* CompleteClass */
    override def modulesSize(): scala.Double = js.native
    /* CompleteClass */
    override def moveModule(module: js.Any, otherChunk: js.Any): scala.Unit = js.native
    /* CompleteClass */
    override def remove(reason: js.Any): scala.Unit = js.native
    /* CompleteClass */
    override def removeGroup(chunkGroup: js.Any): scala.Boolean = js.native
    /* CompleteClass */
    override def removeModule(module: js.Any): scala.Boolean = js.native
    /* CompleteClass */
    override def setModules(modules: js.Any): scala.Unit = js.native
    /* CompleteClass */
    override def size(options: js.Any): scala.Double = js.native
    // tslint:disable-next-line:ban-types
    /* CompleteClass */
    override def sortModules(sortByFn: js.Function): scala.Unit = js.native
    /* CompleteClass */
    override def split(newChunk: js.Any): scala.Unit = js.native
    /* CompleteClass */
    override def updateHash(hash: js.Any): scala.Unit = js.native
  }
  
  @js.native
  class ChunkGroup ()
    extends webpackLib.webpackMod.webpackNs.compilationNs.ChunkGroup
  
  @js.native
  class ChunkHash ()
    extends webpackLib.webpackMod.webpackNs.compilationNs.ChunkHash
  
  @js.native
  class ChunkTemplate ()
    extends webpackLib.webpackMod.webpackNs.compilationNs.ChunkTemplate
  
  @js.native
  class Compilation ()
    extends webpackLib.webpackMod.webpackNs.compilationNs.Compilation
  
  @js.native
  class ContextModuleFactory ()
    extends webpackLib.webpackMod.webpackNs.compilationNs.ContextModuleFactory
  
  @js.native
  class Dependency ()
    extends webpackLib.webpackMod.webpackNs.compilationNs.Dependency {
    /* CompleteClass */
    override def disconnect(): scala.Unit = js.native
    /* CompleteClass */
    override def getErrors(): js.Any = js.native
    /* CompleteClass */
    override def getExports(): js.Any = js.native
    /* CompleteClass */
    override def getReference(): js.Any = js.native
    /* CompleteClass */
    override def getResourceIdentifier(): js.Any = js.native
    /* CompleteClass */
    override def getWarnings(): js.Any = js.native
    /* CompleteClass */
    override def updateHash(hash: js.Any): scala.Unit = js.native
  }
  
  @js.native
  class DllModuleFactory ()
    extends webpackLib.webpackMod.webpackNs.compilationNs.DllModuleFactory
  
  @js.native
  class HotUpdateChunkTemplate ()
    extends webpackLib.webpackMod.webpackNs.compilationNs.HotUpdateChunkTemplate
  
  @js.native
  class MainTemplate ()
    extends webpackLib.webpackMod.webpackNs.compilationNs.MainTemplate
  
  @js.native
  class Module ()
    extends webpackLib.webpackMod.webpackNs.compilationNs.Module
  
  @js.native
  class ModuleTemplate ()
    extends webpackLib.webpackMod.webpackNs.compilationNs.ModuleTemplate
  
  @js.native
  class NormalModuleFactory ()
    extends webpackLib.webpackMod.webpackNs.compilationNs.NormalModuleFactory
  
  @js.native
  class Record ()
    extends webpackLib.webpackMod.webpackNs.compilationNs.Record
  
  @js.native
  class RuntimeTemplate ()
    extends webpackLib.webpackMod.webpackNs.compilationNs.RuntimeTemplate
  
  @js.native
  object Dependency extends js.Object {
    def compare(a: js.Any, b: js.Any): js.Any = js.native
  }
  
}

