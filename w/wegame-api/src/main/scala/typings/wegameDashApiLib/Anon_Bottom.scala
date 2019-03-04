package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  /**
    * 下边界坐标
    */
  var bottom: scala.Double
  /**
    * 高度
    */
  var height: scala.Double
  /**
    * 左边界坐标
    */
  var left: scala.Double
  /**
    * 右边界坐标
    */
  var right: scala.Double
  /**
    * 上边界坐标
    */
  var top: scala.Double
  /**
    * 宽度
    */
  var width: scala.Double
}

object Anon_Bottom {
  @scala.inline
  def apply(
    bottom: scala.Double,
    height: scala.Double,
    left: scala.Double,
    right: scala.Double,
    top: scala.Double,
    width: scala.Double
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom, height = height, left = left, right = right, top = top, width = width)
  
    __obj.asInstanceOf[Anon_Bottom]
  }
}

