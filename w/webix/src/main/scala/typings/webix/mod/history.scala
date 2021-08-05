package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait history extends StObject {
  
  def push(view: String, url: String, value: js.Any): Unit
  
  def track(view: String, url: String): Unit
}
object history {
  
  @JSImport("webix", "history")
  @js.native
  val ^ : typings.webix.webix.history = js.native
  
  extension [Self <: history](x: Self) {
    
    inline def setPush(value: (String, String, js.Any) => Unit): Self = StObject.set(x, "push", js.Any.fromFunction3(value))
    
    inline def setTrack(value: (String, String) => Unit): Self = StObject.set(x, "track", js.Any.fromFunction2(value))
  }
}
