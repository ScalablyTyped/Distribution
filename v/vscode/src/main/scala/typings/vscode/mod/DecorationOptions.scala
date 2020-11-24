package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecorationOptions extends js.Object {
  
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
  implicit class DecorationOptionsOps[Self <: DecorationOptions] (val x: Self) extends AnyVal {
    
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
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverMessageVarargs(value: MarkedString*): Self = this.set("hoverMessage", js.Array(value :_*))
    
    @scala.inline
    def setHoverMessage(value: MarkedString | js.Array[MarkedString]): Self = this.set("hoverMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverMessage: Self = this.set("hoverMessage", js.undefined)
    
    @scala.inline
    def setRenderOptions(value: DecorationInstanceRenderOptions): Self = this.set("renderOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderOptions: Self = this.set("renderOptions", js.undefined)
  }
}
