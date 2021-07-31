package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ReflectionType, 'type'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ trait ReflectionType
  extends StObject
     with SomeType {
  
  var declaration: js.UndefOr[ModelToObject[typings.typedoc.reflectionsDeclarationMod.DeclarationReflection]] = js.undefined
  
  var `type`: (ModelToObject[/* "reflection" */ String]) | (/* "reflection" */ String)
}
object ReflectionType {
  
  @scala.inline
  def apply(`type`: (ModelToObject[/* "reflection" */ String]) | (/* "reflection" */ String)): ReflectionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionType]
  }
  
  @scala.inline
  implicit class ReflectionTypeMutableBuilder[Self <: ReflectionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeclaration(value: ModelToObject[typings.typedoc.reflectionsDeclarationMod.DeclarationReflection]): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
    
    @scala.inline
    def setDeclarationVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "declaration", js.Array(value :_*))
    
    @scala.inline
    def setType(value: (ModelToObject[/* "reflection" */ String]) | (/* "reflection" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
