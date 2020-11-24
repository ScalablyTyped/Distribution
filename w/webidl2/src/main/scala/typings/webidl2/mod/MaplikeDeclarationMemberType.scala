package typings.webidl2.mod

import typings.webidl2.webidl2Booleans.`false`
import typings.webidl2.webidl2Strings.maplike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaplikeDeclarationMemberType
  extends AbstractCollectionLikeMemberType
     with DeclarationMemberType {
  
  @JSName("idlType")
  var idlType_MaplikeDeclarationMemberType: js.Tuple2[IDLTypeDescription, IDLTypeDescription] = js.native
  
  @JSName("type")
  var type_MaplikeDeclarationMemberType: maplike = js.native
}
object MaplikeDeclarationMemberType {
  
  @scala.inline
  def apply(
    arguments: js.Array[js.Any],
    async: `false`,
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Tuple2[IDLTypeDescription, IDLTypeDescription],
    parent: InterfaceMixinType | InterfaceType,
    readonly: Boolean,
    `type`: maplike
  ): MaplikeDeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaplikeDeclarationMemberType]
  }
  
  @scala.inline
  implicit class MaplikeDeclarationMemberTypeOps[Self <: MaplikeDeclarationMemberType] (val x: Self) extends AnyVal {
    
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
    def setIdlType(value: js.Tuple2[IDLTypeDescription, IDLTypeDescription]): Self = this.set("idlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: maplike): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
