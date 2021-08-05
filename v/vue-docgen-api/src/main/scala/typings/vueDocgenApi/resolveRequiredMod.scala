package typings.vueDocgenApi

import org.scalablytyped.runtime.StringDictionary
import typings.babelTypes.mod.File_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveRequiredMod {
  
  @JSImport("vue-docgen-api/dist/utils/resolveRequired", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ast: File_): ImportedVariableSet = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ast.asInstanceOf[js.Any]).asInstanceOf[ImportedVariableSet]
  inline def default(ast: File_, varNameFilter: js.Array[String]): ImportedVariableSet = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ast.asInstanceOf[js.Any], varNameFilter.asInstanceOf[js.Any])).asInstanceOf[ImportedVariableSet]
  
  trait ImportedVariable extends StObject {
    
    var exportName: String
    
    var filePath: js.Array[String]
  }
  object ImportedVariable {
    
    inline def apply(exportName: String, filePath: js.Array[String]): ImportedVariable = {
      val __obj = js.Dynamic.literal(exportName = exportName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportedVariable]
    }
    
    extension [Self <: ImportedVariable](x: Self) {
      
      inline def setExportName(value: String): Self = StObject.set(x, "exportName", value.asInstanceOf[js.Any])
      
      inline def setFilePath(value: js.Array[String]): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathVarargs(value: String*): Self = StObject.set(x, "filePath", js.Array(value :_*))
    }
  }
  
  type ImportedVariableSet = StringDictionary[ImportedVariable]
}
