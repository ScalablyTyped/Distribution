package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetIsDiscrete extends StObject {
  
  var offsetIsDiscrete: Boolean
  
  var step: typings.vegaLite.buildSrcSpecBaseMod.Step
}
object OffsetIsDiscrete {
  
  inline def apply(offsetIsDiscrete: Boolean, step: typings.vegaLite.buildSrcSpecBaseMod.Step): OffsetIsDiscrete = {
    val __obj = js.Dynamic.literal(offsetIsDiscrete = offsetIsDiscrete.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetIsDiscrete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffsetIsDiscrete] (val x: Self) extends AnyVal {
    
    inline def setOffsetIsDiscrete(value: Boolean): Self = StObject.set(x, "offsetIsDiscrete", value.asInstanceOf[js.Any])
    
    inline def setStep(value: typings.vegaLite.buildSrcSpecBaseMod.Step): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
