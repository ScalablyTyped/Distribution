package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResolvedFile extends js.Object {
  
  var importedFiles: js.Array[String] = js.native
  
  var path: String = js.native
  
  var referencedFiles: js.Array[String] = js.native
}
object IResolvedFile {
  
  @scala.inline
  def apply(importedFiles: js.Array[String], path: String, referencedFiles: js.Array[String]): IResolvedFile = {
    val __obj = js.Dynamic.literal(importedFiles = importedFiles.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], referencedFiles = referencedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResolvedFile]
  }
  
  @scala.inline
  implicit class IResolvedFileOps[Self <: IResolvedFile] (val x: Self) extends AnyVal {
    
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
    def setImportedFilesVarargs(value: String*): Self = this.set("importedFiles", js.Array(value :_*))
    
    @scala.inline
    def setImportedFiles(value: js.Array[String]): Self = this.set("importedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencedFilesVarargs(value: String*): Self = this.set("referencedFiles", js.Array(value :_*))
    
    @scala.inline
    def setReferencedFiles(value: js.Array[String]): Self = this.set("referencedFiles", value.asInstanceOf[js.Any])
  }
}
