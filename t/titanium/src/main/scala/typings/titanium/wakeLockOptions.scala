package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameter for wakeLock
  */
@js.native
trait wakeLockOptions extends StObject {
  
  /**
    * Wake lock level and flag. See [PowerManager.newWakeLock in the Android API Reference](https://developer.android.com/reference/android/os/PowerManager.html#newWakeLock(int,%20java.lang.String))
    */
  var flags: js.UndefOr[Double] = js.native
  
  /**
    * Minimum time the device will be switched on (plus device switch-off time)
    */
  var time: js.UndefOr[Double] = js.native
}
object wakeLockOptions {
  
  @scala.inline
  def apply(): wakeLockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[wakeLockOptions]
  }
  
  @scala.inline
  implicit class wakeLockOptionsMutableBuilder[Self <: wakeLockOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
