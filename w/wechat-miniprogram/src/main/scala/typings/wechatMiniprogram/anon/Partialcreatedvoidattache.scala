package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{created (): void, attached (): void, ready (): void, moved (): void, detached (): void, error (err : std.Error): void}> */
trait Partialcreatedvoidattache extends StObject {
  
  var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var created: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
  
  var moved: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object Partialcreatedvoidattache {
  
  inline def apply(): Partialcreatedvoidattache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialcreatedvoidattache]
  }
  
  extension [Self <: Partialcreatedvoidattache](x: Self) {
    
    inline def setAttached(value: () => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction0(value))
    
    inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
    
    inline def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDetached(value: () => Unit): Self = StObject.set(x, "detached", js.Any.fromFunction0(value))
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    inline def setError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setMoved(value: () => Unit): Self = StObject.set(x, "moved", js.Any.fromFunction0(value))
    
    inline def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
    
    inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
  }
}
