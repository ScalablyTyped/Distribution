package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.TypeParameterType, 'type' | 'name' | 'constraint' | 'default'> */
@js.native
trait TypeParameterType extends SomeType {
  
  var constraint: js.UndefOr[
    ModelToObject[js.UndefOr[typings.typedoc.typesAbstractMod.Type]] | typings.typedoc.typesAbstractMod.Type
  ] = js.native
  
  var default: js.UndefOr[
    ModelToObject[js.UndefOr[typings.typedoc.typesAbstractMod.Type]] | typings.typedoc.typesAbstractMod.Type
  ] = js.native
  
  var name: ModelToObject[String] | String = js.native
  
  var `type`: ModelToObject[String] | String = js.native
}
object TypeParameterType {
  
  @scala.inline
  def apply(name: ModelToObject[String] | String, `type`: ModelToObject[String] | String): TypeParameterType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameterType]
  }
  
  @scala.inline
  implicit class TypeParameterTypeOps[Self <: TypeParameterType] (val x: Self) extends AnyVal {
    
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
    def setNameVarargs(value: _ModelToObject[js.Any]*): Self = this.set("name", js.Array(value :_*))
    
    @scala.inline
    def setName(value: ModelToObject[String] | String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ModelToObject[String] | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintVarargs(value: _ModelToObject[js.Any]*): Self = this.set("constraint", js.Array(value :_*))
    
    @scala.inline
    def setConstraint(
      value: ModelToObject[js.UndefOr[typings.typedoc.typesAbstractMod.Type]] | typings.typedoc.typesAbstractMod.Type
    ): Self = this.set("constraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraint: Self = this.set("constraint", js.undefined)
    
    @scala.inline
    def setDefaultVarargs(value: _ModelToObject[js.Any]*): Self = this.set("default", js.Array(value :_*))
    
    @scala.inline
    def setDefault(
      value: ModelToObject[js.UndefOr[typings.typedoc.typesAbstractMod.Type]] | typings.typedoc.typesAbstractMod.Type
    ): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
  }
}
