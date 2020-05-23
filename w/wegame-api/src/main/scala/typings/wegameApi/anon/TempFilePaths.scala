package typings.wegameApi.anon

import typings.wegameApi.ImageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TempFilePaths extends js.Object {
  var tempFilePaths: js.Array[String]
  var tempFiles: js.Array[ImageFile]
}

object TempFilePaths {
  @scala.inline
  def apply(tempFilePaths: js.Array[String], tempFiles: js.Array[ImageFile]): TempFilePaths = {
    val __obj = js.Dynamic.literal(tempFilePaths = tempFilePaths.asInstanceOf[js.Any], tempFiles = tempFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFilePaths]
  }
}

