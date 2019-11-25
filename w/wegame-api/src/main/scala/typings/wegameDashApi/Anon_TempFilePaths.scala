package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TempFilePaths extends js.Object {
  var tempFilePaths: js.Array[String]
  var tempFiles: js.Array[ImageFile]
}

object Anon_TempFilePaths {
  @scala.inline
  def apply(tempFilePaths: js.Array[String], tempFiles: js.Array[ImageFile]): Anon_TempFilePaths = {
    val __obj = js.Dynamic.literal(tempFilePaths = tempFilePaths.asInstanceOf[js.Any], tempFiles = tempFiles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TempFilePaths]
  }
}

