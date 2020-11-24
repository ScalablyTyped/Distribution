package typings.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Process extends js.Object {
  
  var State: js.Any = js.native
  
  var process: js.Any = js.native
  
  var ruler: After = js.native
}
object Process {
  
  @scala.inline
  def apply(State: js.Any, process: js.Any, ruler: After): Process = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any], ruler = ruler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Process]
  }
  
  @scala.inline
  implicit class ProcessOps[Self <: Process] (val x: Self) extends AnyVal {
    
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
    def setState(value: js.Any): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcess(value: js.Any): Self = this.set("process", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuler(value: After): Self = this.set("ruler", value.asInstanceOf[js.Any])
  }
}
