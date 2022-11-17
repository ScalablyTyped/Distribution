package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightSpan extends StObject {
  
  var contextSpan: js.UndefOr[TextSpan] = js.undefined
  
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  
  var isInString: js.UndefOr[true] = js.undefined
  
  var kind: HighlightSpanKind
  
  var textSpan: TextSpan
}
object HighlightSpan {
  
  inline def apply(kind: HighlightSpanKind, textSpan: TextSpan): HighlightSpan = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightSpan]
  }
  
  extension [Self <: HighlightSpan](x: Self) {
    
    inline def setContextSpan(value: TextSpan): Self = StObject.set(x, "contextSpan", value.asInstanceOf[js.Any])
    
    inline def setContextSpanUndefined: Self = StObject.set(x, "contextSpan", js.undefined)
    
    inline def setFileName(value: java.lang.String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setIsInString(value: true): Self = StObject.set(x, "isInString", value.asInstanceOf[js.Any])
    
    inline def setIsInStringUndefined: Self = StObject.set(x, "isInString", js.undefined)
    
    inline def setKind(value: HighlightSpanKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTextSpan(value: TextSpan): Self = StObject.set(x, "textSpan", value.asInstanceOf[js.Any])
  }
}
