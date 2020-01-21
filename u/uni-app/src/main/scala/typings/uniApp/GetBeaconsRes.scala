package typings.uniApp

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
  var errMsg: js.UndefOr[String] = js.undefined
}

object GetBeaconsRes {
  @scala.inline
  def apply(beacons: js.Array[Beacon] = null, errMsg: String = null): GetBeaconsRes = {
    val __obj = js.Dynamic.literal()
    if (beacons != null) __obj.updateDynamic("beacons")(beacons.asInstanceOf[js.Any])
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBeaconsRes]
  }
}

