package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== Router =====
  */
/**
  * The Router can be used to process a FetchEvent through one or more Routes responding with a Request if a matching route exists.
  * If no route matches a given a request, the Router will use a "default" handler if one is defined.
  * Should the matching Route throw an error, the Router will use a "catch" handler if one is defined to gracefully deal with issues and respond with a Request.
  * If a request matches multiple routes, the earliest registered route will be used to respond to the request.
  */
trait Router extends js.Object {
  /**
  	 * Apply the routing rules to a FetchEvent object to get a Response from an appropriate Route's handler.
  	 * @param {FetchEvent} event - The event from a service worker's 'fetch' event listener.
  	 * @returns {Promise<Response>?} A promise is returned if a registered route can handle the FetchEvent's request. If there is no matching route and there's no defaultHandler, undefined is returned.
  	 */
  def handleRequest(event: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify FetchEvent */ js.Any): js.UndefOr[js.Promise[stdLib.Response]]
  /**
  	 * Registers a route with the router.
  	 * @param {Route} route
  	 */
  def registerRoute(route: Route): scala.Unit
  /**
  	 * If a Route throws an error while handling a request, this handler will be called and given a chance to provide a response.
  	 * @param {HandlerCallback} handler - A callback function that returns a Promise resulting in a Response.
  	 */
  def setCatchHandler(handler: workboxDashSwLib.HandlerCallback): scala.Unit
  /**
  	 * Define a default handler that's called when no routes explicitly match the incoming request.
  	 * Without a default handler, unmatched requests will go against the network as if there were no service worker present.
  	 * @param {HandlerCallback} handler - A callback function that returns a Promise resulting in a Response.
  	 */
  def setDefaultHandler(handler: workboxDashSwLib.HandlerCallback): scala.Unit
  /**
  	 * Unregisters a route with the router.
  	 * @param {Route} route - The route to unregister.
  	 */
  def unregisterRoute(route: Route): scala.Unit
}

