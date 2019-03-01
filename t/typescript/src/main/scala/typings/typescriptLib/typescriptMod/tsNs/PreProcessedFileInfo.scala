package typings
package typescriptLib.typescriptMod.tsNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("importedFiles")(importedFiles)
    __obj.updateDynamic("isLibFile")(isLibFile)
    __obj.updateDynamic("libReferenceDirectives")(libReferenceDirectives)
    __obj.updateDynamic("referencedFiles")(referencedFiles)
    __obj.updateDynamic("typeReferenceDirectives")(typeReferenceDirectives)
    if (ambientExternalModules != null) __obj.updateDynamic("ambientExternalModules")(ambientExternalModules)
    __obj.asInstanceOf[PreProcessedFileInfo]
  }
}

