package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Leftshift extends js.Object {
  
  var left_shift: Double = js.native
  
  var right_shift: Double = js.native
  
  var text_line: Double = js.native
}
object Leftshift {
  
  @scala.inline
  def apply(left_shift: Double, right_shift: Double, text_line: Double): Leftshift = {
    val __obj = js.Dynamic.literal(left_shift = left_shift.asInstanceOf[js.Any], right_shift = right_shift.asInstanceOf[js.Any], text_line = text_line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leftshift]
  }
  
  @scala.inline
  implicit class LeftshiftOps[Self <: Leftshift] (val x: Self) extends AnyVal {
    
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
    def setLeft_shift(value: Double): Self = this.set("left_shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight_shift(value: Double): Self = this.set("right_shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_line(value: Double): Self = this.set("text_line", value.asInstanceOf[js.Any])
  }
}
