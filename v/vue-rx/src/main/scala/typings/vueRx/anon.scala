package typings.vueRx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Msg extends StObject {
    
    var msg: js.Any
    
    var name: String
  }
  object Msg {
    
    inline def apply(msg: js.Any, name: String): Msg = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Msg]
    }
    
    extension [Self <: Msg](x: Self) {
      
      inline def setMsg(value: js.Any): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
