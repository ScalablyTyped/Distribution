package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Process extends StObject {
  
  var State: js.Any
  
  var process: js.Any
  
  var ruler: After
}
object Process {
  
  inline def apply(State: js.Any, process: js.Any, ruler: After): Process = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any], ruler = ruler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Process]
  }
  
  extension [Self <: Process](x: Self) {
    
    inline def setProcess(value: js.Any): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    inline def setRuler(value: After): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
    
    inline def setState(value: js.Any): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
