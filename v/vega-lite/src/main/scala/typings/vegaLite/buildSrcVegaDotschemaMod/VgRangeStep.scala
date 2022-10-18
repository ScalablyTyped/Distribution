package typings.vegaLite.buildSrcVegaDotschemaMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VgRangeStep extends StObject {
  
  var step: Double | SignalRef
}
object VgRangeStep {
  
  inline def apply(step: Double | SignalRef): VgRangeStep = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgRangeStep]
  }
  
  extension [Self <: VgRangeStep](x: Self) {
    
    inline def setStep(value: Double | SignalRef): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
