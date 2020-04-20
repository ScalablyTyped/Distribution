package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTempFilePaths extends js.Object {
  var tempFilePaths: js.Array[String]
  var tempFiles: js.Array[ImageFile]
}

object AnonTempFilePaths {
  @scala.inline
  def apply(tempFilePaths: js.Array[String], tempFiles: js.Array[ImageFile]): AnonTempFilePaths = {
    val __obj = js.Dynamic.literal(tempFilePaths = tempFilePaths.asInstanceOf[js.Any], tempFiles = tempFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTempFilePaths]
  }
}

