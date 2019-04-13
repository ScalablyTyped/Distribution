package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreProcessedFileInfo extends js.Object {
  var ambientExternalModules: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var importedFiles: js.Array[FileReference]
  var isLibFile: scala.Boolean
  var libReferenceDirectives: js.Array[FileReference]
  var referencedFiles: js.Array[FileReference]
  var typeReferenceDirectives: js.Array[FileReference]
}

object PreProcessedFileInfo {
  @scala.inline
  def apply(
    importedFiles: js.Array[FileReference],
    isLibFile: scala.Boolean,
    libReferenceDirectives: js.Array[FileReference],
    referencedFiles: js.Array[FileReference],
    typeReferenceDirectives: js.Array[FileReference],
    ambientExternalModules: js.Array[java.lang.String] = null
  ): PreProcessedFileInfo = {
    val __obj = js.Dynamic.literal(importedFiles = importedFiles, isLibFile = isLibFile, libReferenceDirectives = libReferenceDirectives, referencedFiles = referencedFiles, typeReferenceDirectives = typeReferenceDirectives)
    if (ambientExternalModules != null) __obj.updateDynamic("ambientExternalModules")(ambientExternalModules)
    __obj.asInstanceOf[PreProcessedFileInfo]
  }
}

