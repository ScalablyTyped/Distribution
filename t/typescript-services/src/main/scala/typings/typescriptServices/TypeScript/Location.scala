package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  /* private */ var _fileName: Any
  
  /* private */ var _length: Any
  
  /* private */ var _lineMap: Any
  
  /* private */ var _start: Any
  
  def character(): Double
  
  def fileName(): String
  
  def length(): Double
  
  def line(): Double
  
  def lineMap(): LineMap
  
  def start(): Double
}
object Location {
  
  inline def apply(
    _fileName: Any,
    _length: Any,
    _lineMap: Any,
    _start: Any,
    character: () => Double,
    fileName: () => String,
    length: () => Double,
    line: () => Double,
    lineMap: () => LineMap,
    start: () => Double
  ): Location = {
    val __obj = js.Dynamic.literal(_fileName = _fileName.asInstanceOf[js.Any], _length = _length.asInstanceOf[js.Any], _lineMap = _lineMap.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], character = js.Any.fromFunction0(character), fileName = js.Any.fromFunction0(fileName), length = js.Any.fromFunction0(length), line = js.Any.fromFunction0(line), lineMap = js.Any.fromFunction0(lineMap), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    inline def setCharacter(value: () => Double): Self = StObject.set(x, "character", js.Any.fromFunction0(value))
    
    inline def setFileName(value: () => String): Self = StObject.set(x, "fileName", js.Any.fromFunction0(value))
    
    inline def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
    
    inline def setLine(value: () => Double): Self = StObject.set(x, "line", js.Any.fromFunction0(value))
    
    inline def setLineMap(value: () => LineMap): Self = StObject.set(x, "lineMap", js.Any.fromFunction0(value))
    
    inline def setStart(value: () => Double): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def set_fileName(value: Any): Self = StObject.set(x, "_fileName", value.asInstanceOf[js.Any])
    
    inline def set_length(value: Any): Self = StObject.set(x, "_length", value.asInstanceOf[js.Any])
    
    inline def set_lineMap(value: Any): Self = StObject.set(x, "_lineMap", value.asInstanceOf[js.Any])
    
    inline def set_start(value: Any): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
  }
}
