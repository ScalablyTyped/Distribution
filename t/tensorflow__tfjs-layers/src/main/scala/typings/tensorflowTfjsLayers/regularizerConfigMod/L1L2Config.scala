package typings.tensorflowTfjsLayers.regularizerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait L1L2Config extends js.Object {
  
  var l1: js.UndefOr[Double] = js.native
  
  var l2: js.UndefOr[Double] = js.native
}
object L1L2Config {
  
  @scala.inline
  def apply(): L1L2Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[L1L2Config]
  }
  
  @scala.inline
  implicit class L1L2ConfigOps[Self <: L1L2Config] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteL1: Self = this.set("l1", js.undefined)
    
    @scala.inline
    def setL2(value: Double): Self = this.set("l2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteL2: Self = this.set("l2", js.undefined)
  }
}
