package typings.webidl2.mod

import typings.webidl2.webidl2Booleans.`false`
import typings.webidl2.webidl2Strings.maplike
import org.scalablytyped.runtime.StObject
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
  implicit class MaplikeDeclarationMemberTypeMutableBuilder[Self <: MaplikeDeclarationMemberType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdlType(value: js.Tuple2[IDLTypeDescription, IDLTypeDescription]): Self = StObject.set(x, "idlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: maplike): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
