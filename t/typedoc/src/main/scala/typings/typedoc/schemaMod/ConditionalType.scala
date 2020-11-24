package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ConditionalType, 'type' | 'checkType' | 'extendsType' | 'trueType' | 'falseType'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ @js.native
trait ConditionalType extends SomeType {
  
  var checkType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type = js.native
  
  var extendsType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type = js.native
  
  var falseType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type = js.native
  
  var trueType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type = js.native
  
  var `type`: ModelToObject[String] | String = js.native
}
object ConditionalType {
  
  @scala.inline
  def apply(
    checkType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    extendsType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    falseType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    trueType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    `type`: ModelToObject[String] | String
  ): ConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalType]
  }
  
  @scala.inline
  implicit class ConditionalTypeOps[Self <: ConditionalType] (val x: Self) extends AnyVal {
    
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
    def setCheckTypeVarargs(value: _ModelToObject[js.Any]*): Self = this.set("checkType", js.Array(value :_*))
    
    @scala.inline
    def setCheckType(
      value: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type
    ): Self = this.set("checkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsTypeVarargs(value: _ModelToObject[js.Any]*): Self = this.set("extendsType", js.Array(value :_*))
    
    @scala.inline
    def setExtendsType(
      value: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type
    ): Self = this.set("extendsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFalseTypeVarargs(value: _ModelToObject[js.Any]*): Self = this.set("falseType", js.Array(value :_*))
    
    @scala.inline
    def setFalseType(
      value: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type
    ): Self = this.set("falseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrueTypeVarargs(value: _ModelToObject[js.Any]*): Self = this.set("trueType", js.Array(value :_*))
    
    @scala.inline
    def setTrueType(
      value: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type
    ): Self = this.set("trueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ModelToObject[String] | String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
