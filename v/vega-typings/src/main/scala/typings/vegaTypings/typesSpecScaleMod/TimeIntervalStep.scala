package typings.vegaTypings.typesSpecScaleMod

import typings.vegaTypings.typesSpecAxisMod._TickCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeIntervalStep
  extends StObject
     with _TickCount {
  
  var interval: TimeInterval
  
  var step: Double
}
object TimeIntervalStep {
  
  inline def apply(interval: TimeInterval, step: Double): TimeIntervalStep = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeIntervalStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeIntervalStep] (val x: Self) extends AnyVal {
    
    inline def setInterval(value: TimeInterval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
