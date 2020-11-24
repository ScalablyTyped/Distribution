package typings.tensorflowTfjsConverter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attrs extends js.Object {
  
  var attrs: Items = js.native
  
  var category: Ref = js.native
  
  var customExecutor: Ref = js.native
  
  var inputs: Items = js.native
  
  var tfOpName: Type = js.native
}
object Attrs {
  
  @scala.inline
  def apply(attrs: Items, category: Ref, customExecutor: Ref, inputs: Items, tfOpName: Type): Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], customExecutor = customExecutor.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], tfOpName = tfOpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs]
  }
  
  @scala.inline
  implicit class AttrsOps[Self <: Attrs] (val x: Self) extends AnyVal {
    
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
    def setAttrs(value: Items): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: Ref): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomExecutor(value: Ref): Self = this.set("customExecutor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: Items): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfOpName(value: Type): Self = this.set("tfOpName", value.asInstanceOf[js.Any])
  }
}
