package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawCanvasOptions extends js.Object {
  /**
    * 绘图动作数组，由 wx.createContext 创建的 context，
    * 调用 getActions 方法导出绘图动作数组。
    */
  var actions: js.Array[CanvasAction]
  /** 画布标识，传入 <canvas/> 的 cavas-id */
  var canvasId: Double | String
}

object DrawCanvasOptions {
  @scala.inline
  def apply(actions: js.Array[CanvasAction], canvasId: Double | String): DrawCanvasOptions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], canvasId = canvasId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DrawCanvasOptions]
  }
}

