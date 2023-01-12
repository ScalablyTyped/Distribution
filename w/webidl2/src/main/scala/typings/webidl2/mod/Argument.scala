package typings.webidl2.mod

import typings.webidl2.webidl2Strings.argument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Argument
  extends StObject
     with AbstractBase {
  
  /** A default value, absent if there is none. */
  var default: ValueDescription | Null
  
  /** An IDL Type describing the type of the argument. */
  var idlType: IDLTypeDescription
  
  /** The argument's name. */
  var name: String
  
  /** True if the argument is optional. */
  var optional: Boolean
  
  @JSName("parent")
  var parent_Argument: CallbackType | ConstructorMemberType | ExtendedAttribute | OperationMemberType
  
  @JSName("type")
  var type_Argument: argument
  
  /** True if the argument is variadic. */
  var variadic: Boolean
}
object Argument {
  
  inline def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    optional: Boolean,
    parent: CallbackType | ConstructorMemberType | ExtendedAttribute | OperationMemberType,
    variadic: Boolean
  ): Argument = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], variadic = variadic.asInstanceOf[js.Any], default = null)
    __obj.updateDynamic("type")("argument")
    __obj.asInstanceOf[Argument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Argument] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: ValueDescription): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultNull: Self = StObject.set(x, "default", null)
    
    inline def setIdlType(value: IDLTypeDescription): Self = StObject.set(x, "idlType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setParent(value: CallbackType | ConstructorMemberType | ExtendedAttribute | OperationMemberType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: argument): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVariadic(value: Boolean): Self = StObject.set(x, "variadic", value.asInstanceOf[js.Any])
  }
}
