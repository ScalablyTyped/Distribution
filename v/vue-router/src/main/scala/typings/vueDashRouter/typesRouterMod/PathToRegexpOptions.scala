package typings.vueDashRouter.typesRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathToRegexpOptions extends js.Object {
  var end: js.UndefOr[Boolean] = js.undefined
  var sensitive: js.UndefOr[Boolean] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object PathToRegexpOptions {
  @scala.inline
  def apply(
    end: js.UndefOr[Boolean] = js.undefined,
    sensitive: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): PathToRegexpOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end)
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[PathToRegexpOptions]
  }
}

