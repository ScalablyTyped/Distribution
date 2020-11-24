package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPreProcessedFileInfo extends js.Object {
  
  var diagnostics: js.Array[Diagnostic] = js.native
  
  var importedFiles: js.Array[IFileReference] = js.native
  
  var isLibFile: Boolean = js.native
  
  var referencedFiles: js.Array[IFileReference] = js.native
}
object IPreProcessedFileInfo {
  
  @scala.inline
  def apply(
    diagnostics: js.Array[Diagnostic],
    importedFiles: js.Array[IFileReference],
    isLibFile: Boolean,
    referencedFiles: js.Array[IFileReference]
  ): IPreProcessedFileInfo = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], importedFiles = importedFiles.asInstanceOf[js.Any], isLibFile = isLibFile.asInstanceOf[js.Any], referencedFiles = referencedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPreProcessedFileInfo]
  }
  
  @scala.inline
  implicit class IPreProcessedFileInfoOps[Self <: IPreProcessedFileInfo] (val x: Self) extends AnyVal {
    
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
    def setDiagnosticsVarargs(value: Diagnostic*): Self = this.set("diagnostics", js.Array(value :_*))
    
    @scala.inline
    def setDiagnostics(value: js.Array[Diagnostic]): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportedFilesVarargs(value: IFileReference*): Self = this.set("importedFiles", js.Array(value :_*))
    
    @scala.inline
    def setImportedFiles(value: js.Array[IFileReference]): Self = this.set("importedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLibFile(value: Boolean): Self = this.set("isLibFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencedFilesVarargs(value: IFileReference*): Self = this.set("referencedFiles", js.Array(value :_*))
    
    @scala.inline
    def setReferencedFiles(value: js.Array[IFileReference]): Self = this.set("referencedFiles", value.asInstanceOf[js.Any])
  }
}
