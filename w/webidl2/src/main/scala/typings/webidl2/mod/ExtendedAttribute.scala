package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`extended-attribute`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedAttribute extends AbstractBase {
  
  /** If the extended attribute takes arguments or if its right-hand side does they are listed here. */
  var arguments: js.Array[Argument] = js.native
  
  /** The extended attribute's name. */
  var name: String = js.native
  
  @JSName("parent")
  var parent_ExtendedAttribute: IDLRootType | FieldType | IDLInterfaceMemberType = js.native
  
  /** If there is a right-hand side, this will capture its type and value. */
  var rhs: ExtendedAttributeRightHandSide | Null = js.native
  
  @JSName("type")
  var type_ExtendedAttribute: `extended-attribute` = js.native
}
object ExtendedAttribute {
  
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    name: String,
    parent: IDLRootType | FieldType | IDLInterfaceMemberType,
    `type`: `extended-attribute`
  ): ExtendedAttribute = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttribute]
  }
  
  @scala.inline
  implicit class ExtendedAttributeOps[Self <: ExtendedAttribute] (val x: Self) extends AnyVal {
    
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
    def setArgumentsVarargs(value: Argument*): Self = this.set("arguments", js.Array(value :_*))
    
    @scala.inline
    def setArguments(value: js.Array[Argument]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: IDLRootType | FieldType | IDLInterfaceMemberType): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `extended-attribute`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRhs(value: ExtendedAttributeRightHandSide): Self = this.set("rhs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRhsNull: Self = this.set("rhs", null)
  }
}
