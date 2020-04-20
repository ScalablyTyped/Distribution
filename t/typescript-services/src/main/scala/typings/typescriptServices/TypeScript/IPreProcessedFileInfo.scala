package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPreProcessedFileInfo extends js.Object {
  var diagnostics: js.Array[Diagnostic]
  var importedFiles: js.Array[IFileReference]
  var isLibFile: Boolean
  var referencedFiles: js.Array[IFileReference]
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
}

