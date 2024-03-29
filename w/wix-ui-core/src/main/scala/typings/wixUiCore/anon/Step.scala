package typings.wixUiCore.anon

import typings.wixUiCore.timePickerConstantsMod.AmPmOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Step extends StObject {
  
  var disabled: Boolean
  
  def onChange(): js.Any
  
  var step: Double
  
  var useAmPm: AmPmOptions
  
  var useNativeInteraction: Boolean
  
  var value: js.Any
}
object Step {
  
  inline def apply(
    disabled: Boolean,
    onChange: () => js.Any,
    step: Double,
    useAmPm: AmPmOptions,
    useNativeInteraction: Boolean,
    value: js.Any
  ): Step = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), step = step.asInstanceOf[js.Any], useAmPm = useAmPm.asInstanceOf[js.Any], useNativeInteraction = useNativeInteraction.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
  
  extension [Self <: Step](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: () => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setUseAmPm(value: AmPmOptions): Self = StObject.set(x, "useAmPm", value.asInstanceOf[js.Any])
    
    inline def setUseNativeInteraction(value: Boolean): Self = StObject.set(x, "useNativeInteraction", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
