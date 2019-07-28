package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IgnoreIfNotExists extends js.Object {
  var ignoreIfNotExists: js.UndefOr[Boolean] = js.undefined
  var recursive: js.UndefOr[Boolean] = js.undefined
}

object Anon_IgnoreIfNotExists {
  @scala.inline
  def apply(
    ignoreIfNotExists: js.UndefOr[Boolean] = js.undefined,
    recursive: js.UndefOr[Boolean] = js.undefined
  ): Anon_IgnoreIfNotExists = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreIfNotExists)) __obj.updateDynamic("ignoreIfNotExists")(ignoreIfNotExists)
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    __obj.asInstanceOf[Anon_IgnoreIfNotExists]
  }
}

