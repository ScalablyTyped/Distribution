package typings.webpack.mod

import typings.std.Map
import typings.webpack.anon.ModuleReferenceOptionsind
import typings.webpack.anon.PartialModuleReferenceOpt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "ConcatenationScope")
@js.native
open class ConcatenationScope protected () extends StObject {
  def this(modulesMap: js.Array[ModuleInfo], currentModule: ConcatenatedModuleInfo) = this()
  def this(modulesMap: Map[Module, ModuleInfo], currentModule: ConcatenatedModuleInfo) = this()
  
  def createModuleReference(module: Module, __1: PartialModuleReferenceOpt): String = js.native
  
  def isModuleInScope(module: Module): Boolean = js.native
  
  def registerExport(exportName: String, symbol: String): Unit = js.native
  
  def registerNamespaceExport(symbol: String): Unit = js.native
  
  def registerRawExport(exportName: String, expression: String): Unit = js.native
}
object ConcatenationScope {
  
  @JSImport("webpack", "ConcatenationScope")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("webpack", "ConcatenationScope.DEFAULT_EXPORT")
  @js.native
  def DEFAULT_EXPORT: String = js.native
  inline def DEFAULT_EXPORT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_EXPORT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("webpack", "ConcatenationScope.NAMESPACE_OBJECT_EXPORT")
  @js.native
  def NAMESPACE_OBJECT_EXPORT: String = js.native
  inline def NAMESPACE_OBJECT_EXPORT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAMESPACE_OBJECT_EXPORT")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def isModuleReference(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModuleReference")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def matchModuleReference(name: String): ModuleReferenceOptionsind = ^.asInstanceOf[js.Dynamic].applyDynamic("matchModuleReference")(name.asInstanceOf[js.Any]).asInstanceOf[ModuleReferenceOptionsind]
}
