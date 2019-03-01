package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyCodeActionCommandResult extends js.Object {
  var successMessage: java.lang.String
}

object ApplyCodeActionCommandResult {
  @scala.inline
  def apply(successMessage: java.lang.String): ApplyCodeActionCommandResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("successMessage")(successMessage)
    __obj.asInstanceOf[ApplyCodeActionCommandResult]
  }
}

