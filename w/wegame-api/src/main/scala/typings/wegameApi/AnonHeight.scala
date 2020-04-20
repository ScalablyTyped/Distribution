package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeight extends js.Object {
  /**
    * 图片高度
    */
  var height: String
  /**
    * 临时图片路径
    */
  var tempImagePath: String
  /**
    * 图片宽度
    */
  var width: String
}

object AnonHeight {
  @scala.inline
  def apply(height: String, tempImagePath: String, width: String): AnonHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], tempImagePath = tempImagePath.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeight]
  }
}

