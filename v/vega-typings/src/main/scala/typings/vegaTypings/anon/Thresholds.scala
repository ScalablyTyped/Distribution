package typings.vegaTypings.anon

import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Thresholds extends StObject {
  
  var thresholds: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
}
object Thresholds {
  
  @scala.inline
  def apply(): Thresholds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thresholds]
  }
  
  @scala.inline
  implicit class ThresholdsMutableBuilder[Self <: Thresholds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThresholds(value: (js.Array[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdsUndefined: Self = StObject.set(x, "thresholds", js.undefined)
    
    @scala.inline
    def setThresholdsVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "thresholds", js.Array(value :_*))
  }
}
