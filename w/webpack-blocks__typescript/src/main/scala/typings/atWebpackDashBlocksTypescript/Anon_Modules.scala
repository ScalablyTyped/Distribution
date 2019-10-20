package typings.atWebpackDashBlocksTypescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Modules extends js.Object {
  var modules: js.UndefOr[Boolean] = js.undefined
  var targets: js.UndefOr[String] = js.undefined
}

object Anon_Modules {
  @scala.inline
  def apply(modules: js.UndefOr[Boolean] = js.undefined, targets: String = null): Anon_Modules = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(modules)) __obj.updateDynamic("modules")(modules)
    if (targets != null) __obj.updateDynamic("targets")(targets)
    __obj.asInstanceOf[Anon_Modules]
  }
}

