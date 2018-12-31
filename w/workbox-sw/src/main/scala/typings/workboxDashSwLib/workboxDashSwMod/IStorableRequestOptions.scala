package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== BackgroundSync =====
  */
trait IStorableRequestOptions extends js.Object {
  /**
  	 * See: https://fetch.spec.whatwg.org/#requestinit
  	 */
  var requestInit: stdLib.RequestInit
  /**
  	 * The time the request was created, defaulting to the current time if not specified.
  	 */
  var timestamp: scala.Double
  var url: java.lang.String
}

