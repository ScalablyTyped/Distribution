package typings.weixinDashApp.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBeaconsSuccess extends js.Object {
  var beacons: js.Array[Beacon]
  var errMsg: String
}

object GetBeaconsSuccess {
  @scala.inline
  def apply(beacons: js.Array[Beacon], errMsg: String): GetBeaconsSuccess = {
    val __obj = js.Dynamic.literal(beacons = beacons, errMsg = errMsg)
  
    __obj.asInstanceOf[GetBeaconsSuccess]
  }
}

