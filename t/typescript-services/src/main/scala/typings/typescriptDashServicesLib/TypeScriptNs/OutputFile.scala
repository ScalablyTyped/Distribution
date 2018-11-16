package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.OutputFile")
@js.native
class OutputFile protected () extends js.Object {
  def this(name: java.lang.String, writeByteOrderMark: scala.Boolean, text: java.lang.String, fileType: OutputFileType) = this()
  def this(name: java.lang.String, writeByteOrderMark: scala.Boolean, text: java.lang.String, fileType: OutputFileType, sourceMapEntries: js.Array[SourceMapEntry]) = this()
  var fileType: OutputFileType = js.native
  var name: java.lang.String = js.native
  var sourceMapEntries: js.Array[SourceMapEntry] = js.native
  var text: java.lang.String = js.native
  var writeByteOrderMark: scala.Boolean = js.native
}

