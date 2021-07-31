package typings.webidl2.mod

import typings.webidl2.webidl2Strings.attribute
import typings.webidl2.webidl2Strings.static
import typings.webidl2.webidl2Strings.stringifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeMemberType
  extends StObject
     with AbstractBase
     with IDLInterfaceMemberType
     with IDLInterfaceMixinMemberType
     with IDLNamespaceMemberType {
  
  /** An IDL Type for the attribute. */
  var idlType: IDLTypeDescription
  
  /** True if it's an inherit attribute. */
  var inherit: Boolean
  
  /** The attribute's name. */
  var name: String
  
  @JSName("parent")
  var parent_AttributeMemberType: InterfaceMixinType | InterfaceType | NamespaceType
  
  /** True if it's a read-only attribute. */
  var readonly: Boolean
  
  /** Special modifier if exists */
  var special: static | stringifier | Null
  
  @JSName("type")
  var type_AttributeMemberType: attribute
}
object AttributeMemberType {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    inherit: Boolean,
    name: String,
    parent: InterfaceMixinType | InterfaceType | NamespaceType,
    readonly: Boolean
  ): AttributeMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], inherit = inherit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], special = null)
    __obj.updateDynamic("type")("attribute")
    __obj.asInstanceOf[AttributeMemberType]
  }
  
  @scala.inline
  implicit class AttributeMemberTypeMutableBuilder[Self <: AttributeMemberType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdlType(value: IDLTypeDescription): Self = StObject.set(x, "idlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: InterfaceMixinType | InterfaceType | NamespaceType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecial(value: static | stringifier): Self = StObject.set(x, "special", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialNull: Self = StObject.set(x, "special", null)
    
    @scala.inline
    def setType(value: attribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
