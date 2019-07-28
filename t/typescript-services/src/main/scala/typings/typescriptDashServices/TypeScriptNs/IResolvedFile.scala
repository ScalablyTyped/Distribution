package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResolvedFile extends js.Object {
  var importedFiles: js.Array[String]
  var path: String
  var referencedFiles: js.Array[String]
}

object IResolvedFile {
  @scala.inline
  def apply(importedFiles: js.Array[String], path: String, referencedFiles: js.Array[String]): IResolvedFile = {
    val __obj = js.Dynamic.literal(importedFiles = importedFiles, path = path, referencedFiles = referencedFiles)
  
    __obj.asInstanceOf[IResolvedFile]
  }
}

