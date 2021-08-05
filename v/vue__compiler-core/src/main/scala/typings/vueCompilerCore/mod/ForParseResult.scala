package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForParseResult extends StObject {
  
  var index: js.UndefOr[ExpressionNode] = js.undefined
  
  var key: js.UndefOr[ExpressionNode] = js.undefined
  
  var source: ExpressionNode
  
  var value: js.UndefOr[ExpressionNode] = js.undefined
}
object ForParseResult {
  
  inline def apply(source: ExpressionNode): ForParseResult = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForParseResult]
  }
  
  extension [Self <: ForParseResult](x: Self) {
    
    inline def setIndex(value: ExpressionNode): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKey(value: ExpressionNode): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setSource(value: ExpressionNode): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ExpressionNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
