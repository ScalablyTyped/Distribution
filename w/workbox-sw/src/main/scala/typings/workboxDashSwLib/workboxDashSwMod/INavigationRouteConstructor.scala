package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If both blacklist and whitelist are provided, the blacklist will take precedence and the request will not match this route.
  * The regular expressions in whitelist and blacklist are matched against the concatenated pathname and search portions of the requested URL.
  */
@js.native
trait INavigationRouteConstructor
  extends org.scalablytyped.runtime.Instantiable2[
      /* handler */ workboxDashSwLib.HandlerCallback, 
      /* options */ stdLib.Partial[INavigationRouteOptions], 
      NavigationRoute
    ]

