package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ReflectionType, 'type'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ @js.native
trait ReflectionType extends SomeType {
  
  var declaration: js.UndefOr[ModelToObject[typings.typedoc.reflectionsDeclarationMod.DeclarationReflection]] = js.native
  
  var `type`: (ModelToObject[/* "reflection" */ String]) | (/* "reflection" */ String) = js.native
}
object ReflectionType {
  
  @scala.inline
  def apply(`type`: (ModelToObject[/* "reflection" */ String]) | (/* "reflection" */ String)): ReflectionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionType]
  }
  
  @scala.inline
  implicit class ReflectionTypeOps[Self <: ReflectionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: (ModelToObject[/* "reflection" */ String]) | (/* "reflection" */ String)): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationVarargs(value: _ModelToObject[js.Any]*): Self = this.set("declaration", js.Array(value :_*))
    
    @scala.inline
    def setDeclaration(value: ModelToObject[typings.typedoc.reflectionsDeclarationMod.DeclarationReflection]): Self = this.set("declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclaration: Self = this.set("declaration", js.undefined)
  }
}
