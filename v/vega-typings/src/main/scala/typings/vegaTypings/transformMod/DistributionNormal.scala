package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.normal
import org.scalablytyped.runtime.StObject
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
  implicit class DistributionNormalMutableBuilder[Self <: DistributionNormal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunction(value: normal): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMean(value: Double | SignalRef): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
    
    @scala.inline
    def setStdev(value: Double | SignalRef): Self = StObject.set(x, "stdev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdevUndefined: Self = StObject.set(x, "stdev", js.undefined)
  }
}
