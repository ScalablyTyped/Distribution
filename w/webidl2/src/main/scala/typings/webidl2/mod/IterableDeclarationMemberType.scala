package typings.webidl2.mod

import typings.webidl2.webidl2Booleans.`false`
import typings.webidl2.webidl2Strings.iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IterableDeclarationMemberType
  extends StObject
     with AbstractDeclarationMemberType
     with DeclarationMemberType {
  
  @JSName("idlType")
  var idlType_IterableDeclarationMemberType: js.Array[IDLTypeDescription] | (js.Tuple2[IDLTypeDescription, IDLTypeDescription])
  
  @JSName("readonly")
  var readonly_IterableDeclarationMemberType: `false`
  
  @JSName("type")
  var type_IterableDeclarationMemberType: iterable
}
object IterableDeclarationMemberType {
  
  inline def apply(
    arguments: js.Array[Argument],
    async: Boolean,
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription] | (js.Tuple2[IDLTypeDescription, IDLTypeDescription]),
    parent: InterfaceMixinType | InterfaceType
  ): IterableDeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = false)
    __obj.updateDynamic("type")("iterable")
    __obj.asInstanceOf[IterableDeclarationMemberType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IterableDeclarationMemberType] (val x: Self) extends AnyVal {
    
    inline def setIdlType(value: js.Array[IDLTypeDescription] | (js.Tuple2[IDLTypeDescription, IDLTypeDescription])): Self = StObject.set(x, "idlType", value.asInstanceOf[js.Any])
    
    inline def setIdlTypeVarargs(value: IDLTypeDescription*): Self = StObject.set(x, "idlType", js.Array(value*))
    
    inline def setReadonly(value: `false`): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setType(value: iterable): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
