package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameInfoOptions extends js.Object {
  val allowRenameOfImportPath: js.UndefOr[Boolean] = js.undefined
}

object RenameInfoOptions {
  @scala.inline
  def apply(allowRenameOfImportPath: js.UndefOr[Boolean] = js.undefined): RenameInfoOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowRenameOfImportPath)) __obj.updateDynamic("allowRenameOfImportPath")(allowRenameOfImportPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameInfoOptions]
  }
}

