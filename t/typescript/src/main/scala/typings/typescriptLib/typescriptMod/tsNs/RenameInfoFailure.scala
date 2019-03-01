package typings
package typescriptLib.typescriptMod.tsNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canRename")(canRename)
    __obj.updateDynamic("localizedErrorMessage")(localizedErrorMessage)
    __obj.asInstanceOf[RenameInfoFailure]
  }
}

