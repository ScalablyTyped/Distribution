package typings.typescriptDashServices.TypeScript

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
    val __obj = js.Dynamic.literal(importedFiles = importedFiles.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], referencedFiles = referencedFiles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IResolvedFile]
  }
}

