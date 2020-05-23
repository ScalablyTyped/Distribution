package typings.ultraStrftime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var timezone: js.UndefOr[String | Double] = js.undefined
  var utc: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(timezone: String | Double = null, utc: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (!js.isUndefined(utc)) __obj.updateDynamic("utc")(utc.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

