package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgnoreIfExists extends js.Object {
  var ignoreIfExists: js.UndefOr[Boolean] = js.undefined
  var overwrite: js.UndefOr[Boolean] = js.undefined
}

object IgnoreIfExists {
  @scala.inline
  def apply(ignoreIfExists: js.UndefOr[Boolean] = js.undefined, overwrite: js.UndefOr[Boolean] = js.undefined): IgnoreIfExists = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreIfExists)) __obj.updateDynamic("ignoreIfExists")(ignoreIfExists.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreIfExists]
  }
}

