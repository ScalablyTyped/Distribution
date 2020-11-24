package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backward extends js.Object {
  
  var backward: scala.Double = js.native
  
  var forward: scala.Double = js.native
}
object Backward {
  
  @scala.inline
  def apply(backward: scala.Double, forward: scala.Double): Backward = {
    val __obj = js.Dynamic.literal(backward = backward.asInstanceOf[js.Any], forward = forward.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backward]
  }
  
  @scala.inline
  implicit class BackwardOps[Self <: Backward] (val x: Self) extends AnyVal {
    
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
    def setBackward(value: scala.Double): Self = this.set("backward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForward(value: scala.Double): Self = this.set("forward", value.asInstanceOf[js.Any])
  }
}
