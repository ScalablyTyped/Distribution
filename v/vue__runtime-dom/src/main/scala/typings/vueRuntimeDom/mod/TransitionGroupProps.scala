package typings.vueRuntimeDom.mod

import typings.std.Element
import typings.vueRuntimeCore.mod.Hook
import typings.vueRuntimeDom.anon.Enter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@vue/runtime-dom.@vue/runtime-dom.TransitionProps, 'mode'> & {  tag :string | undefined,   moveClass :string | undefined} */
trait TransitionGroupProps extends StObject {
  
  var appear: js.UndefOr[Boolean] = js.undefined
  
  var appearActiveClass: js.UndefOr[String] = js.undefined
  
  var appearFromClass: js.UndefOr[String] = js.undefined
  
  var appearToClass: js.UndefOr[String] = js.undefined
  
  var css: js.UndefOr[Boolean] = js.undefined
  
  var duration: js.UndefOr[Double | Enter] = js.undefined
  
  var enterActiveClass: js.UndefOr[String] = js.undefined
  
  var enterFromClass: js.UndefOr[String] = js.undefined
  
  var enterToClass: js.UndefOr[String] = js.undefined
  
  var leaveActiveClass: js.UndefOr[String] = js.undefined
  
  var leaveFromClass: js.UndefOr[String] = js.undefined
  
  var leaveToClass: js.UndefOr[String] = js.undefined
  
  var moveClass: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onAfterAppear: js.UndefOr[Hook[js.Function1[/* el */ Element, Unit]]] = js.undefined
  
  var onAfterEnter: js.UndefOr[Hook[js.Function1[/* el */ Element, Unit]]] = js.undefined
  
  var onAfterLeave: js.UndefOr[Hook[js.Function1[/* el */ Element, Unit]]] = js.undefined
  
  var onAppear: js.UndefOr[Hook[js.Function2[/* el */ Element, /* done */ js.Function0[Unit], Unit]]] = js.undefined
  
  var onAppearCancelled: js.UndefOr[Hook[js.Function1[/* el */ Element, Unit]]] = js.undefined
  
  var onBeforeAppear: js.UndefOr[Hook[js.Function1[/* el */ Element, Unit]]] = js.undefined
  
  var onBeforeEnter: js.UndefOr[Hook[js.Function1[/* el */ Element, Unit]]] = js.undefined
  
  var onBeforeLeave: js.UndefOr[Hook[js.Function1[/* el */ Element, Unit]]] = js.undefined
  
  var onEnter: js.UndefOr[Hook[js.Function2[/* el */ Element, /* done */ js.Function0[Unit], Unit]]] = js.undefined
  
  var onEnterCancelled: js.UndefOr[Hook[js.Function1[/* el */ Element, Unit]]] = js.undefined
  
  var onLeave: js.UndefOr[Hook[js.Function2[/* el */ Element, /* done */ js.Function0[Unit], Unit]]] = js.undefined
  
  var onLeaveCancelled: js.UndefOr[Hook[js.Function1[/* el */ Element, Unit]]] = js.undefined
  
  var persisted: js.UndefOr[Boolean] = js.undefined
  
  var tag: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[AnimationTypes] = js.undefined
}
object TransitionGroupProps {
  
