package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.kde
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionKDE
  extends StObject
     with Distribution {
  
  var bandwidth: js.UndefOr[Double | SignalRef] = js.undefined
  
  var field: String | TransformField
  
  var from: js.UndefOr[DataName] = js.undefined
  
  var function: kde
}
object DistributionKDE {
  
  inline def apply(field: String | TransformField): DistributionKDE = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = "kde")
    __obj.asInstanceOf[DistributionKDE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistributionKDE] (val x: Self) extends AnyVal {
    
    inline def setBandwidth(value: Double | SignalRef): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    inline def setField(value: String | TransformField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: DataName): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setFunction(value: kde): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
  }
}
