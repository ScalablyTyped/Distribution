package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeft extends js.Object {
  /**
    * 小游戏推荐banner组件左上角横坐标
    */
  var left: Double
  /**
    * 小游戏推荐banner组件左上角纵坐标
    */
  var top: Double
}

object AnonLeft {
  @scala.inline
  def apply(left: Double, top: Double): AnonLeft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeft]
  }
}

