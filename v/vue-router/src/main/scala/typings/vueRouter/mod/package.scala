package typings.vueRouter.mod

import typings.std.Exclude
import typings.std.Record
import typings.vueReactivity.mod.ComputedRef
import typings.vueReactivity.mod.Ref_
import typings.vueRouter.anon.IsExactActive
import typings.vueRouter.anon.ReadonlyArrayRouteRecordR
import typings.vueRouter.mod.^
import typings.vueRouter.vueRouterBooleans.`false`
import typings.vueRouter.vueRouterInts.`2`
import typings.vueRuntimeCore.mod.Component
import typings.vueRuntimeCore.mod.ComponentOptionsBase
import typings.vueRuntimeCore.mod.ComponentOptionsMixin
import typings.vueRuntimeCore.mod.ComponentPublicInstance
import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.DefineComponent_
import typings.vueRuntimeCore.mod.ExtractDefaultPropTypes
import typings.vueRuntimeCore.mod.InjectionKey
import typings.vueRuntimeCore.mod.MethodOptions
import typings.vueRuntimeCore.mod.PublicProps
import typings.vueRuntimeCore.mod.ResolveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def START_LOCATION: RouteLocationNormalizedLoaded = ^.asInstanceOf[js.Dynamic].selectDynamic("START_LOCATION").asInstanceOf[RouteLocationNormalizedLoaded]

inline def createMemoryHistory(): RouterHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryHistory")().asInstanceOf[RouterHistory]
inline def createMemoryHistory(base: String): RouterHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryHistory")(base.asInstanceOf[js.Any]).asInstanceOf[RouterHistory]

inline def createRouter(options: RouterOptions): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(options.asInstanceOf[js.Any]).asInstanceOf[Router]

inline def createRouterMatcher(routes: ReadonlyArrayRouteRecordR, globalOptions: PathParserOptions): RouterMatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("createRouterMatcher")(routes.asInstanceOf[js.Any], globalOptions.asInstanceOf[js.Any])).asInstanceOf[RouterMatcher]

inline def createWebHashHistory(): RouterHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebHashHistory")().asInstanceOf[RouterHistory]
inline def createWebHashHistory(base: String): RouterHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebHashHistory")(base.asInstanceOf[js.Any]).asInstanceOf[RouterHistory]

inline def createWebHistory(): RouterHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebHistory")().asInstanceOf[RouterHistory]
inline def createWebHistory(base: String): RouterHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebHistory")(base.asInstanceOf[js.Any]).asInstanceOf[RouterHistory]

inline def isNavigationFailure(error: Any): /* is vue-router.vue-router.NavigationRedirectError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNavigationFailure")(error.asInstanceOf[js.Any]).asInstanceOf[/* is vue-router.vue-router.NavigationRedirectError */ Boolean]
inline def isNavigationFailure(error: Any, `type`: ErrorTypes): /* is vue-router.vue-router.NavigationFailure */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNavigationFailure")(error.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is vue-router.vue-router.NavigationFailure */ Boolean]
inline def isNavigationFailure(error: Any, `type`: NavigationFailureType): /* is vue-router.vue-router.NavigationFailure */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNavigationFailure")(error.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is vue-router.vue-router.NavigationFailure */ Boolean]

inline def isNavigationFailure_2(error: Any, `type`: `2`): /* is vue-router.vue-router.NavigationRedirectError */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNavigationFailure")(error.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is vue-router.vue-router.NavigationRedirectError */ Boolean]

inline def loadRouteLocation(route: RouteLocationNormalized): js.Promise[RouteLocationNormalizedLoaded] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadRouteLocation")(route.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RouteLocationNormalizedLoaded]]

