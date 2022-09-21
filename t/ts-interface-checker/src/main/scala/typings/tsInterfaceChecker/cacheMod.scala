package typings.tsInterfaceChecker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @JSImport("ts-interface-checker/dist/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ts-interface-checker/dist/cache", "CallCache")
  @js.native
  open class CallCache[K /* <: js.Array[Any] */, V] () extends StObject {
    
    /* private */ var _cache: Any = js.native
    
    def delete(key: K): Unit = js.native
    
    def get(key: K): js.UndefOr[V] = js.native
    
    def set(key: K, value: V): Unit = js.native
  }
  
  inline def arrayEqual[T /* <: js.Array[Any] */](a: T, b: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
