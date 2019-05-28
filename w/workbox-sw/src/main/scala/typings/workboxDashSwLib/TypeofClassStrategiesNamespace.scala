package typings
package workboxDashSwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassStrategiesNamespace
  extends org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.StrategiesNamespace] {
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
  val CacheFirst: workboxDashSwLib.workboxDashSwMod.CacheFirstConstructor = js.native
  /**
  	 * An implementation of a
  	 * [cache-only]{@link https://developers.google.com/web/fundamentals/instant-and-offline/offline-cookbook/#cache-only}
  	 * request strategy.
  	 *
  	 * This class is useful if you want to take advantage of any
  	 * [Workbox plugins]{@link https://developers.google.com/web/tools/workbox/guides/using-plugins}.
  	 *
  	 * If there is no cache match, this will throw a `WorkboxError` exception.
  	 */
  val CacheOnly: workboxDashSwLib.workboxDashSwMod.CacheOnlyConstructor = js.native
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
  val NetworkFirst: workboxDashSwLib.workboxDashSwMod.NetworkFirstConstructor = js.native
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
  val NetworkOnly: workboxDashSwLib.workboxDashSwMod.NetworkOnlyConstructor = js.native
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
  val StaleWhileRevalidate: workboxDashSwLib.workboxDashSwMod.StaleWhileRevalidateConstructor = js.native
  /**
  	 * Instantiates a new CacheFirst strategy
  	 * @deprecated use new workbox.strategies.CacheFirst() syntax
  	 * @param {Partial<StrategyOptions>} [options]
  	 * @returns {HandlerCallback}
  	 */
  def cacheFirst(): workboxDashSwLib.workboxDashSwMod.HandlerCallback = js.native
  def cacheFirst(options: stdLib.Partial[workboxDashSwLib.workboxDashSwMod.StrategyOptions]): workboxDashSwLib.workboxDashSwMod.HandlerCallback = js.native
  /**
  	 * Instantiates a new CacheOnly strategy
  	 * @deprecated use new workbox.strategies.CacheOnly() syntax
  	 * @param {Partial<StrategyOptions>} [options]
  	 * @returns {HandlerCallback}
  	 */
  def cacheOnly(): workboxDashSwLib.workboxDashSwMod.HandlerCallback = js.native
  def cacheOnly(options: stdLib.Partial[workboxDashSwLib.workboxDashSwMod.StrategyOptions]): workboxDashSwLib.workboxDashSwMod.HandlerCallback = js.native
  /**
  	 * Instantiates a new NetworkFirst strategy
  	 * @deprecated use new workbox.strategies.NetworkFirst() syntax
  	 * @param {Partial<StrategyOptions>} [options]
  	 * @returns {HandlerCallback}
  	 */
  def networkFirst(): workboxDashSwLib.workboxDashSwMod.HandlerCallback = js.native
  def networkFirst(options: stdLib.Partial[workboxDashSwLib.workboxDashSwMod.StrategyOptions]): workboxDashSwLib.workboxDashSwMod.HandlerCallback = js.native
  /**
  	 * Instantiates a new NetworkOnly strategy
  	 * @deprecated use new workbox.strategies.NetworkOnly() syntax
  	 * @param {Partial<StrategyOptions>} [options]
  	 * @returns {HandlerCallback}
  	 */
  def networkOnly(): workboxDashSwLib.workboxDashSwMod.HandlerCallback = js.native
  def networkOnly(options: stdLib.Partial[workboxDashSwLib.workboxDashSwMod.StrategyOptions]): workboxDashSwLib.workboxDashSwMod.HandlerCallback = js.native
  /**
  	 * Instantiates a new StaleWhileRevalidate strategy
  	 * @deprecated use new workbox.strategies.StaleWhileRevalidate() syntax
  	 * @param {Partial<StrategyOptions>} [options]
  	 * @returns {StaleWhileRevalidate}
  	 */
  def staleWhileRevalidate(): workboxDashSwLib.workboxDashSwMod.HandlerCallback = js.native
  def staleWhileRevalidate(options: stdLib.Partial[workboxDashSwLib.workboxDashSwMod.StrategyOptions]): workboxDashSwLib.workboxDashSwMod.HandlerCallback = js.native
}

