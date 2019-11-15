package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TempThumbPath extends js.Object {
  /**
    * 临时视频路径
    */
  var tempThumbPath: String
  /**
    * 临时封面路径
    */
  var tempVideoPath: String
}

object Anon_TempThumbPath {
  @scala.inline
  def apply(tempThumbPath: String, tempVideoPath: String): Anon_TempThumbPath = {
    val __obj = js.Dynamic.literal(tempThumbPath = tempThumbPath, tempVideoPath = tempVideoPath)
  
    __obj.asInstanceOf[Anon_TempThumbPath]
  }
}

