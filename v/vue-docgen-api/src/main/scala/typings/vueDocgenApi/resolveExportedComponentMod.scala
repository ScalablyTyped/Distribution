package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import typings.babelTypes.mod.File_
import typings.vueDocgenApi.resolveRequiredMod.ImportedVariableSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveExportedComponentMod {
  
  @JSImport("vue-docgen-api/dist/utils/resolveExportedComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ast: File_): js.Tuple2[typings.tsMap.mod.default[String, NodePath[js.Any, js.Any]], ImportedVariableSet] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ast.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[typings.tsMap.mod.default[String, NodePath[js.Any, js.Any]], ImportedVariableSet]]
}
