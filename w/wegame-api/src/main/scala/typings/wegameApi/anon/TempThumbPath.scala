package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TempThumbPath extends js.Object {
  /**
    * 临时视频路径
    */
  var tempThumbPath: String
  /**
    * 临时封面路径
    */
  var tempVideoPath: String
}

object TempThumbPath {
  @scala.inline
  def apply(tempThumbPath: String, tempVideoPath: String): TempThumbPath = {
    val __obj = js.Dynamic.literal(tempThumbPath = tempThumbPath.asInstanceOf[js.Any], tempVideoPath = tempVideoPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempThumbPath]
  }
}

