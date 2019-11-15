package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Left extends js.Object {
  /**
    * 小游戏推荐banner组件左上角横坐标
    */
  var left: Double
  /**
    * 小游戏推荐banner组件左上角纵坐标
    */
  var top: Double
}

object Anon_Left {
  @scala.inline
  def apply(left: Double, top: Double): Anon_Left = {
    val __obj = js.Dynamic.literal(left = left, top = top)
  
    __obj.asInstanceOf[Anon_Left]
  }
}

