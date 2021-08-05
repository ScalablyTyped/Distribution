package typings.webidl2.mod

import typings.webidl2.webidl2Strings.maplike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaplikeDeclarationMemberType
  extends StObject
     with AbstractCollectionLikeMemberType
     with DeclarationMemberType {
  
  @JSName("idlType")
  var idlType_MaplikeDeclarationMemberType: js.Tuple2[IDLTypeDescription, IDLTypeDescription]
  
  @JSName("type")
  var type_MaplikeDeclarationMemberType: maplike
}
object MaplikeDeclarationMemberType {
  
  inline def apply(
    arguments: js.Array[js.Any],
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Tuple2[IDLTypeDescription, IDLTypeDescription],
    parent: InterfaceMixinType | InterfaceType,
    readonly: Boolean
  ): MaplikeDeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = false, extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("maplike")
    __obj.asInstanceOf[MaplikeDeclarationMemberType]
  }
  
  extension [Self <: MaplikeDeclarationMemberType](x: Self) {
    
    inline def setIdlType(value: js.Tuple2[IDLTypeDescription, IDLTypeDescription]): Self = StObject.set(x, "idlType", value.asInstanceOf[js.Any])
    
    inline def setType(value: maplike): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
