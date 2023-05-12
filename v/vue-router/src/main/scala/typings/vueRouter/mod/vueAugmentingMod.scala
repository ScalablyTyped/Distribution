package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object vueAugmentingMod {
  
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
    var beforeRouteEnter: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vue-router.vue-router.TypesConfig extends / * Inlined std.Record<'beforeRouteEnter', infer T> * /
    {  beforeRouteEnter :infer T} ? T : vue-router.vue-router.NavigationGuardWithThis<undefined> */ js.Any
      ] = js.undefined
    
    /**
      * Guard called when the router is navigating away from the current route that
      * is rendering this component.
      *
      * @param to - RouteLocationRaw we are navigating to
      * @param from - RouteLocationRaw we are navigating from
      * @param next - function to validate, cancel or modify (by redirecting) the
      * navigation
      */
    var beforeRouteLeave: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vue-router.vue-router.TypesConfig extends / * Inlined std.Record<'beforeRouteLeave', infer T> * /
    {  beforeRouteLeave :infer T} ? T : vue-router.vue-router.NavigationGuard */ js.Any
      ] = js.undefined
    
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
    var beforeRouteUpdate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vue-router.vue-router.TypesConfig extends / * Inlined std.Record<'beforeRouteUpdate', infer T> * /
    {  beforeRouteUpdate :infer T} ? T : vue-router.vue-router.NavigationGuard */ js.Any
      ] = js.undefined
  }
  object ComponentCustomOptions {
    
    inline def apply(): ComponentCustomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentCustomOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentCustomOptions] (val x: Self) extends AnyVal {
      
      inline def setBeforeRouteEnter(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vue-router.vue-router.TypesConfig extends / * Inlined std.Record<'beforeRouteEnter', infer T> * /
      {  beforeRouteEnter :infer T} ? T : vue-router.vue-router.NavigationGuardWithThis<undefined> */ js.Any
      ): Self = StObject.set(x, "beforeRouteEnter", value.asInstanceOf[js.Any])
      
      inline def setBeforeRouteEnterUndefined: Self = StObject.set(x, "beforeRouteEnter", js.undefined)
      
      inline def setBeforeRouteLeave(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vue-router.vue-router.TypesConfig extends / * Inlined std.Record<'beforeRouteLeave', infer T> * /
      {  beforeRouteLeave :infer T} ? T : vue-router.vue-router.NavigationGuard */ js.Any
      ): Self = StObject.set(x, "beforeRouteLeave", value.asInstanceOf[js.Any])
      
      inline def setBeforeRouteLeaveUndefined: Self = StObject.set(x, "beforeRouteLeave", js.undefined)
      
      inline def setBeforeRouteUpdate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vue-router.vue-router.TypesConfig extends / * Inlined std.Record<'beforeRouteUpdate', infer T> * /
      {  beforeRouteUpdate :infer T} ? T : vue-router.vue-router.NavigationGuard */ js.Any
      ): Self = StObject.set(x, "beforeRouteUpdate", value.asInstanceOf[js.Any])
      
      inline def setBeforeRouteUpdateUndefined: Self = StObject.set(x, "beforeRouteUpdate", js.undefined)
    }
  }
  
  trait ComponentCustomProperties extends StObject {
    
    /**
      * Normalized current location. See {@link RouteLocationNormalizedLoaded}.
      */
    @JSName("$route")
    var $route: /* import warning: importer.ImportType#apply Failed type conversion: vue-router.vue-router.TypesConfig extends / * Inlined std.Record<'$route', infer T> * /
    {  $route :infer T} ? T : vue-router.vue-router.RouteLocationNormalizedLoaded */ js.Any
    
    /**
      * {@link Router} instance used by the application.
      */
    @JSName("$router")
    var $router: /* import warning: importer.ImportType#apply Failed type conversion: vue-router.vue-router.TypesConfig extends / * Inlined std.Record<'$router', infer T> * /
    {  $router :infer T} ? T : vue-router.vue-router.Router */ js.Any
  }
  object ComponentCustomProperties {
    
    inline def apply(
      $route: /* import warning: importer.ImportType#apply Failed type conversion: vue-router.vue-router.TypesConfig extends / * Inlined std.Record<'$route', infer T> * /
    {  $route :infer T} ? T : vue-router.vue-router.RouteLocationNormalizedLoaded */ js.Any,
      $router: /* import warning: importer.ImportType#apply Failed type conversion: vue-router.vue-router.TypesConfig extends / * Inlined std.Record<'$router', infer T> * /
    {  $router :infer T} ? T : vue-router.vue-router.Router */ js.Any
    ): ComponentCustomProperties = {
      val __obj = js.Dynamic.literal($route = $route.asInstanceOf[js.Any], $router = $router.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentCustomProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentCustomProperties] (val x: Self) extends AnyVal {
      
      inline def set$route(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vue-router.vue-router.TypesConfig extends / * Inlined std.Record<'$route', infer T> * /
      {  $route :infer T} ? T : vue-router.vue-router.RouteLocationNormalizedLoaded */ js.Any
      ): Self = StObject.set(x, "$route", value.asInstanceOf[js.Any])
      
      inline def set$router(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vue-router.vue-router.TypesConfig extends / * Inlined std.Record<'$router', infer T> * /
      {  $router :infer T} ? T : vue-router.vue-router.Router */ js.Any
      ): Self = StObject.set(x, "$router", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlobalComponents extends StObject {
    
    var RouterLink: /* import warning: importer.ImportType#apply Failed type conversion: vue-router.vue-router.TypesConfig extends / * Inlined std.Record<'RouterLink', infer T> * /
    {  RouterLink :infer T} ? T : vue-router.vue-router._RouterLinkI */ js.Any
    
    var RouterView: /* import warning: importer.ImportType#apply Failed type conversion: vue-router.vue-router.TypesConfig extends / * Inlined std.Record<'RouterView', infer T> * /
    {  RouterView :infer T} ? T : new (): {  $props :@vue/runtime-core.@vue/runtime-core.AllowedComponentProps & @vue/runtime-core.@vue/runtime-core.ComponentCustomProps & @vue/runtime-core.@vue/runtime-core.VNodeProps & vue-router.vue-router.RouterViewProps,   $slots :{  default :(param0 : {  Component :@vue/runtime-core.@vue/runtime-core.VNode<@vue/runtime-core.@vue/runtime-core.RendererNode, @vue/runtime-core.@vue/runtime-core.RendererElement, {[key: string] : any}>,   route :vue-router.vue-router.RouteLocationNormalizedLoaded}): std.Array<@vue/runtime-core.@vue/runtime-core.VNode<@vue/runtime-core.@vue/runtime-core.RendererNode, @vue/runtime-core.@vue/runtime-core.RendererElement, {[key: string] : any}>> | undefined}} */ js.Any
  }
  object GlobalComponents {
    
    inline def apply(
      RouterLink: /* import warning: importer.ImportType#apply Failed type conversion: vue-router.vue-router.TypesConfig extends / * Inlined std.Record<'RouterLink', infer T> * /
    {  RouterLink :infer T} ? T : vue-router.vue-router._RouterLinkI */ js.Any,
      RouterView: /* import warning: importer.ImportType#apply Failed type conversion: vue-router.vue-router.TypesConfig extends / * Inlined std.Record<'RouterView', infer T> * /
    {  RouterView :infer T} ? T : new (): {  $props :@vue/runtime-core.@vue/runtime-core.AllowedComponentProps & @vue/runtime-core.@vue/runtime-core.ComponentCustomProps & @vue/runtime-core.@vue/runtime-core.VNodeProps & vue-router.vue-router.RouterViewProps,   $slots :{  default :(param0 : {  Component :@vue/runtime-core.@vue/runtime-core.VNode<@vue/runtime-core.@vue/runtime-core.RendererNode, @vue/runtime-core.@vue/runtime-core.RendererElement, {[key: string] : any}>,   route :vue-router.vue-router.RouteLocationNormalizedLoaded}): std.Array<@vue/runtime-core.@vue/runtime-core.VNode<@vue/runtime-core.@vue/runtime-core.RendererNode, @vue/runtime-core.@vue/runtime-core.RendererElement, {[key: string] : any}>> | undefined}} */ js.Any
    ): GlobalComponents = {
      val __obj = js.Dynamic.literal(RouterLink = RouterLink.asInstanceOf[js.Any], RouterView = RouterView.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobalComponents] (val x: Self) extends AnyVal {
      
      inline def setRouterLink(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vue-router.vue-router.TypesConfig extends / * Inlined std.Record<'RouterLink', infer T> * /
      {  RouterLink :infer T} ? T : vue-router.vue-router._RouterLinkI */ js.Any
      ): Self = StObject.set(x, "RouterLink", value.asInstanceOf[js.Any])
      
      inline def setRouterView(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vue-router.vue-router.TypesConfig extends / * Inlined std.Record<'RouterView', infer T> * /
      {  RouterView :infer T} ? T : new (): {  $props :@vue/runtime-core.@vue/runtime-core.AllowedComponentProps & @vue/runtime-core.@vue/runtime-core.ComponentCustomProps & @vue/runtime-core.@vue/runtime-core.VNodeProps & vue-router.vue-router.RouterViewProps,   $slots :{  default :(param0 : {  Component :@vue/runtime-core.@vue/runtime-core.VNode<@vue/runtime-core.@vue/runtime-core.RendererNode, @vue/runtime-core.@vue/runtime-core.RendererElement, {[key: string] : any}>,   route :vue-router.vue-router.RouteLocationNormalizedLoaded}): std.Array<@vue/runtime-core.@vue/runtime-core.VNode<@vue/runtime-core.@vue/runtime-core.RendererNode, @vue/runtime-core.@vue/runtime-core.RendererElement, {[key: string] : any}>> | undefined}} */ js.Any
      ): Self = StObject.set(x, "RouterView", value.asInstanceOf[js.Any])
    }
  }
}
