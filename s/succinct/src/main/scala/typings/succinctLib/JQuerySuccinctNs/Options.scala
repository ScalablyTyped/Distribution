package typings
package succinctLib.JQuerySuccinctNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var ignore: js.UndefOr[scala.Boolean] = js.undefined
  var omission: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    ignore: js.UndefOr[scala.Boolean] = js.undefined,
    omission: java.lang.String = null,
    size: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignore)) __obj.updateDynamic("ignore")(ignore)
    if (omission != null) __obj.updateDynamic("omission")(omission)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

