package typings.wordpressMediaUtils.anon

import typings.std.File
import typings.wordpressMediaUtils.uploadMediaMod.UploadMediaErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var code: UploadMediaErrorCode
  var file: File
  var message: String
}

object Code {
  @scala.inline
  def apply(code: UploadMediaErrorCode, file: File, message: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

