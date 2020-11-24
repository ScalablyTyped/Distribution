package typings.webidl2.mod

import typings.webidl2.webidl2Booleans.`false`
import typings.webidl2.webidl2Strings.iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IterableDeclarationMemberType
  extends AbstractDeclarationMemberType
     with DeclarationMemberType {
  
  @JSName("idlType")
  var idlType_IterableDeclarationMemberType: js.Array[IDLTypeDescription] | (js.Tuple2[IDLTypeDescription, IDLTypeDescription]) = js.native
  
  @JSName("readonly")
  var readonly_IterableDeclarationMemberType: `false` = js.native
  
  @JSName("type")
  var type_IterableDeclarationMemberType: iterable = js.native
}
object IterableDeclarationMemberType {
  
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    async: Boolean,
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription] | (js.Tuple2[IDLTypeDescription, IDLTypeDescription]),
    parent: InterfaceMixinType | InterfaceType,
    readonly: `false`,
    `type`: iterable
  ): IterableDeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterableDeclarationMemberType]
  }
  
  @scala.inline
  implicit class IterableDeclarationMemberTypeOps[Self <: IterableDeclarationMemberType] (val x: Self) extends AnyVal {
    
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
    def setIdlTypeVarargs(value: IDLTypeDescription*): Self = this.set("idlType", js.Array(value :_*))
    
    @scala.inline
    def setIdlType(value: js.Array[IDLTypeDescription] | (js.Tuple2[IDLTypeDescription, IDLTypeDescription])): Self = this.set("idlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonly(value: `false`): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: iterable): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
