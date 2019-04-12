package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== CoreNamespace =====
  */
trait CacheNames extends js.Object {
  var googleAnalytics: java.lang.String
  var precache: java.lang.String
  var prefix: java.lang.String
  var runtime: java.lang.String
  var suffix: java.lang.String
}

object CacheNames {
  @scala.inline
  def apply(
    googleAnalytics: java.lang.String,
    precache: java.lang.String,
    prefix: java.lang.String,
    runtime: java.lang.String,
    suffix: java.lang.String
  ): CacheNames = {
    val __obj = js.Dynamic.literal(googleAnalytics = googleAnalytics, precache = precache, prefix = prefix, runtime = runtime, suffix = suffix)
  
    __obj.asInstanceOf[CacheNames]
  }
}

