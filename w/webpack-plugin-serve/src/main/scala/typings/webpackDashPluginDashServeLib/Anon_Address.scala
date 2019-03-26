package typings
package webpackDashPluginDashServeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var retry: js.UndefOr[scala.Boolean] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Address {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    retry: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Address = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (!js.isUndefined(retry)) __obj.updateDynamic("retry")(retry)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[Anon_Address]
  }
}

