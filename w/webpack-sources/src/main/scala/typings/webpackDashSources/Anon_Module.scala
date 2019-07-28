package typings.webpackDashSources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Module extends js.Object {
  var module: js.UndefOr[Boolean] = js.undefined
}

object Anon_Module {
  @scala.inline
  def apply(module: js.UndefOr[Boolean] = js.undefined): Anon_Module = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(module)) __obj.updateDynamic("module")(module)
    __obj.asInstanceOf[Anon_Module]
  }
}

