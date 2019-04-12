package typings
package workboxDashSwLib.workboxDashSwMod

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
org.scalablytyped.runtime.Instantiable2[
      /* handler */ workboxDashSwLib.HandlerCallback, 
      /* options */ stdLib.Partial[NavigationRouteOptions], 
      NavigationRoute
    ]

