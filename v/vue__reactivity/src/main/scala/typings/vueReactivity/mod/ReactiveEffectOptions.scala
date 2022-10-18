package typings.vueReactivity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactiveEffectOptions
  extends StObject
     with DebuggerOptions {
  
  var allowRecurse: js.UndefOr[Boolean] = js.undefined
  
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  
  var onStop: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var scheduler: js.UndefOr[EffectScheduler] = js.undefined
  
  var scope: js.UndefOr[EffectScope_] = js.undefined
}
object ReactiveEffectOptions {
  
  inline def apply(): ReactiveEffectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactiveEffectOptions]
  }
  
  extension [Self <: ReactiveEffectOptions](x: Self) {
    
    inline def setAllowRecurse(value: Boolean): Self = StObject.set(x, "allowRecurse", value.asInstanceOf[js.Any])
    
    inline def setAllowRecurseUndefined: Self = StObject.set(x, "allowRecurse", js.undefined)
    
    inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    inline def setOnStop(value: () => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction0(value))
    
    inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
    
    inline def setScheduler(value: EffectScheduler): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
    
    inline def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
    
    inline def setScope(value: EffectScope_): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
