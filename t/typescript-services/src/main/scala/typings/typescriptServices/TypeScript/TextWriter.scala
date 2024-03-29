package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextWriter extends StObject {
  
  def Close(): Unit
  
  def Write(s: String): Unit
  
  def WriteLine(s: String): Unit
  
  /* private */ var contents: Any
  
  def getOutputFile(): OutputFile
  
  /* private */ var name: Any
  
  var onNewLine: Boolean
  
  /* private */ var outputFileType: Any
  
  /* private */ var writeByteOrderMark: Any
}
object TextWriter {
  
  inline def apply(
    Close: () => Unit,
    Write: String => Unit,
    WriteLine: String => Unit,
    contents: Any,
    getOutputFile: () => OutputFile,
    name: Any,
    onNewLine: Boolean,
    outputFileType: Any,
    writeByteOrderMark: Any
  ): TextWriter = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Write = js.Any.fromFunction1(Write), WriteLine = js.Any.fromFunction1(WriteLine), contents = contents.asInstanceOf[js.Any], getOutputFile = js.Any.fromFunction0(getOutputFile), name = name.asInstanceOf[js.Any], onNewLine = onNewLine.asInstanceOf[js.Any], outputFileType = outputFileType.asInstanceOf[js.Any], writeByteOrderMark = writeByteOrderMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextWriter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextWriter] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "Close", js.Any.fromFunction0(value))
    
    inline def setContents(value: Any): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setGetOutputFile(value: () => OutputFile): Self = StObject.set(x, "getOutputFile", js.Any.fromFunction0(value))
    
    inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnNewLine(value: Boolean): Self = StObject.set(x, "onNewLine", value.asInstanceOf[js.Any])
    
    inline def setOutputFileType(value: Any): Self = StObject.set(x, "outputFileType", value.asInstanceOf[js.Any])
    
    inline def setWrite(value: String => Unit): Self = StObject.set(x, "Write", js.Any.fromFunction1(value))
    
    inline def setWriteByteOrderMark(value: Any): Self = StObject.set(x, "writeByteOrderMark", value.asInstanceOf[js.Any])
    
    inline def setWriteLine(value: String => Unit): Self = StObject.set(x, "WriteLine", js.Any.fromFunction1(value))
  }
}
