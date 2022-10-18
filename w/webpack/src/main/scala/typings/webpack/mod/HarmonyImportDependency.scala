package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HarmonyImportDependency
  extends StObject
     with ModuleDependency {
  
  def getImportStatement(update: Boolean, __1: DependencyTemplateContext): js.Tuple2[String, String] = js.native
  
  def getImportVar(moduleGraph: ModuleGraph): String = js.native
  
  def getLinkingErrors(moduleGraph: ModuleGraph, ids: js.Array[String], additionalMessage: String): js.UndefOr[js.Array[WebpackError]] = js.native
  
  var sourceOrder: Double = js.native
}
object HarmonyImportDependency {
  
  /* was `typeof HarmonyImportDependencyTemplate` */
  type Template = HarmonyImportDependencyTemplate
}
