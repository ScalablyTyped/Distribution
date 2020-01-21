package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOverwriteBoolean extends js.Object {
  var overwrite: js.UndefOr[Boolean] = js.undefined
}

object AnonOverwriteBoolean {
  @scala.inline
  def apply(overwrite: js.UndefOr[Boolean] = js.undefined): AnonOverwriteBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOverwriteBoolean]
  }
}

