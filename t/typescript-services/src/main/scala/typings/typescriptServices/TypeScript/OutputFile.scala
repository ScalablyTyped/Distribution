package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputFile extends js.Object {
  var fileType: OutputFileType
  var name: String
  var sourceMapEntries: js.Array[SourceMapEntry]
  var text: String
  var writeByteOrderMark: Boolean
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
}

