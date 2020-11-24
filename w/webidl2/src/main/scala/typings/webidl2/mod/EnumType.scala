package typings.webidl2.mod

import typings.webidl2.anon.Parent
import typings.webidl2.webidl2Strings.enum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumType
  extends AbstractBase
     with IDLRootType {
  
  /** The enum's name. */
  var name: String = js.native
  
  /** The container of this type. */
  @JSName("parent")
  var parent_EnumType: Null = js.native
  
  @JSName("type")
  var type_EnumType: enum = js.native
  
  /** An array of values (strings). */
  var values: js.Array[Parent] = js.native
}
object EnumType {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    name: String,
    parent: Null,
    `type`: enum,
    values: js.Array[Parent]
  ): EnumType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumType]
  }
  
  @scala.inline
  implicit class EnumTypeOps[Self <: EnumType] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Null): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: enum): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Parent*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[Parent]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
