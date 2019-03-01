package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResolvedFile extends js.Object {
  var importedFiles: js.Array[java.lang.String]
  var path: java.lang.String
  var referencedFiles: js.Array[java.lang.String]
}

object IResolvedFile {
  @scala.inline
  def apply(
    importedFiles: js.Array[java.lang.String],
    path: java.lang.String,
    referencedFiles: js.Array[java.lang.String]
  ): IResolvedFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("importedFiles")(importedFiles)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("referencedFiles")(referencedFiles)
    __obj.asInstanceOf[IResolvedFile]
  }
}

