package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameInfoFailure extends RenameInfo {
  var canRename: typescriptLib.typescriptLibNumbers.`false`
  var localizedErrorMessage: java.lang.String
}

object RenameInfoFailure {
  @scala.inline
  def apply(canRename: typescriptLib.typescriptLibNumbers.`false`, localizedErrorMessage: java.lang.String): RenameInfoFailure = {
    val __obj = js.Dynamic.literal(canRename = canRename, localizedErrorMessage = localizedErrorMessage)
  
    __obj.asInstanceOf[RenameInfoFailure]
  }
}

