package typings
package tgfancyLib.tgfancyMod.TgfancyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RatelimitingOptions extends js.Object {
  var maxBackoff: js.UndefOr[scala.Double] = js.undefined
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  @JSName("notify")
  var notify_FRatelimitingOptions: js.UndefOr[
    js.Function2[/* methodName */ java.lang.String, /* repeated */js.Any, scala.Unit]
  ] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

