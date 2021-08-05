package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.lognormal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionLogNormal
  extends StObject
     with Distribution {
  
  var function: lognormal
  
  var mean: js.UndefOr[Double | SignalRef] = js.undefined
  
  var stdev: js.UndefOr[Double | SignalRef] = js.undefined
}
object DistributionLogNormal {
  
  inline def apply(): DistributionLogNormal = {
    val __obj = js.Dynamic.literal(function = "lognormal")
    __obj.asInstanceOf[DistributionLogNormal]
  }
  
  extension [Self <: DistributionLogNormal](x: Self) {
    
    inline def setFunction(value: lognormal): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setMean(value: Double | SignalRef): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
    
    inline def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
    
    inline def setStdev(value: Double | SignalRef): Self = StObject.set(x, "stdev", value.asInstanceOf[js.Any])
    
    inline def setStdevUndefined: Self = StObject.set(x, "stdev", js.undefined)
  }
}
