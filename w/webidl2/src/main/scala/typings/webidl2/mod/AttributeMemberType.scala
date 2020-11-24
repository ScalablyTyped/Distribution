package typings.webidl2.mod

import typings.webidl2.webidl2Strings.attribute
import typings.webidl2.webidl2Strings.static
import typings.webidl2.webidl2Strings.stringifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeMemberType
  extends AbstractBase
     with IDLInterfaceMemberType
     with IDLInterfaceMixinMemberType
     with IDLNamespaceMemberType {
  
  /** An IDL Type for the attribute. */
  var idlType: IDLTypeDescription = js.native
  
  /** True if it's an inherit attribute. */
  var inherit: Boolean = js.native
  
  /** The attribute's name. */
  var name: String = js.native
  
  @JSName("parent")
  var parent_AttributeMemberType: InterfaceMixinType | InterfaceType | NamespaceType = js.native
  
  /** True if it's a read-only attribute. */
  var readonly: Boolean = js.native
  
  /** Special modifier if exists */
  var special: static | stringifier | Null = js.native
  
  @JSName("type")
  var type_AttributeMemberType: attribute = js.native
}
object AttributeMemberType {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    inherit: Boolean,
    name: String,
    parent: InterfaceMixinType | InterfaceType | NamespaceType,
    readonly: Boolean,
    `type`: attribute
  ): AttributeMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], inherit = inherit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeMemberType]
  }
  
  @scala.inline
  implicit class AttributeMemberTypeOps[Self <: AttributeMemberType] (val x: Self) extends AnyVal {
    
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
    def setIdlType(value: IDLTypeDescription): Self = this.set("idlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: InterfaceMixinType | InterfaceType | NamespaceType): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: attribute): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecial(value: static | stringifier): Self = this.set("special", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialNull: Self = this.set("special", null)
  }
}
