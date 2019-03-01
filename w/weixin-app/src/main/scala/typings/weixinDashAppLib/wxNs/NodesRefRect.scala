package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesRefRect extends RectArea {
  /** 节点的dataset */
  var dataset: js.Any
  /** 节点的ID */
  var id: java.lang.String
}

object NodesRefRect {
  @scala.inline
  def apply(
    bottom: scala.Double,
    dataset: js.Any,
    height: scala.Double,
    id: java.lang.String,
    left: scala.Double,
    right: scala.Double,
    top: scala.Double,
    width: scala.Double
  ): NodesRefRect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("dataset")(dataset)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.updateDynamic("top")(top)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[NodesRefRect]
  }
}

