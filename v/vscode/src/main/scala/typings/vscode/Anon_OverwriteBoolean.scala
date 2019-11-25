package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OverwriteBoolean extends js.Object {
  var overwrite: js.UndefOr[Boolean] = js.undefined
}

object Anon_OverwriteBoolean {
  @scala.inline
  def apply(overwrite: js.UndefOr[Boolean] = js.undefined): Anon_OverwriteBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OverwriteBoolean]
  }
}

