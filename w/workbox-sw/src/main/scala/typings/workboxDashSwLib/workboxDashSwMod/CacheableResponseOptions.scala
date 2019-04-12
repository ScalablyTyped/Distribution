package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== CacheableResponse =====
  */
trait CacheableResponseOptions extends js.Object {
  /**
  	 * A mapping of header names and expected values that a `Response` can have and be considered cacheable.
  	 * If multiple headers are provided, only one needs to be present.
  	 */
  var headers: stdLib.Record[java.lang.String, java.lang.String]
  /**
  	 * One or more status codes that a `Response` can have and be considered cacheable.
  	 */
  var statuses: js.Array[scala.Double]
}

object CacheableResponseOptions {
  @scala.inline
  def apply(headers: stdLib.Record[java.lang.String, java.lang.String], statuses: js.Array[scala.Double]): CacheableResponseOptions = {
    val __obj = js.Dynamic.literal(headers = headers, statuses = statuses)
  
    __obj.asInstanceOf[CacheableResponseOptions]
  }
}

