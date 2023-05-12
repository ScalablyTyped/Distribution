package typings.workboxGoogleAnalytics

import typings.workboxGoogleAnalytics.initializeMod.GoogleAnalyticsInitializeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-google-analytics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param {Object=} [options]
    * @param {Object} [options.cacheName] The cache name to store and retrieve
    *     analytics.js. Defaults to the cache names provided by `workbox-core`.
    * @param {Object} [options.parameterOverrides]
    *     [Measurement Protocol parameters](https://developers.google.com/analytics/devguides/collection/protocol/v1/parameters),
    *     expressed as key/value pairs, to be added to replayed Google Analytics
    *     requests. This can be used to, e.g., set a custom dimension indicating
    *     that the request was replayed.
    * @param {Function} [options.hitFilter] A function that allows you to modify
    *     the hit parameters prior to replaying
    *     the hit. The function is invoked with the original hit's URLSearchParams
    *     object as its only argument.
    *
    * @memberof workbox-google-analytics
    */
  inline def initialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[Unit]
  inline def initialize(options: GoogleAnalyticsInitializeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
