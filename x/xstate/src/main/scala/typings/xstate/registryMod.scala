package typings.xstate

import typings.xstate.actorMod.Actor
import typings.xstate.typesMod.AnyEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registryMod {
  
  @JSImport("xstate/lib/registry", "registry")
  @js.native
  val registry: Registry_ = js.native
  
  trait Registry_ extends StObject {
    
    def bookId(): String
    
    def free(id: String): Unit
    
    def get(id: String): js.UndefOr[Actor[Any, AnyEventObject]]
    
    def register(id: String, actor: Actor[Any, AnyEventObject]): String
  }
  object Registry_ {
    
    inline def apply(
      bookId: () => String,
      free: String => Unit,
      get: String => js.UndefOr[Actor[Any, AnyEventObject]],
      register: (String, Actor[Any, AnyEventObject]) => String
    ): Registry_ = {
      val __obj = js.Dynamic.literal(bookId = js.Any.fromFunction0(bookId), free = js.Any.fromFunction1(free), get = js.Any.fromFunction1(get), register = js.Any.fromFunction2(register))
      __obj.asInstanceOf[Registry_]
    }
    
    extension [Self <: Registry_](x: Self) {
      
      inline def setBookId(value: () => String): Self = StObject.set(x, "bookId", js.Any.fromFunction0(value))
      
      inline def setFree(value: String => Unit): Self = StObject.set(x, "free", js.Any.fromFunction1(value))
      
      inline def setGet(value: String => js.UndefOr[Actor[Any, AnyEventObject]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setRegister(value: (String, Actor[Any, AnyEventObject]) => String): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    }
  }
}
