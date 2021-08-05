package typings.webidl2.mod

import typings.webidl2.webidl2Booleans.`false`
import typings.webidl2.webidl2Strings.iterable
import typings.webidl2.webidl2Strings.maplike
import typings.webidl2.webidl2Strings.setlike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractCollectionLikeMemberType
  extends StObject
     with AbstractDeclarationMemberType {
  
  @JSName("arguments")
  var arguments_AbstractCollectionLikeMemberType: js.Array[js.Any]
  
  @JSName("async")
  var async_AbstractCollectionLikeMemberType: `false`
}
object AbstractCollectionLikeMemberType {
  
  inline def apply(
    arguments: js.Array[js.Any],
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    parent: InterfaceMixinType | InterfaceType,
    readonly: Boolean,
    `type`: iterable | maplike | setlike
  ): AbstractCollectionLikeMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = false, extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractCollectionLikeMemberType]
  }
  
  extension [Self <: AbstractCollectionLikeMemberType](x: Self) {
    
    inline def setArguments(value: js.Array[js.Any]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: js.Any*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    inline def setAsync(value: `false`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
  }
}
