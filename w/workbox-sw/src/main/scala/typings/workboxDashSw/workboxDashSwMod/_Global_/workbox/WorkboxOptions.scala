package typings.workboxDashSw.workboxDashSwMod._Global_.workbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkboxOptions extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var modulePathCb: js.UndefOr[ModulePathCallback] = js.undefined
  var modulePathPrefix: js.UndefOr[String] = js.undefined
}

object WorkboxOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    modulePathCb: (/* moduleName */ String, /* debug */ Boolean) => String = null,
    modulePathPrefix: String = null
  ): WorkboxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (modulePathCb != null) __obj.updateDynamic("modulePathCb")(js.Any.fromFunction2(modulePathCb))
    if (modulePathPrefix != null) __obj.updateDynamic("modulePathPrefix")(modulePathPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkboxOptions]
  }
}

