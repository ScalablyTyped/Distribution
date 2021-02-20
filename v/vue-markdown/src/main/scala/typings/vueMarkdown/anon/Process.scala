package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Process extends StObject {
  
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
  implicit class ProcessMutableBuilder[Self <: Process] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcess(value: js.Any): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuler(value: After): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: js.Any): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
