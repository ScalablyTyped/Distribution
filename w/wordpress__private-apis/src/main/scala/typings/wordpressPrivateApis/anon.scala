package typings.wordpressPrivateApis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Lock extends StObject {
    
    def lock(`object`: Any, privateData: Any): Unit
    @JSName("lock")
    var lock_Original: js.Function2[/* object */ Any, /* privateData */ Any, Unit]
    
    def unlock(`object`: Any): Any
    @JSName("unlock")
    var unlock_Original: js.Function1[/* object */ Any, Any]
  }
  object Lock {
    
    inline def apply(lock: (/* object */ Any, /* privateData */ Any) => Unit, unlock: /* object */ Any => Any): Lock = {
      val __obj = js.Dynamic.literal(lock = js.Any.fromFunction2(lock), unlock = js.Any.fromFunction1(unlock))
      __obj.asInstanceOf[Lock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lock] (val x: Self) extends AnyVal {
      
      inline def setLock(value: (/* object */ Any, /* privateData */ Any) => Unit): Self = StObject.set(x, "lock", js.Any.fromFunction2(value))
      
      inline def setUnlock(value: /* object */ Any => Any): Self = StObject.set(x, "unlock", js.Any.fromFunction1(value))
    }
  }
}
