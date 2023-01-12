package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlayHint extends StObject {
  
  var kind: InlayHintKind
  
  var position: Double
  
  var text: java.lang.String
  
  var whitespaceAfter: js.UndefOr[Boolean] = js.undefined
  
  var whitespaceBefore: js.UndefOr[Boolean] = js.undefined
}
object InlayHint {
  
  inline def apply(kind: InlayHintKind, position: Double, text: java.lang.String): InlayHint = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlayHint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlayHint] (val x: Self) extends AnyVal {
    
    inline def setKind(value: InlayHintKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setWhitespaceAfter(value: Boolean): Self = StObject.set(x, "whitespaceAfter", value.asInstanceOf[js.Any])
    
    inline def setWhitespaceAfterUndefined: Self = StObject.set(x, "whitespaceAfter", js.undefined)
    
    inline def setWhitespaceBefore(value: Boolean): Self = StObject.set(x, "whitespaceBefore", value.asInstanceOf[js.Any])
    
    inline def setWhitespaceBeforeUndefined: Self = StObject.set(x, "whitespaceBefore", js.undefined)
  }
}
