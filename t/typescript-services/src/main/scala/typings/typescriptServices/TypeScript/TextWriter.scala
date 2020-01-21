package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TextWriter")
@js.native
class TextWriter protected () extends js.Object {
  def this(name: String, writeByteOrderMark: Boolean, outputFileType: OutputFileType) = this()
  var contents: js.Any = js.native
  var name: js.Any = js.native
  var onNewLine: Boolean = js.native
  var outputFileType: js.Any = js.native
  var writeByteOrderMark: js.Any = js.native
  def Close(): Unit = js.native
  def Write(s: String): Unit = js.native
  def WriteLine(s: String): Unit = js.native
  def getOutputFile(): OutputFile = js.native
}

