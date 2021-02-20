package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecorationOptions extends StObject {
  
  /**
    * A message that should be rendered when hovering over the decoration.
    */
  var hoverMessage: js.UndefOr[MarkedString | js.Array[MarkedString]] = js.native
  
  /**
    * Range to which this decoration is applied. The range must not be empty.
    */
  var range: Range = js.native
  
  /**
    * Render options applied to the current decoration. For performance reasons, keep the
    * number of decoration specific options small, and use decoration types wherever possible.
    */
  var renderOptions: js.UndefOr[DecorationInstanceRenderOptions] = js.native
}
object DecorationOptions {
  
  @scala.inline
  def apply(range: Range): DecorationOptions = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorationOptions]
  }
  
  @scala.inline
  implicit class DecorationOptionsMutableBuilder[Self <: DecorationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHoverMessage(value: MarkedString | js.Array[MarkedString]): Self = StObject.set(x, "hoverMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverMessageUndefined: Self = StObject.set(x, "hoverMessage", js.undefined)
    
    @scala.inline
    def setHoverMessageVarargs(value: MarkedString*): Self = StObject.set(x, "hoverMessage", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderOptions(value: DecorationInstanceRenderOptions): Self = StObject.set(x, "renderOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderOptionsUndefined: Self = StObject.set(x, "renderOptions", js.undefined)
  }
}
