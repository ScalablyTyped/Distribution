package typings.workboxGoogleAnalytics

import org.scalablytyped.runtime.StringDictionary
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializeMod {
  
  @JSImport("workbox-google-analytics/initialize", JSImport.Namespace)
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
  
  trait GoogleAnalyticsInitializeOptions extends StObject {
    
    var cacheName: js.UndefOr[String] = js.undefined
    
    var hitFilter: js.UndefOr[js.Function1[/* params */ URLSearchParams, Unit]] = js.undefined
    
    var parameterOverrides: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GoogleAnalyticsInitializeOptions {
    
    inline def apply(): GoogleAnalyticsInitializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoogleAnalyticsInitializeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GoogleAnalyticsInitializeOptions] (val x: Self) extends AnyVal {
      
      inline def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      inline def setCacheNameUndefined: Self = StObject.set(x, "cacheName", js.undefined)
      
      inline def setHitFilter(value: /* params */ URLSearchParams => Unit): Self = StObject.set(x, "hitFilter", js.Any.fromFunction1(value))
      
      inline def setHitFilterUndefined: Self = StObject.set(x, "hitFilter", js.undefined)
      
      inline def setParameterOverrides(value: StringDictionary[String]): Self = StObject.set(x, "parameterOverrides", value.asInstanceOf[js.Any])
      
      inline def setParameterOverridesUndefined: Self = StObject.set(x, "parameterOverrides", js.undefined)
    }
  }
}
