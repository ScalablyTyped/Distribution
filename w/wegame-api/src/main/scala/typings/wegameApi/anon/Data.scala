package typings.wegameApi.anon

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  /**
    * 图像像素点数据，一维数组，每四项表示一个像素点的 rgba
    */
  var data: ArrayBuffer
  /**
    * 图像数据矩形的高度
    */
  var height: Double
  /**
    * 图像数据矩形的宽度
    */
  var width: Double
}

object Data {
  @scala.inline
  def apply(data: ArrayBuffer, height: Double, width: Double): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

