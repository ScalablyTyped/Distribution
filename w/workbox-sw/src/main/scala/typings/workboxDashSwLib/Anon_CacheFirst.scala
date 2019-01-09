package typings
package workboxDashSwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CacheFirst
  extends org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.StrategiesNamespace] {
  /**
  	 * An implementation of a cache-first request strategy.
  	 * A cache first strategy is useful for assets that have been revisioned, such as URLs like /styles/example.a8f5f1.css, since they can be cached for long periods of time.
  	 */
  val CacheFirst: workboxDashSwLib.workboxDashSwMod.ICacheFirstConstructor = js.native
  /**
  	 * An implementation of a cache-only request strategy.
  	 * This class is useful if you want to take advantage of any Workbox plugins.
  	 */
  val CacheOnly: workboxDashSwLib.workboxDashSwMod.ICacheOnlyConstructor = js.native
  /**
  	 * An implementation of a network first request strategy.
  	 * By default, this strategy will cache responses with a 200 status code as well as opaque responses. Opaque responses are are cross-origin requests where the response doesn't support CORS.
  	 */
  val NetworkFirst: workboxDashSwLib.workboxDashSwMod.INetworkFirstConstructor = js.native
  /**
  	 * An implementation of a network-only request strategy.
  	 * This class is useful if you want to take advantage of any Workbox plugins.
  	 */
  val NetworkOnly: workboxDashSwLib.workboxDashSwMod.INetworkOnlyConstructor = js.native
  /**
  	 * An implementation of a stale-while-revalidate request strategy.
  	 * Resources are requested from both the cache and the network in parallel.
  	 * The strategy will respond with the cached version if available, otherwise wait for the network response.
  	 * The cache is updated with the network response with each successful request.
  	 * By default, this strategy will cache responses with a 200 status code as well as opaque responses.
  	 * Opaque responses are are cross-origin requests where the response doesn't support CORS.
  	 */
  val StaleWhileRevalidate: workboxDashSwLib.workboxDashSwMod.IStaleWhileRevalidateConstructor = js.native
  /**
  	 * Instantiates a new CacheFirst strategy
  	 * @param {Partial<IStrategyOptions>} [options]
  	 * @returns {HandlerCallback}
  	 */
  def cacheFirst(): HandlerCallback = js.native
  def cacheFirst(options: stdLib.Partial[workboxDashSwLib.workboxDashSwMod.IStrategyOptions]): HandlerCallback = js.native
  /**
  	 * Instantiates a new CacheOnly strategy
  	 * @param {Partial<IStrategyOptions>} [options]
  	 * @returns {HandlerCallback}
  	 */
  def cacheOnly(): HandlerCallback = js.native
  def cacheOnly(options: stdLib.Partial[workboxDashSwLib.workboxDashSwMod.IStrategyOptions]): HandlerCallback = js.native
  /**
  	 * Instantiates a new NetworkFirst strategy
  	 * @param {Partial<IStrategyOptions>} [options]
  	 * @returns {HandlerCallback}
  	 */
  def networkFirst(): HandlerCallback = js.native
  def networkFirst(options: stdLib.Partial[workboxDashSwLib.workboxDashSwMod.IStrategyOptions]): HandlerCallback = js.native
  /**
  	 * Instantiates a new NetworkOnly strategy
  	 * @param {Partial<IStrategyOptions>} [options]
  	 * @returns {HandlerCallback}
  	 */
  def networkOnly(): HandlerCallback = js.native
  def networkOnly(options: stdLib.Partial[workboxDashSwLib.workboxDashSwMod.IStrategyOptions]): HandlerCallback = js.native
  /**
  	 * Instantiates a new StaleWhileRevalidate strategy
  	 * @param {Partial<IStrategyOptions>} [options]
  	 * @returns {StaleWhileRevalidate}
  	 */
  def staleWhileRevalidate(): HandlerCallback = js.native
  def staleWhileRevalidate(options: stdLib.Partial[workboxDashSwLib.workboxDashSwMod.IStrategyOptions]): HandlerCallback = js.native
}

