package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgnoreIfNotExists extends js.Object {
  var ignoreIfNotExists: js.UndefOr[Boolean] = js.undefined
  var recursive: js.UndefOr[Boolean] = js.undefined
}

object IgnoreIfNotExists {
  @scala.inline
  def apply(
    ignoreIfNotExists: js.UndefOr[Boolean] = js.undefined,
    recursive: js.UndefOr[Boolean] = js.undefined
  ): IgnoreIfNotExists = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreIfNotExists)) __obj.updateDynamic("ignoreIfNotExists")(ignoreIfNotExists.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreIfNotExists]
  }
}

