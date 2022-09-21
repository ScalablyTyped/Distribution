package typings.tabris.anon

import typings.tabris.mod.Constructor
import typings.tabris.mod.ResourceBuildOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type[ResourceType]
  extends StObject
     with ResourceBuildOptions[ResourceType] {
  
  var `type`: js.UndefOr[Constructor[ResourceType]] = js.undefined
  
  def validator(value: Any): /* is ResourceType */ Boolean
}
object Type {
  
  inline def apply[ResourceType](validator: Any => /* is ResourceType */ Boolean): Type[ResourceType] = {
    val __obj = js.Dynamic.literal(validator = js.Any.fromFunction1(validator))
    __obj.asInstanceOf[Type[ResourceType]]
  }
  
  extension [Self <: Type[?], ResourceType](x: Self & Type[ResourceType]) {
    
    inline def setType(value: Constructor[ResourceType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValidator(value: Any => /* is ResourceType */ Boolean): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
  }
}
