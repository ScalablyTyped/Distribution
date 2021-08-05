package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceBuildConvertOptions[ResourceType, RawType] extends StObject {
  
  def converter(raw: RawType): ResourceType
  
  var `type`: js.UndefOr[Constructor[ResourceType]] = js.undefined
  
  var validator: js.UndefOr[js.Function1[/* value */ js.Any, /* is RawType */ Boolean]] = js.undefined
}
object ResourceBuildConvertOptions {
  
  inline def apply[ResourceType, RawType](converter: RawType => ResourceType): ResourceBuildConvertOptions[ResourceType, RawType] = {
    val __obj = js.Dynamic.literal(converter = js.Any.fromFunction1(converter))
    __obj.asInstanceOf[ResourceBuildConvertOptions[ResourceType, RawType]]
  }
  
  extension [Self <: ResourceBuildConvertOptions[?, ?], ResourceType, RawType](x: Self & (ResourceBuildConvertOptions[ResourceType, RawType])) {
    
    inline def setConverter(value: RawType => ResourceType): Self = StObject.set(x, "converter", js.Any.fromFunction1(value))
    
    inline def setType(value: Constructor[ResourceType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValidator(value: /* value */ js.Any => /* is RawType */ Boolean): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
    
    inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
  }
}
