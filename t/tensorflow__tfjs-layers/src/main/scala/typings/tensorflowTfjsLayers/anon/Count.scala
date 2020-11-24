package typings.tensorflowTfjsLayers.anon

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Count extends js.Object {
  
  var count: js.UndefOr[Double] = js.native
  
  def ones(): Tensor[Rank] = js.native
  
  var rate: Double = js.native
  
  var training: js.UndefOr[Boolean] = js.native
}
object Count {
  
  @scala.inline
  def apply(ones: () => Tensor[Rank], rate: Double): Count = {
    val __obj = js.Dynamic.literal(ones = js.Any.fromFunction0(ones), rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  @scala.inline
  implicit class CountOps[Self <: Count] (val x: Self) extends AnyVal {
    
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
    def setOnes(value: () => Tensor[Rank]): Self = this.set("ones", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setTraining(value: Boolean): Self = this.set("training", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraining: Self = this.set("training", js.undefined)
  }
}
