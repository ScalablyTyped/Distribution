package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * ===== Route =====
 */

/**
 * A Route consists of a pair of callback functions, "match" and "handler".
 * The "match" callback determine if a route should be used to "handle" a request by
 * returning a non-falsy value if it can. The "handler" callback is called when there is a match
 * and should return a Promise that resolves to a Response.
 */

trait Route extends js.Object

