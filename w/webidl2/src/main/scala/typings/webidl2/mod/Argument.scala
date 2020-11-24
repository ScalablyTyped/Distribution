package typings.webidl2.mod

import typings.webidl2.webidl2Strings.argument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Argument extends AbstractBase {
  
  /** A default value, absent if there is none. */
  var default: ValueDescription | Null = js.native
  
  /** An IDL Type describing the type of the argument. */
  var idlType: IDLTypeDescription = js.native
  
  /** The argument's name. */
  var name: String = js.native
  
  /** True if the argument is optional. */
  var optional: Boolean = js.native
  
  @JSName("parent")
  var parent_Argument: CallbackType | ConstructorMemberType | ExtendedAttribute | OperationMemberType = js.native
  
  @JSName("type")
  var type_Argument: argument = js.native
  
  /** True if the argument is variadic. */
  var variadic: Boolean = js.native
}
object Argument {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    optional: Boolean,
    parent: CallbackType | ConstructorMemberType | ExtendedAttribute | OperationMemberType,
    `type`: argument,
    variadic: Boolean
  ): Argument = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], variadic = variadic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argument]
  }
  
  @scala.inline
  implicit class ArgumentOps[Self <: Argument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdlType(value: IDLTypeDescription): Self = this.set("idlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: CallbackType | ConstructorMemberType | ExtendedAttribute | OperationMemberType): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: argument): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariadic(value: Boolean): Self = this.set("variadic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: ValueDescription): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNull: Self = this.set("default", null)
  }
}
