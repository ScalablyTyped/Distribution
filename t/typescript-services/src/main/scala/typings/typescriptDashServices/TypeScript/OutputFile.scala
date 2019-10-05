package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.OutputFile")
@js.native
class OutputFile protected () extends js.Object {
  def this(name: String, writeByteOrderMark: Boolean, text: String, fileType: OutputFileType) = this()
  def this(
    name: String,
    writeByteOrderMark: Boolean,
    text: String,
    fileType: OutputFileType,
    sourceMapEntries: js.Array[SourceMapEntry]
  ) = this()
  var fileType: OutputFileType = js.native
  var name: String = js.native
  var sourceMapEntries: js.Array[SourceMapEntry] = js.native
  var text: String = js.native
  var writeByteOrderMark: Boolean = js.native
}

