package typings.vegaLite.anon

import typings.vegaLite.vegaLiteBooleans.`true`
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  var aria: js.UndefOr[`true` | SignalRef] = js.undefined
  
  var ariaRoleDescription: Unit
  
  var description: SignalRef | ValueString
}
object Description {
  
  @scala.inline
  def apply(ariaRoleDescription: Unit, description: SignalRef | ValueString): Description = {
    val __obj = js.Dynamic.literal(ariaRoleDescription = ariaRoleDescription.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  @scala.inline
  implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAria(value: `true` | SignalRef): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaRoleDescription(value: Unit): Self = StObject.set(x, "ariaRoleDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
    
    @scala.inline
    def setDescription(value: SignalRef | ValueString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
  }
}
