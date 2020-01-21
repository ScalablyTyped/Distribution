package typings.terser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var bare_returns: js.UndefOr[Boolean] = js.undefined
  var ecma: js.UndefOr[ECMA] = js.undefined
  var html5_comments: js.UndefOr[Boolean] = js.undefined
  var shebang: js.UndefOr[Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    bare_returns: js.UndefOr[Boolean] = js.undefined,
    ecma: ECMA = null,
    html5_comments: js.UndefOr[Boolean] = js.undefined,
    shebang: js.UndefOr[Boolean] = js.undefined
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bare_returns)) __obj.updateDynamic("bare_returns")(bare_returns.asInstanceOf[js.Any])
    if (ecma != null) __obj.updateDynamic("ecma")(ecma.asInstanceOf[js.Any])
    if (!js.isUndefined(html5_comments)) __obj.updateDynamic("html5_comments")(html5_comments.asInstanceOf[js.Any])
    if (!js.isUndefined(shebang)) __obj.updateDynamic("shebang")(shebang.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

