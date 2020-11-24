package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.kde
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionKDE extends Distribution {
  
  var bandwidth: js.UndefOr[Double | SignalRef] = js.native
  
  var field: String | TransformField = js.native
  
  var from: js.UndefOr[DataName] = js.native
  
  var function: kde = js.native
}
object DistributionKDE {
  
  @scala.inline
  def apply(field: String | TransformField, function: kde): DistributionKDE = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionKDE]
  }
  
  @scala.inline
  implicit class DistributionKDEOps[Self <: DistributionKDE] (val x: Self) extends AnyVal {
    
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
    def setField(value: String | TransformField): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunction(value: kde): Self = this.set("function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidth(value: Double | SignalRef): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandwidth: Self = this.set("bandwidth", js.undefined)
    
    @scala.inline
    def setFrom(value: DataName): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
  }
}
