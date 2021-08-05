package typings.stylableCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@stylable/core.@stylable/core/cjs/timed-cache.TimedCacheOptions, 'createKey'> */
trait OmitTimedCacheOptionscrea extends StObject {
  
  var timeout: Double
  
  var useTimer: Boolean
}
object OmitTimedCacheOptionscrea {
  
  inline def apply(timeout: Double, useTimer: Boolean): OmitTimedCacheOptionscrea = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any], useTimer = useTimer.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitTimedCacheOptionscrea]
  }
  
  extension [Self <: OmitTimedCacheOptionscrea](x: Self) {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setUseTimer(value: Boolean): Self = StObject.set(x, "useTimer", value.asInstanceOf[js.Any])
  }
}
