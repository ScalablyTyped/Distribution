package typings.wegameDashApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchData extends js.Object {
  /**
    * 触发此次事件的触摸点列表
    */
  var changedTouches: js.Array[Touch]
  /**
    * 事件触发时的时间戳
    */
  var timeStamp: Double
  /**
    * 当前所有触摸点的列表
    */
  var touches: js.Array[Touch]
  /**
    * 当前事件的类型
    */
  var `type`: String
}

object TouchData {
  @scala.inline
  def apply(changedTouches: js.Array[Touch], timeStamp: Double, touches: js.Array[Touch], `type`: String): TouchData = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchData]
  }
}

