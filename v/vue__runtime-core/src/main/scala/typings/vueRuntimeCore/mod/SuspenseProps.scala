package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspenseProps extends StObject {
  
  var onFallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPending: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onResolve: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var timeout: js.UndefOr[String | Double] = js.undefined
}
object SuspenseProps {
  
  inline def apply(): SuspenseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuspenseProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuspenseProps] (val x: Self) extends AnyVal {
    
    inline def setOnFallback(value: () => Unit): Self = StObject.set(x, "onFallback", js.Any.fromFunction0(value))
    
    inline def setOnFallbackUndefined: Self = StObject.set(x, "onFallback", js.undefined)
    
    inline def setOnPending(value: () => Unit): Self = StObject.set(x, "onPending", js.Any.fromFunction0(value))
    
    inline def setOnPendingUndefined: Self = StObject.set(x, "onPending", js.undefined)
    
    inline def setOnResolve(value: () => Unit): Self = StObject.set(x, "onResolve", js.Any.fromFunction0(value))
    
    inline def setOnResolveUndefined: Self = StObject.set(x, "onResolve", js.undefined)
    
    inline def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
