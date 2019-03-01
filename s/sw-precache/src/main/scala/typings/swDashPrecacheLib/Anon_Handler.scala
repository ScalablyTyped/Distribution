package typings
package swDashPrecacheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Handler extends js.Object {
  var handler: swDashPrecacheLib.swDashPrecacheMod.Handler
  var method: js.UndefOr[swDashPrecacheLib.swDashPrecacheMod.Method] = js.undefined
  var options: js.UndefOr[swDashToolboxLib.swDashToolboxMod.Options] = js.undefined
  var urlPattern: stdLib.RegExp | java.lang.String
}

object Anon_Handler {
  @scala.inline
  def apply(
    handler: swDashPrecacheLib.swDashPrecacheMod.Handler,
    urlPattern: stdLib.RegExp | java.lang.String,
    method: swDashPrecacheLib.swDashPrecacheMod.Method = null,
    options: swDashToolboxLib.swDashToolboxMod.Options = null
  ): Anon_Handler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    __obj.updateDynamic("urlPattern")(urlPattern.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Handler]
  }
}

