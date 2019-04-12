package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegExpRouteConstructor
  extends /**
	 *
	 * @param {RegExp} regExp - The regular expression to match against URLs.
	 * @param {HandlerCallback} handler - A callback function that returns a Promise resulting in a Response.
	 * @param {string} [method] - The HTTP method to match the Route against.
	 * @returns {RegExpRoute}
	 */
/**
	 * If the regular expression contains
	 * [capture groups]{@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp#grouping-back-references},
	 * the captured values will be passed to the handler's `params`
	 * argument.
	 * @param {RegExp} regExp - The regular expression to match against URLs.
	 * @param {HandlerCallback} handler - A callback function that returns a Promise resulting in a Response.
	 * @param {string} [method="GET"] - The HTTP method to match the Route against.
	 * @return {RegExpRoute}
	 */
org.scalablytyped.runtime.Instantiable2[
      /* regExp */ stdLib.RegExp, 
      /* handler */ workboxDashSwLib.HandlerCallback, 
      RegExpRoute
    ]
     with org.scalablytyped.runtime.Instantiable3[
      /* regExp */ stdLib.RegExp, 
      /* handler */ workboxDashSwLib.HandlerCallback, 
      /* method */ java.lang.String, 
      RegExpRoute
    ]

