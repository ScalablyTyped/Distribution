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
  
  @scala.inline
  def apply[Resources /* <: ResourceBaseData[js.Any] */, RawType](): ResourceData[Resources, RawType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceData[Resources, RawType]]
  }
  
  @scala.inline
  implicit class ResourceDataMutableBuilder[Self <: ResourceData[?, ?], Resources /* <: ResourceBaseData[js.Any] */, RawType] (val x: Self & (ResourceData[Resources, RawType])) extends AnyVal {
    
    @scala.inline
    def setBuild(value: Selectable[RawType]): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    @scala.inline
    def setConstructor(value: Selectable[RawType]): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
  }
}
