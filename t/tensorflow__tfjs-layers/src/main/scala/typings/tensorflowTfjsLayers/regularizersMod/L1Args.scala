package typings.tensorflowTfjsLayers.regularizersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait L1Args extends js.Object {
  
  /** L1 regularization rate. Defaults to 0.01. */
  var l1: Double = js.native
}
object L1Args {
  
  @scala.inline
  def apply(l1: Double): L1Args = {
    val __obj = js.Dynamic.literal(l1 = l1.asInstanceOf[js.Any])
    __obj.asInstanceOf[L1Args]
  }
  
  @scala.inline
  implicit class L1ArgsOps[Self <: L1Args] (val x: Self) extends AnyVal {
    
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
    def setL1(value: Double): Self = this.set("l1", value.asInstanceOf[js.Any])
  }
}
