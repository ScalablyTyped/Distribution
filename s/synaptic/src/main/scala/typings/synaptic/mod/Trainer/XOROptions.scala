package typings.synaptic.mod.Trainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XOROptions extends js.Object {
  
  var cost: js.UndefOr[CostFunction] = js.native
  
  var iterations: js.UndefOr[Double] = js.native
  
  var log: js.UndefOr[Double] = js.native
  
  var shuffle: js.UndefOr[Boolean] = js.native
}
object XOROptions {
  
  @scala.inline
  def apply(): XOROptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XOROptions]
  }
  
  @scala.inline
  implicit class XOROptionsOps[Self <: XOROptions] (val x: Self) extends AnyVal {
    
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
    def setCost(value: (/* targetValues */ js.Array[Double], /* outputValues */ js.Array[Double]) => Double): Self = this.set("cost", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCost: Self = this.set("cost", js.undefined)
    
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
    
    @scala.inline
    def setLog(value: Double): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setShuffle(value: Boolean): Self = this.set("shuffle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShuffle: Self = this.set("shuffle", js.undefined)
  }
}
