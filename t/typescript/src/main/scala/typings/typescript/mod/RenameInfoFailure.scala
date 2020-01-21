package typings.typescript.mod

import typings.typescript.typescriptBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameInfoFailure extends RenameInfo {
  var canRename: `false`
  var localizedErrorMessage: java.lang.String
}

object RenameInfoFailure {
  @scala.inline
  def apply(canRename: `false`, localizedErrorMessage: java.lang.String): RenameInfoFailure = {
    val __obj = js.Dynamic.literal(canRename = canRename.asInstanceOf[js.Any], localizedErrorMessage = localizedErrorMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenameInfoFailure]
  }
}

