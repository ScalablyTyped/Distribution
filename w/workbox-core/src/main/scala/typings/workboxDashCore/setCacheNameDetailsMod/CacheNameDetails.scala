package typings.workboxDashCore.setCacheNameDetailsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheNameDetails extends js.Object {
  var googleAnalytics: String
  var precache: String
  var prefix: String
  var runtime: String
  var suffix: String
}

object CacheNameDetails {
  @scala.inline
  def apply(googleAnalytics: String, precache: String, prefix: String, runtime: String, suffix: String): CacheNameDetails = {
    val __obj = js.Dynamic.literal(googleAnalytics = googleAnalytics, precache = precache, prefix = prefix, runtime = runtime, suffix = suffix)
  
    __obj.asInstanceOf[CacheNameDetails]
  }
}

