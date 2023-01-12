package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecUtilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.timeunit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeUnitTransform
  extends StObject
     with Transforms {
  
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  
  var field: FieldRef
  
  var interval: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var signal: js.UndefOr[SignalName] = js.undefined
  
  var step: js.UndefOr[Double | SignalRef] = js.undefined
  
  var timezone: js.UndefOr[TimeZone | SignalRef] = js.undefined
  
  var `type`: timeunit
  
  var units: js.UndefOr[(js.Array[TimeUnit | SignalRef]) | SignalRef] = js.undefined
}
object TimeUnitTransform {
  
  inline def apply(field: FieldRef): TimeUnitTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("timeunit")
    __obj.asInstanceOf[TimeUnitTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeUnitTransform] (val x: Self) extends AnyVal {
    
    inline def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setField(value: FieldRef): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: Boolean | SignalRef): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setSignal(value: SignalName): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setStep(value: Double | SignalRef): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setTimezone(value: TimeZone | SignalRef): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    inline def setType(value: timeunit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnits(value: (js.Array[TimeUnit | SignalRef]) | SignalRef): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    inline def setUnitsVarargs(value: (TimeUnit | SignalRef)*): Self = StObject.set(x, "units", js.Array(value*))
  }
}
