package typings.vueRuntimeCore.mod

import typings.vueReactivity.mod.DebuggerOptions
import typings.vueRuntimeCore.vueRuntimeCoreStrings.post
import typings.vueRuntimeCore.vueRuntimeCoreStrings.pre
import typings.vueRuntimeCore.vueRuntimeCoreStrings.sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchOptionsBase
  extends StObject
     with DebuggerOptions {
  
  var flush: js.UndefOr[pre | post | sync] = js.undefined
}
object WatchOptionsBase {
  
  inline def apply(): WatchOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchOptionsBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatchOptionsBase] (val x: Self) extends AnyVal {
    
    inline def setFlush(value: pre | post | sync): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
    
    inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
  }
}
