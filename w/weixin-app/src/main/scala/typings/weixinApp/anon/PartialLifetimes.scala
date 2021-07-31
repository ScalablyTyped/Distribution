package typings.weixinApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<weixin-app.wx.Lifetimes> */
trait PartialLifetimes extends StObject {
  
  var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var created: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var moved: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object PartialLifetimes {
  
  @scala.inline
  def apply(): PartialLifetimes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLifetimes]
  }
  
  @scala.inline
  implicit class PartialLifetimesMutableBuilder[Self <: PartialLifetimes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttached(value: () => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
    
    @scala.inline
    def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDetached(value: () => Unit): Self = StObject.set(x, "detached", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    @scala.inline
    def setMoved(value: () => Unit): Self = StObject.set(x, "moved", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
    
    @scala.inline
    def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
  }
}
