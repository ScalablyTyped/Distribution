package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exit extends StObject {
  
  var enter: Double
  
  var exit: Double
}
object Exit {
  
  inline def apply(enter: Double, exit: Double): Exit = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exit]
  }
  
  extension [Self <: Exit](x: Self) {
    
    inline def setEnter(value: Double): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setExit(value: Double): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
  }
}
