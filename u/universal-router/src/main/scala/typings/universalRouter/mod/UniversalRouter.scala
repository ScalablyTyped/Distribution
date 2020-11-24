package typings.universalRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UniversalRouter[R, C /* <: RouterContext */] extends js.Object {
  
  var baseUrl: String = js.native
  
  var options: RouterOptions[R, C] = js.native
  
  /**
    * Traverses the list of routes in the order they are defined until it finds
    * the first route that matches provided URL path string and whose action function
    * returns anything other than `null` or `undefined`.
    */
  def resolve(pathnameOrContext: String): js.Promise[RouteResult[R]] = js.native
  def resolve(pathnameOrContext: ResolveContext): js.Promise[RouteResult[R]] = js.native
  
  var root: Route[R, C] = js.native
}
