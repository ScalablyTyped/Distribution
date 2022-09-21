package typings.vueRouter.mod

import org.scalablytyped.runtime.Instantiable0
import typings.vueRouter.anon.Slots
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueRuntimeCoreAugmentingMod {
  
  trait ComponentCustomOptions extends StObject {
    
    /**
      * Guard called when the router is navigating to the route that is rendering
      * this component from a different route. Differently from `beforeRouteUpdate`
      * and `beforeRouteLeave`, `beforeRouteEnter` does not have access to the
      * component instance through `this` because it triggers before the component
      * is even mounted.
      *
      * @param to - RouteLocationRaw we are navigating to
      * @param from - RouteLocationRaw we are navigating from
      * @param next - function to validate, cancel or modify (by redirecting) the
      * navigation
      */
    var beforeRouteEnter: js.UndefOr[NavigationGuardWithThis[Unit]] = js.undefined
    
    /**
      * Guard called when the router is navigating away from the current route that
      * is rendering this component.
      *
      * @param to - RouteLocationRaw we are navigating to
      * @param from - RouteLocationRaw we are navigating from
      * @param next - function to validate, cancel or modify (by redirecting) the
      * navigation
      */
    var beforeRouteLeave: js.UndefOr[NavigationGuard] = js.undefined
    
    /**
      * Guard called whenever the route that renders this component has changed, but
      * it is reused for the new route. This allows you to guard for changes in
      * params, the query or the hash.
      *
      * @param to - RouteLocationRaw we are navigating to
      * @param from - RouteLocationRaw we are navigating from
      * @param next - function to validate, cancel or modify (by redirecting) the
      * navigation
      */
    var beforeRouteUpdate: js.UndefOr[NavigationGuard] = js.undefined
  }
  object ComponentCustomOptions {
    
    inline def apply(): ComponentCustomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentCustomOptions]
    }
    
    extension [Self <: ComponentCustomOptions](x: Self) {
      
      inline def setBeforeRouteEnter(value: NavigationGuardWithThis[Unit]): Self = StObject.set(x, "beforeRouteEnter", value.asInstanceOf[js.Any])
      
      inline def setBeforeRouteEnterUndefined: Self = StObject.set(x, "beforeRouteEnter", js.undefined)
      
      inline def setBeforeRouteLeave(
        value: (/* to */ RouteLocationNormalized, /* from */ RouteLocationNormalized, /* next */ NavigationGuardNext) => NavigationGuardReturn | js.Promise[NavigationGuardReturn]
      ): Self = StObject.set(x, "beforeRouteLeave", js.Any.fromFunction3(value))
      
      inline def setBeforeRouteLeaveUndefined: Self = StObject.set(x, "beforeRouteLeave", js.undefined)
      
      inline def setBeforeRouteUpdate(
        value: (/* to */ RouteLocationNormalized, /* from */ RouteLocationNormalized, /* next */ NavigationGuardNext) => NavigationGuardReturn | js.Promise[NavigationGuardReturn]
      ): Self = StObject.set(x, "beforeRouteUpdate", js.Any.fromFunction3(value))
      
      inline def setBeforeRouteUpdateUndefined: Self = StObject.set(x, "beforeRouteUpdate", js.undefined)
    }
  }
  
  trait ComponentCustomProperties extends StObject {
    
    /**
      * Normalized current location. See {@link RouteLocationNormalizedLoaded}.
      */
    @JSName("$route")
    var $route: RouteLocationNormalizedLoaded
    
    /**
      * {@link Router} instance used by the application.
      */
    @JSName("$router")
    var $router: Router
  }
  object ComponentCustomProperties {
    
    inline def apply($route: RouteLocationNormalizedLoaded, $router: Router): ComponentCustomProperties = {
      val __obj = js.Dynamic.literal($route = $route.asInstanceOf[js.Any], $router = $router.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentCustomProperties]
    }
    
    extension [Self <: ComponentCustomProperties](x: Self) {
      
      inline def set$route(value: RouteLocationNormalizedLoaded): Self = StObject.set(x, "$route", value.asInstanceOf[js.Any])
      
      inline def set$router(value: Router): Self = StObject.set(x, "$router", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlobalComponents extends StObject {
    
    var RouterLink: RouterLinkI
    
    var RouterView: Instantiable0[Slots]
  }
  object GlobalComponents {
    
    inline def apply(RouterLink: RouterLinkI, RouterView: Instantiable0[Slots]): GlobalComponents = {
      val __obj = js.Dynamic.literal(RouterLink = RouterLink.asInstanceOf[js.Any], RouterView = RouterView.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalComponents]
    }
    
    extension [Self <: GlobalComponents](x: Self) {
      
      inline def setRouterLink(value: RouterLinkI): Self = StObject.set(x, "RouterLink", value.asInstanceOf[js.Any])
      
      inline def setRouterView(value: Instantiable0[Slots]): Self = StObject.set(x, "RouterView", value.asInstanceOf[js.Any])
    }
  }
}
