package typings
package waitDashForDashLocalhostLib.waitDashForDashLocalhostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		@default 80
  		 */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
  		Use the `GET` HTTP-method instead of `HEAD` to check if the server is running.
  		@default false
  		 */
  var useGet: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(port: scala.Int | scala.Double = null, useGet: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(useGet)) __obj.updateDynamic("useGet")(useGet)
    __obj.asInstanceOf[Options]
  }
}

