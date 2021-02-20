package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForParseResult extends StObject {
  
  var index: js.UndefOr[ExpressionNode] = js.native
  
  var key: js.UndefOr[ExpressionNode] = js.native
  
  var source: ExpressionNode = js.native
  
  var value: js.UndefOr[ExpressionNode] = js.native
}
object ForParseResult {
  
  @scala.inline
  def apply(source: ExpressionNode): ForParseResult = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForParseResult]
  }
  
  @scala.inline
  implicit class ForParseResultMutableBuilder[Self <: ForParseResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: ExpressionNode): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setKey(value: ExpressionNode): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setSource(value: ExpressionNode): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ExpressionNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
