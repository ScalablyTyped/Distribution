package typings.vegaTypings.anon

import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Thresholds extends StObject {
  
  var thresholds: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
}
object Thresholds {
  
  inline def apply(): Thresholds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thresholds]
  }
  
  extension [Self <: Thresholds](x: Self) {
    
    inline def setThresholds(value: (js.Array[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    inline def setThresholdsUndefined: Self = StObject.set(x, "thresholds", js.undefined)
    
    inline def setThresholdsVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "thresholds", js.Array(value :_*))
  }
}
