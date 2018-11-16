package typings
package workboxDashSwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object workboxDashSwMod {
  /**
   * An implementation of a cache-first request strategy.
   * A cache first strategy is useful for assets that have been revisioned, such as URLs like /styles/example.a8f5f1.css, since they can be cached for long periods of time.
   */
  type CacheFirst = CacheStrategy
  /**
   * An implementation of a cache-only request strategy.
   * This class is useful if you want to take advantage of any Workbox plugins.
   */
  type CacheOnly = CacheStrategy
  /**
   * ===== NetworkOnly strategy =====
   */
  
  type INetworkOnlyOptions = ICacheFirstOptions
  /**
   * ===== StaleWhileRevalidate strategy =====
   */
  
  type IStaleWhileRevalidateOptions = ICacheFirstOptions
  /**
   * An implementation of a network first request strategy.
   * By default, this strategy will cache responses with a 200 status code as well as opaque responses.
   * Opaque responses are are cross-origin requests where the response doesn't support CORS.
   */
  type NetworkFirst = CacheStrategy
  /**
   * An implementation of a network-only request strategy.
   * This class is useful if you want to take advantage of any Workbox plugins.
   */
  type NetworkOnly = CacheStrategy
  /**
   * ===== RegExpRoute =====
   */
  
  /**
   * RegExpRoute makes it easy to create a regular expression based Route.
   * For same-origin requests the RegExp only needs to match part of the URL. For requests against third-party servers, you must define a RegExp that matches the start of the URL.
   */
  type RegExpRoute = Route
  /**
   * An implementation of a stale-while-revalidate request strategy.
   * Resources are requested from both the cache and the network in parallel.
   * The strategy will respond with the cached version if available, otherwise wait for the network response.
   * The cache is updated with the network response with each successful request.
   * By default, this strategy will cache responses with a 200 status code as well as opaque responses.
   * Opaque responses are are cross-origin requests where the response doesn't support CORS.
   */
  type StaleWhileRevalidate = CacheStrategy
}
