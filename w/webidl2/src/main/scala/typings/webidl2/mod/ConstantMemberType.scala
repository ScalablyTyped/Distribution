package typings.webidl2.mod

import typings.webidl2.webidl2Strings.const
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstantMemberType
  extends AbstractBase
     with IDLCallbackInterfaceMemberType
     with IDLInterfaceMemberType
     with IDLInterfaceMixinMemberType {
  
  /** An IDL Type of the constant that represents a simple type, the type name. */
  var idlType: IDLTypeDescription = js.native
  
  /** The name of the constant. */
  var name: String = js.native
  
  /** Whether its type is nullable. */
  var nullable: Boolean = js.native
  
  @JSName("parent")
  var parent_ConstantMemberType: CallbackInterfaceType | InterfaceMixinType | InterfaceType = js.native
  
  @JSName("type")
  var type_ConstantMemberType: const = js.native
  
  /** The constant value */
  var value: ValueDescription = js.native
}
object ConstantMemberType {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    nullable: Boolean,
    parent: CallbackInterfaceType | InterfaceMixinType | InterfaceType,
    `type`: const,
    value: ValueDescription
  ): ConstantMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstantMemberType]
  }
  
  @scala.inline
  implicit class ConstantMemberTypeOps[Self <: ConstantMemberType] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullable(value: Boolean): Self = this.set("nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: CallbackInterfaceType | InterfaceMixinType | InterfaceType): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: const): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ValueDescription): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
