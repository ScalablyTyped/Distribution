package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<keyof Resources, tabris.tabris.Selectable<RawType>> */
trait ResourceData[Resources /* <: ResourceBaseData[js.Any] */, RawType] extends StObject {
  
  var build: Selectable[RawType]
  
  var constructor: Selectable[RawType]
}
object ResourceData {
  
  inline def apply[Resources /* <: ResourceBaseData[js.Any] */, RawType](): ResourceData[Resources, RawType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceData[Resources, RawType]]
  }
  
  extension [Self <: ResourceData[?, ?], Resources /* <: ResourceBaseData[js.Any] */, RawType](x: Self & (ResourceData[Resources, RawType])) {
    
    inline def setBuild(value: Selectable[RawType]): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setConstructor(value: Selectable[RawType]): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
  }
}
