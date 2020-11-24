package typings.tsutils.convertAstMod

import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConvertedAst extends js.Object {
  
  var flat: js.Array[Node] = js.native
  
  var wrapped: WrappedAst = js.native
}
object ConvertedAst {
  
  @scala.inline
  def apply(flat: js.Array[Node], wrapped: WrappedAst): ConvertedAst = {
    val __obj = js.Dynamic.literal(flat = flat.asInstanceOf[js.Any], wrapped = wrapped.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertedAst]
  }
  
  @scala.inline
  implicit class ConvertedAstOps[Self <: ConvertedAst] (val x: Self) extends AnyVal {
    
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
    def setFlatVarargs(value: Node*): Self = this.set("flat", js.Array(value :_*))
    
    @scala.inline
    def setFlat(value: js.Array[Node]): Self = this.set("flat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapped(value: WrappedAst): Self = this.set("wrapped", value.asInstanceOf[js.Any])
  }
}
