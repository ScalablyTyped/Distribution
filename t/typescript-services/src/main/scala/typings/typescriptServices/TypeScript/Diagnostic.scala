package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diagnostic
  extends StObject
     with Location {
  
  /* private */ var _additionalLocations: js.Any
  
  /* private */ var _arguments: js.Any
  
  /* private */ var _diagnosticKey: js.Any
  
  def additionalLocations(): js.Array[Location]
  
  def arguments(): js.Array[js.Any]
  
  def diagnosticKey(): String
  
  def info(): DiagnosticInfo
  
  def message(): String
  
  def text(): String
  
  def toJSON(key: js.Any): js.Any
}
object Diagnostic {
  
  inline def apply(
    _additionalLocations: js.Any,
    _arguments: js.Any,
    _diagnosticKey: js.Any,
    _fileName: js.Any,
    _length: js.Any,
    _lineMap: js.Any,
    _start: js.Any,
    additionalLocations: () => js.Array[Location],
    arguments: () => js.Array[js.Any],
    character: () => Double,
    diagnosticKey: () => String,
    fileName: () => String,
    info: () => DiagnosticInfo,
    length: () => Double,
    line: () => Double,
    lineMap: () => LineMap,
    message: () => String,
    start: () => Double,
    text: () => String,
    toJSON: js.Any => js.Any
  ): Diagnostic = {
    val __obj = js.Dynamic.literal(_additionalLocations = _additionalLocations.asInstanceOf[js.Any], _arguments = _arguments.asInstanceOf[js.Any], _diagnosticKey = _diagnosticKey.asInstanceOf[js.Any], _fileName = _fileName.asInstanceOf[js.Any], _length = _length.asInstanceOf[js.Any], _lineMap = _lineMap.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], additionalLocations = js.Any.fromFunction0(additionalLocations), arguments = js.Any.fromFunction0(arguments), character = js.Any.fromFunction0(character), diagnosticKey = js.Any.fromFunction0(diagnosticKey), fileName = js.Any.fromFunction0(fileName), info = js.Any.fromFunction0(info), length = js.Any.fromFunction0(length), line = js.Any.fromFunction0(line), lineMap = js.Any.fromFunction0(lineMap), message = js.Any.fromFunction0(message), start = js.Any.fromFunction0(start), text = js.Any.fromFunction0(text), toJSON = js.Any.fromFunction1(toJSON))
    __obj.asInstanceOf[Diagnostic]
  }
  
  extension [Self <: Diagnostic](x: Self) {
    
    inline def setAdditionalLocations(value: () => js.Array[Location]): Self = StObject.set(x, "additionalLocations", js.Any.fromFunction0(value))
    
    inline def setArguments(value: () => js.Array[js.Any]): Self = StObject.set(x, "arguments", js.Any.fromFunction0(value))
    
    inline def setDiagnosticKey(value: () => String): Self = StObject.set(x, "diagnosticKey", js.Any.fromFunction0(value))
    
    inline def setInfo(value: () => DiagnosticInfo): Self = StObject.set(x, "info", js.Any.fromFunction0(value))
    
    inline def setMessage(value: () => String): Self = StObject.set(x, "message", js.Any.fromFunction0(value))
    
    inline def setText(value: () => String): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    
    inline def setToJSON(value: js.Any => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
    
    inline def set_additionalLocations(value: js.Any): Self = StObject.set(x, "_additionalLocations", value.asInstanceOf[js.Any])
    
    inline def set_arguments(value: js.Any): Self = StObject.set(x, "_arguments", value.asInstanceOf[js.Any])
    
    inline def set_diagnosticKey(value: js.Any): Self = StObject.set(x, "_diagnosticKey", value.asInstanceOf[js.Any])
  }
}
