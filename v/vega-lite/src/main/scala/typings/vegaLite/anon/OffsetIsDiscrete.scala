package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetIsDiscrete extends StObject {
  
  var offsetIsDiscrete: Boolean
  
  var step: typings.vegaLite.specBaseMod.Step
}
object OffsetIsDiscrete {
  
  inline def apply(offsetIsDiscrete: Boolean, step: typings.vegaLite.specBaseMod.Step): OffsetIsDiscrete = {
    val __obj = js.Dynamic.literal(offsetIsDiscrete = offsetIsDiscrete.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetIsDiscrete]
  }
  
  extension [Self <: OffsetIsDiscrete](x: Self) {
    
    inline def setOffsetIsDiscrete(value: Boolean): Self = StObject.set(x, "offsetIsDiscrete", value.asInstanceOf[js.Any])
    
    inline def setStep(value: typings.vegaLite.specBaseMod.Step): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
