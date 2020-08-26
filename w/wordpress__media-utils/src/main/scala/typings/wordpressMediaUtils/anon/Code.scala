package typings.wordpressMediaUtils.anon

import typings.std.File
import typings.wordpressMediaUtils.uploadMediaMod.UploadMediaErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Code extends js.Object {
  var code: UploadMediaErrorCode = js.native
  var file: File = js.native
  var message: String = js.native
}

object Code {
  @scala.inline
  def apply(code: UploadMediaErrorCode, file: File, message: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  @scala.inline
  implicit class CodeOps[Self <: Code] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: UploadMediaErrorCode): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: File): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

