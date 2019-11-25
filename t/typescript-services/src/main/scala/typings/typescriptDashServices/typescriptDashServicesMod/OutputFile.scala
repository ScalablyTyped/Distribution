package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "OutputFile")
@js.native
class OutputFile protected ()
  extends typings.typescriptDashServices.TypeScript.OutputFile {
  def this(
    name: String,
    writeByteOrderMark: Boolean,
    text: String,
    fileType: typings.typescriptDashServices.TypeScript.OutputFileType
  ) = this()
  def this(
    name: String,
    writeByteOrderMark: Boolean,
    text: String,
    fileType: typings.typescriptDashServices.TypeScript.OutputFileType,
    sourceMapEntries: js.Array[typings.typescriptDashServices.TypeScript.SourceMapEntry]
  ) = this()
}

