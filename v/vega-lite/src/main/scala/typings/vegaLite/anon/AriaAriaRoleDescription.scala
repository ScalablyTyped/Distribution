package typings.vegaLite.anon

import typings.vegaLite.vegaLiteBooleans.`true`
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaAriaRoleDescription extends StObject {
  
  var aria: js.UndefOr[`true` | SignalRef] = js.undefined
  
  var ariaRoleDescription: `3`
  
  var description: SignalRef | ValueString
}
object AriaAriaRoleDescription {
  
  inline def apply(ariaRoleDescription: `3`, description: SignalRef | ValueString): AriaAriaRoleDescription = {
    val __obj = js.Dynamic.literal(ariaRoleDescription = ariaRoleDescription.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaAriaRoleDescription]
  }
  
  extension [Self <: AriaAriaRoleDescription](x: Self) {
    
    inline def setAria(value: `true` | SignalRef): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
    
    inline def setAriaRoleDescription(value: `3`): Self = StObject.set(x, "ariaRoleDescription", value.asInstanceOf[js.Any])
    
    inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
    
    inline def setDescription(value: SignalRef | ValueString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
  }
}
