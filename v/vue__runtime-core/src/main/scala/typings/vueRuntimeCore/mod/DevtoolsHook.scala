package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevtoolsHook extends StObject {
  
  var appRecords: js.Array[AppRecord]
  
  def emit(event: String, payload: Any*): Unit
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  def off(event: String, handler: js.Function): Unit
  
  def on(event: String, handler: js.Function): Unit
  
  def once(event: String, handler: js.Function): Unit
}
object DevtoolsHook {
  
  inline def apply(
    appRecords: js.Array[AppRecord],
    emit: (String, /* repeated */ Any) => Unit,
    off: (String, js.Function) => Unit,
    on: (String, js.Function) => Unit,
    once: (String, js.Function) => Unit
  ): DevtoolsHook = {
    val __obj = js.Dynamic.literal(appRecords = appRecords.asInstanceOf[js.Any], emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once))
    __obj.asInstanceOf[DevtoolsHook]
  }
  
  extension [Self <: DevtoolsHook](x: Self) {
    
    inline def setAppRecords(value: js.Array[AppRecord]): Self = StObject.set(x, "appRecords", value.asInstanceOf[js.Any])
    
    inline def setAppRecordsVarargs(value: AppRecord*): Self = StObject.set(x, "appRecords", js.Array(value*))
    
    inline def setEmit(value: (String, /* repeated */ Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setOff(value: (String, js.Function) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    inline def setOn(value: (String, js.Function) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setOnce(value: (String, js.Function) => Unit): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
  }
}
