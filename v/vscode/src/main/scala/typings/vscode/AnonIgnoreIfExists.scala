package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIgnoreIfExists extends js.Object {
  var ignoreIfExists: js.UndefOr[Boolean] = js.undefined
  var overwrite: js.UndefOr[Boolean] = js.undefined
}

object AnonIgnoreIfExists {
  @scala.inline
  def apply(ignoreIfExists: js.UndefOr[Boolean] = js.undefined, overwrite: js.UndefOr[Boolean] = js.undefined): AnonIgnoreIfExists = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreIfExists)) __obj.updateDynamic("ignoreIfExists")(ignoreIfExists.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIgnoreIfExists]
  }
}

