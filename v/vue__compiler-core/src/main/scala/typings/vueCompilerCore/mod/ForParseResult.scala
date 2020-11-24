package typings.vueCompilerCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForParseResult extends js.Object {
  
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
  implicit class ForParseResultOps[Self <: ForParseResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSource(value: ExpressionNode): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: ExpressionNode): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setKey(value: ExpressionNode): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setValue(value: ExpressionNode): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
