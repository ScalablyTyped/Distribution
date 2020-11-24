package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncrementPos extends js.Object {
  
  var incrementPos: js.Any = js.native
  
  var matchedString: js.Any = js.native
  
  var pos: js.Any = js.native
  
  var success: Boolean = js.native
}
object IncrementPos {
  
  @scala.inline
  def apply(incrementPos: js.Any, matchedString: js.Any, pos: js.Any, success: Boolean): IncrementPos = {
    val __obj = js.Dynamic.literal(incrementPos = incrementPos.asInstanceOf[js.Any], matchedString = matchedString.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncrementPos]
  }
  
  @scala.inline
  implicit class IncrementPosOps[Self <: IncrementPos] (val x: Self) extends AnyVal {
    
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
    def setIncrementPos(value: js.Any): Self = this.set("incrementPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedString(value: js.Any): Self = this.set("matchedString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: js.Any): Self = this.set("pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
