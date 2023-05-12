package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecorationOptions extends StObject {
  
  /**
  		 * A message that should be rendered when hovering over the decoration.
  		 */
  var hoverMessage: js.UndefOr[MarkdownString | MarkedString | (js.Array[MarkdownString | MarkedString])] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecorationOptions] (val x: Self) extends AnyVal {
    
    inline def setHoverMessage(value: MarkdownString | MarkedString | (js.Array[MarkdownString | MarkedString])): Self = StObject.set(x, "hoverMessage", value.asInstanceOf[js.Any])
    
    inline def setHoverMessageUndefined: Self = StObject.set(x, "hoverMessage", js.undefined)
    
    inline def setHoverMessageVarargs(value: (MarkdownString | MarkedString)*): Self = StObject.set(x, "hoverMessage", js.Array(value*))
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRenderOptions(value: DecorationInstanceRenderOptions): Self = StObject.set(x, "renderOptions", value.asInstanceOf[js.Any])
    
    inline def setRenderOptionsUndefined: Self = StObject.set(x, "renderOptions", js.undefined)
  }
}
