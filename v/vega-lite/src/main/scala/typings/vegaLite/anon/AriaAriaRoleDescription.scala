package typings.vegaLite.anon

import typings.vegaLite.vegaLiteBooleans.`true`
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AriaAriaRoleDescription extends StObject {
  
  var aria: js.UndefOr[`true` | SignalRef] = js.native
  
  var ariaRoleDescription: ValueScaleField = js.native
  
  var description: SignalRef | ValueString = js.native
}
object AriaAriaRoleDescription {
  
  @scala.inline
  def apply(ariaRoleDescription: ValueScaleField, description: SignalRef | ValueString): AriaAriaRoleDescription = {
    val __obj = js.Dynamic.literal(ariaRoleDescription = ariaRoleDescription.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaAriaRoleDescription]
  }
  
  @scala.inline
  implicit class AriaAriaRoleDescriptionMutableBuilder[Self <: AriaAriaRoleDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAria(value: `true` | SignalRef): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaRoleDescription(value: ValueScaleField): Self = StObject.set(x, "ariaRoleDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
    
    @scala.inline
    def setDescription(value: SignalRef | ValueString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
  }
}
