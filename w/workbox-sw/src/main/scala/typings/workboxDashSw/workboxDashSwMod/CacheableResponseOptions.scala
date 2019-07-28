package typings.workboxDashSw.workboxDashSwMod

import typings.std.Record
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
  var headers: Record[String, String]
  /**
  	 * One or more status codes that a `Response` can have and be considered cacheable.
  	 */
  var statuses: js.Array[Double]
}

object CacheableResponseOptions {
  @scala.inline
  def apply(headers: Record[String, String], statuses: js.Array[Double]): CacheableResponseOptions = {
    val __obj = js.Dynamic.literal(headers = headers, statuses = statuses)
  
    __obj.asInstanceOf[CacheableResponseOptions]
  }
}

