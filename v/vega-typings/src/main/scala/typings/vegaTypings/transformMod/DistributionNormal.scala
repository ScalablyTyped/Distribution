package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionNormal extends Distribution {
  
  var function: normal = js.native
  
  var mean: js.UndefOr[Double | SignalRef] = js.native
  
  var stdev: js.UndefOr[Double | SignalRef] = js.native
}
object DistributionNormal {
  
  @scala.inline
  def apply(function: normal): DistributionNormal = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionNormal]
  }
  
  @scala.inline
  implicit class DistributionNormalOps[Self <: DistributionNormal] (val x: Self) extends AnyVal {
    
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
    def setFunction(value: normal): Self = this.set("function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMean(value: Double | SignalRef): Self = this.set("mean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMean: Self = this.set("mean", js.undefined)
    
    @scala.inline
    def setStdev(value: Double | SignalRef): Self = this.set("stdev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdev: Self = this.set("stdev", js.undefined)
  }
}
