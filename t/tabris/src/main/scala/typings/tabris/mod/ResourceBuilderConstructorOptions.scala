package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceBuilderConstructorOptions[ResourceType, RawType] extends StObject {
  
  var converter: js.UndefOr[js.Function1[/* raw */ RawType, ResourceType]] = js.undefined
  
  var `type`: js.UndefOr[Constructor[ResourceType]] = js.undefined
  
  var validator: js.UndefOr[js.Function1[/* value */ js.Any, /* is RawType */ Boolean]] = js.undefined
}
object ResourceBuilderConstructorOptions {
  
  inline def apply[ResourceType, RawType](): ResourceBuilderConstructorOptions[ResourceType, RawType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceBuilderConstructorOptions[ResourceType, RawType]]
  }
  
  extension [Self <: ResourceBuilderConstructorOptions[?, ?], ResourceType, RawType](x: Self & (ResourceBuilderConstructorOptions[ResourceType, RawType])) {
    
    inline def setConverter(value: /* raw */ RawType => ResourceType): Self = StObject.set(x, "converter", js.Any.fromFunction1(value))
    
    inline def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
    
    inline def setType(value: Constructor[ResourceType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValidator(value: /* value */ js.Any => /* is RawType */ Boolean): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
    
    inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
  }
}
