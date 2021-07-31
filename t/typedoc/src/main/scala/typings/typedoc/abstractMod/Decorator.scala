package typings.typedoc.abstractMod

import typings.typedoc.modelsTypesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decorator extends StObject {
  
  var arguments: js.UndefOr[js.Any] = js.undefined
  
  var name: String
  
  var `type`: js.UndefOr[Type] = js.undefined
}
object Decorator {
  
  @scala.inline
  def apply(name: String): Decorator = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decorator]
  }
  
  @scala.inline
  implicit class DecoratorMutableBuilder[Self <: Decorator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Any): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
