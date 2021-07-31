package typings.typedoc.anon

import typings.typedoc.modelsTypesMod.Type
import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typedoc.typedoc/dist/lib/serialization/schema.Decorator> */
trait PartialDecorator extends StObject {
  
  var arguments: js.UndefOr[ModelToObject[js.UndefOr[js.Any]] | js.Any] = js.undefined
  
  var name: js.UndefOr[ModelToObject[String] | String] = js.undefined
  
  var `type`: js.UndefOr[ModelToObject[js.UndefOr[Type]] | Type] = js.undefined
}
object PartialDecorator {
  
  @scala.inline
  def apply(): PartialDecorator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDecorator]
  }
  
  @scala.inline
  implicit class PartialDecoratorMutableBuilder[Self <: PartialDecorator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: ModelToObject[js.UndefOr[js.Any]] | js.Any): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    @scala.inline
    def setArgumentsVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setName(value: ModelToObject[String] | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ModelToObject[js.UndefOr[Type]] | Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
