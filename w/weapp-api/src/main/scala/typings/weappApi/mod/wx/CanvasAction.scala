package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasAction extends js.Object {
  var data: js.Array[CanvasAction | Double | String]
  var method: String
}

object CanvasAction {
  @scala.inline
  def apply(data: js.Array[CanvasAction | Double | String], method: String): CanvasAction = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasAction]
  }
}

