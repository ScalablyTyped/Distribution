package typings.stylableCore

import typings.stylableCore.anon.Cache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timedCacheMod {
  
  @JSImport("@stylable/core/cjs/timed-cache", "timedCache")
  @js.native
  def timedCache[T /* <: js.Function1[/* repeated */ String, String] */](fn: T, hasTimeoutUseTimerCreateKey: TimedCacheOptions): Cache[T] = js.native
  
  @js.native
  trait TimedCacheOptions extends StObject {
    
    def createKey(args: js.Array[String]): String = js.native
    
    var timeout: Double = js.native
    
    var useTimer: Boolean = js.native
  }
  object TimedCacheOptions {
    
    @scala.inline
    def apply(createKey: js.Array[String] => String, timeout: Double, useTimer: Boolean): TimedCacheOptions = {
      val __obj = js.Dynamic.literal(createKey = js.Any.fromFunction1(createKey), timeout = timeout.asInstanceOf[js.Any], useTimer = useTimer.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimedCacheOptions]
    }
    
    @scala.inline
    implicit class TimedCacheOptionsMutableBuilder[Self <: TimedCacheOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateKey(value: js.Array[String] => String): Self = StObject.set(x, "createKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTimer(value: Boolean): Self = StObject.set(x, "useTimer", value.asInstanceOf[js.Any])
    }
  }
}
