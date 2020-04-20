package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottom extends js.Object {
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

object AnonBottom {
  @scala.inline
  def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): AnonBottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBottom]
  }
}

