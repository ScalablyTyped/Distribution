package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Current extends js.Object {
  
  var current: scala.Double = js.native
  
  var future: scala.Double = js.native
  
  var past: scala.Double = js.native
}
object Current {
  
  @scala.inline
  def apply(current: scala.Double, future: scala.Double, past: scala.Double): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  
  @scala.inline
  implicit class CurrentOps[Self <: Current] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: scala.Double): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFuture(value: scala.Double): Self = this.set("future", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPast(value: scala.Double): Self = this.set("past", value.asInstanceOf[js.Any])
  }
}
