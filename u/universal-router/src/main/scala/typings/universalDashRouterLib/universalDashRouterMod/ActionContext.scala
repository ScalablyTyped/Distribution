package typings
package universalDashRouterLib.universalDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionContext[C /* <: Context */, R] extends PathnameContext {
  /**
       * Base URL path relative to the path of the current route.
       */
  var baseUrl: java.lang.String = js.native
  /**
       * An array of keys found in the path, see `path-to-regexp` documentation for details.
       * @see https://github.com/pillarjs/path-to-regexp
       */
  var keys: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.Key] = js.native
  /**
       * Matched path params.
       */
  var params: Params = js.native
  /**
       * Matched path.
       */
  var path: java.lang.String = js.native
  /**
       * Matched route object.
       */
  var route: Route[_, _] = js.native
  /**
       * Current router instance.
       */
  var router: UniversalRouter[C, R] = js.native
  /**
       * Middleware style function which can continue resolving.
       */
  def next(): stdLib.Promise[R] = js.native
  /**
       * Middleware style function which can continue resolving.
       */
  def next(resume: scala.Boolean): stdLib.Promise[R] = js.native
  /**
       * Middleware style function which can continue resolving.
       */
  def next(resume: scala.Boolean, parent: Route[_, _]): stdLib.Promise[R] = js.native
  /**
       * Middleware style function which can continue resolving.
       */
  def next(resume: scala.Boolean, parent: Route[_, _], prevResult: js.Any): stdLib.Promise[R] = js.native
}