  inline def apply(): TransitionGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionGroupProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitionGroupProps] (val x: Self) extends AnyVal {
    
    inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
    
    inline def setAppearActiveClass(value: String): Self = StObject.set(x, "appearActiveClass", value.asInstanceOf[js.Any])
    
    inline def setAppearActiveClassUndefined: Self = StObject.set(x, "appearActiveClass", js.undefined)
    
    inline def setAppearFromClass(value: String): Self = StObject.set(x, "appearFromClass", value.asInstanceOf[js.Any])
    
    inline def setAppearFromClassUndefined: Self = StObject.set(x, "appearFromClass", js.undefined)
    
    inline def setAppearToClass(value: String): Self = StObject.set(x, "appearToClass", value.asInstanceOf[js.Any])
    
    inline def setAppearToClassUndefined: Self = StObject.set(x, "appearToClass", js.undefined)
    
    inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
    
    inline def setCss(value: Boolean): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setDuration(value: Double | Enter): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEnterActiveClass(value: String): Self = StObject.set(x, "enterActiveClass", value.asInstanceOf[js.Any])
    
    inline def setEnterActiveClassUndefined: Self = StObject.set(x, "enterActiveClass", js.undefined)
    
    inline def setEnterFromClass(value: String): Self = StObject.set(x, "enterFromClass", value.asInstanceOf[js.Any])
    
    inline def setEnterFromClassUndefined: Self = StObject.set(x, "enterFromClass", js.undefined)
    
    inline def setEnterToClass(value: String): Self = StObject.set(x, "enterToClass", value.asInstanceOf[js.Any])
    
    inline def setEnterToClassUndefined: Self = StObject.set(x, "enterToClass", js.undefined)
    
    inline def setLeaveActiveClass(value: String): Self = StObject.set(x, "leaveActiveClass", value.asInstanceOf[js.Any])
    
    inline def setLeaveActiveClassUndefined: Self = StObject.set(x, "leaveActiveClass", js.undefined)
    
    inline def setLeaveFromClass(value: String): Self = StObject.set(x, "leaveFromClass", value.asInstanceOf[js.Any])
    
    inline def setLeaveFromClassUndefined: Self = StObject.set(x, "leaveFromClass", js.undefined)
    
    inline def setLeaveToClass(value: String): Self = StObject.set(x, "leaveToClass", value.asInstanceOf[js.Any])
    
    inline def setLeaveToClassUndefined: Self = StObject.set(x, "leaveToClass", js.undefined)
    
    inline def setMoveClass(value: String): Self = StObject.set(x, "moveClass", value.asInstanceOf[js.Any])
    
    inline def setMoveClassUndefined: Self = StObject.set(x, "moveClass", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnAfterAppear(value: Hook[js.Function1[/* el */ Element, Unit]]): Self = StObject.set(x, "onAfterAppear", value.asInstanceOf[js.Any])
    
    inline def setOnAfterAppearFunction1(value: /* el */ Element => Unit): Self = StObject.set(x, "onAfterAppear", js.Any.fromFunction1(value))
    
    inline def setOnAfterAppearUndefined: Self = StObject.set(x, "onAfterAppear", js.undefined)
    
    inline def setOnAfterAppearVarargs(value: (js.Function1[/* el */ Element, Unit])*): Self = StObject.set(x, "onAfterAppear", js.Array(value*))
    
    inline def setOnAfterEnter(value: Hook[js.Function1[/* el */ Element, Unit]]): Self = StObject.set(x, "onAfterEnter", value.asInstanceOf[js.Any])
    
    inline def setOnAfterEnterFunction1(value: /* el */ Element => Unit): Self = StObject.set(x, "onAfterEnter", js.Any.fromFunction1(value))
    
    inline def setOnAfterEnterUndefined: Self = StObject.set(x, "onAfterEnter", js.undefined)
    
    inline def setOnAfterEnterVarargs(value: (js.Function1[/* el */ Element, Unit])*): Self = StObject.set(x, "onAfterEnter", js.Array(value*))
    
    inline def setOnAfterLeave(value: Hook[js.Function1[/* el */ Element, Unit]]): Self = StObject.set(x, "onAfterLeave", value.asInstanceOf[js.Any])
    
    inline def setOnAfterLeaveFunction1(value: /* el */ Element => Unit): Self = StObject.set(x, "onAfterLeave", js.Any.fromFunction1(value))
    
    inline def setOnAfterLeaveUndefined: Self = StObject.set(x, "onAfterLeave", js.undefined)
    
    inline def setOnAfterLeaveVarargs(value: (js.Function1[/* el */ Element, Unit])*): Self = StObject.set(x, "onAfterLeave", js.Array(value*))
    
    inline def setOnAppear(value: Hook[js.Function2[/* el */ Element, /* done */ js.Function0[Unit], Unit]]): Self = StObject.set(x, "onAppear", value.asInstanceOf[js.Any])
    
    inline def setOnAppearCancelled(value: Hook[js.Function1[/* el */ Element, Unit]]): Self = StObject.set(x, "onAppearCancelled", value.asInstanceOf[js.Any])
    
    inline def setOnAppearCancelledFunction1(value: /* el */ Element => Unit): Self = StObject.set(x, "onAppearCancelled", js.Any.fromFunction1(value))
    
    inline def setOnAppearCancelledUndefined: Self = StObject.set(x, "onAppearCancelled", js.undefined)
    
    inline def setOnAppearCancelledVarargs(value: (js.Function1[/* el */ Element, Unit])*): Self = StObject.set(x, "onAppearCancelled", js.Array(value*))
    
    inline def setOnAppearFunction2(value: (/* el */ Element, /* done */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "onAppear", js.Any.fromFunction2(value))
    
    inline def setOnAppearUndefined: Self = StObject.set(x, "onAppear", js.undefined)
    
    inline def setOnAppearVarargs(value: (js.Function2[/* el */ Element, /* done */ js.Function0[Unit], Unit])*): Self = StObject.set(x, "onAppear", js.Array(value*))
    
    inline def setOnBeforeAppear(value: Hook[js.Function1[/* el */ Element, Unit]]): Self = StObject.set(x, "onBeforeAppear", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeAppearFunction1(value: /* el */ Element => Unit): Self = StObject.set(x, "onBeforeAppear", js.Any.fromFunction1(value))
    
    inline def setOnBeforeAppearUndefined: Self = StObject.set(x, "onBeforeAppear", js.undefined)
    
    inline def setOnBeforeAppearVarargs(value: (js.Function1[/* el */ Element, Unit])*): Self = StObject.set(x, "onBeforeAppear", js.Array(value*))
    
    inline def setOnBeforeEnter(value: Hook[js.Function1[/* el */ Element, Unit]]): Self = StObject.set(x, "onBeforeEnter", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeEnterFunction1(value: /* el */ Element => Unit): Self = StObject.set(x, "onBeforeEnter", js.Any.fromFunction1(value))
    
    inline def setOnBeforeEnterUndefined: Self = StObject.set(x, "onBeforeEnter", js.undefined)
    
    inline def setOnBeforeEnterVarargs(value: (js.Function1[/* el */ Element, Unit])*): Self = StObject.set(x, "onBeforeEnter", js.Array(value*))
    
    inline def setOnBeforeLeave(value: Hook[js.Function1[/* el */ Element, Unit]]): Self = StObject.set(x, "onBeforeLeave", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeLeaveFunction1(value: /* el */ Element => Unit): Self = StObject.set(x, "onBeforeLeave", js.Any.fromFunction1(value))
    
    inline def setOnBeforeLeaveUndefined: Self = StObject.set(x, "onBeforeLeave", js.undefined)
    
    inline def setOnBeforeLeaveVarargs(value: (js.Function1[/* el */ Element, Unit])*): Self = StObject.set(x, "onBeforeLeave", js.Array(value*))
    
    inline def setOnEnter(value: Hook[js.Function2[/* el */ Element, /* done */ js.Function0[Unit], Unit]]): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
    
    inline def setOnEnterCancelled(value: Hook[js.Function1[/* el */ Element, Unit]]): Self = StObject.set(x, "onEnterCancelled", value.asInstanceOf[js.Any])
    
    inline def setOnEnterCancelledFunction1(value: /* el */ Element => Unit): Self = StObject.set(x, "onEnterCancelled", js.Any.fromFunction1(value))
    
    inline def setOnEnterCancelledUndefined: Self = StObject.set(x, "onEnterCancelled", js.undefined)
    
    inline def setOnEnterCancelledVarargs(value: (js.Function1[/* el */ Element, Unit])*): Self = StObject.set(x, "onEnterCancelled", js.Array(value*))
    
    inline def setOnEnterFunction2(value: (/* el */ Element, /* done */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction2(value))
    
    inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    inline def setOnEnterVarargs(value: (js.Function2[/* el */ Element, /* done */ js.Function0[Unit], Unit])*): Self = StObject.set(x, "onEnter", js.Array(value*))
    
    inline def setOnLeave(value: Hook[js.Function2[/* el */ Element, /* done */ js.Function0[Unit], Unit]]): Self = StObject.set(x, "onLeave", value.asInstanceOf[js.Any])
    
    inline def setOnLeaveCancelled(value: Hook[js.Function1[/* el */ Element, Unit]]): Self = StObject.set(x, "onLeaveCancelled", value.asInstanceOf[js.Any])
    
    inline def setOnLeaveCancelledFunction1(value: /* el */ Element => Unit): Self = StObject.set(x, "onLeaveCancelled", js.Any.fromFunction1(value))
    
    inline def setOnLeaveCancelledUndefined: Self = StObject.set(x, "onLeaveCancelled", js.undefined)
    
    inline def setOnLeaveCancelledVarargs(value: (js.Function1[/* el */ Element, Unit])*): Self = StObject.set(x, "onLeaveCancelled", js.Array(value*))
    
    inline def setOnLeaveFunction2(value: (/* el */ Element, /* done */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "onLeave", js.Any.fromFunction2(value))
    
    inline def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
    
    inline def setOnLeaveVarargs(value: (js.Function2[/* el */ Element, /* done */ js.Function0[Unit], Unit])*): Self = StObject.set(x, "onLeave", js.Array(value*))
    
    inline def setPersisted(value: Boolean): Self = StObject.set(x, "persisted", value.asInstanceOf[js.Any])
    
    inline def setPersistedUndefined: Self = StObject.set(x, "persisted", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setType(value: AnimationTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
