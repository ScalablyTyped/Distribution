package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPreProcessedFileInfo extends js.Object {
  var diagnostics: js.Array[Diagnostic]
  var importedFiles: js.Array[IFileReference]
  var isLibFile: scala.Boolean
  var referencedFiles: js.Array[IFileReference]
}

object IPreProcessedFileInfo {
  @scala.inline
  def apply(
    diagnostics: js.Array[Diagnostic],
    importedFiles: js.Array[IFileReference],
    isLibFile: scala.Boolean,
    referencedFiles: js.Array[IFileReference]
  ): IPreProcessedFileInfo = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics, importedFiles = importedFiles, isLibFile = isLibFile, referencedFiles = referencedFiles)
  
    __obj.asInstanceOf[IPreProcessedFileInfo]
  }
}

