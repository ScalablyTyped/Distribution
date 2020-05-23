package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextWriter extends js.Object {
  var contents: js.Any
  var name: js.Any
  var onNewLine: Boolean
  var outputFileType: js.Any
  var writeByteOrderMark: js.Any
  def Close(): Unit
  def Write(s: String): Unit
  def WriteLine(s: String): Unit
  def getOutputFile(): OutputFile
}

object TextWriter {
  @scala.inline
  def apply(
    Close: () => Unit,
    Write: String => Unit,
    WriteLine: String => Unit,
    contents: js.Any,
    getOutputFile: () => OutputFile,
    name: js.Any,
    onNewLine: Boolean,
    outputFileType: js.Any,
    writeByteOrderMark: js.Any
  ): TextWriter = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Write = js.Any.fromFunction1(Write), WriteLine = js.Any.fromFunction1(WriteLine), contents = contents.asInstanceOf[js.Any], getOutputFile = js.Any.fromFunction0(getOutputFile), name = name.asInstanceOf[js.Any], onNewLine = onNewLine.asInstanceOf[js.Any], outputFileType = outputFileType.asInstanceOf[js.Any], writeByteOrderMark = writeByteOrderMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextWriter]
  }
}

