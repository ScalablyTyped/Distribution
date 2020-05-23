package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Useragent extends js.Object {
  var date: js.UndefOr[Double] = js.undefined
  var ip: js.UndefOr[String] = js.undefined
  var user_agent: js.UndefOr[String] = js.undefined
}

object Useragent {
  @scala.inline
  def apply(date: js.UndefOr[Double] = js.undefined, ip: String = null, user_agent: String = null): Useragent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(date)) __obj.updateDynamic("date")(date.get.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (user_agent != null) __obj.updateDynamic("user_agent")(user_agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Useragent]
  }
}

