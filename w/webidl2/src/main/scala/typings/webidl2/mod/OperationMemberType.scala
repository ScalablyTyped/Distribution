package typings.webidl2.mod

import typings.webidl2.webidl2Strings.deleter
import typings.webidl2.webidl2Strings.getter
import typings.webidl2.webidl2Strings.operation
import typings.webidl2.webidl2Strings.setter
import typings.webidl2.webidl2Strings.static
import typings.webidl2.webidl2Strings.stringifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationMemberType
  extends AbstractBase
     with IDLCallbackInterfaceMemberType
     with IDLInterfaceMemberType
     with IDLInterfaceMixinMemberType
     with IDLNamespaceMemberType {
  
  /** An array of arguments for the operation. */
  var arguments: js.Array[Argument] = js.native
  
  /** An IDL Type of what the operation returns. If a stringifier, may be absent. */
  var idlType: IDLTypeDescription | Null = js.native
  
  /** The name of the operation. If a stringifier, may be null. */
  var name: String | Null = js.native
  
  @JSName("parent")
  var parent_OperationMemberType: CallbackInterfaceType | InterfaceMixinType | InterfaceType | NamespaceType = js.native
  
  /** Special modifier if exists */
  var special: getter | setter | deleter | static | stringifier | Null = js.native
  
  @JSName("type")
  var type_OperationMemberType: operation = js.native
}
object OperationMemberType {
  
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    parent: CallbackInterfaceType | InterfaceMixinType | InterfaceType | NamespaceType,
    `type`: operation
  ): OperationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationMemberType]
  }
  
  @scala.inline
  implicit class OperationMemberTypeOps[Self <: OperationMemberType] (val x: Self) extends AnyVal {
    
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
    def setArgumentsVarargs(value: Argument*): Self = this.set("arguments", js.Array(value :_*))
    
    @scala.inline
    def setArguments(value: js.Array[Argument]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: CallbackInterfaceType | InterfaceMixinType | InterfaceType | NamespaceType): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: operation): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdlType(value: IDLTypeDescription): Self = this.set("idlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdlTypeNull: Self = this.set("idlType", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setSpecial(value: getter | setter | deleter | static | stringifier): Self = this.set("special", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialNull: Self = this.set("special", null)
  }
}
