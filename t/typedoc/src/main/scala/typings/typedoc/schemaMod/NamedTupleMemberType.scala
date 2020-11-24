package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.NamedTupleMember, 'type'> */
@js.native
trait NamedTupleMemberType extends js.Object {
  
  var element: ModelToObject[typings.typedoc.typesAbstractMod.Type] = js.native
  
  var isOptional: Boolean = js.native
  
  var name: String = js.native
  
  var `type`: (ModelToObject[/* "named-tuple-member" */ String]) | (/* "named-tuple-member" */ String) = js.native
}
object NamedTupleMemberType {
  
  @scala.inline
  def apply(
    element: ModelToObject[typings.typedoc.typesAbstractMod.Type],
    isOptional: Boolean,
    name: String,
    `type`: (ModelToObject[/* "named-tuple-member" */ String]) | (/* "named-tuple-member" */ String)
  ): NamedTupleMemberType = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedTupleMemberType]
  }
  
  @scala.inline
  implicit class NamedTupleMemberTypeOps[Self <: NamedTupleMemberType] (val x: Self) extends AnyVal {
    
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
    def setElementVarargs(value: _ModelToObject[js.Any]*): Self = this.set("element", js.Array(value :_*))
    
    @scala.inline
    def setElement(value: ModelToObject[typings.typedoc.typesAbstractMod.Type]): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOptional(value: Boolean): Self = this.set("isOptional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: (ModelToObject[/* "named-tuple-member" */ String]) | (/* "named-tuple-member" */ String)): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
