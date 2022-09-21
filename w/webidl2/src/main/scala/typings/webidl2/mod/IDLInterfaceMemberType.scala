package typings.webidl2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.webidl2.mod.AttributeMemberType
  - typings.webidl2.mod.ConstantMemberType
  - typings.webidl2.mod.ConstructorMemberType
  - typings.webidl2.mod.DeclarationMemberType
  - typings.webidl2.mod.OperationMemberType
*/
trait IDLInterfaceMemberType extends StObject
object IDLInterfaceMemberType {
  
  inline def AttributeMemberType(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    inherit: Boolean,
    name: String,
    parent: InterfaceMixinType | InterfaceType | NamespaceType,
    readonly: Boolean
  ): typings.webidl2.mod.AttributeMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], inherit = inherit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], special = null)
    __obj.updateDynamic("type")("attribute")
    __obj.asInstanceOf[typings.webidl2.mod.AttributeMemberType]
  }
  
  inline def ConstantMemberType(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    nullable: Boolean,
    parent: CallbackInterfaceType | InterfaceMixinType | InterfaceType,
    value: ValueDescription
  ): typings.webidl2.mod.ConstantMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("const")
    __obj.asInstanceOf[typings.webidl2.mod.ConstantMemberType]
  }
  
  inline def ConstructorMemberType(arguments: js.Array[Argument], extAttrs: js.Array[ExtendedAttribute], parent: InterfaceType): typings.webidl2.mod.ConstructorMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("constructor")
    __obj.asInstanceOf[typings.webidl2.mod.ConstructorMemberType]
  }
  
  inline def IterableDeclarationMemberType(
    arguments: js.Array[Argument],
    async: Boolean,
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription] | (js.Tuple2[IDLTypeDescription, IDLTypeDescription]),
    parent: InterfaceMixinType | InterfaceType
  ): typings.webidl2.mod.IterableDeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = false)
    __obj.updateDynamic("type")("iterable")
    __obj.asInstanceOf[typings.webidl2.mod.IterableDeclarationMemberType]
  }
  
  inline def MaplikeDeclarationMemberType(
    arguments: js.Array[Any],
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Tuple2[IDLTypeDescription, IDLTypeDescription],
    parent: InterfaceMixinType | InterfaceType,
    readonly: Boolean
  ): typings.webidl2.mod.MaplikeDeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = false, extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("maplike")
    __obj.asInstanceOf[typings.webidl2.mod.MaplikeDeclarationMemberType]
  }
  
  inline def OperationMemberType(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    parent: CallbackInterfaceType | InterfaceMixinType | InterfaceType | NamespaceType
  ): typings.webidl2.mod.OperationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], idlType = null, name = null, special = null)
    __obj.updateDynamic("type")("operation")
    __obj.asInstanceOf[typings.webidl2.mod.OperationMemberType]
  }
  
  inline def SetlikeDeclarationMemberType(
    arguments: js.Array[Any],
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    parent: InterfaceMixinType | InterfaceType,
    readonly: Boolean
  ): typings.webidl2.mod.SetlikeDeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = false, extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setlike")
    __obj.asInstanceOf[typings.webidl2.mod.SetlikeDeclarationMemberType]
  }
}
