package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "OutputFile")
@js.native
class OutputFile protected ()
  extends typings.typescriptDashServices.TypeScriptNs.OutputFile {
  def this(
    name: String,
    writeByteOrderMark: Boolean,
    text: String,
    fileType: typings.typescriptDashServices.TypeScriptNs.OutputFileType
  ) = this()
  def this(
    name: String,
    writeByteOrderMark: Boolean,
    text: String,
    fileType: typings.typescriptDashServices.TypeScriptNs.OutputFileType,
    sourceMapEntries: js.Array[typings.typescriptDashServices.TypeScriptNs.SourceMapEntry]
  ) = this()
}

