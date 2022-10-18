package typings.swr

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsSubscribeKeyMod {
  
  @JSImport("swr/dist/utils/subscribe-key", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def subscribeCallback(key: String, callbacks: Record[String, js.Array[Callback]], callback: Callback): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribeCallback")(key.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @js.native
  trait Callback extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
}
