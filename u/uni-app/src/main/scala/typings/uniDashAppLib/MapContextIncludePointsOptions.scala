package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapContextIncludePointsOptions extends js.Object {
  /**
    * 坐标点形成的矩形边缘到地图边缘的距离，单位像素。格式为[上,右,下,左]，安卓上只能识别数组第一项，上下左右的padding一致。开发者工具暂不支持padding参数。
    */
  var padding: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 要显示在可视区域内的坐标点列表，[{latitude, longitude}]
    */
  var points: js.UndefOr[js.Array[_]] = js.undefined
}

object MapContextIncludePointsOptions {
  @scala.inline
  def apply(padding: js.Array[_] = null, points: js.Array[_] = null): MapContextIncludePointsOptions = {
    val __obj = js.Dynamic.literal()
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (points != null) __obj.updateDynamic("points")(points)
    __obj.asInstanceOf[MapContextIncludePointsOptions]
  }
}

