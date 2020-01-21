package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreProcessedFileInfo extends js.Object {
  var ambientExternalModules: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var importedFiles: js.Array[FileReference]
  var isLibFile: Boolean
  var libReferenceDirectives: js.Array[FileReference]
  var referencedFiles: js.Array[FileReference]
  var typeReferenceDirectives: js.Array[FileReference]
}

object PreProcessedFileInfo {
  @scala.inline
  def apply(
    importedFiles: js.Array[FileReference],
    isLibFile: Boolean,
    libReferenceDirectives: js.Array[FileReference],
    referencedFiles: js.Array[FileReference],
    typeReferenceDirectives: js.Array[FileReference],
    ambientExternalModules: js.Array[java.lang.String] = null
  ): PreProcessedFileInfo = {
    val __obj = js.Dynamic.literal(importedFiles = importedFiles.asInstanceOf[js.Any], isLibFile = isLibFile.asInstanceOf[js.Any], libReferenceDirectives = libReferenceDirectives.asInstanceOf[js.Any], referencedFiles = referencedFiles.asInstanceOf[js.Any], typeReferenceDirectives = typeReferenceDirectives.asInstanceOf[js.Any])
    if (ambientExternalModules != null) __obj.updateDynamic("ambientExternalModules")(ambientExternalModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreProcessedFileInfo]
  }
}

