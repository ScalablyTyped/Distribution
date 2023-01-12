package typings.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSnapshotLine
  extends StObject
     with ITextSnapshotLine {
  
  /* private */ var _end: Any
  
  /* private */ var _lineBreak: Any
  
  /* private */ var _lineNumber: Any
  
  /* private */ var _snapshot: Any
  
  /* private */ var _start: Any
}
object TextSnapshotLine {
  
  inline def apply(
    _end: Any,
    _lineBreak: Any,
    _lineNumber: Any,
    _snapshot: Any,
    _start: Any,
    end: () => SnapshotPoint,
    endIncludingLineBreak: () => SnapshotPoint,
    endIncludingLineBreakPosition: () => Double,
    endPosition: () => Double,
    getText: () => String,
    length: () => Double,
    lineNumber: () => Double,
    snapshot: () => ITextSnapshot,
    start: () => SnapshotPoint,
    startPosition: () => Double
  ): TextSnapshotLine = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _lineBreak = _lineBreak.asInstanceOf[js.Any], _lineNumber = _lineNumber.asInstanceOf[js.Any], _snapshot = _snapshot.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), endIncludingLineBreak = js.Any.fromFunction0(endIncludingLineBreak), endIncludingLineBreakPosition = js.Any.fromFunction0(endIncludingLineBreakPosition), endPosition = js.Any.fromFunction0(endPosition), getText = js.Any.fromFunction0(getText), length = js.Any.fromFunction0(length), lineNumber = js.Any.fromFunction0(lineNumber), snapshot = js.Any.fromFunction0(snapshot), start = js.Any.fromFunction0(start), startPosition = js.Any.fromFunction0(startPosition))
    __obj.asInstanceOf[TextSnapshotLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextSnapshotLine] (val x: Self) extends AnyVal {
    
    inline def set_end(value: Any): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    inline def set_lineBreak(value: Any): Self = StObject.set(x, "_lineBreak", value.asInstanceOf[js.Any])
    
    inline def set_lineNumber(value: Any): Self = StObject.set(x, "_lineNumber", value.asInstanceOf[js.Any])
    
    inline def set_snapshot(value: Any): Self = StObject.set(x, "_snapshot", value.asInstanceOf[js.Any])
    
    inline def set_start(value: Any): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
  }
}
