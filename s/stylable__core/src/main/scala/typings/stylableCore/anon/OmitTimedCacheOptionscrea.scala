package typings.stylableCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@stylable/core.@stylable/core/cjs/timed-cache.TimedCacheOptions, 'createKey'> */
@js.native
trait OmitTimedCacheOptionscrea extends StObject {
  
  var timeout: Double = js.native
  
  var useTimer: Boolean = js.native
}
object OmitTimedCacheOptionscrea {
  
  @scala.inline
  def apply(timeout: Double, useTimer: Boolean): OmitTimedCacheOptionscrea = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any], useTimer = useTimer.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitTimedCacheOptionscrea]
  }
  
  @scala.inline
  implicit class OmitTimedCacheOptionscreaMutableBuilder[Self <: OmitTimedCacheOptionscrea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTimer(value: Boolean): Self = StObject.set(x, "useTimer", value.asInstanceOf[js.Any])
  }
}
