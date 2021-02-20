package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.kde
import org.scalablytyped.runtime.StObject
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
  implicit class DistributionKDEMutableBuilder[Self <: DistributionKDE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidth(value: Double | SignalRef): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    @scala.inline
    def setField(value: String | TransformField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: DataName): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setFunction(value: kde): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
  }
}
