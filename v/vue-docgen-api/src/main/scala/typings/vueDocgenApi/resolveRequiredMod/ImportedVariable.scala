package typings.vueDocgenApi.resolveRequiredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportedVariable extends js.Object {
  
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
  implicit class ImportedVariableOps[Self <: ImportedVariable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExportName(value: String): Self = this.set("exportName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePathVarargs(value: String*): Self = this.set("filePath", js.Array(value :_*))
    
    @scala.inline
    def setFilePath(value: js.Array[String]): Self = this.set("filePath", value.asInstanceOf[js.Any])
  }
}
