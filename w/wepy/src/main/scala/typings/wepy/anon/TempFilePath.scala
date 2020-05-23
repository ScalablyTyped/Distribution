package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TempFilePath extends js.Object {
  var tempFilePath: String
}

object TempFilePath {
  @scala.inline
  def apply(tempFilePath: String): TempFilePath = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFilePath]
  }
}

