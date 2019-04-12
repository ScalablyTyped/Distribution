package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== GoogleAnalyticsNamespace =====
  */
trait GoogleAnalyticsInitializeOptions extends js.Object {
  /**
  	 * The cache name to store and retrieve analytics.js.
  	 * Defaults to the cache names provided by `workbox-core`.
  	 */
  var cacheName: java.lang.String
  /**
  	 * [Measurement Protocol parameters](https://developers.google.com/analytics/devguides/collection/protocol/v1/parameters),
  	 * expressed as key/value pairs, to be added to replayed Google Analytics
  	 * requests. This can be used to, e.g., set a custom dimension indicating
  	 * that the request was replayed.
  	 */
  var parameterOverrides: stdLib.Record[java.lang.String, java.lang.String]
  /**
  	 * A function that allows you to modify the hit parameters prior to replaying
  	 * the hit. The function is invoked with the original hit's URLSearchParams
  	 * object as its only argument.
  	 * @param {URLSearchParams} params
  	 */
  def hitFilter(params: stdLib.URLSearchParams): scala.Unit
}

object GoogleAnalyticsInitializeOptions {
  @scala.inline
  def apply(
    cacheName: java.lang.String,
    hitFilter: stdLib.URLSearchParams => scala.Unit,
    parameterOverrides: stdLib.Record[java.lang.String, java.lang.String]
  ): GoogleAnalyticsInitializeOptions = {
    val __obj = js.Dynamic.literal(cacheName = cacheName, hitFilter = js.Any.fromFunction1(hitFilter), parameterOverrides = parameterOverrides)
  
    __obj.asInstanceOf[GoogleAnalyticsInitializeOptions]
  }
}

