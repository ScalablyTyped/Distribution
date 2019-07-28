package typings.workboxDashSw.workboxDashSwMod

import org.scalablytyped.runtime.Instantiable2
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationRouteConstructor
  extends /**
	 * If both `blacklist` and `whitelist` are provided, the `blacklist` will
	 * take precedence and the request will not match this route.
	 *
	 * The regular expressions in `whitelist` and `blacklist`
	 * are matched against the concatenated
	 * [`pathname`]{@link https://developer.mozilla.org/en-US/docs/Web/API/HTMLHyperlinkElementUtils/pathname}
	 * and [`search`]{@link https://developer.mozilla.org/en-US/docs/Web/API/HTMLHyperlinkElementUtils/search}
	 * portions of the requested URL.
	 * @param {HandlerCallback} handler
	 * @param {Partial<NavigationRouteOptions>} options
	 * @returns {NavigationRoute}
	 */
Instantiable2[
      /* handler */ HandlerCallback, 
      /* options */ Partial[NavigationRouteOptions], 
      NavigationRoute
    ]

