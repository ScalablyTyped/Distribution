package typings.vueRuntimeCore.mod

import typings.vueReactivity.mod.DebuggerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchOptionsBase
  extends StObject
     with DebuggerOptions {
  
  var flush: js.UndefOr["pre" | "post" | "sync"] = js.undefined
}
object WatchOptionsBase {
  
  inline def apply(): WatchOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchOptionsBase]
  }
  
  extension [Self <: WatchOptionsBase](x: Self) {
    
    inline def setFlush(value: "pre" | "post" | "sync"): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
    
    inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
  }
}
