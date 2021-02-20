package typings.vueDocgenApi

import org.scalablytyped.runtime.StringDictionary
import typings.babelTypes.mod.File_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveRequiredMod {
  
  @JSImport("vue-docgen-api/dist/utils/resolveRequired", JSImport.Default)
  @js.native
  def default(ast: File_): ImportedVariableSet = js.native
  @JSImport("vue-docgen-api/dist/utils/resolveRequired", JSImport.Default)
  @js.native
  def default(ast: File_, varNameFilter: js.Array[String]): ImportedVariableSet = js.native
  
  @js.native
  trait ImportedVariable extends StObject {
    
    var exportName: String = js.native
    
    var filePath: js.Array[String] = js.native
  }
  object ImportedVariable {
    
    @scala.inline
    def apply(exportName: String, filePath: js.Array[String]): ImportedVariable = {
      val __obj = js.Dynamic.literal(exportName = exportName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportedVariable]
    }
    
    @scala.inline
    implicit class ImportedVariableMutableBuilder[Self <: ImportedVariable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExportName(value: String): Self = StObject.set(x, "exportName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilePath(value: js.Array[String]): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilePathVarargs(value: String*): Self = StObject.set(x, "filePath", js.Array(value :_*))
    }
  }
  
  type ImportedVariableSet = StringDictionary[ImportedVariable]
}
