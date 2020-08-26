package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileInformation extends js.Object {
  var byteOrderMark: ByteOrderMark = js.native
  var contents: String = js.native
}

object FileInformation {
  @scala.inline
  def apply(byteOrderMark: ByteOrderMark, contents: String): FileInformation = {
    val __obj = js.Dynamic.literal(byteOrderMark = byteOrderMark.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInformation]
  }
  @scala.inline
  implicit class FileInformationOps[Self <: FileInformation] (val x: Self) extends AnyVal {
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
    def setByteOrderMark(value: ByteOrderMark): Self = this.set("byteOrderMark", value.asInstanceOf[js.Any])
    @scala.inline
    def setContents(value: String): Self = this.set("contents", value.asInstanceOf[js.Any])
  }
  
}

