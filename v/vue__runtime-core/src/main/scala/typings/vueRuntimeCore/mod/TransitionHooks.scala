package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vueRuntimeCore.vueRuntimeCoreStrings.`in-out`
import typings.vueRuntimeCore.vueRuntimeCoreStrings.`out-in`
import typings.vueRuntimeCore.vueRuntimeCoreStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionHooks[HostElement] extends StObject {
  
  var afterLeave: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  def beforeEnter(el: HostElement): Unit
  
  def clone(vnode: VNode[RendererNode, RendererElement, StringDictionary[Any]]): TransitionHooks[HostElement]
  
  var delayLeave: js.UndefOr[
    js.Function3[
      /* el */ HostElement, 
      /* earlyRemove */ js.Function0[Unit], 
      /* delayedLeave */ js.Function0[Unit], 
      Unit
    ]
  ] = js.undefined
  
  var delayedLeave: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  def enter(el: HostElement): Unit
  
  def leave(el: HostElement, remove: js.Function0[Unit]): Unit
  
  var mode: js.UndefOr[`in-out` | `out-in` | default] = js.undefined
  
  var persisted: Boolean
}
object TransitionHooks {
  
  inline def apply[HostElement](
    beforeEnter: HostElement => Unit,
    clone_ : VNode[RendererNode, RendererElement, StringDictionary[Any]] => TransitionHooks[HostElement],
    enter: HostElement => Unit,
    leave: (HostElement, js.Function0[Unit]) => Unit,
    persisted: Boolean
  ): TransitionHooks[HostElement] = {
    val __obj = js.Dynamic.literal(beforeEnter = js.Any.fromFunction1(beforeEnter), enter = js.Any.fromFunction1(enter), leave = js.Any.fromFunction2(leave), persisted = persisted.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.asInstanceOf[TransitionHooks[HostElement]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitionHooks[?], HostElement] (val x: Self & TransitionHooks[HostElement]) extends AnyVal {
    
    inline def setAfterLeave(value: () => Unit): Self = StObject.set(x, "afterLeave", js.Any.fromFunction0(value))
    
    inline def setAfterLeaveUndefined: Self = StObject.set(x, "afterLeave", js.undefined)
    
    inline def setBeforeEnter(value: HostElement => Unit): Self = StObject.set(x, "beforeEnter", js.Any.fromFunction1(value))
    
    inline def setClone_(value: VNode[RendererNode, RendererElement, StringDictionary[Any]] => TransitionHooks[HostElement]): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
    
    inline def setDelayLeave(
      value: (/* el */ HostElement, /* earlyRemove */ js.Function0[Unit], /* delayedLeave */ js.Function0[Unit]) => Unit
    ): Self = StObject.set(x, "delayLeave", js.Any.fromFunction3(value))
    
    inline def setDelayLeaveUndefined: Self = StObject.set(x, "delayLeave", js.undefined)
    
    inline def setDelayedLeave(value: () => Unit): Self = StObject.set(x, "delayedLeave", js.Any.fromFunction0(value))
    
    inline def setDelayedLeaveUndefined: Self = StObject.set(x, "delayedLeave", js.undefined)
    
    inline def setEnter(value: HostElement => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
    
    inline def setLeave(value: (HostElement, js.Function0[Unit]) => Unit): Self = StObject.set(x, "leave", js.Any.fromFunction2(value))
    
    inline def setMode(value: `in-out` | `out-in` | default): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPersisted(value: Boolean): Self = StObject.set(x, "persisted", value.asInstanceOf[js.Any])
  }
}
