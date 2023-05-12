package typings.vite.mod

import typings.rollup.mod.PartialResolvedId
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vite", "ModuleGraph")
@js.native
open class ModuleGraph protected () extends StObject {
  /* Excluded from this release type: _unresolvedUrlToModuleMap */
  /* Excluded from this release type: _ssrUnresolvedUrlToModuleMap */
  def this(resolveId: js.Function2[/* url */ String, /* ssr */ Boolean, js.Promise[PartialResolvedId | Null]]) = this()
  
  /* Excluded from this release type: _ensureEntryFromUrl */
  def createFileOnlyEntry(file: String): ModuleNode = js.native
  
  def ensureEntryFromUrl(rawUrl: String): js.Promise[ModuleNode] = js.native
  def ensureEntryFromUrl(rawUrl: String, ssr: Boolean): js.Promise[ModuleNode] = js.native
  def ensureEntryFromUrl(rawUrl: String, ssr: Boolean, setIsSelfAccepting: Boolean): js.Promise[ModuleNode] = js.native
  def ensureEntryFromUrl(rawUrl: String, ssr: Unit, setIsSelfAccepting: Boolean): js.Promise[ModuleNode] = js.native
  
  var fileToModulesMap: Map[String, Set[ModuleNode]] = js.native
  
  def getModuleById(id: String): js.UndefOr[ModuleNode] = js.native
  
  def getModuleByUrl(rawUrl: String): js.Promise[js.UndefOr[ModuleNode]] = js.native
  def getModuleByUrl(rawUrl: String, ssr: Boolean): js.Promise[js.UndefOr[ModuleNode]] = js.native
  
  def getModulesByFile(file: String): js.UndefOr[Set[ModuleNode]] = js.native
  
  var idToModuleMap: Map[String, ModuleNode] = js.native
  
  def invalidateAll(): Unit = js.native
  
  def invalidateModule(mod: ModuleNode): Unit = js.native
  def invalidateModule(mod: ModuleNode, seen: Unit, timestamp: Double): Unit = js.native
  def invalidateModule(mod: ModuleNode, seen: Unit, timestamp: Double, isHmr: Boolean): Unit = js.native
  def invalidateModule(mod: ModuleNode, seen: Unit, timestamp: Unit, isHmr: Boolean): Unit = js.native
  def invalidateModule(mod: ModuleNode, seen: Set[ModuleNode]): Unit = js.native
  def invalidateModule(mod: ModuleNode, seen: Set[ModuleNode], timestamp: Double): Unit = js.native
  def invalidateModule(mod: ModuleNode, seen: Set[ModuleNode], timestamp: Double, isHmr: Boolean): Unit = js.native
  def invalidateModule(mod: ModuleNode, seen: Set[ModuleNode], timestamp: Unit, isHmr: Boolean): Unit = js.native
  
  def onFileChange(file: String): Unit = js.native
  
  /* private */ var resolveId: Any = js.native
  
  def resolveUrl(url: String): js.Promise[ResolvedUrl] = js.native
  def resolveUrl(url: String, ssr: Boolean): js.Promise[ResolvedUrl] = js.native
  
  var safeModulesPath: Set[String] = js.native
  
  def updateModuleInfo(
    mod: ModuleNode,
    importedModules: Set[String | ModuleNode],
    importedBindings: Null,
    acceptedModules: Set[String | ModuleNode],
    acceptedExports: Null,
    isSelfAccepting: Boolean
  ): js.Promise[js.UndefOr[Set[ModuleNode]]] = js.native
  def updateModuleInfo(
    mod: ModuleNode,
    importedModules: Set[String | ModuleNode],
    importedBindings: Null,
    acceptedModules: Set[String | ModuleNode],
    acceptedExports: Null,
    isSelfAccepting: Boolean,
    ssr: Boolean
  ): js.Promise[js.UndefOr[Set[ModuleNode]]] = js.native
  def updateModuleInfo(
    mod: ModuleNode,
    importedModules: Set[String | ModuleNode],
    importedBindings: Null,
    acceptedModules: Set[String | ModuleNode],
    acceptedExports: Set[String],
    isSelfAccepting: Boolean
  ): js.Promise[js.UndefOr[Set[ModuleNode]]] = js.native
  def updateModuleInfo(
    mod: ModuleNode,
    importedModules: Set[String | ModuleNode],
    importedBindings: Null,
    acceptedModules: Set[String | ModuleNode],
    acceptedExports: Set[String],
    isSelfAccepting: Boolean,
    ssr: Boolean
  ): js.Promise[js.UndefOr[Set[ModuleNode]]] = js.native
  def updateModuleInfo(
    mod: ModuleNode,
    importedModules: Set[String | ModuleNode],
    importedBindings: Map[String, Set[String]],
    acceptedModules: Set[String | ModuleNode],
    acceptedExports: Null,
    isSelfAccepting: Boolean
  ): js.Promise[js.UndefOr[Set[ModuleNode]]] = js.native
  def updateModuleInfo(
    mod: ModuleNode,
    importedModules: Set[String | ModuleNode],
    importedBindings: Map[String, Set[String]],
    acceptedModules: Set[String | ModuleNode],
    acceptedExports: Null,
    isSelfAccepting: Boolean,
    ssr: Boolean
  ): js.Promise[js.UndefOr[Set[ModuleNode]]] = js.native
  /**
    * Update the module graph based on a module's updated imports information
    * If there are dependencies that no longer have any importers, they are
    * returned as a Set.
    */
  def updateModuleInfo(
    mod: ModuleNode,
    importedModules: Set[String | ModuleNode],
    importedBindings: Map[String, Set[String]],
    acceptedModules: Set[String | ModuleNode],
    acceptedExports: Set[String],
    isSelfAccepting: Boolean
  ): js.Promise[js.UndefOr[Set[ModuleNode]]] = js.native
  def updateModuleInfo(
    mod: ModuleNode,
    importedModules: Set[String | ModuleNode],
    importedBindings: Map[String, Set[String]],
    acceptedModules: Set[String | ModuleNode],
    acceptedExports: Set[String],
    isSelfAccepting: Boolean,
    ssr: Boolean
  ): js.Promise[js.UndefOr[Set[ModuleNode]]] = js.native
  
  var urlToModuleMap: Map[String, ModuleNode] = js.native
}
