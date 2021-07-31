package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseNativeInteraction extends StObject {
  
  var disabled: Boolean
  
  def onChange(): js.Any
  
  var step: Double
  
  var useAmPm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AmPmOptions */ js.Any
  
  var useNativeInteraction: Boolean
  
  var value: js.Any
}
object UseNativeInteraction {
  
  @scala.inline
  def apply(
    disabled: Boolean,
    onChange: () => js.Any,
    step: Double,
    useAmPm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AmPmOptions */ js.Any,
    useNativeInteraction: Boolean,
    value: js.Any
  ): UseNativeInteraction = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), step = step.asInstanceOf[js.Any], useAmPm = useAmPm.asInstanceOf[js.Any], useNativeInteraction = useNativeInteraction.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseNativeInteraction]
  }
  
  @scala.inline
  implicit class UseNativeInteractionMutableBuilder[Self <: UseNativeInteraction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: () => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAmPm(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AmPmOptions */ js.Any
    ): Self = StObject.set(x, "useAmPm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNativeInteraction(value: Boolean): Self = StObject.set(x, "useNativeInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
