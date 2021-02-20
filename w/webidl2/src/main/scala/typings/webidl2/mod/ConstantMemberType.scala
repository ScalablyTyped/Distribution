package typings.webidl2.mod

import typings.webidl2.webidl2Strings.const
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstantMemberType
  extends AbstractBase
     with IDLCallbackInterfaceMemberType
     with IDLInterfaceMemberType
     with IDLInterfaceMixinMemberType {
  
  /** An IDL Type of the constant that represents a simple type, the type name. */
  var idlType: IDLTypeDescription = js.native
  
  /** The name of the constant. */
  var name: String = js.native
  
  /** Whether its type is nullable. */
  var nullable: Boolean = js.native
  
  @JSName("parent")
  var parent_ConstantMemberType: CallbackInterfaceType | InterfaceMixinType | InterfaceType = js.native
  
  @JSName("type")
  var type_ConstantMemberType: const = js.native
  
  /** The constant value */
  var value: ValueDescription = js.native
}
object ConstantMemberType {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    nullable: Boolean,
    parent: CallbackInterfaceType | InterfaceMixinType | InterfaceType,
    `type`: const,
    value: ValueDescription
  ): ConstantMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstantMemberType]
  }
  
  @scala.inline
  implicit class ConstantMemberTypeMutableBuilder[Self <: ConstantMemberType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdlType(value: IDLTypeDescription): Self = StObject.set(x, "idlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: CallbackInterfaceType | InterfaceMixinType | InterfaceType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: const): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ValueDescription): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
