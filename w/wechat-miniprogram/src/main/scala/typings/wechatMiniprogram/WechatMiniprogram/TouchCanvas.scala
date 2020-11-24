package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** canvas 触摸事件响应 */
@js.native
trait TouchCanvas[Mark /* <: IAnyObject */, TargetDataset /* <: IAnyObject */]
  extends Touch[scala.Nothing, TouchCanvasDetail, Mark, scala.Nothing, TargetDataset]
object TouchCanvas {
  
  @scala.inline
  def apply[Mark /* <: IAnyObject */, TargetDataset /* <: IAnyObject */](
    changedTouches: js.Array[TouchCanvasDetail],
    currentTarget: Target[scala.Nothing],
    target: Target[TargetDataset],
    timeStamp: Double,
    touches: js.Array[TouchCanvasDetail],
    `type`: String
  ): TouchCanvas[Mark, TargetDataset] = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchCanvas[Mark, TargetDataset]]
  }
}
