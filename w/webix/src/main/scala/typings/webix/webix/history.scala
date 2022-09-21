package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait history extends StObject {
  
  def push(view: String, url: String, value: Any): Unit
  
  def track(view: String, url: String): Unit
}
object history {
  
  inline def apply(push: (String, String, Any) => Unit, track: (String, String) => Unit): history = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction3(push), track = js.Any.fromFunction2(track))
    __obj.asInstanceOf[history]
  }
  
  extension [Self <: history](x: Self) {
    
    inline def setPush(value: (String, String, Any) => Unit): Self = StObject.set(x, "push", js.Any.fromFunction3(value))
    
    inline def setTrack(value: (String, String) => Unit): Self = StObject.set(x, "track", js.Any.fromFunction2(value))
  }
}
