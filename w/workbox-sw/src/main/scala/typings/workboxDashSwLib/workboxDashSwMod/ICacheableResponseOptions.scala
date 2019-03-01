package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== CacheableResponse =====
  */
trait ICacheableResponseOptions extends js.Object {
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var statuses: js.Array[scala.Double]
}

object ICacheableResponseOptions {
  @scala.inline
  def apply(
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    statuses: js.Array[scala.Double]
  ): ICacheableResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("statuses")(statuses)
    __obj.asInstanceOf[ICacheableResponseOptions]
  }
}

