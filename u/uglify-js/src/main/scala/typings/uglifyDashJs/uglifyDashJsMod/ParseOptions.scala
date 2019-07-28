package typings.uglifyDashJs.uglifyDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  /** Support top level `return` statements */
  var bare_returns: js.UndefOr[Boolean] = js.undefined
  var html5_comments: js.UndefOr[Boolean] = js.undefined
  /** Support `#!command` as the first line */
  var shebang: js.UndefOr[Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    bare_returns: js.UndefOr[Boolean] = js.undefined,
    html5_comments: js.UndefOr[Boolean] = js.undefined,
    shebang: js.UndefOr[Boolean] = js.undefined
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bare_returns)) __obj.updateDynamic("bare_returns")(bare_returns)
    if (!js.isUndefined(html5_comments)) __obj.updateDynamic("html5_comments")(html5_comments)
    if (!js.isUndefined(shebang)) __obj.updateDynamic("shebang")(shebang)
    __obj.asInstanceOf[ParseOptions]
  }
}

