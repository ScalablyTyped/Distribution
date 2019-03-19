package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBeaconsRes extends js.Object {
  /**
    * 接口调用成功的回调函数
    */
  var beacons: js.UndefOr[js.Array[Beacon]] = js.undefined
  /**
    * 调用结果
    */
  var errMsg: js.UndefOr[java.lang.String] = js.undefined
}

object GetBeaconsRes {
  @scala.inline
  def apply(beacons: js.Array[Beacon] = null, errMsg: java.lang.String = null): GetBeaconsRes = {
    val __obj = js.Dynamic.literal()
    if (beacons != null) __obj.updateDynamic("beacons")(beacons)
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg)
    __obj.asInstanceOf[GetBeaconsRes]
  }
}

