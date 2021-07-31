package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enter extends StObject {
  
  var enter: Double
  
  var exit: Double
}
object Enter {
  
  @scala.inline
  def apply(enter: Double, exit: Double): Enter = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enter]
  }
  
  @scala.inline
  implicit class EnterMutableBuilder[Self <: Enter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnter(value: Double): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExit(value: Double): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
  }
}
