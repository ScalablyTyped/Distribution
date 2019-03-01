package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TempFilePaths extends js.Object {
  var tempFilePaths: js.Array[java.lang.String]
  var tempFiles: js.Array[ImageFile]
}

object Anon_TempFilePaths {
  @scala.inline
  def apply(tempFilePaths: js.Array[java.lang.String], tempFiles: js.Array[ImageFile]): Anon_TempFilePaths = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tempFilePaths")(tempFilePaths)
    __obj.updateDynamic("tempFiles")(tempFiles)
    __obj.asInstanceOf[Anon_TempFilePaths]
  }
}

