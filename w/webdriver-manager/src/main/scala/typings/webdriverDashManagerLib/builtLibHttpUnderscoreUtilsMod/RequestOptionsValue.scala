package typings
package webdriverDashManagerLib.builtLibHttpUnderscoreUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptionsValue extends js.Object {
  var ignoreSSL: js.UndefOr[scala.Boolean] = js.undefined
  var proxy: js.UndefOr[java.lang.String] = js.undefined
}

object RequestOptionsValue {
  @scala.inline
  def apply(ignoreSSL: js.UndefOr[scala.Boolean] = js.undefined, proxy: java.lang.String = null): RequestOptionsValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreSSL)) __obj.updateDynamic("ignoreSSL")(ignoreSSL)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    __obj.asInstanceOf[RequestOptionsValue]
  }
}

