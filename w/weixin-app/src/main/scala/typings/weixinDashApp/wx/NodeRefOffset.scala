package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRefOffset extends js.Object {
  /** 节点的dataset */
  var dataset: js.Any
  /** 节点的ID */
  var id: String
  /** 节点的水平滚动位置 */
  var scrollLeft: Double
  /** 节点的竖直滚动位置 */
  var scrollTop: Double
}

object NodeRefOffset {
  @scala.inline
  def apply(dataset: js.Any, id: String, scrollLeft: Double, scrollTop: Double): NodeRefOffset = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeRefOffset]
  }
}

