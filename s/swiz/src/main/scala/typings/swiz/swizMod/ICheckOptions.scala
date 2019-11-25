package typings.swiz.swizMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckOptions extends js.Object {
  var strict: js.UndefOr[Boolean] = js.undefined
}

object ICheckOptions {
  @scala.inline
  def apply(strict: js.UndefOr[Boolean] = js.undefined): ICheckOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckOptions]
  }
}

