package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value1 extends js.Object {
  
  var value1: Double = js.native
  
  var value2: Double = js.native
}
object Value1 {
  
  @scala.inline
  def apply(value1: Double, value2: Double): Value1 = {
    val __obj = js.Dynamic.literal(value1 = value1.asInstanceOf[js.Any], value2 = value2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value1]
  }
  
  @scala.inline
  implicit class Value1Ops[Self <: Value1] (val x: Self) extends AnyVal {
    
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
    def setValue2(value: Double): Self = this.set("value2", value.asInstanceOf[js.Any])
  }
}
