package typings.userAgents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var downlink: js.UndefOr[Double] = js.undefined
  var downlinkMax: js.UndefOr[js.Any] = js.undefined
  var effectiveType: js.UndefOr[String] = js.undefined
  var rtt: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Connection {
  @scala.inline
  def apply(
    downlink: js.UndefOr[Double] = js.undefined,
    downlinkMax: js.Any = null,
    effectiveType: String = null,
    rtt: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): Connection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(downlink)) __obj.updateDynamic("downlink")(downlink.get.asInstanceOf[js.Any])
    if (downlinkMax != null) __obj.updateDynamic("downlinkMax")(downlinkMax.asInstanceOf[js.Any])
    if (effectiveType != null) __obj.updateDynamic("effectiveType")(effectiveType.asInstanceOf[js.Any])
    if (!js.isUndefined(rtt)) __obj.updateDynamic("rtt")(rtt.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
}

