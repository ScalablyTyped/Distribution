package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== RangeRequestsPlugin =====
  */
/**
  * The range request plugin makes it easy for a request with a 'Range' header to
  * be fulfilled by a cached response.
  *
  * It does this by intercepting the `cachedResponseWillBeUsed` plugin callback
  * and returning the appropriate subset of the cached response body.
  */
trait RangeRequestsPlugin extends js.Object

