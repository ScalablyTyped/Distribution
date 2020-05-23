package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageFile extends js.Object {
  /**
    * 本地文件路径
    */
  var path: String
  /**
    * 本地文件大小，单位 B
    */
  var size: Double
}

object ImageFile {
  @scala.inline
  def apply(path: String, size: Double): ImageFile = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFile]
  }
}

