package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameInfoOptions extends js.Object {
  val allowRenameOfImportPath: js.UndefOr[scala.Boolean] = js.undefined
}

object RenameInfoOptions {
  @scala.inline
  def apply(allowRenameOfImportPath: js.UndefOr[scala.Boolean] = js.undefined): RenameInfoOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowRenameOfImportPath)) __obj.updateDynamic("allowRenameOfImportPath")(allowRenameOfImportPath)
    __obj.asInstanceOf[RenameInfoOptions]
  }
}

