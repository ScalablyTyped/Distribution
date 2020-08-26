package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextWriter extends js.Object {
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
  @scala.inline
  implicit class TextWriterOps[Self <: TextWriter] (val x: Self) extends AnyVal {
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
    def setClose(value: () => Unit): Self = this.set("Close", js.Any.fromFunction0(value))
    @scala.inline
    def setWrite(value: String => Unit): Self = this.set("Write", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteLine(value: String => Unit): Self = this.set("WriteLine", js.Any.fromFunction1(value))
    @scala.inline
    def setContents(value: js.Any): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetOutputFile(value: () => OutputFile): Self = this.set("getOutputFile", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: js.Any): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnNewLine(value: Boolean): Self = this.set("onNewLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputFileType(value: js.Any): Self = this.set("outputFileType", value.asInstanceOf[js.Any])
    @scala.inline
    def setWriteByteOrderMark(value: js.Any): Self = this.set("writeByteOrderMark", value.asInstanceOf[js.Any])
  }
  
}