inline def matchedRouteKey: InjectionKey[ComputedRef[js.UndefOr[RouteRecordNormalized]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("matchedRouteKey").asInstanceOf[InjectionKey[ComputedRef[js.UndefOr[RouteRecordNormalized]]]]

inline def onBeforeRouteLeave(leaveGuard: NavigationGuard): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBeforeRouteLeave")(leaveGuard.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def onBeforeRouteUpdate(updateGuard: NavigationGuard): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBeforeRouteUpdate")(updateGuard.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def parseQuery(search: String): LocationQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("parseQuery")(search.asInstanceOf[js.Any]).asInstanceOf[LocationQuery]

inline def routeLocationKey: InjectionKey[RouteLocationNormalizedLoaded] = ^.asInstanceOf[js.Dynamic].selectDynamic("routeLocationKey").asInstanceOf[InjectionKey[RouteLocationNormalizedLoaded]]

inline def routerKey: InjectionKey[Router] = ^.asInstanceOf[js.Dynamic].selectDynamic("routerKey").asInstanceOf[InjectionKey[Router]]

inline def routerViewLocationKey: InjectionKey[Ref_[RouteLocationNormalizedLoaded]] = ^.asInstanceOf[js.Dynamic].selectDynamic("routerViewLocationKey").asInstanceOf[InjectionKey[Ref_[RouteLocationNormalizedLoaded]]]

inline def stringifyQuery(query: LocationQueryRaw): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyQuery")(query.asInstanceOf[js.Any]).asInstanceOf[String]

inline def useLink(props: UseLinkOptions): IsExactActive = ^.asInstanceOf[js.Dynamic].applyDynamic("useLink")(props.asInstanceOf[js.Any]).asInstanceOf[IsExactActive]

inline def useRoute(): RouteLocationNormalizedLoaded = ^.asInstanceOf[js.Dynamic].applyDynamic("useRoute")().asInstanceOf[RouteLocationNormalizedLoaded]

inline def useRouter(): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouter")().asInstanceOf[Router]

inline def viewDepthKey: InjectionKey[Double | Ref_[Double]] = ^.asInstanceOf[js.Dynamic].selectDynamic("viewDepthKey").asInstanceOf[InjectionKey[Double | Ref_[Double]]]

type Awaitable[T] = T | js.Promise[T]

/**
  * Internal type to define an ErrorHandler
  *
  * @param error - error thrown
  * @param to - location we were navigating to when the error happened
  * @param from - location we were navigating from when the error happened
  * @internal
  */
type ErrorHandler = js.Function3[
/* error */ Any, 
/* to */ RouteLocationNormalized, 
/* from */ RouteLocationNormalizedLoaded, 
Any]

type HistoryLocation = String

/**
  * Allowed arrays for history.state.
  *
  * @internal
  */
type HistoryStateArray = js.Array[HistoryStateValue]

/**
  * Allowed variables in HTML5 history state. Note that pushState clones the state
  * passed and does not accept everything: e.g.: it doesn't accept symbols, nor
  * functions as values. It also ignores Symbols as keys.
  *
  * @internal
  */
/** 
NOTE: Rewritten from type alias:
{{{
type HistoryStateValue = string | number | boolean | null | undefined | vue-router.vue-router.HistoryState | vue-router.vue-router.HistoryStateArray
}}}
to avoid circular code involving: 
- vue-router.vue-router.HistoryStateArray
- vue-router.vue-router.HistoryStateValue
*/
type HistoryStateValue = js.UndefOr[String | Double | Boolean | Null | HistoryState | Any]

type Lazy[T] = js.Function0[js.Promise[T]]

type LocationQuery = Record[String, LocationQueryValue | js.Array[LocationQueryValue]]

type LocationQueryRaw = Record[String | Double, LocationQueryValueRaw | js.Array[LocationQueryValueRaw]]

type LocationQueryValue = String | Null

type LocationQueryValueRaw = js.UndefOr[LocationQueryValue | Double]

type NavigationCallback = js.Function3[
/* to */ HistoryLocation, 
/* from */ HistoryLocation, 
/* information */ NavigationInformation, 
Unit]

type NavigationGuard = js.Function3[
/* to */ RouteLocationNormalized, 
/* from */ RouteLocationNormalized, 
/* next */ NavigationGuardNext, 
NavigationGuardReturn | js.Promise[NavigationGuardReturn]]

type NavigationGuardNextCallback = js.Function1[
/* vm */ ComponentPublicInstance[
  js.Object, 
  js.Object, 
  js.Object, 
  js.Object, 
  js.Object, 
  js.Object, 
  js.Object, 
  js.Object, 
  `false`, 
  ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
  js.Object, 
  js.Object
], 
Any]

type NavigationGuardReturn = Unit | js.Error | RouteLocationRaw | Boolean | NavigationGuardNextCallback

type NavigationGuardWithThis[T] = js.ThisFunction3[
/* this */ T, 
/* to */ RouteLocationNormalized, 
/* from */ RouteLocationNormalized, 
/* next */ NavigationGuardNext, 
NavigationGuardReturn | js.Promise[NavigationGuardReturn]]

type NavigationHookAfter = js.Function3[
/* to */ RouteLocationNormalized, 
/* from */ RouteLocationNormalized, 
/* failure */ js.UndefOr[NavigationFailure | Unit], 
Any]

type PathParams = Record[String, String | js.Array[String]]

/**
  * Allowed Component definitions in route records provided by the user
  */
type RawRouteComponent = RouteComponent | Lazy[RouteComponent]

type RouteComponent = (Component[Any, Any, Any, ComputedOptions, MethodOptions]) | (DefineComponent_[
js.Object, 
js.Object, 
js.Object, 
ComputedOptions, 
MethodOptions, 
ComponentOptionsMixin, 
ComponentOptionsMixin, 
js.Object, 
String, 
PublicProps, 
ResolveProps[js.Object, js.Object], 
ExtractDefaultPropTypes[js.Object], 
js.Object])

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.vueRouter.mod.RouteLocationPathRaw
  - typings.vueRouter.mod.RouteLocationNamedRaw
*/
type RouteLocationRaw = _RouteLocationRaw | String

type RouteMeta = Record[String | Double | js.Symbol, Any]

type RouteParamValue = String

type RouteParamValueRaw = js.UndefOr[RouteParamValue | Double | Null]

type RouteParams = Record[String, RouteParamValue | js.Array[RouteParamValue]]

type RouteParamsRaw = Record[
String, 
RouteParamValueRaw | (js.Array[Exclude[RouteParamValueRaw, js.UndefOr[Null]]])]

type RouteRecord = RouteRecordNormalized

type RouteRecordName = String | js.Symbol

/**
  * @internal
  */
type RouteRecordProps = Boolean | (Record[String, Any]) | (js.Function1[/* to */ RouteLocationNormalized, Record[String, Any]])

type RouteRecordRedirectOption = RouteLocationRaw | (js.Function1[/* to */ RouteLocation, RouteLocationRaw])

type RouterScrollBehavior = js.Function3[
/* to */ RouteLocationNormalized, 
/* from */ RouteLocationNormalizedLoaded, 
/* savedPosition */ ScrollPositionNormalized | Null, 
Awaitable[ScrollPosition | `false` | Unit]]
