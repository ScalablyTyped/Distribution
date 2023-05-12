package typings.workboxRouting

import typings.workboxCore.typesMod.RouteHandler
import typings.workboxRouting.routeMod.Route
import typings.workboxRouting.utilsConstantsMod.HTTPMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regExpRouteMod {
  
  /**
    * RegExpRoute makes it easy to create a regular expression based
    * {@link workbox-routing.Route}.
    *
    * For same-origin requests the RegExp only needs to match part of the URL. For
    * requests against third-party servers, you must define a RegExp that matches
    * the start of the URL.
    *
    * @memberof workbox-routing
    * @extends workbox-routing.Route
    */
  @JSImport("workbox-routing/RegExpRoute", "RegExpRoute")
  @js.native
  open class RegExpRoute protected () extends Route {
    /**
      * If the regular expression contains
      * [capture groups]{@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp#grouping-back-references},
      * the captured values will be passed to the
      * {@link workbox-routing~handlerCallback} `params`
      * argument.
      *
      * @param {RegExp} regExp The regular expression to match against URLs.
      * @param {workbox-routing~handlerCallback} handler A callback
      * function that returns a Promise resulting in a Response.
      * @param {string} [method='GET'] The HTTP method to match the Route
      * against.
      */
    def this(regExp: js.RegExp, handler: RouteHandler) = this()
    def this(regExp: js.RegExp, handler: RouteHandler, method: HTTPMethod) = this()
  }
}
