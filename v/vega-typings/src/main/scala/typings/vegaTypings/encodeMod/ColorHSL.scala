package typings.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorHSL extends js.Object {
  
  var h: NumericValueRef = js.native
  
  var l: NumericValueRef = js.native
  
  var s: NumericValueRef = js.native
}
object ColorHSL {
  
  @scala.inline
  def apply(h: NumericValueRef, l: NumericValueRef, s: NumericValueRef): ColorHSL = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorHSL]
  }
  
  @scala.inline
  implicit class ColorHSLOps[Self <: ColorHSL] (val x: Self) extends AnyVal {
    
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
    def setH(value: NumericValueRef): Self = this.set("h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: NumericValueRef): Self = this.set("l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: NumericValueRef): Self = this.set("s", value.asInstanceOf[js.Any])
  }
}
