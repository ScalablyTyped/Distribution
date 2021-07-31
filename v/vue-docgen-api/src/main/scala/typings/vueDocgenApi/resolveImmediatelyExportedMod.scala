package typings.vueDocgenApi

import typings.babelTypes.mod.File_
import typings.vueDocgenApi.resolveRequiredMod.ImportedVariableSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveImmediatelyExportedMod {
  
  @JSImport("vue-docgen-api/dist/utils/resolveImmediatelyExported", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(ast: File_, variableFilter: js.Array[String]): ImportedVariableSet = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ast.asInstanceOf[js.Any], variableFilter.asInstanceOf[js.Any])).asInstanceOf[ImportedVariableSet]
}
