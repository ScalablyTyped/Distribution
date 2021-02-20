package typings.wepy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMod {
  
  @JSImport("wepy/event", JSImport.Default)
  @js.native
  class default protected () extends event {
    def this(name: String, source: js.Any, `type`: js.Any) = this()
  }
  
  @js.native
  trait event extends StObject {
    
    @JSName("$destroy")
    def $destroy(): Unit = js.native
    
    @JSName("$transfor")
    def $transfor(wxevent: js.Array[_]): Unit = js.native
    
    var active: Boolean = js.native
  }
  object event {
    
    @scala.inline
    def apply($destroy: () => Unit, $transfor: js.Array[_] => Unit, active: Boolean): event = {
      val __obj = js.Dynamic.literal($destroy = js.Any.fromFunction0($destroy), $transfor = js.Any.fromFunction1($transfor), active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[event]
    }
    
    @scala.inline
    implicit class eventMutableBuilder[Self <: event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$destroy(value: () => Unit): Self = StObject.set(x, "$destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def set$transfor(value: js.Array[_] => Unit): Self = StObject.set(x, "$transfor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    }
  }
}
