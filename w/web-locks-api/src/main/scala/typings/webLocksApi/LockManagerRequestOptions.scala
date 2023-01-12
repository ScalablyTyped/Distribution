package typings.webLocksApi

import typings.std.AbortSignal
import typings.webLocksApi.webLocksApiStrings.exclusive
import typings.webLocksApi.webLocksApiStrings.shared
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LockManagerRequestOptions extends StObject {
  
  var ifAvailable: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[exclusive | shared] = js.undefined
  
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  var steal: js.UndefOr[Boolean] = js.undefined
}
object LockManagerRequestOptions {
  
  inline def apply(): LockManagerRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LockManagerRequestOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LockManagerRequestOptions] (val x: Self) extends AnyVal {
    
    inline def setIfAvailable(value: Boolean): Self = StObject.set(x, "ifAvailable", value.asInstanceOf[js.Any])
    
    inline def setIfAvailableUndefined: Self = StObject.set(x, "ifAvailable", js.undefined)
    
    inline def setMode(value: exclusive | shared): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSteal(value: Boolean): Self = StObject.set(x, "steal", value.asInstanceOf[js.Any])
    
    inline def setStealUndefined: Self = StObject.set(x, "steal", js.undefined)
  }
}
