package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecorationOptions extends StObject {
  
  /**
    * A message that should be rendered when hovering over the decoration.
    */
  var hoverMessage: js.UndefOr[MarkedString | js.Array[MarkedString]] = js.undefined
  
  /**
    * Range to which this decoration is applied. The range must not be empty.
    */
  var range: Range
  
  /**
    * Render options applied to the current decoration. For performance reasons, keep the
    * number of decoration specific options small, and use decoration types wherever possible.
    */
  var renderOptions: js.UndefOr[DecorationInstanceRenderOptions] = js.undefined
}
object DecorationOptions {
  
  inline def apply(range: Range): DecorationOptions = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorationOptions]
  }
  
  extension [Self <: DecorationOptions](x: Self) {
    
    inline def setHoverMessage(value: MarkedString | js.Array[MarkedString]): Self = StObject.set(x, "hoverMessage", value.asInstanceOf[js.Any])
    
    inline def setHoverMessageUndefined: Self = StObject.set(x, "hoverMessage", js.undefined)
    
    inline def setHoverMessageVarargs(value: MarkedString*): Self = StObject.set(x, "hoverMessage", js.Array(value :_*))
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRenderOptions(value: DecorationInstanceRenderOptions): Self = StObject.set(x, "renderOptions", value.asInstanceOf[js.Any])
    
    inline def setRenderOptionsUndefined: Self = StObject.set(x, "renderOptions", js.undefined)
  }
}
