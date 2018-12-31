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

