package typings.webidl2.mod

import typings.webidl2.webidl2Strings.iterable
import typings.webidl2.webidl2Strings.maplike
import typings.webidl2.webidl2Strings.setlike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractDeclarationMemberType extends AbstractBase {
  
  /** An array of arguments for the iterable declaration. */
  var arguments: js.Array[Argument] = js.native
  
  /** Whether the iterable is declared as async. */
  var async: Boolean = js.native
  
  /** An array with one or more IDL Types representing the declared type arguments. */
  var idlType: js.Array[IDLTypeDescription] = js.native
  
  @JSName("parent")
  var parent_AbstractDeclarationMemberType: InterfaceMixinType | InterfaceType = js.native
  
  /** Whether the maplike or setlike is declared as read only. */
  var readonly: Boolean = js.native
  
  @JSName("type")
  var type_AbstractDeclarationMemberType: iterable | maplike | setlike = js.native
}
object AbstractDeclarationMemberType {
  
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    async: Boolean,
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    parent: InterfaceMixinType | InterfaceType,
    readonly: Boolean,
    `type`: iterable | maplike | setlike
  ): AbstractDeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractDeclarationMemberType]
  }
  
  @scala.inline
  implicit class AbstractDeclarationMemberTypeOps[Self <: AbstractDeclarationMemberType] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdlTypeVarargs(value: IDLTypeDescription*): Self = this.set("idlType", js.Array(value :_*))
    
    @scala.inline
    def setIdlType(value: js.Array[IDLTypeDescription]): Self = this.set("idlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: InterfaceMixinType | InterfaceType): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: iterable | maplike | setlike): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
