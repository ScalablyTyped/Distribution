package typings.stylableCore

import typings.stylableCore.anon.Cache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timedCacheMod {
  
  @JSImport("@stylable/core/cjs/timed-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def timedCache[T /* <: js.Function1[/* repeated */ String, String] */](fn: T, hasTimeoutUseTimerCreateKey: TimedCacheOptions): Cache[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timedCache")(fn.asInstanceOf[js.Any], hasTimeoutUseTimerCreateKey.asInstanceOf[js.Any])).asInstanceOf[Cache[T]]
  
  trait TimedCacheOptions extends StObject {
    
    def createKey(args: js.Array[String]): String
    
    var timeout: Double
    
    var useTimer: Boolean
  }
  object TimedCacheOptions {
    
    inline def apply(createKey: js.Array[String] => String, timeout: Double, useTimer: Boolean): TimedCacheOptions = {
      val __obj = js.Dynamic.literal(createKey = js.Any.fromFunction1(createKey), timeout = timeout.asInstanceOf[js.Any], useTimer = useTimer.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimedCacheOptions]
    }
    
    extension [Self <: TimedCacheOptions](x: Self) {
      
      inline def setCreateKey(value: js.Array[String] => String): Self = StObject.set(x, "createKey", js.Any.fromFunction1(value))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setUseTimer(value: Boolean): Self = StObject.set(x, "useTimer", value.asInstanceOf[js.Any])
    }
  }
}
