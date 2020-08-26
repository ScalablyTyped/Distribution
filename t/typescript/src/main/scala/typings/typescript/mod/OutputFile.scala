package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputFile extends js.Object {
  var name: java.lang.String = js.native
  var text: java.lang.String = js.native
  var writeByteOrderMark: Boolean = js.native
}

object OutputFile {
  @scala.inline
  def apply(name: java.lang.String, text: java.lang.String, writeByteOrderMark: Boolean): OutputFile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], writeByteOrderMark = writeByteOrderMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFile]
  }
  @scala.inline
  implicit class OutputFileOps[Self <: OutputFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: java.lang.String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setWriteByteOrderMark(value: Boolean): Self = this.set("writeByteOrderMark", value.asInstanceOf[js.Any])
  }
  
}

