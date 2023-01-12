package typings.vueRuntimeCore.mod

import typings.vueRuntimeCore.vueRuntimeCoreStrings.`in-out`
import typings.vueRuntimeCore.vueRuntimeCoreStrings.`out-in`
import typings.vueRuntimeCore.vueRuntimeCoreStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseTransitionProps[HostElement] extends StObject {
  
  var appear: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[`in-out` | `out-in` | default] = js.undefined
  
  var onAfterAppear: js.UndefOr[Hook[js.Function1[/* el */ HostElement, Unit]]] = js.undefined
  
  var onAfterEnter: js.UndefOr[Hook[js.Function1[/* el */ HostElement, Unit]]] = js.undefined
  
  var onAfterLeave: js.UndefOr[Hook[js.Function1[/* el */ HostElement, Unit]]] = js.undefined
  
  var onAppear: js.UndefOr[Hook[js.Function2[/* el */ HostElement, /* done */ js.Function0[Unit], Unit]]] = js.undefined
  
  var onAppearCancelled: js.UndefOr[Hook[js.Function1[/* el */ HostElement, Unit]]] = js.undefined
  
  var onBeforeAppear: js.UndefOr[Hook[js.Function1[/* el */ HostElement, Unit]]] = js.undefined
  
  var onBeforeEnter: js.UndefOr[Hook[js.Function1[/* el */ HostElement, Unit]]] = js.undefined
  
  var onBeforeLeave: js.UndefOr[Hook[js.Function1[/* el */ HostElement, Unit]]] = js.undefined
  
  var onEnter: js.UndefOr[Hook[js.Function2[/* el */ HostElement, /* done */ js.Function0[Unit], Unit]]] = js.undefined
  
  var onEnterCancelled: js.UndefOr[Hook[js.Function1[/* el */ HostElement, Unit]]] = js.undefined
  
  var onLeave: js.UndefOr[Hook[js.Function2[/* el */ HostElement, /* done */ js.Function0[Unit], Unit]]] = js.undefined
  
  var onLeaveCancelled: js.UndefOr[Hook[js.Function1[/* el */ HostElement, Unit]]] = js.undefined
  
  var persisted: js.UndefOr[Boolean] = js.undefined
}
object BaseTransitionProps {
  
