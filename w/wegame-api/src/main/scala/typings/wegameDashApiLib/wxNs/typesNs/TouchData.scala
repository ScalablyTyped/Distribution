package typings
package wegameDashApiLib.wxNs.typesNs

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
  var timeStamp: scala.Double
  /**
    * 当前所有触摸点的列表
    */
  var touches: js.Array[Touch]
  /**
    * 当前事件的类型
    */
  var `type`: java.lang.String
}

object TouchData {
  @scala.inline
  def apply(
    changedTouches: js.Array[Touch],
    timeStamp: scala.Double,
    touches: js.Array[Touch],
    `type`: java.lang.String
  ): TouchData = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches, timeStamp = timeStamp, touches = touches)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TouchData]
  }
}

