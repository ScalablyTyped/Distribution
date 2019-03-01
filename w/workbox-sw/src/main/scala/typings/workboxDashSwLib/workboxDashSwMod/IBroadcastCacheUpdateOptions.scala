package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBroadcastCacheUpdateOptions extends js.Object {
  /**
  	 * A list of headers that will be used to determine whether the responses differ.
  	 */
  var headersToCheck: js.Array[java.lang.String]
  /**
  	 * An attribution value that indicates where the update originated.
  	 */
  var source: java.lang.String
}

object IBroadcastCacheUpdateOptions {
  @scala.inline
  def apply(headersToCheck: js.Array[java.lang.String], source: java.lang.String): IBroadcastCacheUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headersToCheck")(headersToCheck)
    __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[IBroadcastCacheUpdateOptions]
  }
}

