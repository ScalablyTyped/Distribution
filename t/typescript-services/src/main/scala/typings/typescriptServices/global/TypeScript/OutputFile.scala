package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.OutputFile")
@js.native
class OutputFile protected ()
  extends typings.typescriptServices.TypeScript.OutputFile {
  def this(
    name: String,
    writeByteOrderMark: Boolean,
    text: String,
    fileType: typings.typescriptServices.TypeScript.OutputFileType
  ) = this()
  def this(
    name: String,
    writeByteOrderMark: Boolean,
    text: String,
    fileType: typings.typescriptServices.TypeScript.OutputFileType,
    sourceMapEntries: js.Array[typings.typescriptServices.TypeScript.SourceMapEntry]
  ) = this()
}

