package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchOptions[Immediate]
  extends StObject
     with WatchOptionsBase {
  
  var deep: js.UndefOr[Boolean] = js.undefined
  
  var immediate: js.UndefOr[Immediate] = js.undefined
}
object WatchOptions {
  
  inline def apply[Immediate](): WatchOptions[Immediate] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchOptions[Immediate]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatchOptions[?], Immediate] (val x: Self & WatchOptions[Immediate]) extends AnyVal {
    
    inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
    
    inline def setImmediate(value: Immediate): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
  }
}
