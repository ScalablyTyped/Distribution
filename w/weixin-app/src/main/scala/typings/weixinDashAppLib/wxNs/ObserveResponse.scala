package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserveResponse extends js.Object {
   // 相交区域占目标节点的布局区域的比例
  var boundingClientRect: RectArea
  var dataset: js.Any
  var id: java.lang.String
  var intersectionRatio: scala.Double
  var intersectionRect: RectArea
  var relativeRect: RectArea
  var time: scala.Double
}

object ObserveResponse {
  @scala.inline
  def apply(
    boundingClientRect: RectArea,
    dataset: js.Any,
    id: java.lang.String,
    intersectionRatio: scala.Double,
    intersectionRect: RectArea,
    relativeRect: RectArea,
    time: scala.Double
  ): ObserveResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boundingClientRect")(boundingClientRect)
    __obj.updateDynamic("dataset")(dataset)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("intersectionRatio")(intersectionRatio)
    __obj.updateDynamic("intersectionRect")(intersectionRect)
    __obj.updateDynamic("relativeRect")(relativeRect)
    __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[ObserveResponse]
  }
}

