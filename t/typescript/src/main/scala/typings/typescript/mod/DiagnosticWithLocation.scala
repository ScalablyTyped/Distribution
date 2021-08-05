package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticWithLocation
  extends StObject
     with Diagnostic {
  
  @JSName("file")
  var file_DiagnosticWithLocation: SourceFile
  
  @JSName("length")
  var length_DiagnosticWithLocation: Double
  
  @JSName("start")
  var start_DiagnosticWithLocation: Double
}
object DiagnosticWithLocation {
  
  inline def apply(
    category: DiagnosticCategory,
    code: Double,
    file: SourceFile,
    length: Double,
    messageText: java.lang.String | DiagnosticMessageChain,
    start: Double
  ): DiagnosticWithLocation = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticWithLocation]
  }
  
  extension [Self <: DiagnosticWithLocation](x: Self) {
    
    inline def setFile(value: SourceFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
