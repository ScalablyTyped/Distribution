package typings.xstate

import typings.xstate.actorMod.Actor
import typings.xstate.typesMod.AnyEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registryMod {
  
  @JSImport("xstate/lib/registry", "registry")
  @js.native
  val registry: Registry_ = js.native
  
  @js.native
  trait Registry_ extends StObject {
    
    def bookId(): String = js.native
    
    def free(id: String): Unit = js.native
    
    def get(id: String): js.UndefOr[Actor[_, AnyEventObject]] = js.native
    
    def register(id: String, actor: Actor[_, AnyEventObject]): String = js.native
  }
  object Registry_ {
    
    @scala.inline
    def apply(
      bookId: () => String,
      free: String => Unit,
      get: String => js.UndefOr[Actor[_, AnyEventObject]],
      register: (String, Actor[_, AnyEventObject]) => String
    ): Registry_ = {
      val __obj = js.Dynamic.literal(bookId = js.Any.fromFunction0(bookId), free = js.Any.fromFunction1(free), get = js.Any.fromFunction1(get), register = js.Any.fromFunction2(register))
      __obj.asInstanceOf[Registry_]
    }
    
    @scala.inline
    implicit class Registry_MutableBuilder[Self <: Registry_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBookId(value: () => String): Self = StObject.set(x, "bookId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFree(value: String => Unit): Self = StObject.set(x, "free", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: String => js.UndefOr[Actor[_, AnyEventObject]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegister(value: (String, Actor[_, AnyEventObject]) => String): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    }
  }
}
