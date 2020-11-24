package typings.webidl2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractBase extends js.Object {
  
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute] = js.native
  
  /** The container of this type. */
  var parent: AbstractBase | Null = js.native
  
  /** String indicating the type of this node. */
  var `type`: String | Null = js.native
}
object AbstractBase {
  
  @scala.inline
  def apply(extAttrs: js.Array[ExtendedAttribute]): AbstractBase = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractBase]
  }
  
  @scala.inline
  implicit class AbstractBaseOps[Self <: AbstractBase] (val x: Self) extends AnyVal {
    
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
    def setExtAttrsVarargs(value: ExtendedAttribute*): Self = this.set("extAttrs", js.Array(value :_*))
    
    @scala.inline
    def setExtAttrs(value: js.Array[ExtendedAttribute]): Self = this.set("extAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: AbstractBase): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
}
