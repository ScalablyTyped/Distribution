package typings.webidl2.mod

import typings.webidl2.webidl2Strings.includes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludesType
  extends AbstractBase
     with IDLRootType {
  
  /** The interface mixin that is being included by the target. */
  var includes: String = js.native
  
  @JSName("parent")
  var parent_IncludesType: Null = js.native
  
  /** The interface that includes an interface mixin. */
  var target: String = js.native
  
  @JSName("type")
  var type_IncludesType: includes = js.native
}
object IncludesType {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    includes: String,
    parent: Null,
    target: String,
    `type`: includes
  ): IncludesType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludesType]
  }
  
  @scala.inline
  implicit class IncludesTypeOps[Self <: IncludesType] (val x: Self) extends AnyVal {
    
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
    def setIncludes(value: String): Self = this.set("includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Null): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: includes): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
