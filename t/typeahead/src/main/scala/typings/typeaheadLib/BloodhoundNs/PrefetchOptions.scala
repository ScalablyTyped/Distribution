package typings
package typeaheadLib.BloodhoundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Prefetched data is fetched and processed on initialization. If the browser
     * supports local storage, the processed data will be cached there to prevent
     * additional network requests on subsequent page loads.
     *
     * WARNING: While it's possible to get away with it for smaller data sets,
     * prefetched data isn't meant to contain entire sets of data. Rather, it should
     * act as a first-level cache. Ignoring this warning means you'll run the risk
     * of hitting local storage limits.
     */

trait PrefetchOptions[T] extends js.Object {
  /**
           * If false, will not attempt to read or write to local storage and
           * will always load prefetch data from url on initialization. Defaults to true.
           */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The key that data will be stored in local storage under.
           * Defaults to value of url.
           */
  var cacheKey: js.UndefOr[java.lang.String] = js.undefined
  /**
           * A function that provides a hook to allow you to prepare the settings
           * object passed to transport when a request is about to be made.
           * Defaults to the identity function.
           *
           * @param settings The default settings object created internally by the Bloodhound instance.
           * @returns A settings object.
           */
  var prepare: js.UndefOr[
    js.Function1[/* settings */ jqueryLib.JQueryAjaxSettings, jqueryLib.JQueryAjaxSettings]
  ] = js.undefined
  /**
           * A string used for thumbprinting prefetched data. If this doesn't
           * match what's stored in local storage, the data will be refetched.
           */
  var thumbprint: js.UndefOr[java.lang.String] = js.undefined
  /**
           * A function with the signature transform(response) that allows you to
           * transform the prefetch response before the Bloodhound instance operates
           * on it. Defaults to the identity function.
           *
           * @param response Prefetch response.
           * @returns Transform response.
           */
  var transform: js.UndefOr[js.Function1[/* response */ T, T]] = js.undefined
  /**
           * The time (in milliseconds) the prefetched data should be cached in
           * local storage. Defaults to 86400000 (1 day).
           */
  var ttl: js.UndefOr[scala.Double] = js.undefined
  /**
           * The URL prefetch data should be loaded from.
           */
  var url: java.lang.String
}

