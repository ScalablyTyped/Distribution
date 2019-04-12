package typings
package workboxDashSwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object workboxDashSwMod {
  /**
    * An implementation of a [cache-first]{@link https://developers.google.com/web/fundamentals/instant-and-offline/offline-cookbook/#cache-falling-back-to-network}
    * request strategy.
    *
    * A cache first strategy is useful for assets that have been revisioned,
    * such as URLs like `/styles/example.a8f5f1.css`, since they
    * can be cached for long periods of time.
    *
    * If the network request fails, and there is no cache match, this will throw
    * a `WorkboxError` exception.
    */
  type CacheFirst = CacheStrategy
  /**
    *  An implementation of a
    * [cache-only]{@link https://developers.google.com/web/fundamentals/instant-and-offline/offline-cookbook/#cache-only}
    * request strategy.
    *
    * This class is useful if you want to take advantage of any
    * [Workbox plugins]{@link https://developers.google.com/web/tools/workbox/guides/using-plugins}.
    *
    * If there is no cache match, this will throw a `WorkboxError` exception.
    */
  type CacheOnly = CacheStrategy
  /**
    * An implementation of a
    * [network first]{@link https://developers.google.com/web/fundamentals/instant-and-offline/offline-cookbook/#network-falling-back-to-cache}
    * request strategy.
    *
    * By default, this strategy will cache responses with a 200 status code as
    * well as [opaque responses]{@link https://developers.google.com/web/tools/workbox/guides/handle-third-party-requests}.
    * Opaque responses are are cross-origin requests where the response doesn't
    * support [CORS]{@link https://enable-cors.org/}.
    *
    * If the network request fails, and there is no cache match, this will throw
    * a `WorkboxError` exception.
    */
  type NetworkFirst = CacheStrategy
  /**
    * An implementation of a
    * [network-only]{@link https://developers.google.com/web/fundamentals/instant-and-offline/offline-cookbook/#network-only}
    * request strategy.
    *
    * This class is useful if you want to take advantage of any
    * [Workbox plugins]{@link https://developers.google.com/web/tools/workbox/guides/using-plugins}.
    *
    * If the network request fails, this will throw a `WorkboxError` exception.
    */
  type NetworkOnly = CacheStrategy
  /**
    * ===== NetworkOnly strategy =====
    */
  type NetworkOnlyOptions = CacheFirstOptions
  /**
    * ===== RegExpRoute =====
    */
  /**
    * RegExpRoute makes it easy to create a regular expression based Route.
    *
    * For same-origin requests the RegExp only needs to match part of the URL. For
    * requests against third-party servers, you must define a RegExp that matches
    * the start of the URL.
    *
    * [See the module docs for info.]{@link https://developers.google.com/web/tools/workbox/modules/workbox-routing}
    */
  type RegExpRoute = Route
  /**
    * An implementation of a
    * [stale-while-revalidate]{@link https://developers.google.com/web/fundamentals/instant-and-offline/offline-cookbook/#stale-while-revalidate}
    * request strategy.
    *
    * Resources are requested from both the cache and the network in parallel.
    * The strategy will respond with the cached version if available, otherwise
    * wait for the network response. The cache is updated with the network response
    * with each successful request.
    *
    * By default, this strategy will cache responses with a 200 status code as
    * well as [opaque responses]{@link https://developers.google.com/web/tools/workbox/guides/handle-third-party-requests}.
    * Opaque responses are are cross-origin requests where the response doesn't
    * support [CORS]{@link https://enable-cors.org/}.
    *
    * If the network request fails, and there is no cache match, this will throw
    * a `WorkboxError` exception.
    */
  type StaleWhileRevalidate = CacheStrategy
  /**
    * ===== StaleWhileRevalidate strategy =====
    */
  type StaleWhileRevalidateOptions = CacheFirstOptions
}
