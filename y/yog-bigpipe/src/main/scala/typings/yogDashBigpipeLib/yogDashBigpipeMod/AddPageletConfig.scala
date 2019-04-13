package typings
package yogDashBigpipeLib.yogDashBigpipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddPageletConfig extends js.Object {
  var id: java.lang.String
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[yogDashBigpipeLib.yogDashBigpipeMod.PageletNs.mode] = js.undefined
}

object AddPageletConfig {
  @scala.inline
  def apply(
    id: java.lang.String,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    mode: yogDashBigpipeLib.yogDashBigpipeMod.PageletNs.mode = null
  ): AddPageletConfig = {
    val __obj = js.Dynamic.literal(id = id)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[AddPageletConfig]
  }
}

