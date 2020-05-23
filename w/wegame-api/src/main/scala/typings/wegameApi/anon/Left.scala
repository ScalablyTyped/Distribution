package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Left extends js.Object {
  /**
    * 小游戏推荐banner组件左上角横坐标
    */
  var left: Double
  /**
    * 小游戏推荐banner组件左上角纵坐标
    */
  var top: Double
}

object Left {
  @scala.inline
  def apply(left: Double, top: Double): Left = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
}

