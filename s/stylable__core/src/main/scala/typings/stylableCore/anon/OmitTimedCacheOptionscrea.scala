package typings.stylableCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@stylable/core.@stylable/core/cjs/timed-cache.TimedCacheOptions, 'createKey'> */
@js.native
trait OmitTimedCacheOptionscrea extends js.Object {
  
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
  implicit class OmitTimedCacheOptionscreaOps[Self <: OmitTimedCacheOptionscrea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTimer(value: Boolean): Self = this.set("useTimer", value.asInstanceOf[js.Any])
  }
}
