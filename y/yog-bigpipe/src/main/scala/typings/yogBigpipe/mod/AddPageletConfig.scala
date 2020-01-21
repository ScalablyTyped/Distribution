package typings.yogBigpipe.mod

import typings.yogBigpipe.mod.Pagelet.mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddPageletConfig extends js.Object {
  var id: String
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[typings.yogBigpipe.mod.Pagelet.mode] = js.undefined
}

object AddPageletConfig {
  @scala.inline
  def apply(id: String, `lazy`: js.UndefOr[Boolean] = js.undefined, mode: mode = null): AddPageletConfig = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPageletConfig]
  }
}

