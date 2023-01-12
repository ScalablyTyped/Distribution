package typings.webidl2.mod

import typings.webidl2.webidl2Strings.setlike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetlikeDeclarationMemberType
  extends StObject
     with AbstractCollectionLikeMemberType
     with DeclarationMemberType {
  
  @JSName("type")
  var type_SetlikeDeclarationMemberType: setlike
}
object SetlikeDeclarationMemberType {
  
  inline def apply(
    arguments: js.Array[Any],
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    parent: InterfaceMixinType | InterfaceType,
    readonly: Boolean
  ): SetlikeDeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = false, extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setlike")
    __obj.asInstanceOf[SetlikeDeclarationMemberType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetlikeDeclarationMemberType] (val x: Self) extends AnyVal {
    
    inline def setType(value: setlike): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
