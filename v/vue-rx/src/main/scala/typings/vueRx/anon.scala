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
    
    @scala.inline
    def apply(msg: js.Any, name: String): Msg = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Msg]
    }
    
    @scala.inline
    implicit class MsgMutableBuilder[Self <: Msg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMsg(value: js.Any): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
