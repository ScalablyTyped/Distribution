package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeaconService extends js.Object {
  /**
    * 服务目前是否可用
    */
  var available: js.UndefOr[Boolean] = js.undefined
  /**
    * 目前是否处于搜索状态
    */
  var discovering: js.UndefOr[Boolean] = js.undefined
}

object BeaconService {
  @scala.inline
  def apply(available: js.UndefOr[Boolean] = js.undefined, discovering: js.UndefOr[Boolean] = js.undefined): BeaconService = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available)
    if (!js.isUndefined(discovering)) __obj.updateDynamic("discovering")(discovering)
    __obj.asInstanceOf[BeaconService]
  }
}

