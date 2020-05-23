package typings.webpackSources.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends js.Object {
  var module: js.UndefOr[Boolean] = js.undefined
}

object Module {
  @scala.inline
  def apply(module: js.UndefOr[Boolean] = js.undefined): Module = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(module)) __obj.updateDynamic("module")(module.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
}

