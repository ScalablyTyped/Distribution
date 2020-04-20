package typings.workboxCore.setCacheNameDetailsMod

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
    val __obj = js.Dynamic.literal(googleAnalytics = googleAnalytics.asInstanceOf[js.Any], precache = precache.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheNameDetails]
  }
}

