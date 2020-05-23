package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverwriteBoolean extends js.Object {
  var overwrite: js.UndefOr[Boolean] = js.undefined
}

object OverwriteBoolean {
  @scala.inline
  def apply(overwrite: js.UndefOr[Boolean] = js.undefined): OverwriteBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverwriteBoolean]
  }
}

