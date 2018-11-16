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

