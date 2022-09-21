package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcesConstructorOptions[ResourceType, RawType] extends StObject {
  
  var base: js.UndefOr[ResourceBaseData[ResourceType]] = js.undefined
  
  var config: js.UndefOr[ResourceConfig] = js.undefined
  
  var converter: js.UndefOr[js.Function1[/* raw */ RawType, ResourceType]] = js.undefined
  
  var data: ResourceRawData[RawType]
  
  var `type`: js.UndefOr[Constructor[ResourceType]] = js.undefined
  
  var validator: js.UndefOr[js.Function1[/* value */ Any, /* is RawType */ Boolean]] = js.undefined
}
object ResourcesConstructorOptions {
  
  inline def apply[ResourceType, RawType](data: ResourceRawData[RawType]): ResourcesConstructorOptions[ResourceType, RawType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcesConstructorOptions[ResourceType, RawType]]
  }
  
  extension [Self <: ResourcesConstructorOptions[?, ?], ResourceType, RawType](x: Self & (ResourcesConstructorOptions[ResourceType, RawType])) {
    
    inline def setBase(value: ResourceBaseData[ResourceType]): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setConfig(value: ResourceConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setConverter(value: /* raw */ RawType => ResourceType): Self = StObject.set(x, "converter", js.Any.fromFunction1(value))
    
    inline def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
    
    inline def setData(value: ResourceRawData[RawType]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: Constructor[ResourceType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValidator(value: /* value */ Any => /* is RawType */ Boolean): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
    
    inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
  }
}
