package typings.webcola.rectangleMod

import typings.webcola.vpscMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Leaf extends js.Object {
  
  var bounds: Rectangle = js.native
  
  var variable: Variable = js.native
}
object Leaf {
  
  @scala.inline
  def apply(bounds: Rectangle, variable: Variable): Leaf = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leaf]
  }
  
  @scala.inline
  implicit class LeafOps[Self <: Leaf] (val x: Self) extends AnyVal {
    
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
    def setBounds(value: Rectangle): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariable(value: Variable): Self = this.set("variable", value.asInstanceOf[js.Any])
  }
}
