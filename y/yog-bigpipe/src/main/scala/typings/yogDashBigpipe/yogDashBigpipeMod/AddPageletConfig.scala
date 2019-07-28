package typings.yogDashBigpipe.yogDashBigpipeMod

import typings.yogDashBigpipe.yogDashBigpipeMod.PageletNs.mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddPageletConfig extends js.Object {
  var id: String
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[typings.yogDashBigpipe.yogDashBigpipeMod.PageletNs.mode] = js.undefined
}

object AddPageletConfig {
  @scala.inline
  def apply(id: String, `lazy`: js.UndefOr[Boolean] = js.undefined, mode: mode = null): AddPageletConfig = {
    val __obj = js.Dynamic.literal(id = id)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[AddPageletConfig]
  }
}

