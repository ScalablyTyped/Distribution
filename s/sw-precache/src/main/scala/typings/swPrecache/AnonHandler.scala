package typings.swPrecache

import typings.std.RegExp
import typings.swPrecache.mod.Handler
import typings.swPrecache.mod.Method
import typings.swToolbox.mod.Options_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandler extends js.Object {
  var handler: Handler
  var method: js.UndefOr[Method] = js.undefined
  var options: js.UndefOr[Options_] = js.undefined
  var urlPattern: RegExp | String
}

object AnonHandler {
  @scala.inline
  def apply(handler: Handler, urlPattern: RegExp | String, method: Method = null, options: Options_ = null): AnonHandler = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], urlPattern = urlPattern.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHandler]
  }
}

