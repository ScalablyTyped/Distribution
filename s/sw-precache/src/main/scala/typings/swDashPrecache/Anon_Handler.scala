package typings.swDashPrecache

import typings.std.RegExp
import typings.swDashPrecache.swDashPrecacheMod.Handler
import typings.swDashPrecache.swDashPrecacheMod.Method
import typings.swDashToolbox.swDashToolboxMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Handler extends js.Object {
  var handler: Handler
  var method: js.UndefOr[Method] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var urlPattern: RegExp | String
}

object Anon_Handler {
  @scala.inline
  def apply(handler: Handler, urlPattern: RegExp | String, method: Method = null, options: Options = null): Anon_Handler = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], urlPattern = urlPattern.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Handler]
  }
}

