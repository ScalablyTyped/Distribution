package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== CoreNamespace =====
  */
trait ICacheNames extends js.Object {
  var googleAnalytics: java.lang.String
  var precache: java.lang.String
  var runtime: java.lang.String
}

object ICacheNames {
  @scala.inline
  def apply(googleAnalytics: java.lang.String, precache: java.lang.String, runtime: java.lang.String): ICacheNames = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("googleAnalytics")(googleAnalytics)
    __obj.updateDynamic("precache")(precache)
    __obj.updateDynamic("runtime")(runtime)
    __obj.asInstanceOf[ICacheNames]
  }
}

