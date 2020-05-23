package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedFilePath extends js.Object {
  var savedFilePath: String
}

object SavedFilePath {
  @scala.inline
  def apply(savedFilePath: String): SavedFilePath = {
    val __obj = js.Dynamic.literal(savedFilePath = savedFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFilePath]
  }
}

