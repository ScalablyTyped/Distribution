package typings.traverson.mod.Traverson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Traversal extends js.Object {
  
  def continue(): Builder = js.native
}
object Traversal {
  
  @scala.inline
  def apply(continue: () => Builder): Traversal = {
    val __obj = js.Dynamic.literal(continue = js.Any.fromFunction0(continue))
    __obj.asInstanceOf[Traversal]
  }
  
  @scala.inline
  implicit class TraversalOps[Self <: Traversal] (val x: Self) extends AnyVal {
    
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
    def setContinue(value: () => Builder): Self = this.set("continue", js.Any.fromFunction0(value))
  }
}
