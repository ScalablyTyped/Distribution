package typings.webidl2.mod

import typings.webidl2.webidl2Strings.iterable
import typings.webidl2.webidl2Strings.maplike
import typings.webidl2.webidl2Strings.setlike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractDeclarationMemberType
  extends StObject
     with AbstractBase {
  
  /** An array of arguments for the iterable declaration. */
  var arguments: js.Array[Argument]
  
  /** Whether the iterable is declared as async. */
  var async: Boolean
  
  /** An array with one or more IDL Types representing the declared type arguments. */
  var idlType: js.Array[IDLTypeDescription]
  
  @JSName("parent")
  var parent_AbstractDeclarationMemberType: InterfaceMixinType | InterfaceType
  
  /** Whether the maplike or setlike is declared as read only. */
  var readonly: Boolean
  
  @JSName("type")
  var type_AbstractDeclarationMemberType: iterable | maplike | setlike
}
object AbstractDeclarationMemberType {
  
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    async: Boolean,
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    parent: InterfaceMixinType | InterfaceType,
    readonly: Boolean,
    `type`: iterable | maplike | setlike
  ): AbstractDeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractDeclarationMemberType]
  }
  
  @scala.inline
  implicit class AbstractDeclarationMemberTypeMutableBuilder[Self <: AbstractDeclarationMemberType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[Argument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsVarargs(value: Argument*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdlType(value: js.Array[IDLTypeDescription]): Self = StObject.set(x, "idlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdlTypeVarargs(value: IDLTypeDescription*): Self = StObject.set(x, "idlType", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: InterfaceMixinType | InterfaceType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: iterable | maplike | setlike): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
