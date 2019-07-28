package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  /**
    * 下边界坐标
    */
  var bottom: Double
  /**
    * 高度
    */
  var height: Double
  /**
    * 左边界坐标
    */
  var left: Double
  /**
    * 右边界坐标
    */
  var right: Double
  /**
    * 上边界坐标
    */
  var top: Double
  /**
    * 宽度
    */
  var width: Double
}

object Anon_Bottom {
  @scala.inline
  def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): Anon_Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom, height = height, left = left, right = right, top = top, width = width)
  
    __obj.asInstanceOf[Anon_Bottom]
  }
}

