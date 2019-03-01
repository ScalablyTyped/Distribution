package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// 界面-----绘图
trait CanvasAction extends js.Object {
  var data: js.Array[CanvasAction] | (js.Array[scala.Double | java.lang.String])
  var method: java.lang.String
}

object CanvasAction {
  @scala.inline
  def apply(
    data: js.Array[CanvasAction] | (js.Array[scala.Double | java.lang.String]),
    method: java.lang.String
  ): CanvasAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[CanvasAction]
  }
}

