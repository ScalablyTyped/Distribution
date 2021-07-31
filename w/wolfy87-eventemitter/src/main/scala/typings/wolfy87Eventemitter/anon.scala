package typings.wolfy87Eventemitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Listener extends StObject {
    
    var listener: js.Function
  }
  object Listener {
    
    @scala.inline
    def apply(listener: js.Function): Listener = {
      val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any])
      __obj.asInstanceOf[Listener]
    }
    
    @scala.inline
    implicit class ListenerMutableBuilder[Self <: Listener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setListener(value: js.Function): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
    }
  }
}
