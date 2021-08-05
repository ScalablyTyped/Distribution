package typings.tabris.anon

import typings.tabris.mod.Constructor
import typings.tabris.mod.ResourceBuildOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validator[ResourceType]
  extends StObject
     with ResourceBuildOptions[ResourceType] {
  
  var `type`: Constructor[ResourceType]
  
  var validator: js.UndefOr[js.Function1[/* value */ js.Any, /* is ResourceType */ Boolean]] = js.undefined
}
object Validator {
  
  inline def apply[ResourceType](`type`: Constructor[ResourceType]): Validator[ResourceType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validator[ResourceType]]
  }
  
  extension [Self <: Validator[?], ResourceType](x: Self & Validator[ResourceType]) {
    
    inline def setType(value: Constructor[ResourceType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidator(value: /* value */ js.Any => /* is ResourceType */ Boolean): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
    
    inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
  }
}
