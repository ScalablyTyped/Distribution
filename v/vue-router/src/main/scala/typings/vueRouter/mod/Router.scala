package typings.vueRouter.mod

import typings.std.ReturnType
import typings.vueReactivity.mod.Ref_
import typings.vueRouter.anon.RouteLocationhrefstring
import typings.vueRuntimeCore.mod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Router extends StObject {
  
  /**
    * Add a new {@link RouteRecordRaw | route record} as the child of an existing route.
    *
    * @param parentName - Parent Route Record where `route` should be appended at
    * @param route - Route Record to add
    */
  def addRoute(parentName: RouteRecordName, route: RouteRecordRaw): js.Function0[Unit] = js.native
  /**
    * Add a new {@link RouteRecordRaw | route record} to the router.
    *
    * @param route - Route Record to add
    */
  def addRoute(route: RouteRecordRaw): js.Function0[Unit] = js.native
  
  /**
    * Add a navigation hook that is executed after every navigation. Returns a
    * function that removes the registered hook.
    *
    * @example
    * ```js
    * router.afterEach((to, from, failure) => {
    *   if (isNavigationFailure(failure)) {
    *     console.log('failed navigation', failure)
    *   }
    * })
    * ```
    *
    * @param guard - navigation hook to add
    */
  def afterEach(guard: NavigationHookAfter): js.Function0[Unit] = js.native
  
  /**
    * Go back in history if possible by calling `history.back()`. Equivalent to
    * `router.go(-1)`.
    */
  def back(): ReturnType[js.Function1[/* delta */ Double, Unit]] = js.native
  
  /**
    * Add a navigation guard that executes before any navigation. Returns a
    * function that removes the registered guard.
    *
    * @param guard - navigation guard to add
    */
  def beforeEach(guard: NavigationGuardWithThis[Unit]): js.Function0[Unit] = js.native
  
  /**
    * Add a navigation guard that executes before navigation is about to be
    * resolved. At this state all component have been fetched and other
    * navigation guards have been successful. Returns a function that removes the
    * registered guard.
    *
    * @example
    * ```js
    * router.beforeResolve(to => {
    *   if (to.meta.requiresAuth && !isAuthenticated) return false
    * })
    * ```
    *
    * @param guard - navigation guard to add
    */
  def beforeResolve(guard: NavigationGuardWithThis[Unit]): js.Function0[Unit] = js.native
  
  /**
    * @internal
    */
  /**
    * Current {@link RouteLocationNormalized}
    */
  val currentRoute: Ref_[RouteLocationNormalizedLoaded] = js.native
  
  /**
    * Go forward in history if possible by calling `history.forward()`.
    * Equivalent to `router.go(1)`.
    */
  def forward(): ReturnType[js.Function1[/* delta */ Double, Unit]] = js.native
  
  /**
    * Get a full list of all the {@link RouteRecord | route records}.
    */
  def getRoutes(): js.Array[RouteRecord] = js.native
  
  /**
    * Allows you to move forward or backward through the history. Calls
    * `history.go()`.
    *
    * @param delta - The position in the history to which you want to move,
    * relative to the current page
    */
  def go(delta: Double): Unit = js.native
  
  /**
    * Checks if a route with a given name exists
    *
    * @param name - Name of the route to check
    */
  def hasRoute(name: RouteRecordName): Boolean = js.native
  
  /**
    * Called automatically by `app.use(router)`. Should not be called manually by
    * the user. This will trigger the initial navigation when on client side.
    *
    * @internal
    * @param app - Application that uses the router
    */
  def install(app: App[Any]): Unit = js.native
  
  /**
    * Returns a Promise that resolves when the router has completed the initial
    * navigation, which means it has resolved all async enter hooks and async
    * components that are associated with the initial route. If the initial
    * navigation already happened, the promise resolves immediately.
    *
    * This is useful in server-side rendering to ensure consistent output on both
    * the server and the client. Note that on server side, you need to manually
    * push the initial location while on client side, the router automatically
    * picks it up from the URL.
    */
  def isReady(): js.Promise[Unit] = js.native
  
  /**
    * Allows turning off the listening of history events. This is a low level api for micro-frontends.
    */
  var listening: Boolean = js.native
  
  /**
    * Adds an error handler that is called every time a non caught error happens
    * during navigation. This includes errors thrown synchronously and
    * asynchronously, errors returned or passed to `next` in any navigation
    * guard, and errors occurred when trying to resolve an async component that
    * is required to render a route.
    *
    * @param handler - error handler to register
    */
  def onError(handler: ErrorHandler): js.Function0[Unit] = js.native
  
  /**
    * Original options object passed to create the Router
    */
  val options: RouterOptions = js.native
  
  /**
    * Programmatically navigate to a new URL by pushing an entry in the history
    * stack.
    *
    * @param to - Route location to navigate to
    */
  def push(to: RouteLocationRaw): js.Promise[js.UndefOr[NavigationFailure | Unit]] = js.native
  
  /**
    * Remove an existing route by its name.
    *
    * @param name - Name of the route to remove
    */
  def removeRoute(name: RouteRecordName): Unit = js.native
  
  /**
    * Programmatically navigate to a new URL by replacing the current entry in
    * the history stack.
    *
    * @param to - Route location to navigate to
    */
  def replace(to: RouteLocationRaw): js.Promise[js.UndefOr[NavigationFailure | Unit]] = js.native
  
  /**
    * Returns the {@link RouteLocation | normalized version} of a
    * {@link RouteLocationRaw | route location}. Also includes an `href` property
    * that includes any existing `base`. By default, the `currentLocation` used is
    * `route.currentRoute` and should only be overridden in advanced use cases.
    *
    * @param to - Raw route location to resolve
    * @param currentLocation - Optional current location to resolve against
    */
  def resolve(to: RouteLocationRaw): RouteLocationhrefstring = js.native
  def resolve(to: RouteLocationRaw, currentLocation: RouteLocationNormalizedLoaded): RouteLocationhrefstring = js.native
}
