package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentHighlights extends StObject {
  
  var fileName: java.lang.String
  
  var highlightSpans: js.Array[HighlightSpan]
}
object DocumentHighlights {
  
  inline def apply(fileName: java.lang.String, highlightSpans: js.Array[HighlightSpan]): DocumentHighlights = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], highlightSpans = highlightSpans.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentHighlights]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentHighlights] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: java.lang.String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setHighlightSpans(value: js.Array[HighlightSpan]): Self = StObject.set(x, "highlightSpans", value.asInstanceOf[js.Any])
    
    inline def setHighlightSpansVarargs(value: HighlightSpan*): Self = StObject.set(x, "highlightSpans", js.Array(value*))
  }
}
