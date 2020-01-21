package typings.waitForLocalhost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		@default 80
  		 */
  var port: js.UndefOr[Double] = js.undefined
  /**
  		Use the `GET` HTTP-method instead of `HEAD` to check if the server is running.
  		@default false
  		 */
  var useGet: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(port: Int | Double = null, useGet: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(useGet)) __obj.updateDynamic("useGet")(useGet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

