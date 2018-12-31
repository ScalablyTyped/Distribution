package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If the regular expression contains capture groups, the captured values will be passed to the handler's params argument.
  */
@js.native
trait IRegExpRouteConstructor
  extends /**
	 *
	 * @param {RegExp} regExp - The regular expression to match against URLs.
	 * @param {HandlerCallback} handler - A callback function that returns a Promise resulting in a Response.
	 * @param {string} [method] - The HTTP method to match the Route against.
	 * @returns {RegExpRoute}
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

