package typings.vueRouter

import typings.vue.vueMod.Vue
import typings.vueRouter.mod.default
import typings.vueRouter.routerMod.NavigationGuard
import typings.vueRouter.routerMod.NavigationGuardNext
import typings.vueRouter.routerMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @js.native
  trait ComponentOptions[V /* <: Vue */] extends StObject {
    
    var beforeRouteEnter: js.UndefOr[NavigationGuard[V]] = js.native
    
    var beforeRouteLeave: js.UndefOr[NavigationGuard[V]] = js.native
    
    var beforeRouteUpdate: js.UndefOr[NavigationGuard[V]] = js.native
    
    var router: js.UndefOr[default] = js.native
  }
  object ComponentOptions {
    
    @scala.inline
    def apply[V /* <: Vue */](): ComponentOptions[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentOptions[V]]
    }
    
    @scala.inline
    implicit class ComponentOptionsMutableBuilder[Self <: ComponentOptions[_], V /* <: Vue */] (val x: Self with ComponentOptions[V]) extends AnyVal {
      
      @scala.inline
      def setBeforeRouteEnter(value: (/* to */ Route, /* from */ Route, /* next */ NavigationGuardNext[V]) => js.Any): Self = StObject.set(x, "beforeRouteEnter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBeforeRouteEnterUndefined: Self = StObject.set(x, "beforeRouteEnter", js.undefined)
      
      @scala.inline
      def setBeforeRouteLeave(value: (/* to */ Route, /* from */ Route, /* next */ NavigationGuardNext[V]) => js.Any): Self = StObject.set(x, "beforeRouteLeave", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBeforeRouteLeaveUndefined: Self = StObject.set(x, "beforeRouteLeave", js.undefined)
      
      @scala.inline
      def setBeforeRouteUpdate(value: (/* to */ Route, /* from */ Route, /* next */ NavigationGuardNext[V]) => js.Any): Self = StObject.set(x, "beforeRouteUpdate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBeforeRouteUpdateUndefined: Self = StObject.set(x, "beforeRouteUpdate", js.undefined)
      
      @scala.inline
      def setRouter(value: default): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
    }
  }
}
