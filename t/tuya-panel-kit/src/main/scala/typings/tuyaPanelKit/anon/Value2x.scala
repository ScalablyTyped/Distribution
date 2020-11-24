package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value2x extends js.Object {
  
  var value1: Double = js.native
  
  var value2x: Double = js.native
}
object Value2x {
  
  @scala.inline
  def apply(value1: Double, value2x: Double): Value2x = {
    val __obj = js.Dynamic.literal(value1 = value1.asInstanceOf[js.Any], value2x = value2x.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value2x]
  }
  
  @scala.inline
  implicit class Value2xOps[Self <: Value2x] (val x: Self) extends AnyVal {
    
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
    def setValue1(value: Double): Self = this.set("value1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue2x(value: Double): Self = this.set("value2x", value.asInstanceOf[js.Any])
  }
}
