package typings.unload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait addReturn extends js.Object {
  
  def remove(): Unit = js.native
  
  def run(): js.Any = js.native
}
object addReturn {
  
  @scala.inline
  def apply(remove: () => Unit, run: () => js.Any): addReturn = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove), run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[addReturn]
  }
  
  @scala.inline
  implicit class addReturnOps[Self <: addReturn] (val x: Self) extends AnyVal {
    
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
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRun(value: () => js.Any): Self = this.set("run", js.Any.fromFunction0(value))
  }
}
