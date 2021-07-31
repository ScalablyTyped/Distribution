package typings.umzug

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Down extends StObject {
    
    var down: js.UndefOr[js.Function0[js.Thenable[js.Any]]] = js.undefined
    
    def up(): js.Thenable[js.Any]
  }
  object Down {
    
    @scala.inline
    def apply(up: () => js.Thenable[js.Any]): Down = {
      val __obj = js.Dynamic.literal(up = js.Any.fromFunction0(up))
      __obj.asInstanceOf[Down]
    }
    
    @scala.inline
    implicit class DownMutableBuilder[Self <: Down] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDown(value: () => js.Thenable[js.Any]): Self = StObject.set(x, "down", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      @scala.inline
      def setUp(value: () => js.Thenable[js.Any]): Self = StObject.set(x, "up", js.Any.fromFunction0(value))
    }
  }
}