  inline def apply[HostElement](): BaseTransitionProps[HostElement] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseTransitionProps[HostElement]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseTransitionProps[?], HostElement] (val x: Self & BaseTransitionProps[HostElement]) extends AnyVal {
    
    inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
    
    inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
    
    inline def setMode(value: `in-out` | `out-in` | default): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnAfterAppear(value: Hook[js.Function1[/* el */ HostElement, Unit]]): Self = StObject.set(x, "onAfterAppear", value.asInstanceOf[js.Any])
    
    inline def setOnAfterAppearFunction1(value: /* el */ HostElement => Unit): Self = StObject.set(x, "onAfterAppear", js.Any.fromFunction1(value))
    
    inline def setOnAfterAppearUndefined: Self = StObject.set(x, "onAfterAppear", js.undefined)
    
    inline def setOnAfterAppearVarargs(value: (js.Function1[/* el */ HostElement, Unit])*): Self = StObject.set(x, "onAfterAppear", js.Array(value*))
    
    inline def setOnAfterEnter(value: Hook[js.Function1[/* el */ HostElement, Unit]]): Self = StObject.set(x, "onAfterEnter", value.asInstanceOf[js.Any])
    
    inline def setOnAfterEnterFunction1(value: /* el */ HostElement => Unit): Self = StObject.set(x, "onAfterEnter", js.Any.fromFunction1(value))
    
    inline def setOnAfterEnterUndefined: Self = StObject.set(x, "onAfterEnter", js.undefined)
    
    inline def setOnAfterEnterVarargs(value: (js.Function1[/* el */ HostElement, Unit])*): Self = StObject.set(x, "onAfterEnter", js.Array(value*))
    
    inline def setOnAfterLeave(value: Hook[js.Function1[/* el */ HostElement, Unit]]): Self = StObject.set(x, "onAfterLeave", value.asInstanceOf[js.Any])
    
    inline def setOnAfterLeaveFunction1(value: /* el */ HostElement => Unit): Self = StObject.set(x, "onAfterLeave", js.Any.fromFunction1(value))
    
    inline def setOnAfterLeaveUndefined: Self = StObject.set(x, "onAfterLeave", js.undefined)
    
    inline def setOnAfterLeaveVarargs(value: (js.Function1[/* el */ HostElement, Unit])*): Self = StObject.set(x, "onAfterLeave", js.Array(value*))
    
    inline def setOnAppear(value: Hook[js.Function2[/* el */ HostElement, /* done */ js.Function0[Unit], Unit]]): Self = StObject.set(x, "onAppear", value.asInstanceOf[js.Any])
    
    inline def setOnAppearCancelled(value: Hook[js.Function1[/* el */ HostElement, Unit]]): Self = StObject.set(x, "onAppearCancelled", value.asInstanceOf[js.Any])
    
    inline def setOnAppearCancelledFunction1(value: /* el */ HostElement => Unit): Self = StObject.set(x, "onAppearCancelled", js.Any.fromFunction1(value))
    
    inline def setOnAppearCancelledUndefined: Self = StObject.set(x, "onAppearCancelled", js.undefined)
    
    inline def setOnAppearCancelledVarargs(value: (js.Function1[/* el */ HostElement, Unit])*): Self = StObject.set(x, "onAppearCancelled", js.Array(value*))
    
    inline def setOnAppearFunction2(value: (/* el */ HostElement, /* done */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "onAppear", js.Any.fromFunction2(value))
    
    inline def setOnAppearUndefined: Self = StObject.set(x, "onAppear", js.undefined)
    
    inline def setOnAppearVarargs(value: (js.Function2[/* el */ HostElement, /* done */ js.Function0[Unit], Unit])*): Self = StObject.set(x, "onAppear", js.Array(value*))
    
    inline def setOnBeforeAppear(value: Hook[js.Function1[/* el */ HostElement, Unit]]): Self = StObject.set(x, "onBeforeAppear", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeAppearFunction1(value: /* el */ HostElement => Unit): Self = StObject.set(x, "onBeforeAppear", js.Any.fromFunction1(value))
    
    inline def setOnBeforeAppearUndefined: Self = StObject.set(x, "onBeforeAppear", js.undefined)
    
    inline def setOnBeforeAppearVarargs(value: (js.Function1[/* el */ HostElement, Unit])*): Self = StObject.set(x, "onBeforeAppear", js.Array(value*))
    
    inline def setOnBeforeEnter(value: Hook[js.Function1[/* el */ HostElement, Unit]]): Self = StObject.set(x, "onBeforeEnter", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeEnterFunction1(value: /* el */ HostElement => Unit): Self = StObject.set(x, "onBeforeEnter", js.Any.fromFunction1(value))
    
    inline def setOnBeforeEnterUndefined: Self = StObject.set(x, "onBeforeEnter", js.undefined)
    
    inline def setOnBeforeEnterVarargs(value: (js.Function1[/* el */ HostElement, Unit])*): Self = StObject.set(x, "onBeforeEnter", js.Array(value*))
    
    inline def setOnBeforeLeave(value: Hook[js.Function1[/* el */ HostElement, Unit]]): Self = StObject.set(x, "onBeforeLeave", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeLeaveFunction1(value: /* el */ HostElement => Unit): Self = StObject.set(x, "onBeforeLeave", js.Any.fromFunction1(value))
    
    inline def setOnBeforeLeaveUndefined: Self = StObject.set(x, "onBeforeLeave", js.undefined)
    
    inline def setOnBeforeLeaveVarargs(value: (js.Function1[/* el */ HostElement, Unit])*): Self = StObject.set(x, "onBeforeLeave", js.Array(value*))
    
    inline def setOnEnter(value: Hook[js.Function2[/* el */ HostElement, /* done */ js.Function0[Unit], Unit]]): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
    
    inline def setOnEnterCancelled(value: Hook[js.Function1[/* el */ HostElement, Unit]]): Self = StObject.set(x, "onEnterCancelled", value.asInstanceOf[js.Any])
    
    inline def setOnEnterCancelledFunction1(value: /* el */ HostElement => Unit): Self = StObject.set(x, "onEnterCancelled", js.Any.fromFunction1(value))
    
    inline def setOnEnterCancelledUndefined: Self = StObject.set(x, "onEnterCancelled", js.undefined)
    
    inline def setOnEnterCancelledVarargs(value: (js.Function1[/* el */ HostElement, Unit])*): Self = StObject.set(x, "onEnterCancelled", js.Array(value*))
    
    inline def setOnEnterFunction2(value: (/* el */ HostElement, /* done */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction2(value))
    
    inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    inline def setOnEnterVarargs(value: (js.Function2[/* el */ HostElement, /* done */ js.Function0[Unit], Unit])*): Self = StObject.set(x, "onEnter", js.Array(value*))
    
    inline def setOnLeave(value: Hook[js.Function2[/* el */ HostElement, /* done */ js.Function0[Unit], Unit]]): Self = StObject.set(x, "onLeave", value.asInstanceOf[js.Any])
    
    inline def setOnLeaveCancelled(value: Hook[js.Function1[/* el */ HostElement, Unit]]): Self = StObject.set(x, "onLeaveCancelled", value.asInstanceOf[js.Any])
    
    inline def setOnLeaveCancelledFunction1(value: /* el */ HostElement => Unit): Self = StObject.set(x, "onLeaveCancelled", js.Any.fromFunction1(value))
    
    inline def setOnLeaveCancelledUndefined: Self = StObject.set(x, "onLeaveCancelled", js.undefined)
    
    inline def setOnLeaveCancelledVarargs(value: (js.Function1[/* el */ HostElement, Unit])*): Self = StObject.set(x, "onLeaveCancelled", js.Array(value*))
    
    inline def setOnLeaveFunction2(value: (/* el */ HostElement, /* done */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "onLeave", js.Any.fromFunction2(value))
    
    inline def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
    
    inline def setOnLeaveVarargs(value: (js.Function2[/* el */ HostElement, /* done */ js.Function0[Unit], Unit])*): Self = StObject.set(x, "onLeave", js.Array(value*))
    
    inline def setPersisted(value: Boolean): Self = StObject.set(x, "persisted", value.asInstanceOf[js.Any])
    
    inline def setPersistedUndefined: Self = StObject.set(x, "persisted", js.undefined)
  }
}
