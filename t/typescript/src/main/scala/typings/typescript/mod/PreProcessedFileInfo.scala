package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreProcessedFileInfo extends js.Object {
  var ambientExternalModules: js.UndefOr[js.Array[java.lang.String]] = js.native
  var importedFiles: js.Array[FileReference] = js.native
  var isLibFile: Boolean = js.native
  var libReferenceDirectives: js.Array[FileReference] = js.native
  var referencedFiles: js.Array[FileReference] = js.native
  var typeReferenceDirectives: js.Array[FileReference] = js.native
}

object PreProcessedFileInfo {
  @scala.inline
  def apply(
    importedFiles: js.Array[FileReference],
    isLibFile: Boolean,
    libReferenceDirectives: js.Array[FileReference],
    referencedFiles: js.Array[FileReference],
    typeReferenceDirectives: js.Array[FileReference]
  ): PreProcessedFileInfo = {
    val __obj = js.Dynamic.literal(importedFiles = importedFiles.asInstanceOf[js.Any], isLibFile = isLibFile.asInstanceOf[js.Any], libReferenceDirectives = libReferenceDirectives.asInstanceOf[js.Any], referencedFiles = referencedFiles.asInstanceOf[js.Any], typeReferenceDirectives = typeReferenceDirectives.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreProcessedFileInfo]
  }
  @scala.inline
  implicit class PreProcessedFileInfoOps[Self <: PreProcessedFileInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImportedFilesVarargs(value: FileReference*): Self = this.set("importedFiles", js.Array(value :_*))
    @scala.inline
    def setImportedFiles(value: js.Array[FileReference]): Self = this.set("importedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLibFile(value: Boolean): Self = this.set("isLibFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setLibReferenceDirectivesVarargs(value: FileReference*): Self = this.set("libReferenceDirectives", js.Array(value :_*))
    @scala.inline
    def setLibReferenceDirectives(value: js.Array[FileReference]): Self = this.set("libReferenceDirectives", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferencedFilesVarargs(value: FileReference*): Self = this.set("referencedFiles", js.Array(value :_*))
    @scala.inline
    def setReferencedFiles(value: js.Array[FileReference]): Self = this.set("referencedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeReferenceDirectivesVarargs(value: FileReference*): Self = this.set("typeReferenceDirectives", js.Array(value :_*))
    @scala.inline
    def setTypeReferenceDirectives(value: js.Array[FileReference]): Self = this.set("typeReferenceDirectives", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmbientExternalModulesVarargs(value: java.lang.String*): Self = this.set("ambientExternalModules", js.Array(value :_*))
    @scala.inline
    def setAmbientExternalModules(value: js.Array[java.lang.String]): Self = this.set("ambientExternalModules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmbientExternalModules: Self = this.set("ambientExternalModules", js.undefined)
  }
  
}

