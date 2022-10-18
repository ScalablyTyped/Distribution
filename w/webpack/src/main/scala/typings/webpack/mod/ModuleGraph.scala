package typings.webpack.mod

import typings.std.Map
import typings.webpack.webpackBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleGraph extends StObject {
  
  def addExplanation(dependency: Dependency, explanation: String): Unit = js.native
  
  def addExtraReason(module: Module, explanation: String): Unit = js.native
  
  def cached[T /* <: js.Array[Any] */, V](
    fn: js.Function2[/* moduleGraph */ this.type, /* args */ T, V],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): V = js.native
  
  def cloneModuleAttributes(sourceModule: Module, targetModule: Module): Unit = js.native
  
  def copyOutgoingModuleConnections(
    oldModule: Module,
    newModule: Module,
    filterConnection: js.Function1[/* arg0 */ ModuleGraphConnection, Boolean]
  ): Unit = js.native
  
  def dependencyCacheProvide(dependency: Dependency, args: Any*): Any = js.native
  
  def freeze(): Unit = js.native
  def freeze(cacheStage: String): Unit = js.native
  
  def getConnection(dependency: Dependency): js.UndefOr[ModuleGraphConnection] = js.native
  
  def getDepth(module: Module): Double = js.native
  
  def getExportInfo(module: Module, exportName: String): ExportInfo = js.native
  
  def getExportsInfo(module: Module): ExportsInfo = js.native
  
  def getIncomingConnections(module: Module): js.Iterable[ModuleGraphConnection] = js.native
  
  def getIncomingConnectionsByOriginModule(module: Module): Map[js.UndefOr[Module], js.Array[ModuleGraphConnection]] = js.native
  
  def getIssuer(module: Module): Null | Module = js.native
  
  def getMeta(): js.Object = js.native
  def getMeta(thing: Any): js.Object = js.native
  
  def getMetaIfExisting(): js.Object = js.native
  def getMetaIfExisting(thing: Any): js.Object = js.native
  
  def getModule(dependency: Dependency): Module = js.native
  
  def getOptimizationBailout(module: Module): js.Array[String | (js.Function1[/* requestShortener */ RequestShortener, String])] = js.native
  
  def getOrigin(dependency: Dependency): Module = js.native
  
  def getOutgoingConnections(module: Module): js.Iterable[ModuleGraphConnection] = js.native
  
  def getOutgoingConnectionsByModule(module: Module): js.UndefOr[Map[js.UndefOr[Module], js.Array[ModuleGraphConnection]]] = js.native
  
  def getParentBlock(dependency: Dependency): DependenciesBlock = js.native
  
  def getParentBlockIndex(dependency: Dependency): Double = js.native
  
  def getParentModule(dependency: Dependency): Module = js.native
  
  def getPostOrderIndex(module: Module): Double = js.native
  
  def getPreOrderIndex(module: Module): Double = js.native
  
  def getProfile(module: Module): Null | ModuleProfile = js.native
  
  def getProvidedExports(module: Module): Null | `true` | js.Array[String] = js.native
  
  def getReadOnlyExportInfo(module: Module, exportName: String): ExportInfo = js.native
  
  def getResolvedModule(dependency: Dependency): Module = js.native
  
  def getResolvedOrigin(dependency: Dependency): Module = js.native
  
  def getUsedExports(module: Module, runtime: RuntimeSpec): Null | Boolean | SortableSet[String] = js.native
  
  def isAsync(module: Module): Boolean = js.native
  
  def isExportProvided(module: Module, exportName: String): Null | Boolean = js.native
  def isExportProvided(module: Module, exportName: js.Array[String]): Null | Boolean = js.native
  
  def moveModuleConnections(
    oldModule: Module,
    newModule: Module,
    filterConnection: js.Function1[/* arg0 */ ModuleGraphConnection, Boolean]
  ): Unit = js.native
  
  def removeAllModuleAttributes(): Unit = js.native
  
  def removeConnection(dependency: Dependency): Unit = js.native
  
  def removeModuleAttributes(module: Module): Unit = js.native
  
  def setAsync(module: Module): Unit = js.native
  
  def setDepth(module: Module, depth: Double): Unit = js.native
  
  def setDepthIfLower(module: Module, depth: Double): Boolean = js.native
  
  def setIssuer(module: Module): Unit = js.native
  def setIssuer(module: Module, issuer: Module): Unit = js.native
  
  def setIssuerIfUnset(module: Module): Unit = js.native
  def setIssuerIfUnset(module: Module, issuer: Module): Unit = js.native
  
  def setModuleMemCaches(moduleMemCaches: Map[Module, WeakTupleMap[Any, Any]]): Unit = js.native
  
  def setParents(dependency: Dependency, block: DependenciesBlock, module: Module): Unit = js.native
  def setParents(dependency: Dependency, block: DependenciesBlock, module: Module, indexInBlock: Double): Unit = js.native
  
  def setPostOrderIndex(module: Module, index: Double): Unit = js.native
  
  def setPostOrderIndexIfUnset(module: Module, index: Double): Boolean = js.native
  
  def setPreOrderIndex(module: Module, index: Double): Unit = js.native
  
  def setPreOrderIndexIfUnset(module: Module, index: Double): Boolean = js.native
  
  def setProfile(module: Module): Unit = js.native
  def setProfile(module: Module, profile: ModuleProfile): Unit = js.native
  
  def setResolvedModule(originModule: Module, dependency: Dependency, module: Module): Unit = js.native
  
  def unfreeze(): Unit = js.native
  
  def updateModule(dependency: Dependency, module: Module): Unit = js.native
}
