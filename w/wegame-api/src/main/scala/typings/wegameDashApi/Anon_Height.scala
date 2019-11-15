package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
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

object Anon_Height {
  @scala.inline
  def apply(height: String, tempImagePath: String, width: String): Anon_Height = {
    val __obj = js.Dynamic.literal(height = height, tempImagePath = tempImagePath, width = width)
  
    __obj.asInstanceOf[Anon_Height]
  }
}

