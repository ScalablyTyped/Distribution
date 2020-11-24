package typings.stylableWebpackPlugin.stylableDependenciesMod

import typings.stylableWebpackPlugin.anon.ImportedNames
import typings.stylableWebpackPlugin.typesMod.StylableModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("@stylable/webpack-plugin/cjs/stylable-dependencies", "StylableImportDependency")
@js.native
class StylableImportDependency protected () extends js.Object {
  def this(request: String, hasDefaultImportNames: ImportDefinition) = this()
  
  var defaultImport: String = js.native
  
  def getReference(): ImportedNames | Null = js.native
  
  var module: StylableModule = js.native
  
  var names: js.Any = js.native
  
  def `type`: String = js.native
  
  def updateHash(hash: js.Any): Unit = js.native
  
  var weak: js.Any = js.native
}
/* static members */
@JSImport("@stylable/webpack-plugin/cjs/stylable-dependencies", "StylableImportDependency")
@js.native
object StylableImportDependency extends js.Object {
  
  def createWeak(request: String, originModule: StylableModule, importDef: ImportDefinition): StylableImportDependency = js.native
}
