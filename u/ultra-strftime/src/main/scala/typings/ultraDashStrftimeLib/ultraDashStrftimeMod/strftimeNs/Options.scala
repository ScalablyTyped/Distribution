package typings
package ultraDashStrftimeLib.ultraDashStrftimeMod.strftimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var timezone: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var utc: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(timezone: java.lang.String | scala.Double = null, utc: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (!js.isUndefined(utc)) __obj.updateDynamic("utc")(utc)
    __obj.asInstanceOf[Options]
  }
}

