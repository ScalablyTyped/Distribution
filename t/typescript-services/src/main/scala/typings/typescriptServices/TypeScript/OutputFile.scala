package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputFile extends js.Object {
  var fileType: OutputFileType = js.native
  var name: String = js.native
  var sourceMapEntries: js.Array[SourceMapEntry] = js.native
  var text: String = js.native
  var writeByteOrderMark: Boolean = js.native
}

object OutputFile {
  @scala.inline
  def apply(
    fileType: OutputFileType,
    name: String,
    sourceMapEntries: js.Array[SourceMapEntry],
    text: String,
    writeByteOrderMark: Boolean
  ): OutputFile = {
    val __obj = js.Dynamic.literal(fileType = fileType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sourceMapEntries = sourceMapEntries.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], writeByteOrderMark = writeByteOrderMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFile]
  }
  @scala.inline
  implicit class OutputFileOps[Self <: OutputFile] (val x: Self) extends AnyVal {
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
    def setFileType(value: OutputFileType): Self = this.set("fileType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceMapEntriesVarargs(value: SourceMapEntry*): Self = this.set("sourceMapEntries", js.Array(value :_*))
    @scala.inline
    def setSourceMapEntries(value: js.Array[SourceMapEntry]): Self = this.set("sourceMapEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setWriteByteOrderMark(value: Boolean): Self = this.set("writeByteOrderMark", value.asInstanceOf[js.Any])
  }
  
}

