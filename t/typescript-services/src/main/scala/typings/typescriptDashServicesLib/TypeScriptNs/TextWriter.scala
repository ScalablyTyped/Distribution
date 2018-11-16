package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TextWriter")
@js.native
class TextWriter protected () extends js.Object {
  def this(name: java.lang.String, writeByteOrderMark: scala.Boolean, outputFileType: OutputFileType) = this()
  var contents: js.Any = js.native
  var name: js.Any = js.native
  var onNewLine: scala.Boolean = js.native
  var outputFileType: js.Any = js.native
  var writeByteOrderMark: js.Any = js.native
  def Close(): scala.Unit = js.native
  def Write(s: java.lang.String): scala.Unit = js.native
  def WriteLine(s: java.lang.String): scala.Unit = js.native
  def getOutputFile(): OutputFile = js.native
}

