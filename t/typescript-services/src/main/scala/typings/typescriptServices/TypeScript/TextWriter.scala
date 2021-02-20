package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextWriter extends StObject {
  
  def Close(): Unit = js.native
  
  def Write(s: String): Unit = js.native
  
  def WriteLine(s: String): Unit = js.native
  
  var contents: js.Any = js.native
  
  def getOutputFile(): OutputFile = js.native
  
  var name: js.Any = js.native
  
  var onNewLine: Boolean = js.native
  
  var outputFileType: js.Any = js.native
  
  var writeByteOrderMark: js.Any = js.native
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
  implicit class TextWriterMutableBuilder[Self <: TextWriter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "Close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContents(value: js.Any): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetOutputFile(value: () => OutputFile): Self = StObject.set(x, "getOutputFile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnNewLine(value: Boolean): Self = StObject.set(x, "onNewLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFileType(value: js.Any): Self = StObject.set(x, "outputFileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: String => Unit): Self = StObject.set(x, "Write", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteByteOrderMark(value: js.Any): Self = StObject.set(x, "writeByteOrderMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteLine(value: String => Unit): Self = StObject.set(x, "WriteLine", js.Any.fromFunction1(value))
  }
}
