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
  
  def validator(value: js.Any): /* is ResourceType */ Boolean
}
object Type {
  
  @scala.inline
  def apply[ResourceType](validator: js.Any => /* is ResourceType */ Boolean): Type[ResourceType] = {
    val __obj = js.Dynamic.literal(validator = js.Any.fromFunction1(validator))
    __obj.asInstanceOf[Type[ResourceType]]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type[?], ResourceType] (val x: Self & Type[ResourceType]) extends AnyVal {
    
    @scala.inline
    def setType(value: Constructor[ResourceType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValidator(value: js.Any => /* is ResourceType */ Boolean): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
  }
}
