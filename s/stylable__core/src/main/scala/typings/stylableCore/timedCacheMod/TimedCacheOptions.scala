package typings.stylableCore.timedCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimedCacheOptions extends js.Object {
  
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
  implicit class TimedCacheOptionsOps[Self <: TimedCacheOptions] (val x: Self) extends AnyVal {
    
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
    def setCreateKey(value: js.Array[String] => String): Self = this.set("createKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTimer(value: Boolean): Self = this.set("useTimer", value.asInstanceOf[js.Any])
  }
}
