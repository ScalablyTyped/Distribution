package typings
package typestubDashIpfsLib.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var EXPERIMENTAL: js.UndefOr[js.Any] = js.undefined
  var config: js.UndefOr[js.Any] = js.undefined
  var init: js.UndefOr[scala.Boolean] = js.undefined
  var repo: js.UndefOr[java.lang.String] = js.undefined
  var start: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    EXPERIMENTAL: js.Any = null,
    config: js.Any = null,
    init: js.UndefOr[scala.Boolean] = js.undefined,
    repo: java.lang.String = null,
    start: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (EXPERIMENTAL != null) __obj.updateDynamic("EXPERIMENTAL")(EXPERIMENTAL)
    if (config != null) __obj.updateDynamic("config")(config)
    if (!js.isUndefined(init)) __obj.updateDynamic("init")(init)
    if (repo != null) __obj.updateDynamic("repo")(repo)
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Options]
  }
}

