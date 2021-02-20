package typings.webidl2.mod

import typings.webidl2.webidl2Booleans.`false`
import typings.webidl2.webidl2Strings.iterable
import org.scalablytyped.runtime.StObject
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
  implicit class IterableDeclarationMemberTypeMutableBuilder[Self <: IterableDeclarationMemberType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdlType(value: js.Array[IDLTypeDescription] | (js.Tuple2[IDLTypeDescription, IDLTypeDescription])): Self = StObject.set(x, "idlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdlTypeVarargs(value: IDLTypeDescription*): Self = StObject.set(x, "idlType", js.Array(value :_*))
    
    @scala.inline
    def setReadonly(value: `false`): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: iterable): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
