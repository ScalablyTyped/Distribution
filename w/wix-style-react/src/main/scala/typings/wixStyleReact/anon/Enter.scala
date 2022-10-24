package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enter extends StObject {
  
  var enter: Requireable[Double]
  
  var exit: Requireable[Double]
}
object Enter {
  
  inline def apply(enter: Requireable[Double], exit: Requireable[Double]): Enter = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enter]
  }
  
  extension [Self <: Enter](x: Self) {
    
    inline def setEnter(value: Requireable[Double]): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setExit(value: Requireable[Double]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
  }
}
