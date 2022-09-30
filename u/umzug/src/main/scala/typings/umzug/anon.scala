package typings.umzug

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Down extends StObject {
    
    var down: js.UndefOr[js.Function0[PromiseLike[Any]]] = js.undefined
    
    def up(): PromiseLike[Any]
  }
  object Down {
    
    inline def apply(up: () => PromiseLike[Any]): Down = {
      val __obj = js.Dynamic.literal(up = js.Any.fromFunction0(up))
      __obj.asInstanceOf[Down]
    }
    
    extension [Self <: Down](x: Self) {
      
      inline def setDown(value: () => PromiseLike[Any]): Self = StObject.set(x, "down", js.Any.fromFunction0(value))
      
      inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      inline def setUp(value: () => PromiseLike[Any]): Self = StObject.set(x, "up", js.Any.fromFunction0(value))
    }
  }
}
