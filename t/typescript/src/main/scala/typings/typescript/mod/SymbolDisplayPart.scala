package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolDisplayPart extends StObject {
  
  var kind: java.lang.String
  
  var text: java.lang.String
}
object SymbolDisplayPart {
  
  @scala.inline
  def apply(kind: java.lang.String, text: java.lang.String): SymbolDisplayPart = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolDisplayPart]
  }
  
  @scala.inline
  implicit class SymbolDisplayPartMutableBuilder[Self <: SymbolDisplayPart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: java.lang.String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
