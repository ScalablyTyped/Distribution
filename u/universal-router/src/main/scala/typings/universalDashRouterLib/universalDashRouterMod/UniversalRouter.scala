package typings
package universalDashRouterLib.universalDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UniversalRouter[C /* <: Context */, R] extends js.Object {
  /**
       * Traverses the list of routes in the order they are defined until it finds the first route that matches provided URL path string
       * and whose action function returns anything other than null or undefined.
       */
  def resolve(pathnameOrContext: java.lang.String): js.Promise[R] = js.native
  /**
       * Traverses the list of routes in the order they are defined until it finds the first route that matches provided URL path string
       * and whose action function returns anything other than null or undefined.
       */
  def resolve(pathnameOrContext: PathnameContext): js.Promise[R] = js.native
}

