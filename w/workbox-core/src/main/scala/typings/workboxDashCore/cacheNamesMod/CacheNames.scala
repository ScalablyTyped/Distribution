package typings.workboxDashCore.cacheNamesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheNames extends js.Object {
  val googleAnalytics: String
  val precache: String
  val prefix: String
  val runtime: String
  val suffix: String
}

object CacheNames {
  @scala.inline
  def apply(googleAnalytics: String, precache: String, prefix: String, runtime: String, suffix: String): CacheNames = {
    val __obj = js.Dynamic.literal(googleAnalytics = googleAnalytics, precache = precache, prefix = prefix, runtime = runtime, suffix = suffix)
  
    __obj.asInstanceOf[CacheNames]
  }
}

@JSImport("workbox-core/cacheNames", "cacheNames")
@js.native
object cacheNames extends TopLevel[CacheNames]

